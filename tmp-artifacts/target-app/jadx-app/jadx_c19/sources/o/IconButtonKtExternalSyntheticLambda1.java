package o;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class IconButtonKtExternalSyntheticLambda1 implements FloatingActionButtonKtExternalSyntheticLambda1 {
    private final int IAuthTabCallback;
    public final ImmutableList<FloatingActionButtonKtExternalSyntheticLambda1> onExtraCallback;

    public static IconButtonKtExternalSyntheticLambda1 onWarmupCompleted(int i2, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        FloatingActionButtonKtExternalSyntheticLambda1 floatingActionButtonKtExternalSyntheticLambda1OnNavigationEvent;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult();
        int iOnWarmupCompleted = -2;
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 8) {
            int interfaceDescriptor = textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
            int iOnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() + textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(iOnWarmupCompleted2);
            if (interfaceDescriptor == 1414744396) {
                floatingActionButtonKtExternalSyntheticLambda1OnNavigationEvent = onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.getInterfaceDescriptor(), textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            } else {
                floatingActionButtonKtExternalSyntheticLambda1OnNavigationEvent = onNavigationEvent(interfaceDescriptor, iOnWarmupCompleted, textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            }
            if (floatingActionButtonKtExternalSyntheticLambda1OnNavigationEvent != null) {
                if (floatingActionButtonKtExternalSyntheticLambda1OnNavigationEvent.onExtraCallbackWithResult() == 1752331379) {
                    iOnWarmupCompleted = ((FloatingActionButtonKtExternalSyntheticLambda4) floatingActionButtonKtExternalSyntheticLambda1OnNavigationEvent).onWarmupCompleted();
                }
                builder.add(floatingActionButtonKtExternalSyntheticLambda1OnNavigationEvent);
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(iOnWarmupCompleted2);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(iOnExtraCallbackWithResult);
        }
        return new IconButtonKtExternalSyntheticLambda1(i2, builder.build());
    }

    private IconButtonKtExternalSyntheticLambda1(int i2, ImmutableList<FloatingActionButtonKtExternalSyntheticLambda1> immutableList) {
        this.IAuthTabCallback = i2;
        this.onExtraCallback = immutableList;
    }

    @Override // o.FloatingActionButtonKtExternalSyntheticLambda1
    public int onExtraCallbackWithResult() {
        return this.IAuthTabCallback;
    }

    public <T extends FloatingActionButtonKtExternalSyntheticLambda1> T onExtraCallback(Class<T> cls) {
        UnmodifiableIterator it = this.onExtraCallback.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    private static FloatingActionButtonKtExternalSyntheticLambda1 onNavigationEvent(int i2, int i3, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        switch (i2) {
            case 1718776947:
                return IconKtExternalSyntheticLambda1.onExtraCallback(i3, textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            case 1751742049:
                return FloatingActionButtonKtExternalSyntheticLambda5.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            case 1752331379:
                return FloatingActionButtonKtExternalSyntheticLambda4.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            case 1852994675:
                return FloatingActionButtonKtExternalSyntheticLambda6.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            default:
                return null;
        }
    }
}
