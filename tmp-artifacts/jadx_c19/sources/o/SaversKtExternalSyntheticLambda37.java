package o;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.HttpException;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import o.SaversKtExternalSyntheticLambda35;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SaversKtExternalSyntheticLambda37 implements SaversKtExternalSyntheticLambda35<InputStream> {
    static final onExtraCallback onExtraCallback = new IAuthTabCallback();
    private final SpannableExtensions_androidKtExternalSyntheticLambda0 IAuthTabCallback;
    private final int asBinder;
    private volatile boolean onExtraCallbackWithResult;
    private InputStream onNavigationEvent;
    private HttpURLConnection onTransact;
    private final onExtraCallback onWarmupCompleted;

    interface onExtraCallback {
        HttpURLConnection onWarmupCompleted(URL url) throws IOException;
    }

    public SaversKtExternalSyntheticLambda37(SpannableExtensions_androidKtExternalSyntheticLambda0 spannableExtensions_androidKtExternalSyntheticLambda0, int i2) {
        this(spannableExtensions_androidKtExternalSyntheticLambda0, i2, onExtraCallback);
    }

    SaversKtExternalSyntheticLambda37(SpannableExtensions_androidKtExternalSyntheticLambda0 spannableExtensions_androidKtExternalSyntheticLambda0, int i2, onExtraCallback onextracallback) {
        this.IAuthTabCallback = spannableExtensions_androidKtExternalSyntheticLambda0;
        this.asBinder = i2;
        this.onWarmupCompleted = onextracallback;
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public void onExtraCallback(@NonNull SaversKtExternalSyntheticLambda11 saversKtExternalSyntheticLambda11, @NonNull SaversKtExternalSyntheticLambda35.onNavigationEvent<? super InputStream> onnavigationevent) {
        long jIAuthTabCallback = getSharedValues.IAuthTabCallback();
        try {
            try {
                onnavigationevent.onExtraCallback((SaversKtExternalSyntheticLambda35.onNavigationEvent<? super InputStream>) IAuthTabCallback(this.IAuthTabCallback.onExtraCallback(), 0, null, this.IAuthTabCallback.IAuthTabCallback()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    getSharedValues.onWarmupCompleted(jIAuthTabCallback);
                }
            } catch (IOException e) {
                onnavigationevent.onExtraCallback((Exception) e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    getSharedValues.onWarmupCompleted(jIAuthTabCallback);
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                getSharedValues.onWarmupCompleted(jIAuthTabCallback);
            }
            throw th;
        }
    }

    private InputStream IAuthTabCallback(URL url, int i2, URL url2, Map<String, String> map) throws IOException {
        if (i2 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionOnExtraCallbackWithResult = onExtraCallbackWithResult(url, map);
        this.onTransact = httpURLConnectionOnExtraCallbackWithResult;
        try {
            httpURLConnectionOnExtraCallbackWithResult.connect();
            this.onNavigationEvent = this.onTransact.getInputStream();
            if (this.onExtraCallbackWithResult) {
                return null;
            }
            int iOnWarmupCompleted = onWarmupCompleted(this.onTransact);
            if (onExtraCallback(iOnWarmupCompleted)) {
                return onExtraCallbackWithResult(this.onTransact);
            }
            if (!onWarmupCompleted(iOnWarmupCompleted)) {
                if (iOnWarmupCompleted == -1) {
                    throw new HttpException(iOnWarmupCompleted);
                }
                try {
                    throw new HttpException(this.onTransact.getResponseMessage(), iOnWarmupCompleted);
                } catch (IOException e) {
                    throw new HttpException("Failed to get a response message", iOnWarmupCompleted, e);
                }
            }
            String headerField = this.onTransact.getHeaderField(RtspHeaders.LOCATION);
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iOnWarmupCompleted);
            }
            try {
                URL url3 = new URL(url, headerField);
                onExtraCallback();
                return IAuthTabCallback(url3, i2 + 1, url, map);
            } catch (MalformedURLException e2) {
                throw new HttpException("Bad redirect url: " + headerField, iOnWarmupCompleted, e2);
            }
        } catch (IOException e3) {
            throw new HttpException("Failed to connect or obtain data", onWarmupCompleted(this.onTransact), e3);
        }
    }

    private static int onWarmupCompleted(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    private HttpURLConnection onExtraCallbackWithResult(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionOnWarmupCompleted = this.onWarmupCompleted.onWarmupCompleted(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionOnWarmupCompleted.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionOnWarmupCompleted.setConnectTimeout(this.asBinder);
            httpURLConnectionOnWarmupCompleted.setReadTimeout(this.asBinder);
            httpURLConnectionOnWarmupCompleted.setUseCaches(false);
            httpURLConnectionOnWarmupCompleted.setDoInput(true);
            httpURLConnectionOnWarmupCompleted.setInstanceFollowRedirects(false);
            return httpURLConnectionOnWarmupCompleted;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    private static boolean onExtraCallback(int i2) {
        return i2 / 100 == 2;
    }

    private static boolean onWarmupCompleted(int i2) {
        return i2 / 100 == 3;
    }

    private InputStream onExtraCallbackWithResult(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.onNavigationEvent = setType.onExtraCallbackWithResult(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    httpURLConnection.getContentEncoding();
                }
                this.onNavigationEvent = httpURLConnection.getInputStream();
            }
            return this.onNavigationEvent;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", onWarmupCompleted(httpURLConnection), e);
        }
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public void onExtraCallback() throws IOException {
        InputStream inputStream = this.onNavigationEvent;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.onTransact;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.onTransact = null;
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public void onExtraCallbackWithResult() {
        this.onExtraCallbackWithResult = true;
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public Class<InputStream> onNavigationEvent() {
        return InputStream.class;
    }

    @Override // o.SaversKtExternalSyntheticLambda35
    public SaversKtExternalSyntheticLambda21 IAuthTabCallback() {
        return SaversKtExternalSyntheticLambda21.REMOTE;
    }

    static class IAuthTabCallback implements onExtraCallback {
        IAuthTabCallback() {
        }

        @Override // o.SaversKtExternalSyntheticLambda37.onExtraCallback
        public HttpURLConnection onWarmupCompleted(URL url) throws IOException {
            return (HttpURLConnection) url.openConnection();
        }
    }
}
