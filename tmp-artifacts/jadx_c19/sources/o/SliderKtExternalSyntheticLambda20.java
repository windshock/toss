package o;

import android.util.SparseArray;
import com.google.android.material.button.MaterialButton;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.SnackbarKtExternalSyntheticLambda3;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda20 implements SnackbarKtExternalSyntheticLambda3.onWarmupCompleted {
    private final int IAuthTabCallback;
    private final List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> onExtraCallback;

    public SliderKtExternalSyntheticLambda20() {
        this(0);
    }

    public SliderKtExternalSyntheticLambda20(int i2) {
        this(i2, ImmutableList.of());
    }

    public SliderKtExternalSyntheticLambda20(int i2, List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list) {
        this.IAuthTabCallback = i2;
        this.onExtraCallback = list;
    }

    @Override // o.SnackbarKtExternalSyntheticLambda3.onWarmupCompleted
    public SparseArray<SnackbarKtExternalSyntheticLambda3> onExtraCallback() {
        return new SparseArray<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    @Override // o.SnackbarKtExternalSyntheticLambda3.onWarmupCompleted
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SnackbarKtExternalSyntheticLambda3 onNavigationEvent(int i2, SnackbarKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback) {
        if (i2 != 2) {
            if (i2 == 3 || i2 == 4) {
                return new SnackbarHostKtExternalSyntheticLambda5(new SliderKtanimateToTarget2ExternalSyntheticLambda0(iAuthTabCallback.IAuthTabCallback, iAuthTabCallback.onExtraCallback(), "video/mp2t"));
            }
            if (i2 == 21) {
                return new SnackbarHostKtExternalSyntheticLambda5(new SliderKtExternalSyntheticLambda9("video/mp2t"));
            }
            if (i2 == 27) {
                if (onNavigationEvent(4)) {
                    return null;
                }
                return new SnackbarHostKtExternalSyntheticLambda5(new SliderKtExternalSyntheticLambda5(onExtraCallbackWithResult(iAuthTabCallback), onNavigationEvent(1), onNavigationEvent(8), "video/mp2t"));
            }
            if (i2 == 36) {
                return new SnackbarHostKtExternalSyntheticLambda5(new SliderKtExternalSyntheticLambda6(onExtraCallbackWithResult(iAuthTabCallback), "video/mp2t"));
            }
            if (i2 == 45) {
                return new SnackbarHostKtExternalSyntheticLambda5(new SliderKtrangeSliderPressDragModifier111ExternalSyntheticLambda0("video/mp2t"));
            }
            if (i2 == 89) {
                return new SnackbarHostKtExternalSyntheticLambda5(new SliderKtExternalSyntheticLambda21(iAuthTabCallback.onExtraCallback, "video/mp2t"));
            }
            if (i2 == 172) {
                return new SnackbarHostKtExternalSyntheticLambda5(new SliderKtExternalSyntheticLambda2(iAuthTabCallback.IAuthTabCallback, iAuthTabCallback.onExtraCallback(), "video/mp2t"));
            }
            if (i2 != 257) {
                if (i2 != 138) {
                    if (i2 != 139) {
                        switch (i2) {
                            case 15:
                                if (!onNavigationEvent(2)) {
                                    break;
                                }
                                break;
                            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                                break;
                            case 17:
                                if (!onNavigationEvent(2)) {
                                    break;
                                }
                                break;
                            default:
                                switch (i2) {
                                    case 128:
                                        break;
                                    case 129:
                                        break;
                                    case 130:
                                        if (!onNavigationEvent(64)) {
                                        }
                                        break;
                                    default:
                                        switch (i2) {
                                            case 134:
                                                if (!onNavigationEvent(16)) {
                                                    break;
                                                }
                                                break;
                                        }
                                }
                        }
                        return null;
                    }
                    return new SnackbarHostKtExternalSyntheticLambda5(new SliderKtExternalSyntheticLambda3(iAuthTabCallback.IAuthTabCallback, iAuthTabCallback.onExtraCallback(), 5408, "video/mp2t"));
                }
                return new SnackbarHostKtExternalSyntheticLambda5(new SliderKtExternalSyntheticLambda3(iAuthTabCallback.IAuthTabCallback, iAuthTabCallback.onExtraCallback(), 4096, "video/mp2t"));
            }
            return new SnackbarHostKtExternalSyntheticLambda6(new SnackbarHostKtExternalSyntheticLambda0("application/vnd.dvb.ait", "video/mp2t"));
        }
        return new SnackbarHostKtExternalSyntheticLambda5(new SliderKtExternalSyntheticLambda4(onWarmupCompleted(iAuthTabCallback), "video/mp2t"));
    }

    private SnackbarHostKtExternalSyntheticLambda7 onExtraCallbackWithResult(SnackbarKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback) {
        return new SnackbarHostKtExternalSyntheticLambda7(onNavigationEvent(iAuthTabCallback), "video/mp2t");
    }

    private SnackbarKtExternalSyntheticLambda10 onWarmupCompleted(SnackbarKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback) {
        return new SnackbarKtExternalSyntheticLambda10(onNavigationEvent(iAuthTabCallback), "video/mp2t");
    }

    private List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> onNavigationEvent(SnackbarKtExternalSyntheticLambda3.IAuthTabCallback iAuthTabCallback) {
        String str;
        int i2;
        List<byte[]> listOnExtraCallback;
        if (onNavigationEvent(32)) {
            return this.onExtraCallback;
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(iAuthTabCallback.onNavigationEvent);
        List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> arrayList = this.onExtraCallback;
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
            int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted();
            if (iOnMinimized == 134) {
                arrayList = new ArrayList<>();
                int iOnMinimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                for (int i3 = 0; i3 < (iOnMinimized3 & 31); i3++) {
                    String strOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(3);
                    int iOnMinimized4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                    boolean z = (iOnMinimized4 & 128) != 0;
                    if (z) {
                        i2 = iOnMinimized4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte bOnMinimized = (byte) textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
                    if (z) {
                        listOnExtraCallback = TextFieldCoreModifierNodeExternalSyntheticLambda1.onExtraCallback((bOnMinimized & 64) != 0);
                    } else {
                        listOnExtraCallback = null;
                    }
                    arrayList.add(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallbackDefault(str).onWarmupCompleted(strOnWarmupCompleted).IAuthTabCallback(i2).IAuthTabCallback(listOnExtraCallback).onNavigationEvent());
                }
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted + iOnMinimized2);
        }
        return arrayList;
    }

    private boolean onNavigationEvent(int i2) {
        return (i2 & this.IAuthTabCallback) != 0;
    }
}
