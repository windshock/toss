package o;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldDecoratorModifierNodeExternalSyntheticLambda7 {
    public final String onExtraCallback;
    public final int onNavigationEvent;
    public final int onWarmupCompleted;

    public static TextFieldDecoratorModifierNodeExternalSyntheticLambda7 onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        String str;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int i2 = iOnMinimized >> 1;
        int iOnMinimized2 = ((textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() >> 3) & 31) | ((iOnMinimized & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7 || i2 == 8) {
            str = "dvhe";
        } else if (i2 == 9) {
            str = "dvav";
        } else {
            if (i2 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i2 < 10 ? ".0" : ".");
        sb.append(i2);
        sb.append(iOnMinimized2 >= 10 ? "." : ".0");
        sb.append(iOnMinimized2);
        return new TextFieldDecoratorModifierNodeExternalSyntheticLambda7(i2, iOnMinimized2, sb.toString());
    }

    private TextFieldDecoratorModifierNodeExternalSyntheticLambda7(int i2, int i3, String str) {
        this.onNavigationEvent = i2;
        this.onWarmupCompleted = i3;
        this.onExtraCallback = str;
    }
}
