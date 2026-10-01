package o;

import android.content.Context;
import android.content.SharedPreferences;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class shouldMeasureChild {
    public static String onExtraCallbackWithResult(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                stringBuffer.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static void onNavigationEvent(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("pref", 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.apply();
    }
}
