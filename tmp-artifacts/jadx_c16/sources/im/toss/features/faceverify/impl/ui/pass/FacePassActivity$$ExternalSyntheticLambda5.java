package im.toss.features.faceverify.impl.ui.pass;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o.CommonModule_setLeftEdgeTouchEnabled;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final /* synthetic */ class FacePassActivity$$ExternalSyntheticLambda5 implements Function1 {
    private static int IAuthTabCallback = 1;
    private static int onWarmupCompleted;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ Function0 f$4;
    public final /* synthetic */ Function0 f$5;
    public final /* synthetic */ Function0 f$6;

    public /* synthetic */ FacePassActivity$$ExternalSyntheticLambda5(String str, String str2, String str3, String str4, Function0 function0, Function0 function02, Function0 function03) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = str4;
        this.f$4 = function0;
        this.f$5 = function02;
        this.f$6 = function03;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onWarmupCompleted + 9;
        IAuthTabCallback = i2 % 128;
        int i3 = i2 % 2;
        Unit unitIAuthTabCallback = FacePassActivity.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (CommonModule_setLeftEdgeTouchEnabled) obj);
        int i4 = onWarmupCompleted + 83;
        IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 72 / 0;
        }
        return unitIAuthTabCallback;
    }
}
