package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.RtspMessageChannel;
import com.google.android.exoplayer2.source.rtsp.RtspMessageUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class RtspClient implements Closeable {
    private static final long DEFAULT_RTSP_KEEP_ALIVE_INTERVAL_MS = 30000;
    public static final int RTSP_STATE_INIT = 0;
    public static final int RTSP_STATE_PLAYING = 2;
    public static final int RTSP_STATE_READY = 1;
    public static final int RTSP_STATE_UNINITIALIZED = -1;
    private static final String TAG = "RtspClient";
    private final boolean debugLoggingEnabled;
    private boolean hasPendingPauseRequest;
    private boolean hasUpdatedTimelineAndTracks;
    private KeepAliveMonitor keepAliveMonitor;
    private final PlaybackEventListener playbackEventListener;
    private boolean receivedAuthorizationRequest;
    private RtspMessageUtil.RtspAuthUserInfo rtspAuthUserInfo;
    private RtspAuthenticationInfo rtspAuthenticationInfo;
    private String sessionId;
    private final SessionInfoListener sessionInfoListener;
    private final SocketFactory socketFactory;
    private Uri uri;
    private final String userAgent;
    private final ArrayDeque<RtspMediaPeriod$RtpLoadInfo> pendingSetupRtpLoadInfos = new ArrayDeque<>();
    private final SparseArray<RtspRequest> pendingRequests = new SparseArray<>();
    private final MessageSender messageSender = new MessageSender();
    private RtspMessageChannel messageChannel = new RtspMessageChannel(new MessageListener());
    private long pendingSeekPositionUs = -9223372036854775807L;
    private int rtspState = -1;

    public interface PlaybackEventListener {
        void onPlaybackError(RtspMediaSource.RtspPlaybackException rtspPlaybackException);

        void onPlaybackStarted(long j, ImmutableList<RtspTrackTiming> immutableList);

        void onRtspSetupCompleted();
    }

    public interface SessionInfoListener {
        void onSessionTimelineRequestFailed(String str, @Nullable Throwable th);

        void onSessionTimelineUpdated(RtspSessionTiming rtspSessionTiming, ImmutableList<RtspMediaTrack> immutableList);
    }

    public RtspClient(SessionInfoListener sessionInfoListener, PlaybackEventListener playbackEventListener, String str, Uri uri, SocketFactory socketFactory, boolean z) {
        this.sessionInfoListener = sessionInfoListener;
        this.playbackEventListener = playbackEventListener;
        this.userAgent = str;
        this.socketFactory = socketFactory;
        this.debugLoggingEnabled = z;
        this.uri = RtspMessageUtil.removeUserInfo(uri);
        this.rtspAuthUserInfo = RtspMessageUtil.parseUserInfo(uri);
    }

    public void start() throws NumberFormatException, IOException {
        try {
            this.messageChannel.open(getSocket(this.uri));
            this.messageSender.sendOptionsRequest(this.uri, this.sessionId);
        } catch (IOException e) {
            Util.closeQuietly(this.messageChannel);
            throw e;
        }
    }

    public int getState() {
        return this.rtspState;
    }

    public void setupSelectedTracks(List<RtspMediaPeriod$RtpLoadInfo> list) throws NumberFormatException {
        this.pendingSetupRtpLoadInfos.addAll(list);
        continueSetupRtspTrack();
    }

    public void startPlayback(long j) throws NumberFormatException {
        this.messageSender.sendPlayRequest(this.uri, j, (String) Assertions.checkNotNull(this.sessionId));
    }

    public void seekToUs(long j) throws NumberFormatException {
        if (this.rtspState == 2 && !this.hasPendingPauseRequest) {
            this.messageSender.sendPauseRequest(this.uri, (String) Assertions.checkNotNull(this.sessionId));
        }
        this.pendingSeekPositionUs = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws NumberFormatException, IOException {
        KeepAliveMonitor keepAliveMonitor = this.keepAliveMonitor;
        if (keepAliveMonitor != null) {
            keepAliveMonitor.close();
            this.keepAliveMonitor = null;
            this.messageSender.sendTeardownRequest(this.uri, (String) Assertions.checkNotNull(this.sessionId));
        }
        this.messageChannel.close();
    }

    public void retryWithRtpTcp() throws NumberFormatException {
        try {
            close();
            RtspMessageChannel rtspMessageChannel = new RtspMessageChannel(new MessageListener());
            this.messageChannel = rtspMessageChannel;
            rtspMessageChannel.open(getSocket(this.uri));
            this.sessionId = null;
            this.receivedAuthorizationRequest = false;
            this.rtspAuthenticationInfo = null;
        } catch (IOException e) {
            this.playbackEventListener.onPlaybackError(new RtspMediaSource.RtspPlaybackException(e));
        }
    }

    public void registerInterleavedDataChannel(int i2, RtspMessageChannel.InterleavedBinaryDataListener interleavedBinaryDataListener) {
        this.messageChannel.registerInterleavedBinaryDataListener(i2, interleavedBinaryDataListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void continueSetupRtspTrack() throws NumberFormatException {
        RtspMediaPeriod$RtpLoadInfo rtspMediaPeriod$RtpLoadInfoPollFirst = this.pendingSetupRtpLoadInfos.pollFirst();
        if (rtspMediaPeriod$RtpLoadInfoPollFirst == null) {
            this.playbackEventListener.onRtspSetupCompleted();
        } else {
            this.messageSender.sendSetupRequest(rtspMediaPeriod$RtpLoadInfoPollFirst.getTrackUri(), rtspMediaPeriod$RtpLoadInfoPollFirst.getTransport(), this.sessionId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeLogMessage(List<String> list) {
        if (this.debugLoggingEnabled) {
            Log.d(TAG, Joiner.on("\n").join(list));
        }
    }

    private Socket getSocket(Uri uri) throws IOException {
        Assertions.checkArgument(uri.getHost() != null);
        return this.socketFactory.createSocket((String) Assertions.checkNotNull(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : RtspMessageChannel.DEFAULT_RTSP_PORT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchRtspError(Throwable th) {
        RtspMediaSource.RtspPlaybackException rtspPlaybackException;
        if (th instanceof RtspMediaSource.RtspPlaybackException) {
            rtspPlaybackException = (RtspMediaSource.RtspPlaybackException) th;
        } else {
            rtspPlaybackException = new RtspMediaSource.RtspPlaybackException(th);
        }
        if (this.hasUpdatedTimelineAndTracks) {
            this.playbackEventListener.onPlaybackError(rtspPlaybackException);
        } else {
            this.sessionInfoListener.onSessionTimelineRequestFailed(Strings.nullToEmpty(th.getMessage()), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean serverSupportsDescribe(List<Integer> list) {
        return list.isEmpty() || list.contains(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<RtspMediaTrack> buildTrackList(SessionDescription sessionDescription, Uri uri) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i2 = 0; i2 < sessionDescription.mediaDescriptionList.size(); i2++) {
            MediaDescription mediaDescription = (MediaDescription) sessionDescription.mediaDescriptionList.get(i2);
            if (RtpPayloadFormat.isFormatSupported(mediaDescription)) {
                builder.add(new RtspMediaTrack(mediaDescription, uri));
            }
        }
        return builder.build();
    }

    final class MessageSender {
        private int cSeq;
        private RtspRequest lastRequest;

        private MessageSender() {
        }

        public void sendOptionsRequest(Uri uri, @Nullable String str) throws NumberFormatException {
            sendRequest(getRequestWithCommonHeaders(4, str, ImmutableMap.of(), uri));
        }

        public void sendDescribeRequest(Uri uri, @Nullable String str) throws NumberFormatException {
            sendRequest(getRequestWithCommonHeaders(2, str, ImmutableMap.of(), uri));
        }

        public void sendSetupRequest(Uri uri, String str, @Nullable String str2) throws NumberFormatException {
            RtspClient.this.rtspState = 0;
            sendRequest(getRequestWithCommonHeaders(10, str2, ImmutableMap.of(RtspHeaders.TRANSPORT, str), uri));
        }

        public void sendPlayRequest(Uri uri, long j, String str) throws NumberFormatException {
            boolean z = true;
            if (RtspClient.this.rtspState != 1 && RtspClient.this.rtspState != 2) {
                z = false;
            }
            Assertions.checkState(z);
            sendRequest(getRequestWithCommonHeaders(6, str, ImmutableMap.of(RtspHeaders.RANGE, RtspSessionTiming.getOffsetStartTimeTiming(j)), uri));
        }

        public void sendTeardownRequest(Uri uri, String str) throws NumberFormatException {
            if (RtspClient.this.rtspState == -1 || RtspClient.this.rtspState == 0) {
                return;
            }
            RtspClient.this.rtspState = 0;
            sendRequest(getRequestWithCommonHeaders(12, str, ImmutableMap.of(), uri));
        }

        public void sendPauseRequest(Uri uri, String str) throws NumberFormatException {
            Assertions.checkState(RtspClient.this.rtspState == 2);
            sendRequest(getRequestWithCommonHeaders(5, str, ImmutableMap.of(), uri));
            RtspClient.this.hasPendingPauseRequest = true;
        }

        public void retryLastRequest() throws NumberFormatException {
            Assertions.checkStateNotNull(this.lastRequest);
            ImmutableListMultimap<String, String> immutableListMultimapAsMultiMap = this.lastRequest.headers.asMultiMap();
            HashMap map = new HashMap();
            for (String str : immutableListMultimapAsMultiMap.keySet()) {
                if (!str.equals(RtspHeaders.CSEQ) && !str.equals(RtspHeaders.USER_AGENT) && !str.equals(RtspHeaders.SESSION) && !str.equals(RtspHeaders.AUTHORIZATION)) {
                    map.put(str, (String) Iterables.getLast(immutableListMultimapAsMultiMap.get(str)));
                }
            }
            sendRequest(getRequestWithCommonHeaders(this.lastRequest.method, RtspClient.this.sessionId, map, this.lastRequest.uri));
        }

        public void sendMethodNotAllowedResponse(int i2) {
            sendResponse(new RtspResponse(405, new RtspHeaders.Builder(RtspClient.this.userAgent, RtspClient.this.sessionId, i2).build()));
            this.cSeq = Math.max(this.cSeq, i2 + 1);
        }

        private RtspRequest getRequestWithCommonHeaders(int i2, @Nullable String str, Map<String, String> map, Uri uri) {
            String str2 = RtspClient.this.userAgent;
            int i3 = this.cSeq;
            this.cSeq = i3 + 1;
            RtspHeaders.Builder builder = new RtspHeaders.Builder(str2, str, i3);
            if (RtspClient.this.rtspAuthenticationInfo != null) {
                Assertions.checkStateNotNull(RtspClient.this.rtspAuthUserInfo);
                try {
                    builder.add(RtspHeaders.AUTHORIZATION, RtspClient.this.rtspAuthenticationInfo.getAuthorizationHeaderValue(RtspClient.this.rtspAuthUserInfo, uri, i2));
                } catch (ParserException e) {
                    RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e));
                }
            }
            builder.addAll(map);
            return new RtspRequest(uri, i2, builder.build(), "");
        }

        private void sendRequest(RtspRequest rtspRequest) throws NumberFormatException {
            int i2 = Integer.parseInt((String) Assertions.checkNotNull(rtspRequest.headers.get(RtspHeaders.CSEQ)));
            Assertions.checkState(RtspClient.this.pendingRequests.get(i2) == null);
            RtspClient.this.pendingRequests.append(i2, rtspRequest);
            List<String> listSerializeRequest = RtspMessageUtil.serializeRequest(rtspRequest);
            RtspClient.this.maybeLogMessage(listSerializeRequest);
            RtspClient.this.messageChannel.send(listSerializeRequest);
            this.lastRequest = rtspRequest;
        }

        private void sendResponse(RtspResponse rtspResponse) {
            List<String> listSerializeResponse = RtspMessageUtil.serializeResponse(rtspResponse);
            RtspClient.this.maybeLogMessage(listSerializeResponse);
            RtspClient.this.messageChannel.send(listSerializeResponse);
        }
    }

    final class MessageListener implements RtspMessageChannel.MessageListener {
        private final Handler messageHandler = Util.createHandlerForCurrentLooper();

        public MessageListener() {
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspMessageChannel.MessageListener
        public void onRtspMessageReceived(final List<String> list) {
            this.messageHandler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.RtspClient$MessageListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    this.f$0.handleRtspMessage(list);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleRtspMessage(List<String> list) throws Throwable {
            RtspClient.this.maybeLogMessage(list);
            if (RtspMessageUtil.isRtspResponse(list)) {
                handleRtspResponse(list);
            } else {
                handleRtspRequest(list);
            }
        }

        private void handleRtspRequest(List<String> list) {
            RtspClient.this.messageSender.sendMethodNotAllowedResponse(Integer.parseInt((String) Assertions.checkNotNull(RtspMessageUtil.parseRequest(list).headers.get(RtspHeaders.CSEQ))));
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
        private void handleRtspResponse(List<String> list) throws Throwable {
            int i2;
            RtspSessionTiming timing;
            ImmutableList<RtspTrackTiming> immutableListOf;
            RtspResponse response = RtspMessageUtil.parseResponse(list);
            int i3 = Integer.parseInt((String) Assertions.checkNotNull(response.headers.get(RtspHeaders.CSEQ)));
            RtspRequest rtspRequest = (RtspRequest) RtspClient.this.pendingRequests.get(i3);
            if (rtspRequest != null) {
                RtspClient.this.pendingRequests.remove(i3);
                int i4 = rtspRequest.method;
                try {
                    i2 = response.status;
                } catch (ParserException e) {
                    RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e));
                }
                if (i2 != 200) {
                    if (i2 != 401) {
                        if (i2 == 301 || i2 == 302) {
                            if (RtspClient.this.rtspState != -1) {
                                RtspClient.this.rtspState = 0;
                            }
                            String str = response.headers.get(RtspHeaders.LOCATION);
                            if (str == null) {
                                RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("Redirection without new location.", null);
                                return;
                            }
                            Uri uri = Uri.parse(str);
                            RtspClient.this.uri = RtspMessageUtil.removeUserInfo(uri);
                            RtspClient.this.rtspAuthUserInfo = RtspMessageUtil.parseUserInfo(uri);
                            RtspClient.this.messageSender.sendDescribeRequest(RtspClient.this.uri, RtspClient.this.sessionId);
                            return;
                        }
                    } else if (RtspClient.this.rtspAuthUserInfo != null && !RtspClient.this.receivedAuthorizationRequest) {
                        ImmutableList<String> immutableListValues = response.headers.values(RtspHeaders.WWW_AUTHENTICATE);
                        if (immutableListValues.isEmpty()) {
                            throw ParserException.createForMalformedManifest("Missing WWW-Authenticate header in a 401 response.", (Throwable) null);
                        }
                        for (int i5 = 0; i5 < immutableListValues.size(); i5++) {
                            RtspClient.this.rtspAuthenticationInfo = RtspMessageUtil.parseWwwAuthenticateHeader((String) immutableListValues.get(i5));
                            if (RtspClient.this.rtspAuthenticationInfo.authenticationMechanism == 2) {
                                break;
                            }
                        }
                        RtspClient.this.messageSender.retryLastRequest();
                        RtspClient.this.receivedAuthorizationRequest = true;
                        return;
                    }
                    RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(RtspMessageUtil.toMethodString(i4) + " " + response.status));
                    return;
                }
                switch (i4) {
                    case 1:
                    case 3:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                    case 12:
                        return;
                    case 2:
                        onDescribeResponseReceived(new RtspDescribeResponse(i2, SessionDescriptionParser.parse(response.messageBody)));
                        return;
                    case 4:
                        onOptionsResponseReceived(new RtspOptionsResponse(i2, RtspMessageUtil.parsePublicHeader(response.headers.get(RtspHeaders.PUBLIC))));
                        return;
                    case 5:
                        onPauseResponseReceived();
                        return;
                    case 6:
                        String str2 = response.headers.get(RtspHeaders.RANGE);
                        if (str2 == null) {
                            timing = RtspSessionTiming.DEFAULT;
                        } else {
                            timing = RtspSessionTiming.parseTiming(str2);
                        }
                        try {
                            String str3 = response.headers.get(RtspHeaders.RTP_INFO);
                            if (str3 != null) {
                                immutableListOf = RtspTrackTiming.parseTrackTiming(str3, RtspClient.this.uri);
                            } else {
                                immutableListOf = ImmutableList.of();
                            }
                        } catch (ParserException unused) {
                            immutableListOf = ImmutableList.of();
                        }
                        onPlayResponseReceived(new RtspPlayResponse(response.status, timing, immutableListOf));
                        return;
                    case 10:
                        String str4 = response.headers.get(RtspHeaders.SESSION);
                        String str5 = response.headers.get(RtspHeaders.TRANSPORT);
                        if (str4 == null || str5 == null) {
                            throw ParserException.createForMalformedManifest("Missing mandatory session or transport header", (Throwable) null);
                        }
                        onSetupResponseReceived(new RtspSetupResponse(response.status, RtspMessageUtil.parseSessionHeader(str4), str5));
                        return;
                    default:
                        throw new IllegalStateException();
                }
                RtspClient.this.dispatchRtspError(new RtspMediaSource.RtspPlaybackException(e));
            }
        }

        private void onOptionsResponseReceived(RtspOptionsResponse rtspOptionsResponse) throws NumberFormatException {
            if (RtspClient.this.keepAliveMonitor != null) {
                return;
            }
            if (RtspClient.serverSupportsDescribe(rtspOptionsResponse.supportedMethods)) {
                RtspClient.this.messageSender.sendDescribeRequest(RtspClient.this.uri, RtspClient.this.sessionId);
            } else {
                RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("DESCRIBE not supported.", null);
            }
        }

        private void onDescribeResponseReceived(RtspDescribeResponse rtspDescribeResponse) {
            RtspSessionTiming timing = RtspSessionTiming.DEFAULT;
            String str = (String) rtspDescribeResponse.sessionDescription.attributes.get(SessionDescription.ATTR_RANGE);
            if (str != null) {
                try {
                    timing = RtspSessionTiming.parseTiming(str);
                } catch (ParserException e) {
                    RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("SDP format error.", e);
                    return;
                }
            }
            ImmutableList<RtspMediaTrack> immutableListBuildTrackList = RtspClient.buildTrackList(rtspDescribeResponse.sessionDescription, RtspClient.this.uri);
            if (immutableListBuildTrackList.isEmpty()) {
                RtspClient.this.sessionInfoListener.onSessionTimelineRequestFailed("No playable track.", null);
            } else {
                RtspClient.this.sessionInfoListener.onSessionTimelineUpdated(timing, immutableListBuildTrackList);
                RtspClient.this.hasUpdatedTimelineAndTracks = true;
            }
        }

        private void onSetupResponseReceived(RtspSetupResponse rtspSetupResponse) throws NumberFormatException {
            Assertions.checkState(RtspClient.this.rtspState != -1);
            RtspClient.this.rtspState = 1;
            RtspClient.this.sessionId = rtspSetupResponse.sessionHeader.sessionId;
            RtspClient.this.continueSetupRtspTrack();
        }

        private void onPlayResponseReceived(RtspPlayResponse rtspPlayResponse) {
            Assertions.checkState(RtspClient.this.rtspState == 1);
            RtspClient.this.rtspState = 2;
            if (RtspClient.this.keepAliveMonitor == null) {
                RtspClient rtspClient = RtspClient.this;
                rtspClient.keepAliveMonitor = rtspClient.new KeepAliveMonitor(RtspClient.DEFAULT_RTSP_KEEP_ALIVE_INTERVAL_MS);
                RtspClient.this.keepAliveMonitor.start();
            }
            RtspClient.this.pendingSeekPositionUs = -9223372036854775807L;
            RtspClient.this.playbackEventListener.onPlaybackStarted(Util.msToUs(rtspPlayResponse.sessionTiming.startTimeMs), rtspPlayResponse.trackTimingList);
        }

        private void onPauseResponseReceived() throws NumberFormatException {
            Assertions.checkState(RtspClient.this.rtspState == 2);
            RtspClient.this.rtspState = 1;
            RtspClient.this.hasPendingPauseRequest = false;
            if (RtspClient.this.pendingSeekPositionUs != -9223372036854775807L) {
                RtspClient rtspClient = RtspClient.this;
                rtspClient.startPlayback(Util.usToMs(rtspClient.pendingSeekPositionUs));
            }
        }
    }

    final class KeepAliveMonitor implements Runnable, Closeable {
        private final long intervalMs;
        private boolean isStarted;
        private final Handler keepAliveHandler = Util.createHandlerForCurrentLooper();

        public KeepAliveMonitor(long j) {
            this.intervalMs = j;
        }

        public void start() {
            if (this.isStarted) {
                return;
            }
            this.isStarted = true;
            this.keepAliveHandler.postDelayed(this, this.intervalMs);
        }

        @Override // java.lang.Runnable
        public void run() throws NumberFormatException {
            RtspClient.this.messageSender.sendOptionsRequest(RtspClient.this.uri, RtspClient.this.sessionId);
            this.keepAliveHandler.postDelayed(this, this.intervalMs);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.isStarted = false;
            this.keepAliveHandler.removeCallbacks(this);
        }
    }
}
