package viva.republica.toss.account.util;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.functions.Function1;
import o.DERConstructedSet;
import o.checkNavigationBarBySystemProperties;
import o.getPadBits;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class AccountHelper$$ExternalSyntheticLambda12 implements Function1 {
    public final /* synthetic */ checkNavigationBarBySystemProperties f$0;
    public final /* synthetic */ getPadBits f$1;
    public final /* synthetic */ boolean f$10;
    public final /* synthetic */ Function1 f$11;
    public final /* synthetic */ String f$12;
    public final /* synthetic */ String f$13;
    public final /* synthetic */ FragmentActivity f$2;
    public final /* synthetic */ String f$3;
    public final /* synthetic */ String f$4;
    public final /* synthetic */ String f$5;
    public final /* synthetic */ String f$6;
    public final /* synthetic */ String f$7;
    public final /* synthetic */ String f$8;
    public final /* synthetic */ String f$9;

    public /* synthetic */ AccountHelper$$ExternalSyntheticLambda12(checkNavigationBarBySystemProperties checknavigationbarbysystemproperties, getPadBits getpadbits, FragmentActivity fragmentActivity, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Function1 function1, String str8, String str9) {
        this.f$0 = checknavigationbarbysystemproperties;
        this.f$1 = getpadbits;
        this.f$2 = fragmentActivity;
        this.f$3 = str;
        this.f$4 = str2;
        this.f$5 = str3;
        this.f$6 = str4;
        this.f$7 = str5;
        this.f$8 = str6;
        this.f$9 = str7;
        this.f$10 = z;
        this.f$11 = function1;
        this.f$12 = str8;
        this.f$13 = str9;
    }

    public final Object invoke(Object obj) {
        return DERConstructedSet.IAuthTabCallback(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, this.f$11, this.f$12, this.f$13, ((Boolean) obj).booleanValue());
    }
}
