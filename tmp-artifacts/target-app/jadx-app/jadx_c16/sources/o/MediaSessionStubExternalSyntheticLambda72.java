package o;

import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONObject;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class MediaSessionStubExternalSyntheticLambda72 implements Runnable {
    public static final String getInterfaceDescriptor = StringFog.decrypt("dnxpUsnIuK5MUFtRw8g=\n", "Ij46M6+t6ts=\n");

    public abstract void onWarmupCompleted();

    public void onWarmupCompleted(Throwable th) {
        String str = getInterfaceDescriptor;
        String str2 = StringFog.decrypt("coIS5ZIvelIXkwzrk3wz\n", "N/BgiuAPEzw=\n") + getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("PUSlFWxo\n", "fijEZh9AgzA=\n"));
        sb.append(getClass().getName());
        try {
            SpannedDataExternalSyntheticLambda0.onWarmupCompleted(str, str2, NavDestinationImplExternalSyntheticLambda3.onExtraCallback("Sg==\n", "Y19PnGHzSPU=\n", sb), th, (NavDisplayKt__NavDisplayKtExternalSyntheticLambda8) null, (JSONObject) null, false, false, false);
        } catch (Throwable unused) {
        }
        VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.onNavigationEvent(str, StringFog.decrypt("lxNgKGld7xryAn4maA6m\n", "0mESRxt9hnQ=\n") + getClass().getName());
        VideoRendererEventListenerEventDispatcherExternalSyntheticLambda5.onExtraCallback(str, str, StringFog.decrypt("pDlsEwRt0bk=\n", "4FwYcm0BooM=\n"), th, null, false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            onWarmupCompleted();
        } catch (Throwable th) {
            try {
                onWarmupCompleted(th);
            } catch (Throwable unused) {
            }
        }
    }
}
