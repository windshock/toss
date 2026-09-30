package o;

import android.os.Build;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SelectionManager_androidKtExternalSyntheticLambda2 {
    public static byte[] onWarmupCompleted(byte[] bArr) {
        return Build.VERSION.SDK_INT >= 27 ? bArr : TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(bArr)));
    }

    public static byte[] IAuthTabCallback(byte[] bArr) throws JSONException {
        if (Build.VERSION.SDK_INT >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                if (i2 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                sb.append("{\"k\":\"");
                sb.append(onExtraCallbackWithResult(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(onExtraCallbackWithResult(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(sb.toString());
        } catch (JSONException e) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("ClearKeyUtil", "Failed to adjust response data: " + TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(bArr), e);
            return bArr;
        }
    }

    private static String onWarmupCompleted(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String onExtraCallbackWithResult(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
