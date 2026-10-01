package o;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public interface TTAppOpenAdTransActivity extends TTHistoryActivity42, ReadableByteChannel {
    int IAuthTabCallback(@NotNull TTFullScreenVideoActivity1 tTFullScreenVideoActivity1) throws IOException;

    int IAuthTabCallback(@NotNull byte[] bArr) throws IOException;

    long IAuthTabCallback(@NotNull TTHistoryActivity41 tTHistoryActivity41) throws IOException;

    String IAuthTabCallback(long j) throws IOException;

    String IAuthTabCallback(@NotNull Charset charset) throws IOException;

    @Deprecated
    TTBaseActivity IAuthTabCallback();

    void IAuthTabCallback(@NotNull TTBaseActivity tTBaseActivity, long j) throws IOException;

    void IAuthTabCallbackDefault(long j) throws IOException;

    void IAuthTabCallbackStub(long j) throws IOException;

    InputStream IAuthTabCallbackStubProxy();

    boolean IAuthTabCallback_Parcel() throws IOException;

    byte ICustomTabsCallback() throws IOException;

    int ICustomTabsCallbackStub() throws IOException;

    short ICustomTabsCallbackStubProxy() throws IOException;

    TTBaseActivity access100();

    boolean asBinder(long j) throws IOException;

    byte[] extraCallback() throws IOException;

    long extraCallbackWithResult() throws IOException;

    TTAppOpenAdTransActivity getInterfaceDescriptor();

    int onActivityLayout() throws IOException;

    short onActivityResized() throws IOException;

    long onExtraCallback(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, long j) throws IOException;

    String onExtraCallback(long j) throws IOException;

    long onExtraCallbackWithResult(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException;

    void onExtraCallbackWithResult(@NotNull byte[] bArr) throws IOException;

    long onMessageChannelReady() throws IOException;

    long onMinimized() throws IOException;

    long onNavigationEvent(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException;

    long onNavigationEvent(@NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity, long j, long j2) throws IOException;

    TTBaseLandingPageActivity onNavigationEvent(long j) throws IOException;

    boolean onNavigationEvent(long j, @NotNull TTBaseLandingPageActivity tTBaseLandingPageActivity) throws IOException;

    int onPostMessage() throws IOException;

    String onRelationshipValidationResult() throws IOException;

    String onUnminimized() throws IOException;

    long readTypedObject() throws IOException;

    TTBaseLandingPageActivity writeTypedObject() throws IOException;
}
