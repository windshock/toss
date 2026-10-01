package o;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import java.util.Collections;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerKtExternalSyntheticLambda23;
import o.SnackbarKtExternalSyntheticLambda3;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SliderKtExternalSyntheticLambda7 implements SliderKtExternalSyntheticLambda22 {
    private final String IAuthTabCallback;
    private int IAuthTabCallbackDefault;
    private final String IAuthTabCallbackStub;
    private final int IAuthTabCallbackStubProxy;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda21 IAuthTabCallback_Parcel;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 ICustomTabsCallback;
    private boolean access000;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 access100;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 asBinder;
    private int asInterface;
    private int extraCallback;
    private int extraCallbackWithResult;
    private long getInterfaceDescriptor;
    private int onActivityLayout;
    private String onExtraCallback;
    private int onExtraCallbackWithResult;
    private long onMinimized;
    private int onNavigationEvent;
    private boolean onPostMessage;
    private String onTransact;
    private int onWarmupCompleted;
    private long readTypedObject;
    private int writeTypedObject;

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(boolean z) {
    }

    public SliderKtExternalSyntheticLambda7(@Nullable String str, int i2, String str2) {
        this.IAuthTabCallbackStub = str;
        this.IAuthTabCallbackStubProxy = i2;
        this.IAuthTabCallback = str2;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(1024);
        this.ICustomTabsCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20;
        this.IAuthTabCallback_Parcel = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback());
        this.onMinimized = -9223372036854775807L;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onWarmupCompleted() {
        this.onActivityLayout = 0;
        this.onMinimized = -9223372036854775807L;
        this.onPostMessage = false;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, SnackbarKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult) {
        onextracallbackwithresult.onExtraCallback();
        this.access100 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(onextracallbackwithresult.onExtraCallbackWithResult(), 1);
        this.onTransact = onextracallbackwithresult.IAuthTabCallback();
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void onNavigationEvent(long j, int i2) {
        this.onMinimized = j;
    }

    @Override // o.SliderKtExternalSyntheticLambda22
    public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
        RecordingInputConnection_androidKt.onWarmupCompleted(this.access100);
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            int i2 = this.onActivityLayout;
            if (i2 != 0) {
                if (i2 == 1) {
                    int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                    if ((iOnMinimized & 224) == 224) {
                        this.extraCallbackWithResult = iOnMinimized;
                        this.onActivityLayout = 2;
                    } else if (iOnMinimized != 86) {
                        this.onActivityLayout = 0;
                    }
                } else if (i2 == 2) {
                    int iOnMinimized2 = ((this.extraCallbackWithResult & (-225)) << 8) | textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                    this.extraCallback = iOnMinimized2;
                    if (iOnMinimized2 > this.ICustomTabsCallback.onExtraCallback().length) {
                        onWarmupCompleted(this.extraCallback);
                    }
                    this.onNavigationEvent = 0;
                    this.onActivityLayout = 3;
                } else if (i2 == 3) {
                    int iMin = Math.min(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent(), this.extraCallback - this.onNavigationEvent);
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(this.IAuthTabCallback_Parcel.onWarmupCompleted, this.onNavigationEvent, iMin);
                    int i3 = this.onNavigationEvent + iMin;
                    this.onNavigationEvent = i3;
                    if (i3 == this.extraCallback) {
                        this.IAuthTabCallback_Parcel.onWarmupCompleted(0);
                        onWarmupCompleted(this.IAuthTabCallback_Parcel);
                        this.onActivityLayout = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized() == 86) {
                this.onActivityLayout = 1;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @RequiresNonNull
    private void onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) throws ParserException {
        if (!textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            this.onPostMessage = true;
            IAuthTabCallbackStub(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
        } else if (!this.onPostMessage) {
            return;
        }
        if (this.onExtraCallbackWithResult == 0) {
            if (this.IAuthTabCallbackDefault != 0) {
                throw ParserException.onNavigationEvent((String) null, (Throwable) null);
            }
            onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21, IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21));
            if (this.access000) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback((int) this.getInterfaceDescriptor);
                return;
            }
            return;
        }
        throw ParserException.onNavigationEvent((String) null, (Throwable) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @RequiresNonNull
    private void IAuthTabCallbackStub(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) throws ParserException {
        boolean zOnWarmupCompleted;
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(1);
        int iOnNavigationEvent2 = iOnNavigationEvent == 1 ? textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(1) : 0;
        this.onExtraCallbackWithResult = iOnNavigationEvent2;
        if (iOnNavigationEvent2 == 0) {
            if (iOnNavigationEvent == 1) {
                onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
            }
            if (!textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                throw ParserException.onNavigationEvent((String) null, (Throwable) null);
            }
            this.IAuthTabCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(6);
            int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
            int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
            if (iOnNavigationEvent3 != 0 || iOnNavigationEvent4 != 0) {
                throw ParserException.onNavigationEvent((String) null, (Throwable) null);
            }
            if (iOnNavigationEvent == 0) {
                int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult();
                int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(iOnExtraCallbackWithResult);
                byte[] bArr = new byte[(iOnExtraCallbackWithResult2 + 7) / 8];
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(bArr, 0, iOnExtraCallbackWithResult2);
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(this.onTransact).onNavigationEvent(this.IAuthTabCallback).IAuthTabCallbackDefault("audio/mp4a-latm").onExtraCallback(this.onExtraCallback).onExtraCallback(this.onWarmupCompleted).extraCallbackWithResult(this.writeTypedObject).IAuthTabCallback(Collections.singletonList(bArr)).onWarmupCompleted(this.IAuthTabCallbackStub).readTypedObject(this.IAuthTabCallbackStubProxy).onNavigationEvent();
                if (!basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.equals(this.asBinder)) {
                    this.asBinder = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent;
                    this.readTypedObject = 1024000000 / basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.prefetch;
                    this.access100.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent);
                }
            } else {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(((int) onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21)) - onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21));
            }
            onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
            boolean zOnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
            this.access000 = zOnWarmupCompleted2;
            this.getInterfaceDescriptor = 0L;
            if (zOnWarmupCompleted2) {
                if (iOnNavigationEvent == 1) {
                    this.getInterfaceDescriptor = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
                } else {
                    do {
                        zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                        this.getInterfaceDescriptor = (this.getInterfaceDescriptor << 8) + textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
                    } while (zOnWarmupCompleted);
                }
            }
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
                return;
            }
            return;
        }
        throw ParserException.onNavigationEvent((String) null, (Throwable) null);
    }

    private void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
        this.asInterface = iOnNavigationEvent;
        if (iOnNavigationEvent == 0) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
            return;
        }
        if (iOnNavigationEvent == 1) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(9);
            return;
        }
        if (iOnNavigationEvent == 3 || iOnNavigationEvent == 4 || iOnNavigationEvent == 5) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(6);
        } else {
            if (iOnNavigationEvent == 6 || iOnNavigationEvent == 7) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(1);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private int onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) throws ParserException {
        int iOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback();
        DrawerKtExternalSyntheticLambda23.onWarmupCompleted onwarmupcompletedOnExtraCallback = DrawerKtExternalSyntheticLambda23.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21, true);
        this.onExtraCallback = onwarmupcompletedOnExtraCallback.onExtraCallbackWithResult;
        this.writeTypedObject = onwarmupcompletedOnExtraCallback.IAuthTabCallback;
        this.onWarmupCompleted = onwarmupcompletedOnExtraCallback.onExtraCallback;
        return iOnExtraCallback - textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private int IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) throws ParserException {
        int iOnNavigationEvent;
        if (this.asInterface != 0) {
            throw ParserException.onNavigationEvent((String) null, (Throwable) null);
        }
        int i2 = 0;
        do {
            iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
            i2 += iOnNavigationEvent;
        } while (iOnNavigationEvent == 255);
        return i2;
    }

    @RequiresNonNull
    private void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int i2) {
        int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult();
        if ((iOnExtraCallbackWithResult & 7) == 0) {
            this.ICustomTabsCallback.asBinder(iOnExtraCallbackWithResult >> 3);
        } else {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(this.ICustomTabsCallback.onExtraCallback(), 0, i2 << 3);
            this.ICustomTabsCallback.asBinder(0);
        }
        this.access100.onNavigationEvent(this.ICustomTabsCallback, i2);
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onMinimized != -9223372036854775807L);
        this.access100.onExtraCallback(this.onMinimized, 1, i2, 0, null);
        this.onMinimized += this.readTypedObject;
    }

    private void onWarmupCompleted(int i2) {
        this.ICustomTabsCallback.onExtraCallback(i2);
        this.IAuthTabCallback_Parcel.onExtraCallback(this.ICustomTabsCallback.onExtraCallback());
    }

    private static long onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        return textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent((textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2) + 1) << 3);
    }
}
