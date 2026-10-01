package o;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerStateExternalSyntheticLambda0;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0;
import o.ProgressIndicatorKtExternalSyntheticLambda12;
import o.RippleKtExternalSyntheticLambda0;
import o.TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0 implements DrawerStateExternalSyntheticLambda0, ExposedDropdownMenu_androidKtExternalSyntheticLambda4 {

    @Deprecated
    public static final DrawerStateExternalSyntheticLambda2 onNavigationEvent = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda2
        @Override // o.DrawerStateExternalSyntheticLambda2
        public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
            return OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0.IAuthTabCallbackStub();
        }
    };
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallback;
    private final ArrayDeque<TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback> IAuthTabCallbackDefault;
    private int IAuthTabCallbackStub;
    private int IAuthTabCallbackStubProxy;
    private DrawerStateExternalSyntheticLambda1 IAuthTabCallback_Parcel;
    private ImmutableList<ExposedDropdownMenu_androidKtExternalSyntheticLambda1> ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private boolean ICustomTabsCallbackStub;
    private final OutlinedTextFieldMeasurePolicyExternalSyntheticLambda3 ICustomTabsCallbackStubProxy;
    private final RippleKtExternalSyntheticLambda0.onExtraCallback ICustomTabsCallback_Parcel;
    private final List<HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback> ICustomTabsService;
    private int access000;
    private final int access100;
    private long asBinder;
    private long asInterface;
    private ModalBottomSheetStateExternalSyntheticLambda2 extraCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 extraCallbackWithResult;
    private boolean getInterfaceDescriptor;
    private IAuthTabCallback[] isEngagementSignalsApiAvailable;
    private long onActivityLayout;
    private int onActivityResized;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onExtraCallback;
    private int onExtraCallbackWithResult;
    private int onMessageChannelReady;
    private int onMinimized;
    private boolean onPostMessage;
    private int onRelationshipValidationResult;
    private long onTransact;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onUnminimized;
    private long[][] onWarmupCompleted;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 readTypedObject;
    private int writeTypedObject;

    public static int onExtraCallback(int i2) {
        int i3 = (i2 & 1) != 0 ? 32 : 0;
        return (i2 & 2) != 0 ? i3 | 128 : i3;
    }

    private static int onExtraCallbackWithResult(int i2) {
        if (i2 != 1751476579) {
            return i2 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static /* synthetic */ ProgressIndicatorKtExternalSyntheticLambda12 onExtraCallbackWithResult(ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12) {
        return progressIndicatorKtExternalSyntheticLambda12;
    }

    private static boolean onNavigationEvent(int i2) {
        return i2 == 1835296868 || i2 == 1836476516 || i2 == 1751411826 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1937011571 || i2 == 1668576371 || i2 == 1701606260 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1953196132 || i2 == 1718909296 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124;
    }

    private static boolean onWarmupCompleted(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473 || i2 == 1635284069;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public boolean onNavigationEvent() {
        return true;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] IAuthTabCallback(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        return new DrawerStateExternalSyntheticLambda0[]{new OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0(onextracallback)};
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] IAuthTabCallbackStub() {
        return new DrawerStateExternalSyntheticLambda0[]{new OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0(RippleKtExternalSyntheticLambda0.onExtraCallback.onExtraCallback, 16)};
    }

    @Deprecated
    public OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0() {
        this(RippleKtExternalSyntheticLambda0.onExtraCallback.onExtraCallback, 16);
    }

    public OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        this(onextracallback, 0);
    }

    public OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback, int i2) {
        this.ICustomTabsCallback_Parcel = onextracallback;
        this.access100 = i2;
        this.ICustomTabsCallback = ImmutableList.of();
        this.writeTypedObject = (i2 & 4) != 0 ? 3 : 0;
        this.ICustomTabsCallbackStubProxy = new OutlinedTextFieldMeasurePolicyExternalSyntheticLambda3();
        this.ICustomTabsService = new ArrayList();
        this.onExtraCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(16);
        this.IAuthTabCallbackDefault = new ArrayDeque<>();
        this.extraCallbackWithResult = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(TextFieldKeyEventHandlerExternalSyntheticLambda1.onNavigationEvent);
        this.readTypedObject = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(6);
        this.onUnminimized = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
        this.onRelationshipValidationResult = -1;
        this.IAuthTabCallback_Parcel = DrawerStateExternalSyntheticLambda1.onNavigationEvent;
        this.isEngagementSignalsApiAvailable = new IAuthTabCallback[0];
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        ExposedDropdownMenu_androidKtExternalSyntheticLambda1 exposedDropdownMenu_androidKtExternalSyntheticLambda1IAuthTabCallback = ProgressIndicatorKtExternalSyntheticLambda10.IAuthTabCallback(drawerKtExternalSyntheticLambda9, (this.access100 & 2) != 0);
        this.ICustomTabsCallback = exposedDropdownMenu_androidKtExternalSyntheticLambda1IAuthTabCallback != null ? ImmutableList.of(exposedDropdownMenu_androidKtExternalSyntheticLambda1IAuthTabCallback) : ImmutableList.of();
        return exposedDropdownMenu_androidKtExternalSyntheticLambda1IAuthTabCallback == null;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    /* renamed from: onTransact, reason: merged with bridge method [inline-methods] */
    public ImmutableList<ExposedDropdownMenu_androidKtExternalSyntheticLambda1> onExtraCallbackWithResult() {
        return this.ICustomTabsCallback;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        if ((this.access100 & 16) == 0) {
            drawerStateExternalSyntheticLambda1 = new ResistanceConfig(drawerStateExternalSyntheticLambda1, this.ICustomTabsCallback_Parcel);
        }
        this.IAuthTabCallback_Parcel = drawerStateExternalSyntheticLambda1;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        this.IAuthTabCallbackDefault.clear();
        this.onExtraCallbackWithResult = 0;
        this.onRelationshipValidationResult = -1;
        this.onMessageChannelReady = 0;
        this.onMinimized = 0;
        this.onActivityResized = 0;
        this.getInterfaceDescriptor = false;
        if (j == 0) {
            if (this.writeTypedObject != 3) {
                asInterface();
                return;
            } else {
                this.ICustomTabsCallbackStubProxy.onExtraCallbackWithResult();
                this.ICustomTabsService.clear();
                return;
            }
        }
        for (IAuthTabCallback iAuthTabCallback : this.isEngagementSignalsApiAvailable) {
            onNavigationEvent(iAuthTabCallback, j2);
            ExposedDropdownMenu_androidKtExternalSyntheticLambda8 exposedDropdownMenu_androidKtExternalSyntheticLambda8 = iAuthTabCallback.onNavigationEvent;
            if (exposedDropdownMenu_androidKtExternalSyntheticLambda8 != null) {
                exposedDropdownMenu_androidKtExternalSyntheticLambda8.IAuthTabCallback();
            }
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        while (true) {
            int i2 = this.writeTypedObject;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
                    }
                    if (i2 == 3) {
                        return onNavigationEvent(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3);
                    }
                    throw new IllegalStateException();
                }
                if (onExtraCallback(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3)) {
                    return 1;
                }
            } else if (!onNavigationEvent(drawerKtExternalSyntheticLambda9)) {
                return -1;
            }
        }
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public long onExtraCallback() {
        return this.onTransact;
    }

    @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onExtraCallback(long j) {
        return onWarmupCompleted(j, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent onWarmupCompleted(long j, int i2) {
        long jOnExtraCallbackWithResult;
        long j2;
        long jOnExtraCallbackWithResult2;
        long j3;
        int iOnExtraCallbackWithResult;
        long j4 = j;
        IAuthTabCallback[] iAuthTabCallbackArr = this.isEngagementSignalsApiAvailable;
        if (iAuthTabCallbackArr.length == 0) {
            return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(ExposedDropdownMenu_androidKtExternalSyntheticLambda3.onWarmupCompleted);
        }
        int i3 = i2 != -1 ? i2 : this.IAuthTabCallbackStubProxy;
        if (i3 != -1) {
            ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda14 = iAuthTabCallbackArr[i3].onWarmupCompleted;
            int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(progressIndicatorKtExternalSyntheticLambda14, j4);
            if (iOnExtraCallbackWithResult2 == -1) {
                return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(ExposedDropdownMenu_androidKtExternalSyntheticLambda3.onWarmupCompleted);
            }
            j3 = progressIndicatorKtExternalSyntheticLambda14.IAuthTabCallbackStub[iOnExtraCallbackWithResult2];
            jOnExtraCallbackWithResult = progressIndicatorKtExternalSyntheticLambda14.IAuthTabCallback[iOnExtraCallbackWithResult2];
            if (j3 < j4 && iOnExtraCallbackWithResult2 < progressIndicatorKtExternalSyntheticLambda14.onNavigationEvent - 1 && (iOnExtraCallbackWithResult = progressIndicatorKtExternalSyntheticLambda14.onExtraCallbackWithResult(j4)) != -1 && iOnExtraCallbackWithResult != iOnExtraCallbackWithResult2) {
                j2 = progressIndicatorKtExternalSyntheticLambda14.IAuthTabCallbackStub[iOnExtraCallbackWithResult];
                jOnExtraCallbackWithResult2 = progressIndicatorKtExternalSyntheticLambda14.IAuthTabCallback[iOnExtraCallbackWithResult];
                if (i2 == -1) {
                    int i4 = 0;
                    while (true) {
                        IAuthTabCallback[] iAuthTabCallbackArr2 = this.isEngagementSignalsApiAvailable;
                        if (i4 >= iAuthTabCallbackArr2.length) {
                            break;
                        }
                        if (i4 != this.IAuthTabCallbackStubProxy) {
                            ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda142 = iAuthTabCallbackArr2[i4].onWarmupCompleted;
                            jOnExtraCallbackWithResult = onExtraCallbackWithResult(progressIndicatorKtExternalSyntheticLambda142, j3, jOnExtraCallbackWithResult);
                            if (j2 != -9223372036854775807L) {
                                jOnExtraCallbackWithResult2 = onExtraCallbackWithResult(progressIndicatorKtExternalSyntheticLambda142, j2, jOnExtraCallbackWithResult2);
                            }
                        }
                        i4++;
                    }
                }
                ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda3 = new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(j3, jOnExtraCallbackWithResult);
                if (j2 != -9223372036854775807L) {
                    return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3);
                }
                return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onNavigationEvent(exposedDropdownMenu_androidKtExternalSyntheticLambda3, new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(j2, jOnExtraCallbackWithResult2));
            }
            j4 = j3;
        } else {
            jOnExtraCallbackWithResult = Long.MAX_VALUE;
        }
        j2 = -9223372036854775807L;
        long j5 = j4;
        jOnExtraCallbackWithResult2 = -1;
        j3 = j5;
        if (i2 == -1) {
        }
        ExposedDropdownMenu_androidKtExternalSyntheticLambda3 exposedDropdownMenu_androidKtExternalSyntheticLambda32 = new ExposedDropdownMenu_androidKtExternalSyntheticLambda3(j3, jOnExtraCallbackWithResult);
        if (j2 != -9223372036854775807L) {
        }
    }

    private void asInterface() {
        this.writeTypedObject = 0;
        this.onExtraCallbackWithResult = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private boolean onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallbackPeek;
        if (this.onExtraCallbackWithResult == 0) {
            if (!drawerKtExternalSyntheticLambda9.onExtraCallback(this.onExtraCallback.onExtraCallback(), 0, 8, true)) {
                asBinder();
                return false;
            }
            this.onExtraCallbackWithResult = 8;
            this.onExtraCallback.asBinder(0);
            this.asInterface = this.onExtraCallback.onActivityResized();
            this.IAuthTabCallbackStub = this.onExtraCallback.asBinder();
        }
        long j = this.asInterface;
        if (j == 1) {
            drawerKtExternalSyntheticLambda9.onNavigationEvent(this.onExtraCallback.onExtraCallback(), 8, 8);
            this.onExtraCallbackWithResult += 8;
            this.asInterface = this.onExtraCallback.ICustomTabsCallbackStubProxy();
        } else if (j == 0) {
            long jOnExtraCallback = drawerKtExternalSyntheticLambda9.onExtraCallback();
            if (jOnExtraCallback == -1 && (onextracallbackPeek = this.IAuthTabCallbackDefault.peek()) != null) {
                jOnExtraCallback = onextracallbackPeek.IAuthTabCallback;
            }
            if (jOnExtraCallback != -1) {
                this.asInterface = (jOnExtraCallback - drawerKtExternalSyntheticLambda9.IAuthTabCallback()) + this.onExtraCallbackWithResult;
            }
        }
        if (this.asInterface < this.onExtraCallbackWithResult) {
            throw ParserException.onExtraCallback("Atom size less than header length (unsupported).");
        }
        if (onWarmupCompleted(this.IAuthTabCallbackStub)) {
            long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
            long j2 = this.asInterface;
            long j3 = this.onExtraCallbackWithResult;
            long j4 = (jIAuthTabCallback + j2) - j3;
            if (j2 != j3 && this.IAuthTabCallbackStub == 1835365473) {
                onWarmupCompleted(drawerKtExternalSyntheticLambda9);
            }
            this.IAuthTabCallbackDefault.push(new TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback(this.IAuthTabCallbackStub, j4));
            if (this.asInterface == this.onExtraCallbackWithResult) {
                IAuthTabCallback(j4);
            } else {
                asInterface();
            }
        } else if (onNavigationEvent(this.IAuthTabCallbackStub)) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onExtraCallbackWithResult == 8);
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.asInterface <= 2147483647L);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20((int) this.asInterface);
            System.arraycopy(this.onExtraCallback.onExtraCallback(), 0, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, 8);
            this.IAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20;
            this.writeTypedObject = 1;
        } else {
            onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9.IAuthTabCallback() - this.onExtraCallbackWithResult);
            this.IAuthTabCallback = null;
            this.writeTypedObject = 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws ParserException, IOException {
        boolean z;
        long j = this.asInterface - this.onExtraCallbackWithResult;
        long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = this.IAuthTabCallback;
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20 != null) {
            drawerKtExternalSyntheticLambda9.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), this.onExtraCallbackWithResult, (int) j);
            if (this.IAuthTabCallbackStub == 1718909296) {
                this.ICustomTabsCallbackStub = true;
                this.access000 = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            } else if (!this.IAuthTabCallbackDefault.isEmpty()) {
                this.IAuthTabCallbackDefault.peek().onExtraCallbackWithResult(new TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult(this.IAuthTabCallbackStub, textFieldDecoratorModifierNodeExternalSyntheticLambda20));
            }
        } else {
            if (!this.ICustomTabsCallbackStub && this.IAuthTabCallbackStub == 1835295092) {
                this.access000 = 1;
            }
            if (j < 262144) {
                drawerKtExternalSyntheticLambda9.onExtraCallback((int) j);
            } else {
                exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = drawerKtExternalSyntheticLambda9.IAuthTabCallback() + j;
                z = true;
                IAuthTabCallback(jIAuthTabCallback + j);
                if (this.ICustomTabsCallbackDefault) {
                    if (z) {
                    }
                }
                this.onPostMessage = true;
                exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = this.asBinder;
                this.ICustomTabsCallbackDefault = false;
                return this.writeTypedObject == 2;
            }
        }
        z = false;
        IAuthTabCallback(jIAuthTabCallback + j);
        if (this.ICustomTabsCallbackDefault) {
        }
        if (this.writeTypedObject == 2) {
        }
    }

    private int onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws ParserException, IOException {
        int iOnExtraCallback = this.ICustomTabsCallbackStubProxy.onExtraCallback(drawerKtExternalSyntheticLambda9, exposedDropdownMenuDefaultsExternalSyntheticLambda3, this.ICustomTabsService);
        if (iOnExtraCallback == 1 && exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted == 0) {
            asInterface();
        }
        return iOnExtraCallback;
    }

    private void IAuthTabCallback(long j) throws ParserException {
        while (!this.IAuthTabCallbackDefault.isEmpty() && this.IAuthTabCallbackDefault.peek().IAuthTabCallback == j) {
            TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallbackPop = this.IAuthTabCallbackDefault.pop();
            if (onextracallbackPop.onExtraCallback == 1836019574) {
                onNavigationEvent(onextracallbackPop);
                this.IAuthTabCallbackDefault.clear();
                if (!this.ICustomTabsCallbackDefault) {
                    this.writeTypedObject = 2;
                }
            } else if (!this.IAuthTabCallbackDefault.isEmpty()) {
                this.IAuthTabCallbackDefault.peek().onExtraCallback(onextracallbackPop);
            }
        }
        if (this.writeTypedObject != 2) {
            asInterface();
        }
    }

    private void onNavigationEvent(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback) throws ParserException {
        List<Integer> list;
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0;
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda02;
        List<ProgressIndicatorKtExternalSyntheticLambda14> list2;
        int i2;
        int i3;
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda03;
        long j;
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallbackIAuthTabCallback = onextracallback.IAuthTabCallback(1835365473);
        List<Integer> arrayList = new ArrayList<>();
        if (onextracallbackIAuthTabCallback != null) {
            HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0IAuthTabCallback = OutlinedTextFieldKtExternalSyntheticLambda9.IAuthTabCallback(onextracallbackIAuthTabCallback);
            if (this.onPostMessage) {
                RecordingInputConnection_androidKt.onWarmupCompleted(handwritingHandlerNodeExternalSyntheticLambda0IAuthTabCallback);
                onExtraCallbackWithResult(handwritingHandlerNodeExternalSyntheticLambda0IAuthTabCallback);
                arrayList = onWarmupCompleted(handwritingHandlerNodeExternalSyntheticLambda0IAuthTabCallback);
            } else if (IAuthTabCallback(handwritingHandlerNodeExternalSyntheticLambda0IAuthTabCallback)) {
                this.ICustomTabsCallbackDefault = true;
                return;
            }
            handwritingHandlerNodeExternalSyntheticLambda0 = handwritingHandlerNodeExternalSyntheticLambda0IAuthTabCallback;
            list = arrayList;
        } else {
            list = arrayList;
            handwritingHandlerNodeExternalSyntheticLambda0 = null;
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.access000 == 1;
        ElevationOverlayKtExternalSyntheticLambda1 elevationOverlayKtExternalSyntheticLambda1 = new ElevationOverlayKtExternalSyntheticLambda1();
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onextracallback.onNavigationEvent(1969517665);
        if (onextracallbackwithresultOnNavigationEvent != null) {
            HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent = OutlinedTextFieldKtExternalSyntheticLambda9.onNavigationEvent(onextracallbackwithresultOnNavigationEvent);
            elevationOverlayKtExternalSyntheticLambda1.onWarmupCompleted(handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent);
            handwritingHandlerNodeExternalSyntheticLambda02 = handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent;
        } else {
            handwritingHandlerNodeExternalSyntheticLambda02 = null;
        }
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda04 = new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{OutlinedTextFieldKtExternalSyntheticLambda9.onExtraCallback(((TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback.onNavigationEvent(1836476516))).onNavigationEvent)});
        List<ProgressIndicatorKtExternalSyntheticLambda14> listOnWarmupCompleted = OutlinedTextFieldKtExternalSyntheticLambda9.onWarmupCompleted(onextracallback, elevationOverlayKtExternalSyntheticLambda1, -9223372036854775807L, (BasicTextContextMenuProviderExternalSyntheticLambda0) null, (this.access100 & 1) != 0, z, (Function<ProgressIndicatorKtExternalSyntheticLambda12, ProgressIndicatorKtExternalSyntheticLambda12>) new Function() { // from class: androidx.media3.extractor.mp4.Mp4Extractor$$ExternalSyntheticLambda1
            public final Object apply(Object obj) {
                return OutlinedTextFieldMeasurePolicyExternalSyntheticLambda0.onExtraCallbackWithResult((ProgressIndicatorKtExternalSyntheticLambda12) obj);
            }
        });
        if (this.onPostMessage) {
            RecordingInputConnection_androidKt.onExtraCallbackWithResult(list.size() == listOnWarmupCompleted.size(), String.format(Locale.US, "The number of auxiliary track types from metadata (%d) is not same as the number of auxiliary tracks (%d)", Integer.valueOf(list.size()), Integer.valueOf(listOnWarmupCompleted.size())));
        }
        String strOnExtraCallbackWithResult = OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda1.onExtraCallbackWithResult(listOnWarmupCompleted);
        int i4 = 0;
        int i5 = 0;
        int size = -1;
        long j2 = -9223372036854775807L;
        while (i4 < listOnWarmupCompleted.size()) {
            ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda14 = listOnWarmupCompleted.get(i4);
            if (progressIndicatorKtExternalSyntheticLambda14.onNavigationEvent != 0) {
                ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12 = progressIndicatorKtExternalSyntheticLambda14.IAuthTabCallbackDefault;
                list2 = listOnWarmupCompleted;
                IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(progressIndicatorKtExternalSyntheticLambda12, progressIndicatorKtExternalSyntheticLambda14, this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(i5, progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallback_Parcel));
                long j3 = progressIndicatorKtExternalSyntheticLambda12.onWarmupCompleted;
                if (j3 == -9223372036854775807L) {
                    j3 = progressIndicatorKtExternalSyntheticLambda14.onExtraCallbackWithResult;
                }
                int i6 = i5;
                ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5 = iAuthTabCallback.onExtraCallbackWithResult;
                long jMax = Math.max(j2, j3);
                if ("audio/true-hd".equals(progressIndicatorKtExternalSyntheticLambda12.onNavigationEvent.isEngagementSignalsApiAvailable)) {
                    i3 = progressIndicatorKtExternalSyntheticLambda14.onExtraCallback << 4;
                } else {
                    i3 = progressIndicatorKtExternalSyntheticLambda14.onExtraCallback + 30;
                }
                BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = progressIndicatorKtExternalSyntheticLambda12.onNavigationEvent.onExtraCallback();
                onextracallbackwithresultOnExtraCallback.IAuthTabCallbackStubProxy(i3);
                if (progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallback_Parcel == 2) {
                    int i7 = progressIndicatorKtExternalSyntheticLambda12.onNavigationEvent.mayLaunchUrl;
                    if ((this.access100 & 8) != 0) {
                        i7 |= size == -1 ? 1 : 2;
                    }
                    if (this.onPostMessage) {
                        i7 |= 32768;
                        onextracallbackwithresultOnExtraCallback.onWarmupCompleted(list.get(i4).intValue());
                    }
                    onextracallbackwithresultOnExtraCallback.readTypedObject(i7);
                }
                OutlinedTextFieldMeasurePolicyExternalSyntheticLambda1.onExtraCallbackWithResult(progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallback_Parcel, elevationOverlayKtExternalSyntheticLambda1, onextracallbackwithresultOnExtraCallback);
                int i8 = progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallback_Parcel;
                HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda05 = progressIndicatorKtExternalSyntheticLambda12.onNavigationEvent.ICustomTabsCallbackDefault;
                if (this.ICustomTabsService.isEmpty()) {
                    j = jMax;
                    handwritingHandlerNodeExternalSyntheticLambda03 = null;
                } else {
                    j = jMax;
                    handwritingHandlerNodeExternalSyntheticLambda03 = new HandwritingHandlerNodeExternalSyntheticLambda0(this.ICustomTabsService);
                }
                OutlinedTextFieldMeasurePolicyExternalSyntheticLambda1.onWarmupCompleted(i8, handwritingHandlerNodeExternalSyntheticLambda0, onextracallbackwithresultOnExtraCallback, handwritingHandlerNodeExternalSyntheticLambda05, handwritingHandlerNodeExternalSyntheticLambda03, handwritingHandlerNodeExternalSyntheticLambda02, handwritingHandlerNodeExternalSyntheticLambda04);
                onextracallbackwithresultOnExtraCallback.onNavigationEvent(strOnExtraCallbackWithResult);
                iAuthTabCallback.onExtraCallbackWithResult.onExtraCallbackWithResult(onextracallbackwithresultOnExtraCallback.onNavigationEvent());
                if (progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallback_Parcel == 2 && size == -1) {
                    size = arrayList2.size();
                }
                arrayList2.add(iAuthTabCallback);
                i2 = i6 + 1;
                j2 = j;
            } else {
                list2 = listOnWarmupCompleted;
                i2 = i5;
            }
            i4++;
            i5 = i2;
            listOnWarmupCompleted = list2;
        }
        this.IAuthTabCallbackStubProxy = size;
        this.onTransact = j2;
        IAuthTabCallback[] iAuthTabCallbackArr = (IAuthTabCallback[]) arrayList2.toArray(new IAuthTabCallback[0]);
        this.isEngagementSignalsApiAvailable = iAuthTabCallbackArr;
        this.onWarmupCompleted = IAuthTabCallback(iAuthTabCallbackArr);
        this.IAuthTabCallback_Parcel.onExtraCallbackWithResult();
        this.IAuthTabCallback_Parcel.IAuthTabCallback(this);
    }

    private boolean IAuthTabCallback(@Nullable HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0) {
        TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0 textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0OnExtraCallbackWithResult;
        if (handwritingHandlerNodeExternalSyntheticLambda0 != null && (this.access100 & 64) != 0 && (textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0OnExtraCallbackWithResult = OutlinedTextFieldMeasurePolicyExternalSyntheticLambda1.onExtraCallbackWithResult(handwritingHandlerNodeExternalSyntheticLambda0, "auxiliary.tracks.offset")) != null) {
            long jICustomTabsCallbackStubProxy = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallback).ICustomTabsCallbackStubProxy();
            if (jICustomTabsCallbackStubProxy > 0) {
                this.asBinder = jICustomTabsCallbackStubProxy;
                return true;
            }
        }
        return false;
    }

    private void onExtraCallbackWithResult(HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0) {
        TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0 textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0OnExtraCallbackWithResult = OutlinedTextFieldMeasurePolicyExternalSyntheticLambda1.onExtraCallbackWithResult(handwritingHandlerNodeExternalSyntheticLambda0, "auxiliary.tracks.interleaved");
        if (textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0OnExtraCallbackWithResult == null || textFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0OnExtraCallbackWithResult.onExtraCallback[0] != 0) {
            return;
        }
        this.onActivityLayout = this.asBinder + 16;
    }

    private List<Integer> onWarmupCompleted(HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0) {
        List<Integer> listIAuthTabCallback = ((TextFieldDecoratorModifierNodepointerInputNode11ExternalSyntheticLambda0) RecordingInputConnection_androidKt.onWarmupCompleted(OutlinedTextFieldMeasurePolicyExternalSyntheticLambda1.onExtraCallbackWithResult(handwritingHandlerNodeExternalSyntheticLambda0, "auxiliary.tracks.map"))).IAuthTabCallback();
        ArrayList arrayList = new ArrayList(listIAuthTabCallback.size());
        for (int i2 = 0; i2 < listIAuthTabCallback.size(); i2++) {
            int iIntValue = listIAuthTabCallback.get(i2).intValue();
            int i3 = 1;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    i3 = 3;
                    if (iIntValue != 2) {
                        i3 = iIntValue != 3 ? 0 : 4;
                    }
                } else {
                    i3 = 2;
                }
            }
            arrayList.add(Integer.valueOf(i3));
        }
        return arrayList;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    private int onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws ParserException, IOException {
        int i2;
        ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda32;
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback iAuthTabCallback;
        ?? r5;
        int iOnWarmupCompleted;
        long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
        if (this.onRelationshipValidationResult == -1) {
            int iOnNavigationEvent = onNavigationEvent(jIAuthTabCallback);
            this.onRelationshipValidationResult = iOnNavigationEvent;
            if (iOnNavigationEvent == -1) {
                return -1;
            }
        }
        IAuthTabCallback iAuthTabCallback2 = this.isEngagementSignalsApiAvailable[this.onRelationshipValidationResult];
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5 = iAuthTabCallback2.onExtraCallbackWithResult;
        int i3 = iAuthTabCallback2.onExtraCallback;
        ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda14 = iAuthTabCallback2.onWarmupCompleted;
        long j = progressIndicatorKtExternalSyntheticLambda14.IAuthTabCallback[i3] + this.onActivityLayout;
        int i4 = progressIndicatorKtExternalSyntheticLambda14.onTransact[i3];
        ExposedDropdownMenu_androidKtExternalSyntheticLambda8 exposedDropdownMenu_androidKtExternalSyntheticLambda8 = iAuthTabCallback2.onNavigationEvent;
        long j2 = (j - jIAuthTabCallback) + this.onMessageChannelReady;
        if (j2 < 0) {
            i2 = 1;
            exposedDropdownMenuDefaultsExternalSyntheticLambda32 = exposedDropdownMenuDefaultsExternalSyntheticLambda3;
        } else {
            if (j2 < 262144) {
                if (iAuthTabCallback2.IAuthTabCallback.asBinder == 1) {
                    j2 += 8;
                    i4 -= 8;
                }
                drawerKtExternalSyntheticLambda9.onExtraCallback((int) j2);
                if (!onExtraCallbackWithResult(iAuthTabCallback2.IAuthTabCallback.onNavigationEvent)) {
                    this.getInterfaceDescriptor = true;
                }
                ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12 = iAuthTabCallback2.IAuthTabCallback;
                if (progressIndicatorKtExternalSyntheticLambda12.onTransact != 0) {
                    byte[] bArrOnExtraCallback = this.readTypedObject.onExtraCallback();
                    bArrOnExtraCallback[0] = 0;
                    bArrOnExtraCallback[1] = 0;
                    bArrOnExtraCallback[2] = 0;
                    int i5 = 4 - iAuthTabCallback2.IAuthTabCallback.onTransact;
                    i4 += i5;
                    while (this.onMinimized < i4) {
                        int i6 = this.onActivityResized;
                        if (i6 == 0) {
                            ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda122 = iAuthTabCallback2.IAuthTabCallback;
                            int i7 = progressIndicatorKtExternalSyntheticLambda122.onTransact;
                            if (this.getInterfaceDescriptor || TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(progressIndicatorKtExternalSyntheticLambda122.onNavigationEvent) + i7 > iAuthTabCallback2.onWarmupCompleted.onTransact[i3] - this.onMessageChannelReady) {
                                iOnWarmupCompleted = 0;
                            } else {
                                iOnWarmupCompleted = TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(iAuthTabCallback2.IAuthTabCallback.onNavigationEvent);
                                i7 = iAuthTabCallback2.IAuthTabCallback.onTransact + iOnWarmupCompleted;
                            }
                            drawerKtExternalSyntheticLambda9.onNavigationEvent(bArrOnExtraCallback, i5, i7);
                            this.onMessageChannelReady += i7;
                            this.readTypedObject.asBinder(0);
                            int iAsBinder = this.readTypedObject.asBinder();
                            if (iAsBinder < 0) {
                                throw ParserException.onNavigationEvent("Invalid NAL length", (Throwable) null);
                            }
                            this.onActivityResized = iAsBinder - iOnWarmupCompleted;
                            this.extraCallbackWithResult.asBinder(0);
                            exposedDropdownMenu_androidKtExternalSyntheticLambda5.onNavigationEvent(this.extraCallbackWithResult, 4);
                            this.onMinimized += 4;
                            if (iOnWarmupCompleted > 0) {
                                exposedDropdownMenu_androidKtExternalSyntheticLambda5.onNavigationEvent(this.readTypedObject, iOnWarmupCompleted);
                                this.onMinimized += iOnWarmupCompleted;
                                if (TextFieldKeyEventHandlerExternalSyntheticLambda1.IAuthTabCallback(bArrOnExtraCallback, 4, iOnWarmupCompleted, iAuthTabCallback2.IAuthTabCallback.onNavigationEvent)) {
                                    this.getInterfaceDescriptor = true;
                                }
                            }
                        } else {
                            int iOnExtraCallback = exposedDropdownMenu_androidKtExternalSyntheticLambda5.onExtraCallback(drawerKtExternalSyntheticLambda9, i6, false);
                            this.onMessageChannelReady += iOnExtraCallback;
                            this.onMinimized += iOnExtraCallback;
                            this.onActivityResized -= iOnExtraCallback;
                        }
                    }
                    iAuthTabCallback = null;
                } else {
                    iAuthTabCallback = null;
                    if ("audio/ac4".equals(progressIndicatorKtExternalSyntheticLambda12.onNavigationEvent.isEngagementSignalsApiAvailable)) {
                        if (this.onMinimized == 0) {
                            DrawerKtExternalSyntheticLambda3.onExtraCallbackWithResult(i4, this.onUnminimized);
                            exposedDropdownMenu_androidKtExternalSyntheticLambda5.onNavigationEvent(this.onUnminimized, 7);
                            this.onMinimized += 7;
                        }
                        i4 += 7;
                    } else if (exposedDropdownMenu_androidKtExternalSyntheticLambda8 != null) {
                        exposedDropdownMenu_androidKtExternalSyntheticLambda8.onNavigationEvent(drawerKtExternalSyntheticLambda9);
                    }
                    while (true) {
                        int i8 = this.onMinimized;
                        if (i8 >= i4) {
                            break;
                        }
                        int iOnExtraCallback2 = exposedDropdownMenu_androidKtExternalSyntheticLambda5.onExtraCallback(drawerKtExternalSyntheticLambda9, i4 - i8, false);
                        this.onMessageChannelReady += iOnExtraCallback2;
                        this.onMinimized += iOnExtraCallback2;
                        this.onActivityResized -= iOnExtraCallback2;
                    }
                }
                int i9 = i4;
                ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda142 = iAuthTabCallback2.onWarmupCompleted;
                long j3 = progressIndicatorKtExternalSyntheticLambda142.IAuthTabCallbackStub[i3];
                int i10 = progressIndicatorKtExternalSyntheticLambda142.onWarmupCompleted[i3];
                if (!this.getInterfaceDescriptor) {
                    i10 |= 67108864;
                }
                if (exposedDropdownMenu_androidKtExternalSyntheticLambda8 != null) {
                    int i11 = i10;
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback iAuthTabCallback3 = iAuthTabCallback;
                    boolean z = false;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda8.onExtraCallback(exposedDropdownMenu_androidKtExternalSyntheticLambda5, j3, i11, i9, 0, null);
                    r5 = z;
                    if (i3 + 1 == iAuthTabCallback2.onWarmupCompleted.onNavigationEvent) {
                        exposedDropdownMenu_androidKtExternalSyntheticLambda8.onExtraCallback(exposedDropdownMenu_androidKtExternalSyntheticLambda5, iAuthTabCallback3);
                        r5 = z;
                    }
                } else {
                    r5 = 0;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5.onExtraCallback(j3, i10, i9, 0, null);
                }
                iAuthTabCallback2.onExtraCallback++;
                this.onRelationshipValidationResult = -1;
                this.onMessageChannelReady = r5;
                this.onMinimized = r5;
                this.onActivityResized = r5;
                this.getInterfaceDescriptor = r5;
                return r5;
            }
            exposedDropdownMenuDefaultsExternalSyntheticLambda32 = exposedDropdownMenuDefaultsExternalSyntheticLambda3;
            i2 = 1;
        }
        exposedDropdownMenuDefaultsExternalSyntheticLambda32.onWarmupCompleted = j;
        return i2;
    }

    private int onNavigationEvent(long j) {
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        while (true) {
            IAuthTabCallback[] iAuthTabCallbackArr = this.isEngagementSignalsApiAvailable;
            if (i4 >= iAuthTabCallbackArr.length) {
                break;
            }
            IAuthTabCallback iAuthTabCallback = iAuthTabCallbackArr[i4];
            int i5 = iAuthTabCallback.onExtraCallback;
            ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda14 = iAuthTabCallback.onWarmupCompleted;
            if (i5 != progressIndicatorKtExternalSyntheticLambda14.onNavigationEvent) {
                long j5 = progressIndicatorKtExternalSyntheticLambda14.IAuthTabCallback[i5];
                long j6 = ((long[][]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this.onWarmupCompleted}, -1084655742))[i4][i5];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i4;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i3 = i4;
                    j2 = j6;
                }
            }
            i4++;
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i3;
    }

    private void onNavigationEvent(IAuthTabCallback iAuthTabCallback, long j) {
        ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda14 = iAuthTabCallback.onWarmupCompleted;
        int iOnExtraCallback = progressIndicatorKtExternalSyntheticLambda14.onExtraCallback(j);
        if (iOnExtraCallback == -1) {
            iOnExtraCallback = progressIndicatorKtExternalSyntheticLambda14.onExtraCallbackWithResult(j);
        }
        iAuthTabCallback.onExtraCallback = iOnExtraCallback;
    }

    private void asBinder() {
        if (this.access000 != 2 || (this.access100 & 2) == 0) {
            return;
        }
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = this.IAuthTabCallback_Parcel.onExtraCallbackWithResult(0, 4);
        ModalBottomSheetStateExternalSyntheticLambda2 modalBottomSheetStateExternalSyntheticLambda2 = this.extraCallback;
        exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult.onExtraCallbackWithResult(new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().onExtraCallbackWithResult(modalBottomSheetStateExternalSyntheticLambda2 == null ? null : new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{modalBottomSheetStateExternalSyntheticLambda2})).onNavigationEvent());
        this.IAuthTabCallback_Parcel.onExtraCallbackWithResult();
        this.IAuthTabCallback_Parcel.IAuthTabCallback(new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(-9223372036854775807L));
    }

    private void onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        this.onUnminimized.onExtraCallback(8);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.onUnminimized.onExtraCallback(), 0, 8);
        OutlinedTextFieldKtExternalSyntheticLambda9.onNavigationEvent(this.onUnminimized);
        drawerKtExternalSyntheticLambda9.onExtraCallback(this.onUnminimized.onWarmupCompleted());
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
    }

    private void onExtraCallbackWithResult(long j) {
        if (this.IAuthTabCallbackStub == 1836086884) {
            long j2 = this.onExtraCallbackWithResult;
            this.extraCallback = new ModalBottomSheetStateExternalSyntheticLambda2(0L, j, -9223372036854775807L, j + j2, this.asInterface - j2);
        }
    }

    private boolean onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "video/avc") ? (this.access100 & 32) != 0 : Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "video/hevc") && (this.access100 & 128) != 0;
    }

    private static long[][] IAuthTabCallback(IAuthTabCallback[] iAuthTabCallbackArr) {
        long[][] jArr = new long[iAuthTabCallbackArr.length][];
        int[] iArr = new int[iAuthTabCallbackArr.length];
        long[] jArr2 = new long[iAuthTabCallbackArr.length];
        boolean[] zArr = new boolean[iAuthTabCallbackArr.length];
        for (int i2 = 0; i2 < iAuthTabCallbackArr.length; i2++) {
            jArr[i2] = new long[iAuthTabCallbackArr[i2].onWarmupCompleted.onNavigationEvent];
            jArr2[i2] = iAuthTabCallbackArr[i2].onWarmupCompleted.IAuthTabCallbackStub[0];
        }
        long j = 0;
        int i3 = 0;
        while (i3 < iAuthTabCallbackArr.length) {
            long j2 = Long.MAX_VALUE;
            int i4 = -1;
            for (int i5 = 0; i5 < iAuthTabCallbackArr.length; i5++) {
                if (!zArr[i5]) {
                    long j3 = jArr2[i5];
                    if (j3 <= j2) {
                        i4 = i5;
                        j2 = j3;
                    }
                }
            }
            int i6 = iArr[i4];
            long[] jArr3 = jArr[i4];
            jArr3[i6] = j;
            ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda14 = iAuthTabCallbackArr[i4].onWarmupCompleted;
            j += progressIndicatorKtExternalSyntheticLambda14.onTransact[i6];
            int i7 = i6 + 1;
            iArr[i4] = i7;
            if (i7 < jArr3.length) {
                jArr2[i4] = progressIndicatorKtExternalSyntheticLambda14.IAuthTabCallbackStub[i7];
            } else {
                zArr[i4] = true;
                i3++;
            }
        }
        return jArr;
    }

    private static long onExtraCallbackWithResult(ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda14, long j, long j2) {
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(progressIndicatorKtExternalSyntheticLambda14, j);
        return iOnExtraCallbackWithResult == -1 ? j2 : Math.min(progressIndicatorKtExternalSyntheticLambda14.IAuthTabCallback[iOnExtraCallbackWithResult], j2);
    }

    private static int onExtraCallbackWithResult(ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda14, long j) {
        int iOnExtraCallback = progressIndicatorKtExternalSyntheticLambda14.onExtraCallback(j);
        return iOnExtraCallback == -1 ? progressIndicatorKtExternalSyntheticLambda14.onExtraCallbackWithResult(j) : iOnExtraCallback;
    }

    private static int IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
        if (iOnExtraCallbackWithResult != 0) {
            return iOnExtraCallbackWithResult;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent() > 0) {
            int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
            if (iOnExtraCallbackWithResult2 != 0) {
                return iOnExtraCallbackWithResult2;
            }
        }
        return 0;
    }

    static final class IAuthTabCallback {
        public final ProgressIndicatorKtExternalSyntheticLambda12 IAuthTabCallback;
        public int onExtraCallback;
        public final ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onExtraCallbackWithResult;
        public final ExposedDropdownMenu_androidKtExternalSyntheticLambda8 onNavigationEvent;
        public final ProgressIndicatorKtExternalSyntheticLambda14 onWarmupCompleted;

        public IAuthTabCallback(ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12, ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda14, ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5) {
            this.IAuthTabCallback = progressIndicatorKtExternalSyntheticLambda12;
            this.onWarmupCompleted = progressIndicatorKtExternalSyntheticLambda14;
            this.onExtraCallbackWithResult = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
            this.onNavigationEvent = "audio/true-hd".equals(progressIndicatorKtExternalSyntheticLambda12.onNavigationEvent.isEngagementSignalsApiAvailable) ? new ExposedDropdownMenu_androidKtExternalSyntheticLambda8() : null;
        }
    }
}
