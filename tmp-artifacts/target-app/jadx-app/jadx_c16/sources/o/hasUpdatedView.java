package o;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class hasUpdatedView {
    private int onWarmupCompleted = 300000;

    public void IAuthTabCallback(int i) {
        this.onWarmupCompleted = i;
    }

    public InputStream onExtraCallbackWithResult(String str) {
        try {
            URI uri = new URI(str);
            BasicHttpParams basicHttpParams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 300000);
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient(basicHttpParams);
            HttpConnectionParams.setConnectionTimeout(basicHttpParams, this.onWarmupCompleted);
            HttpEntity entity = defaultHttpClient.execute(new HttpGet(uri)).getEntity();
            if (entity != null) {
                return entity.getContent();
            }
        } catch (URISyntaxException unused) {
            return null;
        } catch (ClientProtocolException e) {
            e.printStackTrace();
            return null;
        } catch (IOException unused2) {
        }
        return null;
    }
}
