package viva.republica.toss.widget;

import android.widget.EditText;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: /tmp/toss_alldex/classes30.dex */
public final /* synthetic */ class LoanTextFieldLineDropDownView$$ExternalSyntheticLambda1 implements Function1 {
    private static int onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    public final /* synthetic */ LoanTextFieldLineDropDownView f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Function0 f$10;
    public final /* synthetic */ String f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ List f$4;
    public final /* synthetic */ Function1 f$5;
    public final /* synthetic */ EditText f$6;
    public final /* synthetic */ List f$7;
    public final /* synthetic */ String f$8;
    public final /* synthetic */ Function0 f$9;

    public /* synthetic */ LoanTextFieldLineDropDownView$$ExternalSyntheticLambda1(LoanTextFieldLineDropDownView loanTextFieldLineDropDownView, String str, String str2, boolean z, List list, Function1 function1, EditText editText, List list2, String str3, Function0 function0, Function0 function02) {
        this.f$0 = loanTextFieldLineDropDownView;
        this.f$1 = str;
        this.f$2 = str2;
        this.f$3 = z;
        this.f$4 = list;
        this.f$5 = function1;
        this.f$6 = editText;
        this.f$7 = list2;
        this.f$8 = str3;
        this.f$9 = function0;
        this.f$10 = function02;
    }

    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 9;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnNavigationEvent = LoanTextFieldLineDropDownView.onNavigationEvent(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9, this.f$10, (Boolean) obj);
        int i4 = onNavigationEvent + 45;
        onWarmupCompleted = i4 % 128;
        if (i4 % 2 != 0) {
            return unitOnNavigationEvent;
        }
        throw null;
    }
}
