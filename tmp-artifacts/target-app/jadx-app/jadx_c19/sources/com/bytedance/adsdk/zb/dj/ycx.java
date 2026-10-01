package com.bytedance.adsdk.zb.dj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ycx implements dj {
    private final HttpURLConnection ycx;

    public ycx(HttpURLConnection httpURLConnection) {
        this.ycx = httpURLConnection;
    }

    @Override // com.bytedance.adsdk.zb.dj.dj
    public boolean ycx() {
        return this.ycx.getResponseCode() / 100 == 2;
    }

    @Override // com.bytedance.adsdk.zb.dj.dj
    public InputStream zb() throws IOException {
        return this.ycx.getInputStream();
    }

    @Override // com.bytedance.adsdk.zb.dj.dj
    public String sya() {
        return this.ycx.getContentType();
    }

    @Override // com.bytedance.adsdk.zb.dj.dj
    public String dj() {
        try {
            if (ycx()) {
                return null;
            }
            return "Unable to fetch " + this.ycx.getURL() + ". Failed with " + this.ycx.getResponseCode() + "\n" + ycx(this.ycx);
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.ycx.disconnect();
    }

    private String ycx(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }
}
