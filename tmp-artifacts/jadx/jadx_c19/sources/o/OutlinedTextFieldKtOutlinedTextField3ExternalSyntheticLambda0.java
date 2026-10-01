package o;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.container.ReorderingBufferQueue;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import o.BasicTextContextMenuProviderExternalSyntheticLambda0;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerKtExternalSyntheticLambda27;
import o.DrawerStateExternalSyntheticLambda0;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0;
import o.ProgressIndicatorKtExternalSyntheticLambda12;
import o.RippleKtExternalSyntheticLambda0;
import o.TextFieldDecoratorModifierNodeExternalSyntheticLambda20;
import o.TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0 implements DrawerStateExternalSyntheticLambda0 {
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5[] IAuthTabCallbackDefault;
    private long IAuthTabCallbackStub;
    private final List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> IAuthTabCallbackStubProxy;
    private final ArrayDeque<TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback> IAuthTabCallback_Parcel;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5[] ICustomTabsCallback;
    private final ArrayDeque<onNavigationEvent> ICustomTabsCallbackDefault;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 ICustomTabsCallbackStub;
    private int ICustomTabsCallbackStubProxy;
    private int ICustomTabsCallback_Parcel;
    private long ICustomTabsService;
    private final DrawerKtExternalSyntheticLambda4 access000;
    private long access100;
    private int asBinder;
    private int asInterface;
    private long extraCallback;
    private final MenuKtExternalSyntheticLambda7 extraCallbackWithResult;
    private boolean extraCommand;
    private onWarmupCompleted getInterfaceDescriptor;
    private int isEngagementSignalsApiAvailable;
    private final ReorderingBufferQueue mayLaunchUrl;
    private long newAuthTabSession;
    private long newSession;
    private int newSessionWithExtras;
    private ImmutableList<ExposedDropdownMenu_androidKtExternalSyntheticLambda1> onActivityLayout;
    private boolean onActivityResized;
    private boolean onMessageChannelReady;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onMinimized;
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onNavigationEvent;
    private boolean onPostMessage;
    private int onRelationshipValidationResult;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onTransact;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onUnminimized;
    private final ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onWarmupCompleted;
    private final byte[] postMessage;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 prefetch;
    private final RippleKtExternalSyntheticLambda0.onExtraCallback prefetchWithMultipleUrls;
    private final int readTypedObject;
    private final SparseArray<onWarmupCompleted> receiveFile;
    private final ProgressIndicatorKtExternalSyntheticLambda12 requestPostMessageChannel;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda24 requestPostMessageChannelWithExtras;
    private DrawerStateExternalSyntheticLambda1 writeTypedObject;

    @Deprecated
    public static final DrawerStateExternalSyntheticLambda2 onExtraCallbackWithResult = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda1
        @Override // o.DrawerStateExternalSyntheticLambda2
        public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
            return OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0.onNavigationEvent();
        }
    };
    private static final byte[] onExtraCallback = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallbackDefault("application/x-emsg").onNavigationEvent();

    private static boolean onExtraCallback(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1836019558 || i2 == 1953653094 || i2 == 1836475768 || i2 == 1701082227 || i2 == 1835365473;
    }

    private static boolean onNavigationEvent(int i2) {
        return i2 == 1751411826 || i2 == 1835296868 || i2 == 1836476516 || i2 == 1936286840 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1668576371 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1937011571 || i2 == 1952867444 || i2 == 1952868452 || i2 == 1953196132 || i2 == 1953654136 || i2 == 1953658222 || i2 == 1886614376 || i2 == 1935763834 || i2 == 1935763823 || i2 == 1936027235 || i2 == 1970628964 || i2 == 1935828848 || i2 == 1936158820 || i2 == 1701606260 || i2 == 1835362404 || i2 == 1701671783 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124;
    }

    public static int onWarmupCompleted(int i2) {
        int i3 = (i2 & 1) != 0 ? 64 : 0;
        return (i2 & 2) != 0 ? i3 | 128 : i3;
    }

    public ProgressIndicatorKtExternalSyntheticLambda12 onWarmupCompleted(@Nullable ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12) {
        return progressIndicatorKtExternalSyntheticLambda12;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onWarmupCompleted() {
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] IAuthTabCallback(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        return new DrawerStateExternalSyntheticLambda0[]{new OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0(onextracallback)};
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onNavigationEvent() {
        return new DrawerStateExternalSyntheticLambda0[]{new OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0(RippleKtExternalSyntheticLambda0.onExtraCallback.onExtraCallback, 32)};
    }

    @Deprecated
    public OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0() {
        this(RippleKtExternalSyntheticLambda0.onExtraCallback.onExtraCallback, 32, null, null, ImmutableList.of(), null);
    }

    public OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        this(onextracallback, 0, null, null, ImmutableList.of(), null);
    }

    public OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback, int i2) {
        this(onextracallback, i2, null, null, ImmutableList.of(), null);
    }

    public OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda0(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback, int i2, @Nullable TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, @Nullable ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12, List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list, @Nullable ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5) {
        this.prefetchWithMultipleUrls = onextracallback;
        this.readTypedObject = i2;
        this.requestPostMessageChannelWithExtras = textFieldDecoratorModifierNodeExternalSyntheticLambda24;
        this.requestPostMessageChannel = progressIndicatorKtExternalSyntheticLambda12;
        this.IAuthTabCallbackStubProxy = Collections.unmodifiableList(list);
        this.onWarmupCompleted = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
        this.extraCallbackWithResult = new MenuKtExternalSyntheticLambda7();
        this.onTransact = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(16);
        this.ICustomTabsCallbackStub = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(TextFieldKeyEventHandlerExternalSyntheticLambda1.onNavigationEvent);
        this.onMinimized = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(6);
        this.onUnminimized = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
        byte[] bArr = new byte[16];
        this.postMessage = bArr;
        this.prefetch = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(bArr);
        this.IAuthTabCallback_Parcel = new ArrayDeque<>();
        this.ICustomTabsCallbackDefault = new ArrayDeque<>();
        this.receiveFile = new SparseArray<>();
        this.onActivityLayout = ImmutableList.of();
        this.access100 = -9223372036854775807L;
        this.ICustomTabsService = -9223372036854775807L;
        this.newSession = -9223372036854775807L;
        this.writeTypedObject = DrawerStateExternalSyntheticLambda1.onNavigationEvent;
        this.ICustomTabsCallback = new ExposedDropdownMenu_androidKtExternalSyntheticLambda5[0];
        this.IAuthTabCallbackDefault = new ExposedDropdownMenu_androidKtExternalSyntheticLambda5[0];
        this.mayLaunchUrl = new ReorderingBufferQueue(new ReorderingBufferQueue.OutputConsumer() { // from class: androidx.media3.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda3
            @Override // androidx.media3.container.ReorderingBufferQueue.OutputConsumer
            public final void consume(long j, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
                DrawerKtExternalSyntheticLambda27.onNavigationEvent(j, textFieldDecoratorModifierNodeExternalSyntheticLambda20, this.f$0.IAuthTabCallbackDefault);
            }
        });
        this.access000 = new DrawerKtExternalSyntheticLambda4();
        this.newAuthTabSession = -1L;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        ExposedDropdownMenu_androidKtExternalSyntheticLambda1 exposedDropdownMenu_androidKtExternalSyntheticLambda1OnExtraCallback = ProgressIndicatorKtExternalSyntheticLambda10.onExtraCallback(drawerKtExternalSyntheticLambda9);
        this.onActivityLayout = exposedDropdownMenu_androidKtExternalSyntheticLambda1OnExtraCallback != null ? ImmutableList.of(exposedDropdownMenu_androidKtExternalSyntheticLambda1OnExtraCallback) : ImmutableList.of();
        return exposedDropdownMenu_androidKtExternalSyntheticLambda1OnExtraCallback == null;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public ImmutableList<ExposedDropdownMenu_androidKtExternalSyntheticLambda1> onExtraCallbackWithResult() {
        return this.onActivityLayout;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        if ((this.readTypedObject & 32) == 0) {
            drawerStateExternalSyntheticLambda1 = new ResistanceConfig(drawerStateExternalSyntheticLambda1, this.prefetchWithMultipleUrls);
        }
        this.writeTypedObject = drawerStateExternalSyntheticLambda1;
        asBinder();
        IAuthTabCallbackDefault();
        ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12 = this.requestPostMessageChannel;
        if (progressIndicatorKtExternalSyntheticLambda12 != null) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = progressIndicatorKtExternalSyntheticLambda12.onNavigationEvent.onExtraCallback();
            onextracallbackwithresultOnExtraCallback.onNavigationEvent(OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda1.onExtraCallbackWithResult(this.requestPostMessageChannel.onNavigationEvent));
            this.receiveFile.put(0, new onWarmupCompleted(this.writeTypedObject.onExtraCallbackWithResult(0, this.requestPostMessageChannel.IAuthTabCallback_Parcel), new ProgressIndicatorKtExternalSyntheticLambda14(this.requestPostMessageChannel, new long[0], new int[0], 0, new long[0], new int[0], 0L), new OutlinedTextFieldKtExternalSyntheticLambda7(0, 0, 0, 0), onextracallbackwithresultOnExtraCallback.onNavigationEvent()));
            this.writeTypedObject.onExtraCallbackWithResult();
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        int size = this.receiveFile.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.receiveFile.valueAt(i2).IAuthTabCallbackDefault();
        }
        this.ICustomTabsCallbackDefault.clear();
        this.ICustomTabsCallbackStubProxy = 0;
        this.mayLaunchUrl.onNavigationEvent();
        this.ICustomTabsService = j2;
        this.IAuthTabCallback_Parcel.clear();
        asBinder();
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws ParserException, IOException {
        while (true) {
            int i2 = this.onRelationshipValidationResult;
            if (i2 != 0) {
                if (i2 == 1) {
                    onNavigationEvent(drawerKtExternalSyntheticLambda9);
                } else if (i2 == 2) {
                    onWarmupCompleted(drawerKtExternalSyntheticLambda9);
                } else if (asInterface(drawerKtExternalSyntheticLambda9)) {
                    return 0;
                }
            } else if (!onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9)) {
                long j = this.newAuthTabSession;
                if (j != -1) {
                    exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = j;
                    this.newAuthTabSession = -1L;
                    this.writeTypedObject.IAuthTabCallback(this.access000.onNavigationEvent());
                    this.onPostMessage = true;
                    return 1;
                }
                this.mayLaunchUrl.onExtraCallback();
                return -1;
            }
        }
    }

    private void asBinder() {
        this.onRelationshipValidationResult = 0;
        this.asInterface = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private boolean onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        if (this.asInterface == 0) {
            if (!drawerKtExternalSyntheticLambda9.onExtraCallback(this.onTransact.onExtraCallback(), 0, 8, true)) {
                return false;
            }
            this.asInterface = 8;
            this.onTransact.asBinder(0);
            this.IAuthTabCallbackStub = this.onTransact.onActivityResized();
            this.asBinder = this.onTransact.asBinder();
        }
        long j = this.IAuthTabCallbackStub;
        if (j == 1) {
            drawerKtExternalSyntheticLambda9.onNavigationEvent(this.onTransact.onExtraCallback(), 8, 8);
            this.asInterface += 8;
            this.IAuthTabCallbackStub = this.onTransact.ICustomTabsCallbackStubProxy();
        } else if (j == 0) {
            long jOnExtraCallback = drawerKtExternalSyntheticLambda9.onExtraCallback();
            if (jOnExtraCallback == -1 && !this.IAuthTabCallback_Parcel.isEmpty()) {
                jOnExtraCallback = this.IAuthTabCallback_Parcel.peek().IAuthTabCallback;
            }
            if (jOnExtraCallback != -1) {
                this.IAuthTabCallbackStub = (jOnExtraCallback - drawerKtExternalSyntheticLambda9.IAuthTabCallback()) + this.asInterface;
            }
        }
        long j2 = this.IAuthTabCallbackStub;
        long j3 = this.asInterface;
        if (j2 < j3) {
            throw ParserException.onExtraCallback("Atom size less than header length (unsupported).");
        }
        if (this.newAuthTabSession != -1) {
            if (this.asBinder == 1936286840) {
                this.prefetch.onExtraCallback((int) j2);
                System.arraycopy(this.onTransact.onExtraCallback(), 0, this.prefetch.onExtraCallback(), 0, 8);
                drawerKtExternalSyntheticLambda9.onNavigationEvent(this.prefetch.onExtraCallback(), 8, (int) (this.IAuthTabCallbackStub - this.asInterface));
                this.access000.onExtraCallbackWithResult((DrawerKtExternalSyntheticLambda29) IAuthTabCallback(new TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult(1936286840, this.prefetch).onNavigationEvent, drawerKtExternalSyntheticLambda9.onWarmupCompleted()).second);
            } else {
                drawerKtExternalSyntheticLambda9.IAuthTabCallback((int) (j2 - j3), true);
            }
            asBinder();
            return true;
        }
        long jIAuthTabCallback = drawerKtExternalSyntheticLambda9.IAuthTabCallback() - this.asInterface;
        int i2 = this.asBinder;
        if ((i2 == 1836019558 || i2 == 1835295092) && !this.onMessageChannelReady) {
            this.writeTypedObject.IAuthTabCallback(new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(this.access100, jIAuthTabCallback));
            this.onMessageChannelReady = true;
        }
        if (this.asBinder == 1836019558) {
            int size = this.receiveFile.size();
            for (int i3 = 0; i3 < size; i3++) {
                ProgressIndicatorKtExternalSyntheticLambda15 progressIndicatorKtExternalSyntheticLambda15 = this.receiveFile.valueAt(i3).asBinder;
                progressIndicatorKtExternalSyntheticLambda15.onWarmupCompleted = jIAuthTabCallback;
                progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallback = jIAuthTabCallback;
                progressIndicatorKtExternalSyntheticLambda15.onNavigationEvent = jIAuthTabCallback;
            }
        }
        int i4 = this.asBinder;
        if (i4 == 1835295092) {
            this.getInterfaceDescriptor = null;
            this.extraCallback = jIAuthTabCallback + this.IAuthTabCallbackStub;
            this.onRelationshipValidationResult = 2;
            return true;
        }
        if (onExtraCallback(i4)) {
            long jIAuthTabCallback2 = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
            long j4 = this.IAuthTabCallbackStub;
            long j5 = (jIAuthTabCallback2 + j4) - 8;
            if (j4 != this.asInterface && this.asBinder == 1835365473) {
                IAuthTabCallback(drawerKtExternalSyntheticLambda9);
            }
            this.IAuthTabCallback_Parcel.push(new TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback(this.asBinder, j5));
            if (this.IAuthTabCallbackStub == this.asInterface) {
                onExtraCallbackWithResult(j5);
            } else {
                asBinder();
            }
        } else if (onNavigationEvent(this.asBinder)) {
            if (this.asInterface != 8) {
                throw ParserException.onExtraCallback("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.IAuthTabCallbackStub > 2147483647L) {
                throw ParserException.onExtraCallback("Leaf atom with length > 2147483647 (unsupported).");
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20((int) this.IAuthTabCallbackStub);
            System.arraycopy(this.onTransact.onExtraCallback(), 0, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 0, 8);
            this.onNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20;
            this.onRelationshipValidationResult = 1;
        } else {
            if (this.IAuthTabCallbackStub > 2147483647L) {
                throw ParserException.onExtraCallback("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.onNavigationEvent = null;
            this.onRelationshipValidationResult = 1;
        }
        return true;
    }

    private void IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        this.prefetch.onExtraCallback(8);
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.prefetch.onExtraCallback(), 0, 8);
        OutlinedTextFieldKtExternalSyntheticLambda9.onNavigationEvent(this.prefetch);
        drawerKtExternalSyntheticLambda9.onExtraCallback(this.prefetch.onWarmupCompleted());
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
    }

    private void onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        int i2 = (int) (this.IAuthTabCallbackStub - this.asInterface);
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = this.onNavigationEvent;
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20 != null) {
            drawerKtExternalSyntheticLambda9.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback(), 8, i2);
            onWarmupCompleted(new TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult(this.asBinder, textFieldDecoratorModifierNodeExternalSyntheticLambda20), drawerKtExternalSyntheticLambda9);
        } else {
            drawerKtExternalSyntheticLambda9.onExtraCallback(i2);
        }
        onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9.IAuthTabCallback());
    }

    private void onExtraCallbackWithResult(long j) throws ParserException {
        while (!this.IAuthTabCallback_Parcel.isEmpty() && this.IAuthTabCallback_Parcel.peek().IAuthTabCallback == j) {
            onExtraCallback(this.IAuthTabCallback_Parcel.pop());
        }
        asBinder();
    }

    private void onWarmupCompleted(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult, DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        if (!this.IAuthTabCallback_Parcel.isEmpty()) {
            this.IAuthTabCallback_Parcel.peek().onExtraCallbackWithResult(onextracallbackwithresult);
            return;
        }
        int i2 = onextracallbackwithresult.onExtraCallback;
        if (i2 != 1936286840) {
            if (i2 == 1701671783) {
                onExtraCallback(onextracallbackwithresult.onNavigationEvent);
                return;
            }
            return;
        }
        Pair<Long, DrawerKtExternalSyntheticLambda29> pairIAuthTabCallback = IAuthTabCallback(onextracallbackwithresult.onNavigationEvent, drawerKtExternalSyntheticLambda9.IAuthTabCallback());
        this.access000.onExtraCallbackWithResult((DrawerKtExternalSyntheticLambda29) pairIAuthTabCallback.second);
        if (!this.onMessageChannelReady) {
            this.newSession = ((Long) pairIAuthTabCallback.first).longValue();
            this.writeTypedObject.IAuthTabCallback((ExposedDropdownMenu_androidKtExternalSyntheticLambda4) pairIAuthTabCallback.second);
            this.onMessageChannelReady = true;
        } else {
            if ((this.readTypedObject & 256) == 0 || this.onPostMessage || this.access000.onExtraCallback() <= 1) {
                return;
            }
            this.newAuthTabSession = drawerKtExternalSyntheticLambda9.IAuthTabCallback();
        }
    }

    private void onExtraCallback(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback) throws ParserException {
        int i2 = onextracallback.onExtraCallback;
        if (i2 == 1836019574) {
            IAuthTabCallback(onextracallback);
        } else if (i2 == 1836019558) {
            onNavigationEvent(onextracallback);
        } else {
            if (this.IAuthTabCallback_Parcel.isEmpty()) {
                return;
            }
            this.IAuthTabCallback_Parcel.peek().onExtraCallback(onextracallback);
        }
    }

    private void IAuthTabCallback(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback) throws ParserException {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.requestPostMessageChannel == null, "Unexpected moov box.");
        BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallback = onExtraCallback(onextracallback.onNavigationEvent);
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback2 = (TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback.IAuthTabCallback(1836475768));
        SparseArray<OutlinedTextFieldKtExternalSyntheticLambda7> sparseArray = new SparseArray<>();
        int size = onextracallback2.onNavigationEvent.size();
        long jOnNavigationEvent = -9223372036854775807L;
        for (int i2 = 0; i2 < size; i2++) {
            TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = onextracallback2.onNavigationEvent.get(i2);
            int i3 = onextracallbackwithresult.onExtraCallback;
            if (i3 == 1953654136) {
                Pair<Integer, OutlinedTextFieldKtExternalSyntheticLambda7> pairOnWarmupCompleted = onWarmupCompleted(onextracallbackwithresult.onNavigationEvent);
                sparseArray.put(((Integer) pairOnWarmupCompleted.first).intValue(), (OutlinedTextFieldKtExternalSyntheticLambda7) pairOnWarmupCompleted.second);
            } else if (i3 == 1835362404) {
                jOnNavigationEvent = onNavigationEvent(onextracallbackwithresult.onNavigationEvent);
            }
        }
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallbackIAuthTabCallback = onextracallback.IAuthTabCallback(1835365473);
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent = null;
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0IAuthTabCallback = onextracallbackIAuthTabCallback != null ? OutlinedTextFieldKtExternalSyntheticLambda9.IAuthTabCallback(onextracallbackIAuthTabCallback) : null;
        ElevationOverlayKtExternalSyntheticLambda1 elevationOverlayKtExternalSyntheticLambda1 = new ElevationOverlayKtExternalSyntheticLambda1();
        TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onextracallback.onNavigationEvent(1969517665);
        if (onextracallbackwithresultOnNavigationEvent != null) {
            handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent = OutlinedTextFieldKtExternalSyntheticLambda9.onNavigationEvent(onextracallbackwithresultOnNavigationEvent);
            elevationOverlayKtExternalSyntheticLambda1.onWarmupCompleted(handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent);
        }
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0 = handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent;
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda02 = new HandwritingHandlerNodeExternalSyntheticLambda0(new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[]{OutlinedTextFieldKtExternalSyntheticLambda9.onExtraCallback(((TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback.onNavigationEvent(1836476516))).onNavigationEvent)});
        List<ProgressIndicatorKtExternalSyntheticLambda14> listOnWarmupCompleted = OutlinedTextFieldKtExternalSyntheticLambda9.onWarmupCompleted(onextracallback, elevationOverlayKtExternalSyntheticLambda1, jOnNavigationEvent, basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallback, (this.readTypedObject & 16) != 0, false, (Function<ProgressIndicatorKtExternalSyntheticLambda12, ProgressIndicatorKtExternalSyntheticLambda12>) new Function() { // from class: androidx.media3.extractor.mp4.FragmentedMp4Extractor$$ExternalSyntheticLambda0
            public final Object apply(Object obj) {
                return this.f$0.onWarmupCompleted((ProgressIndicatorKtExternalSyntheticLambda12) obj);
            }
        });
        int size2 = listOnWarmupCompleted.size();
        if (this.receiveFile.size() == 0) {
            String strOnExtraCallbackWithResult = OutlinedTextFieldKtOutlinedTextField3ExternalSyntheticLambda1.onExtraCallbackWithResult(listOnWarmupCompleted);
            int i4 = 0;
            while (i4 < size2) {
                ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda14 = listOnWarmupCompleted.get(i4);
                ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12 = progressIndicatorKtExternalSyntheticLambda14.IAuthTabCallbackDefault;
                ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = this.writeTypedObject.onExtraCallbackWithResult(i4, progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallback_Parcel);
                long j = progressIndicatorKtExternalSyntheticLambda12.onWarmupCompleted;
                BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = progressIndicatorKtExternalSyntheticLambda12.onNavigationEvent.onExtraCallback();
                onextracallbackwithresultOnExtraCallback.onNavigationEvent(strOnExtraCallbackWithResult);
                OutlinedTextFieldMeasurePolicyExternalSyntheticLambda1.onExtraCallbackWithResult(progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallback_Parcel, elevationOverlayKtExternalSyntheticLambda1, onextracallbackwithresultOnExtraCallback);
                OutlinedTextFieldMeasurePolicyExternalSyntheticLambda1.onWarmupCompleted(progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallback_Parcel, handwritingHandlerNodeExternalSyntheticLambda0IAuthTabCallback, onextracallbackwithresultOnExtraCallback, progressIndicatorKtExternalSyntheticLambda12.onNavigationEvent.ICustomTabsCallbackDefault, handwritingHandlerNodeExternalSyntheticLambda0, handwritingHandlerNodeExternalSyntheticLambda02);
                this.receiveFile.put(progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallback, new onWarmupCompleted(exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult, progressIndicatorKtExternalSyntheticLambda14, IAuthTabCallback(sparseArray, progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallback), onextracallbackwithresultOnExtraCallback.onNavigationEvent()));
                this.access100 = Math.max(this.access100, progressIndicatorKtExternalSyntheticLambda12.onWarmupCompleted);
                i4++;
                strOnExtraCallbackWithResult = strOnExtraCallbackWithResult;
            }
            this.writeTypedObject.onExtraCallbackWithResult();
            return;
        }
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.receiveFile.size() == size2);
        for (int i5 = 0; i5 < size2; i5++) {
            ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda142 = listOnWarmupCompleted.get(i5);
            ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda122 = progressIndicatorKtExternalSyntheticLambda142.IAuthTabCallbackDefault;
            this.receiveFile.get(progressIndicatorKtExternalSyntheticLambda122.IAuthTabCallback).onNavigationEvent(progressIndicatorKtExternalSyntheticLambda142, IAuthTabCallback(sparseArray, progressIndicatorKtExternalSyntheticLambda122.IAuthTabCallback));
        }
    }

    private OutlinedTextFieldKtExternalSyntheticLambda7 IAuthTabCallback(SparseArray<OutlinedTextFieldKtExternalSyntheticLambda7> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (OutlinedTextFieldKtExternalSyntheticLambda7) RecordingInputConnection_androidKt.onExtraCallbackWithResult(sparseArray.get(i2));
    }

    private void onNavigationEvent(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback) throws ParserException {
        onNavigationEvent(onextracallback, this.receiveFile, this.requestPostMessageChannel != null, this.readTypedObject, this.postMessage);
        BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallback = onExtraCallback(onextracallback.onNavigationEvent);
        if (basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallback != null) {
            int size = this.receiveFile.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.receiveFile.valueAt(i2).onExtraCallbackWithResult(basicTextContextMenuProviderExternalSyntheticLambda0OnExtraCallback);
            }
        }
        if (this.ICustomTabsService != -9223372036854775807L) {
            int size2 = this.receiveFile.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.receiveFile.valueAt(i3).IAuthTabCallback(this.ICustomTabsService);
            }
            this.ICustomTabsService = -9223372036854775807L;
        }
    }

    private void IAuthTabCallbackDefault() {
        int i2;
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5[] exposedDropdownMenu_androidKtExternalSyntheticLambda5Arr = new ExposedDropdownMenu_androidKtExternalSyntheticLambda5[2];
        this.ICustomTabsCallback = exposedDropdownMenu_androidKtExternalSyntheticLambda5Arr;
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5 = this.onWarmupCompleted;
        int i3 = 0;
        if (exposedDropdownMenu_androidKtExternalSyntheticLambda5 != null) {
            exposedDropdownMenu_androidKtExternalSyntheticLambda5Arr[0] = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = 100;
        if ((this.readTypedObject & 4) != 0) {
            exposedDropdownMenu_androidKtExternalSyntheticLambda5Arr[i2] = this.writeTypedObject.onExtraCallbackWithResult(100, 5);
            i2++;
            i4 = 101;
        }
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5[] exposedDropdownMenu_androidKtExternalSyntheticLambda5Arr2 = (ExposedDropdownMenu_androidKtExternalSyntheticLambda5[]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(this.ICustomTabsCallback, i2);
        this.ICustomTabsCallback = exposedDropdownMenu_androidKtExternalSyntheticLambda5Arr2;
        for (ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda52 : exposedDropdownMenu_androidKtExternalSyntheticLambda5Arr2) {
            exposedDropdownMenu_androidKtExternalSyntheticLambda52.onExtraCallbackWithResult(IAuthTabCallback);
        }
        this.IAuthTabCallbackDefault = new ExposedDropdownMenu_androidKtExternalSyntheticLambda5[this.IAuthTabCallbackStubProxy.size()];
        while (i3 < this.IAuthTabCallbackDefault.length) {
            ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = this.writeTypedObject.onExtraCallbackWithResult(i4, 3);
            exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult.onExtraCallbackWithResult(this.IAuthTabCallbackStubProxy.get(i3));
            this.IAuthTabCallbackDefault[i3] = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
            i3++;
            i4++;
        }
    }

    private void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        long jIAuthTabCallback;
        String str;
        long jIAuthTabCallback2;
        String str2;
        long jOnActivityResized;
        long jOnExtraCallback;
        if (this.ICustomTabsCallback.length != 0) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
            int iOnWarmupCompleted = OutlinedTextFieldKtExternalSyntheticLambda9.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
            if (iOnWarmupCompleted == 0) {
                String str3 = (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCallbackWithResult());
                String str4 = (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCallbackWithResult());
                long jOnActivityResized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
                jIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized(), 1000000L, jOnActivityResized2);
                long j = this.newSession;
                long j2 = j != -9223372036854775807L ? j + jIAuthTabCallback : -9223372036854775807L;
                str = str3;
                jIAuthTabCallback2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized(), 1000L, jOnActivityResized2);
                str2 = str4;
                jOnActivityResized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
                jOnExtraCallback = j2;
            } else {
                if (iOnWarmupCompleted != 1) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iOnWarmupCompleted);
                    return;
                }
                long jOnActivityResized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
                jOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackStubProxy(), 1000000L, jOnActivityResized3);
                long jIAuthTabCallback3 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized(), 1000L, jOnActivityResized3);
                long jOnActivityResized4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
                str = (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCallbackWithResult());
                jIAuthTabCallback2 = jIAuthTabCallback3;
                jOnActivityResized = jOnActivityResized4;
                str2 = (String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda20.extraCallbackWithResult());
                jIAuthTabCallback = -9223372036854775807L;
            }
            byte[] bArr = new byte[textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent()];
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent());
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda202 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(this.extraCallbackWithResult.onExtraCallback(new MenuKtExternalSyntheticLambda3(str, str2, jIAuthTabCallback2, jOnActivityResized, bArr)));
            int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda202.onNavigationEvent();
            for (ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5 : this.ICustomTabsCallback) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda202.asBinder(0);
                exposedDropdownMenu_androidKtExternalSyntheticLambda5.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda202, iOnNavigationEvent);
            }
            if (jOnExtraCallback == -9223372036854775807L) {
                this.ICustomTabsCallbackDefault.addLast(new onNavigationEvent(jIAuthTabCallback, true, iOnNavigationEvent));
                this.ICustomTabsCallbackStubProxy += iOnNavigationEvent;
                return;
            }
            if (!this.ICustomTabsCallbackDefault.isEmpty()) {
                this.ICustomTabsCallbackDefault.addLast(new onNavigationEvent(jOnExtraCallback, false, iOnNavigationEvent));
                this.ICustomTabsCallbackStubProxy += iOnNavigationEvent;
                return;
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24 = this.requestPostMessageChannelWithExtras;
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda24 != null && !textFieldDecoratorModifierNodeExternalSyntheticLambda24.onExtraCallback()) {
                this.ICustomTabsCallbackDefault.addLast(new onNavigationEvent(jOnExtraCallback, false, iOnNavigationEvent));
                this.ICustomTabsCallbackStubProxy += iOnNavigationEvent;
                return;
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda242 = this.requestPostMessageChannelWithExtras;
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda242 != null) {
                jOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda242.onExtraCallback(jOnExtraCallback);
            }
            for (ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda52 : this.ICustomTabsCallback) {
                exposedDropdownMenu_androidKtExternalSyntheticLambda52.onExtraCallback(jOnExtraCallback, 1, iOnNavigationEvent, 0, null);
            }
        }
    }

    private static Pair<Integer, OutlinedTextFieldKtExternalSyntheticLambda7> onWarmupCompleted(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(12);
        return Pair.create(Integer.valueOf(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder()), new OutlinedTextFieldKtExternalSyntheticLambda7(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() - 1, textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(), textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder()));
    }

    private static long onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        return OutlinedTextFieldKtExternalSyntheticLambda9.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder()) == 0 ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized() : textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackStubProxy();
    }

    private static void onNavigationEvent(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback, SparseArray<onWarmupCompleted> sparseArray, boolean z, int i2, byte[] bArr) throws ParserException {
        int size = onextracallback.onExtraCallbackWithResult.size();
        for (int i3 = 0; i3 < size; i3++) {
            TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback2 = onextracallback.onExtraCallbackWithResult.get(i3);
            if (onextracallback2.onExtraCallback == 1953653094) {
                onExtraCallbackWithResult(onextracallback2, sparseArray, z, i2, bArr);
            }
        }
    }

    private static void onExtraCallbackWithResult(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback, SparseArray<onWarmupCompleted> sparseArray, boolean z, int i2, byte[] bArr) throws ParserException {
        onWarmupCompleted onwarmupcompletedOnExtraCallbackWithResult = onExtraCallbackWithResult(((TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallback.onNavigationEvent(1952868452))).onNavigationEvent, sparseArray, z);
        if (onwarmupcompletedOnExtraCallbackWithResult != null) {
            ProgressIndicatorKtExternalSyntheticLambda15 progressIndicatorKtExternalSyntheticLambda15 = onwarmupcompletedOnExtraCallbackWithResult.asBinder;
            long j = progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallbackDefault;
            boolean z2 = progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallbackStub;
            onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallbackDefault();
            onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallbackStubProxy = true;
            TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onextracallback.onNavigationEvent(1952867444);
            if (onextracallbackwithresultOnNavigationEvent != null && (i2 & 2) == 0) {
                progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallbackDefault = IAuthTabCallback(onextracallbackwithresultOnNavigationEvent.onNavigationEvent);
                progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallbackStub = true;
            } else {
                progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallbackDefault = j;
                progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallbackStub = z2;
            }
            onExtraCallback(onextracallback, onwarmupcompletedOnExtraCallbackWithResult, i2);
            ProgressIndicatorKtExternalSyntheticLambda11 progressIndicatorKtExternalSyntheticLambda11IAuthTabCallback = onwarmupcompletedOnExtraCallbackWithResult.IAuthTabCallbackStub.IAuthTabCallbackDefault.IAuthTabCallback(((OutlinedTextFieldKtExternalSyntheticLambda7) RecordingInputConnection_androidKt.onExtraCallbackWithResult(progressIndicatorKtExternalSyntheticLambda15.onExtraCallbackWithResult)).onExtraCallback);
            TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent2 = onextracallback.onNavigationEvent(1935763834);
            if (onextracallbackwithresultOnNavigationEvent2 != null) {
                onExtraCallbackWithResult((ProgressIndicatorKtExternalSyntheticLambda11) RecordingInputConnection_androidKt.onExtraCallbackWithResult(progressIndicatorKtExternalSyntheticLambda11IAuthTabCallback), onextracallbackwithresultOnNavigationEvent2.onNavigationEvent, progressIndicatorKtExternalSyntheticLambda15);
            }
            TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent3 = onextracallback.onNavigationEvent(1935763823);
            if (onextracallbackwithresultOnNavigationEvent3 != null) {
                IAuthTabCallback(onextracallbackwithresultOnNavigationEvent3.onNavigationEvent, progressIndicatorKtExternalSyntheticLambda15);
            }
            TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent4 = onextracallback.onNavigationEvent(1936027235);
            if (onextracallbackwithresultOnNavigationEvent4 != null) {
                onExtraCallback(onextracallbackwithresultOnNavigationEvent4.onNavigationEvent, progressIndicatorKtExternalSyntheticLambda15);
            }
            onNavigationEvent(onextracallback, progressIndicatorKtExternalSyntheticLambda11IAuthTabCallback != null ? progressIndicatorKtExternalSyntheticLambda11IAuthTabCallback.IAuthTabCallback : null, progressIndicatorKtExternalSyntheticLambda15);
            int size = onextracallback.onNavigationEvent.size();
            for (int i3 = 0; i3 < size; i3++) {
                TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = onextracallback.onNavigationEvent.get(i3);
                if (onextracallbackwithresult.onExtraCallback == 1970628964) {
                    onExtraCallbackWithResult(onextracallbackwithresult.onNavigationEvent, progressIndicatorKtExternalSyntheticLambda15, bArr);
                }
            }
        }
    }

    private static void onExtraCallback(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback, onWarmupCompleted onwarmupcompleted, int i2) throws ParserException {
        List<TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult> list = onextracallback.onNavigationEvent;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = list.get(i5);
            if (onextracallbackwithresult.onExtraCallback == 1953658222) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = onextracallbackwithresult.onNavigationEvent;
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(12);
                int iICustomTabsCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
                if (iICustomTabsCallbackDefault > 0) {
                    i4 += iICustomTabsCallbackDefault;
                    i3++;
                }
            }
        }
        onwarmupcompleted.onNavigationEvent = 0;
        onwarmupcompleted.onWarmupCompleted = 0;
        onwarmupcompleted.IAuthTabCallback = 0;
        onwarmupcompleted.asBinder.onNavigationEvent(i3, i4);
        int i6 = 0;
        int iOnExtraCallback = 0;
        for (int i7 = 0; i7 < size; i7++) {
            TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult2 = list.get(i7);
            if (onextracallbackwithresult2.onExtraCallback == 1953658222) {
                iOnExtraCallback = onExtraCallback(onwarmupcompleted, i6, i2, onextracallbackwithresult2.onNavigationEvent, iOnExtraCallback);
                i6++;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static void onExtraCallbackWithResult(ProgressIndicatorKtExternalSyntheticLambda11 progressIndicatorKtExternalSyntheticLambda11, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, ProgressIndicatorKtExternalSyntheticLambda15 progressIndicatorKtExternalSyntheticLambda15) throws ParserException {
        int i2;
        int i3 = progressIndicatorKtExternalSyntheticLambda11.onNavigationEvent;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        if ((OutlinedTextFieldKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder()) & 1) == 1) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(8);
        }
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int iICustomTabsCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
        if (iICustomTabsCallbackDefault > progressIndicatorKtExternalSyntheticLambda15.asInterface) {
            throw ParserException.onNavigationEvent("Saiz sample count " + iICustomTabsCallbackDefault + " is greater than fragment sample count" + progressIndicatorKtExternalSyntheticLambda15.asInterface, (Throwable) null);
        }
        if (iOnMinimized == 0) {
            boolean[] zArr = progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallbackStubProxy;
            i2 = 0;
            for (int i4 = 0; i4 < iICustomTabsCallbackDefault; i4++) {
                int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
                i2 += iOnMinimized2;
                zArr[i4] = iOnMinimized2 > i3;
            }
        } else {
            i2 = iOnMinimized * iICustomTabsCallbackDefault;
            Arrays.fill(progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallbackStubProxy, 0, iICustomTabsCallbackDefault, iOnMinimized > i3);
        }
        Arrays.fill(progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallbackStubProxy, iICustomTabsCallbackDefault, progressIndicatorKtExternalSyntheticLambda15.asInterface, false);
        if (i2 > 0) {
            progressIndicatorKtExternalSyntheticLambda15.onNavigationEvent(i2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, ProgressIndicatorKtExternalSyntheticLambda15 progressIndicatorKtExternalSyntheticLambda15) throws ParserException {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        if ((OutlinedTextFieldKtExternalSyntheticLambda9.IAuthTabCallback(iAsBinder) & 1) == 1) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(8);
        }
        int iICustomTabsCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
        if (iICustomTabsCallbackDefault != 1) {
            throw ParserException.onNavigationEvent("Unexpected saio entry count: " + iICustomTabsCallbackDefault, (Throwable) null);
        }
        progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallback += OutlinedTextFieldKtExternalSyntheticLambda9.onWarmupCompleted(iAsBinder) == 0 ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized() : textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackStubProxy();
    }

    private static onWarmupCompleted onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, SparseArray<onWarmupCompleted> sparseArray, boolean z) {
        int iAsBinder;
        int iAsBinder2;
        int iAsBinder3;
        int iAsBinder4;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        int iIAuthTabCallback = OutlinedTextFieldKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
        onWarmupCompleted onwarmupcompletedValueAt = z ? sparseArray.valueAt(0) : sparseArray.get(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
        if (onwarmupcompletedValueAt == null) {
            return null;
        }
        if ((iIAuthTabCallback & 1) != 0) {
            long jICustomTabsCallbackStubProxy = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackStubProxy();
            ProgressIndicatorKtExternalSyntheticLambda15 progressIndicatorKtExternalSyntheticLambda15 = onwarmupcompletedValueAt.asBinder;
            progressIndicatorKtExternalSyntheticLambda15.onNavigationEvent = jICustomTabsCallbackStubProxy;
            progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallback = jICustomTabsCallbackStubProxy;
        }
        OutlinedTextFieldKtExternalSyntheticLambda7 outlinedTextFieldKtExternalSyntheticLambda7 = onwarmupcompletedValueAt.onExtraCallbackWithResult;
        if ((iIAuthTabCallback & 2) != 0) {
            iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() - 1;
        } else {
            iAsBinder = outlinedTextFieldKtExternalSyntheticLambda7.onExtraCallback;
        }
        if ((iIAuthTabCallback & 8) != 0) {
            iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        } else {
            iAsBinder2 = outlinedTextFieldKtExternalSyntheticLambda7.onNavigationEvent;
        }
        if ((iIAuthTabCallback & 16) != 0) {
            iAsBinder3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        } else {
            iAsBinder3 = outlinedTextFieldKtExternalSyntheticLambda7.onExtraCallbackWithResult;
        }
        if ((iIAuthTabCallback & 32) != 0) {
            iAsBinder4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        } else {
            iAsBinder4 = outlinedTextFieldKtExternalSyntheticLambda7.IAuthTabCallback;
        }
        onwarmupcompletedValueAt.asBinder.onExtraCallbackWithResult = new OutlinedTextFieldKtExternalSyntheticLambda7(iAsBinder, iAsBinder2, iAsBinder3, iAsBinder4);
        return onwarmupcompletedValueAt;
    }

    private static long IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        return OutlinedTextFieldKtExternalSyntheticLambda9.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder()) == 1 ? textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackStubProxy() : textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
    }

    private static boolean onNavigationEvent(ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12) {
        long[] jArr = progressIndicatorKtExternalSyntheticLambda12.onExtraCallback;
        if (jArr != null && jArr.length == 1 && progressIndicatorKtExternalSyntheticLambda12.onExtraCallbackWithResult != null) {
            long j = jArr[0];
            if (j == 0 || TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j, 1000000L, progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallbackDefault) + TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(progressIndicatorKtExternalSyntheticLambda12.onExtraCallbackWithResult[0], 1000000L, progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallbackStub) >= progressIndicatorKtExternalSyntheticLambda12.onWarmupCompleted) {
                return true;
            }
        }
        return false;
    }

    private static int onExtraCallback(onWarmupCompleted onwarmupcompleted, int i2, int i3, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i4) throws ParserException {
        long j;
        boolean z;
        int iAsBinder;
        int i5;
        int iAsBinder2;
        boolean z2;
        int iAsBinder3;
        boolean z3;
        OutlinedTextFieldKtExternalSyntheticLambda7 outlinedTextFieldKtExternalSyntheticLambda7;
        int i6;
        int iAsBinder4;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        int iIAuthTabCallback = OutlinedTextFieldKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
        ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12 = onwarmupcompleted.IAuthTabCallbackStub.IAuthTabCallbackDefault;
        ProgressIndicatorKtExternalSyntheticLambda15 progressIndicatorKtExternalSyntheticLambda15 = onwarmupcompleted.asBinder;
        OutlinedTextFieldKtExternalSyntheticLambda7 outlinedTextFieldKtExternalSyntheticLambda72 = (OutlinedTextFieldKtExternalSyntheticLambda7) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{progressIndicatorKtExternalSyntheticLambda15.onExtraCallbackWithResult}, -1084655742);
        progressIndicatorKtExternalSyntheticLambda15.writeTypedObject[i2] = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
        long[] jArr = progressIndicatorKtExternalSyntheticLambda15.ICustomTabsCallback;
        long j2 = progressIndicatorKtExternalSyntheticLambda15.onNavigationEvent;
        jArr[i2] = j2;
        if ((iIAuthTabCallback & 1) != 0) {
            jArr[i2] = j2 + textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        }
        boolean z4 = (iIAuthTabCallback & 4) != 0;
        int iAsBinder5 = outlinedTextFieldKtExternalSyntheticLambda72.IAuthTabCallback;
        if (z4) {
            iAsBinder5 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
        }
        boolean z5 = (iIAuthTabCallback & 256) != 0;
        boolean z6 = (iIAuthTabCallback & 512) != 0;
        boolean z7 = (iIAuthTabCallback & 1024) != 0;
        boolean z8 = (iIAuthTabCallback & 2048) != 0;
        if (onNavigationEvent(progressIndicatorKtExternalSyntheticLambda12)) {
            j = ((long[]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{progressIndicatorKtExternalSyntheticLambda12.onExtraCallbackWithResult}, -1084655742))[0];
        } else {
            j = 0;
        }
        int[] iArr = progressIndicatorKtExternalSyntheticLambda15.getInterfaceDescriptor;
        long[] jArr2 = progressIndicatorKtExternalSyntheticLambda15.access100;
        boolean[] zArr = progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallback_Parcel;
        boolean z9 = progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallback_Parcel == 2 && (i3 & 1) != 0;
        int i7 = i4 + progressIndicatorKtExternalSyntheticLambda15.writeTypedObject[i2];
        int i8 = iAsBinder5;
        long j3 = progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallbackStub;
        boolean z10 = z9;
        ProgressIndicatorKtExternalSyntheticLambda15 progressIndicatorKtExternalSyntheticLambda152 = progressIndicatorKtExternalSyntheticLambda15;
        long j4 = progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallbackDefault;
        int i9 = i4;
        while (i9 < i7) {
            if (z5) {
                iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
                z = z5;
            } else {
                z = z5;
                iAsBinder = outlinedTextFieldKtExternalSyntheticLambda72.onNavigationEvent;
            }
            int iIAuthTabCallback2 = IAuthTabCallback(iAsBinder);
            if (z6) {
                iAsBinder2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
                i5 = i7;
            } else {
                i5 = i7;
                iAsBinder2 = outlinedTextFieldKtExternalSyntheticLambda72.onExtraCallbackWithResult;
            }
            int iIAuthTabCallback3 = IAuthTabCallback(iAsBinder2);
            if (z7) {
                z2 = z4;
                iAsBinder3 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            } else if (i9 == 0 && z4) {
                z2 = z4;
                iAsBinder3 = i8;
            } else {
                z2 = z4;
                iAsBinder3 = outlinedTextFieldKtExternalSyntheticLambda72.IAuthTabCallback;
            }
            if (z8) {
                z3 = z8;
                outlinedTextFieldKtExternalSyntheticLambda7 = outlinedTextFieldKtExternalSyntheticLambda72;
                i6 = iAsBinder3;
                iAsBinder4 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            } else {
                z3 = z8;
                outlinedTextFieldKtExternalSyntheticLambda7 = outlinedTextFieldKtExternalSyntheticLambda72;
                i6 = iAsBinder3;
                iAsBinder4 = 0;
            }
            long jIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback((iAsBinder4 + j4) - j, 1000000L, j3);
            jArr2[i9] = jIAuthTabCallback;
            long j5 = j3;
            ProgressIndicatorKtExternalSyntheticLambda15 progressIndicatorKtExternalSyntheticLambda153 = progressIndicatorKtExternalSyntheticLambda152;
            if (!progressIndicatorKtExternalSyntheticLambda153.IAuthTabCallbackStub) {
                jArr2[i9] = jIAuthTabCallback + onwarmupcompleted.IAuthTabCallbackStub.onExtraCallbackWithResult;
            }
            iArr[i9] = iIAuthTabCallback3;
            zArr[i9] = ((i6 >> 16) & 1) == 0 && (!z10 || i9 == 0);
            j4 += iIAuthTabCallback2;
            i9++;
            i7 = i5;
            progressIndicatorKtExternalSyntheticLambda152 = progressIndicatorKtExternalSyntheticLambda153;
            j3 = j5;
            z5 = z;
            z4 = z2;
            z8 = z3;
            outlinedTextFieldKtExternalSyntheticLambda72 = outlinedTextFieldKtExternalSyntheticLambda7;
        }
        int i10 = i7;
        progressIndicatorKtExternalSyntheticLambda152.IAuthTabCallbackDefault = j4;
        return i10;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static int IAuthTabCallback(int i2) throws ParserException {
        if (i2 >= 0) {
            return i2;
        }
        throw ParserException.onNavigationEvent("Unexpected negative value: " + i2, (Throwable) null);
    }

    private static void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, ProgressIndicatorKtExternalSyntheticLambda15 progressIndicatorKtExternalSyntheticLambda15, byte[] bArr) throws ParserException {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(bArr, 0, 16);
        if (Arrays.equals(bArr, onExtraCallback)) {
            onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, 16, progressIndicatorKtExternalSyntheticLambda15);
        }
    }

    private static void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, ProgressIndicatorKtExternalSyntheticLambda15 progressIndicatorKtExternalSyntheticLambda15) throws ParserException {
        onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, 0, progressIndicatorKtExternalSyntheticLambda15);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, ProgressIndicatorKtExternalSyntheticLambda15 progressIndicatorKtExternalSyntheticLambda15) throws ParserException {
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(i2 + 8);
        int iIAuthTabCallback = OutlinedTextFieldKtExternalSyntheticLambda9.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
        if ((iIAuthTabCallback & 1) != 0) {
            throw ParserException.onExtraCallback("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iIAuthTabCallback & 2) != 0;
        int iICustomTabsCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault();
        if (iICustomTabsCallbackDefault == 0) {
            Arrays.fill(progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallbackStubProxy, 0, progressIndicatorKtExternalSyntheticLambda15.asInterface, false);
            return;
        }
        if (iICustomTabsCallbackDefault != progressIndicatorKtExternalSyntheticLambda15.asInterface) {
            throw ParserException.onNavigationEvent("Senc sample count " + iICustomTabsCallbackDefault + " is different from fragment sample count" + progressIndicatorKtExternalSyntheticLambda15.asInterface, (Throwable) null);
        }
        Arrays.fill(progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallbackStubProxy, 0, iICustomTabsCallbackDefault, z);
        progressIndicatorKtExternalSyntheticLambda15.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onNavigationEvent());
        progressIndicatorKtExternalSyntheticLambda15.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static void onNavigationEvent(TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallback onextracallback, @Nullable String str, ProgressIndicatorKtExternalSyntheticLambda15 progressIndicatorKtExternalSyntheticLambda15) throws ParserException {
        byte[] bArr;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = null;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda202 = null;
        for (int i2 = 0; i2 < onextracallback.onNavigationEvent.size(); i2++) {
            TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = onextracallback.onNavigationEvent.get(i2);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda203 = onextracallbackwithresult.onNavigationEvent;
            int i3 = onextracallbackwithresult.onExtraCallback;
            if (i3 == 1935828848) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda203.asBinder(12);
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda203.asBinder() == 1936025959) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20 = textFieldDecoratorModifierNodeExternalSyntheticLambda203;
                }
            } else if (i3 == 1936158820) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda203.asBinder(12);
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda203.asBinder() == 1936025959) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda202 = textFieldDecoratorModifierNodeExternalSyntheticLambda203;
                }
            }
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20 == null || textFieldDecoratorModifierNodeExternalSyntheticLambda202 == null) {
            return;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        int iOnWarmupCompleted = OutlinedTextFieldKtExternalSyntheticLambda9.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        if (iOnWarmupCompleted == 1) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder() != 1) {
            throw ParserException.onExtraCallback("Entry count in sbgp != 1 (unsupported).");
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda202.asBinder(8);
        int iOnWarmupCompleted2 = OutlinedTextFieldKtExternalSyntheticLambda9.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda202.asBinder());
        textFieldDecoratorModifierNodeExternalSyntheticLambda202.IAuthTabCallbackDefault(4);
        if (iOnWarmupCompleted2 == 1) {
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda202.onActivityResized() == 0) {
                throw ParserException.onExtraCallback("Variable length description in sgpd found (unsupported)");
            }
        } else if (iOnWarmupCompleted2 >= 2) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda202.IAuthTabCallbackDefault(4);
        }
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda202.onActivityResized() != 1) {
            throw ParserException.onExtraCallback("Entry count in sgpd != 1 (unsupported).");
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda202.IAuthTabCallbackDefault(1);
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda202.onMinimized();
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda202.onMinimized() == 1) {
            int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda202.onMinimized();
            byte[] bArr2 = new byte[16];
            textFieldDecoratorModifierNodeExternalSyntheticLambda202.onWarmupCompleted(bArr2, 0, 16);
            if (iOnMinimized2 == 0) {
                int iOnMinimized3 = textFieldDecoratorModifierNodeExternalSyntheticLambda202.onMinimized();
                byte[] bArr3 = new byte[iOnMinimized3];
                textFieldDecoratorModifierNodeExternalSyntheticLambda202.onWarmupCompleted(bArr3, 0, iOnMinimized3);
                bArr = bArr3;
            } else {
                bArr = null;
            }
            progressIndicatorKtExternalSyntheticLambda15.onExtraCallback = true;
            progressIndicatorKtExternalSyntheticLambda15.access000 = new ProgressIndicatorKtExternalSyntheticLambda11(true, str, iOnMinimized2, bArr2, (iOnMinimized & 240) >> 4, iOnMinimized & 15, bArr);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static Pair<Long, DrawerKtExternalSyntheticLambda29> IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, long j) throws ParserException {
        long jICustomTabsCallbackStubProxy;
        long jICustomTabsCallbackStubProxy2;
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(8);
        int iOnWarmupCompleted = OutlinedTextFieldKtExternalSyntheticLambda9.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder());
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        long jOnActivityResized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
        if (iOnWarmupCompleted == 0) {
            jICustomTabsCallbackStubProxy = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
            jICustomTabsCallbackStubProxy2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
        } else {
            jICustomTabsCallbackStubProxy = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackStubProxy();
            jICustomTabsCallbackStubProxy2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackStubProxy();
        }
        long j2 = jICustomTabsCallbackStubProxy;
        long j3 = jICustomTabsCallbackStubProxy2;
        long jIAuthTabCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j2, 1000000L, jOnActivityResized);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
        int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        int[] iArr = new int[iOnUnminimized];
        long[] jArr = new long[iOnUnminimized];
        long[] jArr2 = new long[iOnUnminimized];
        long[] jArr3 = new long[iOnUnminimized];
        long j4 = j + j3;
        int i2 = 0;
        long j5 = jIAuthTabCallback;
        long j6 = j2;
        long j7 = j4;
        while (i2 < iOnUnminimized) {
            int iAsBinder = textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder();
            if ((iAsBinder & Integer.MIN_VALUE) != 0) {
                throw ParserException.onNavigationEvent("Unhandled indirect reference", (Throwable) null);
            }
            long jOnActivityResized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onActivityResized();
            iArr[i2] = iAsBinder & Integer.MAX_VALUE;
            jArr[i2] = j7;
            jArr3[i2] = j5;
            long j8 = j6 + jOnActivityResized2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i3 = iOnUnminimized;
            long jIAuthTabCallback2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(j8, 1000000L, jOnActivityResized);
            jArr4[i2] = jIAuthTabCallback2 - jArr5[i2];
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
            j7 += r1[i2];
            i2++;
            iArr = iArr;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            iOnUnminimized = i3;
            jIAuthTabCallback = jIAuthTabCallback;
            j6 = j8;
            j5 = jIAuthTabCallback2;
        }
        return Pair.create(Long.valueOf(jIAuthTabCallback), new DrawerKtExternalSyntheticLambda29(iArr, jArr, jArr2, jArr3));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private void onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        int size = this.receiveFile.size();
        long j = Long.MAX_VALUE;
        onWarmupCompleted onwarmupcompletedValueAt = null;
        for (int i2 = 0; i2 < size; i2++) {
            ProgressIndicatorKtExternalSyntheticLambda15 progressIndicatorKtExternalSyntheticLambda15 = this.receiveFile.valueAt(i2).asBinder;
            if (progressIndicatorKtExternalSyntheticLambda15.asBinder) {
                long j2 = progressIndicatorKtExternalSyntheticLambda15.IAuthTabCallback;
                if (j2 < j) {
                    onwarmupcompletedValueAt = this.receiveFile.valueAt(i2);
                    j = j2;
                }
            }
        }
        if (onwarmupcompletedValueAt == null) {
            this.onRelationshipValidationResult = 3;
            return;
        }
        int iIAuthTabCallback = (int) (j - drawerKtExternalSyntheticLambda9.IAuthTabCallback());
        if (iIAuthTabCallback < 0) {
            throw ParserException.onNavigationEvent("Offset to encryption data was negative.", (Throwable) null);
        }
        drawerKtExternalSyntheticLambda9.onExtraCallback(iIAuthTabCallback);
        onwarmupcompletedValueAt.asBinder.IAuthTabCallback(drawerKtExternalSyntheticLambda9);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean asInterface(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        int iOnExtraCallback;
        onWarmupCompleted onwarmupcompletedOnNavigationEvent = this.getInterfaceDescriptor;
        if (onwarmupcompletedOnNavigationEvent == null) {
            onwarmupcompletedOnNavigationEvent = onNavigationEvent(this.receiveFile);
            if (onwarmupcompletedOnNavigationEvent == null) {
                int iIAuthTabCallback = (int) (this.extraCallback - drawerKtExternalSyntheticLambda9.IAuthTabCallback());
                if (iIAuthTabCallback < 0) {
                    throw ParserException.onNavigationEvent("Offset to end of mdat was negative.", (Throwable) null);
                }
                drawerKtExternalSyntheticLambda9.onExtraCallback(iIAuthTabCallback);
                asBinder();
                return false;
            }
            int iOnNavigationEvent = (int) (onwarmupcompletedOnNavigationEvent.onNavigationEvent() - drawerKtExternalSyntheticLambda9.IAuthTabCallback());
            if (iOnNavigationEvent < 0) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                iOnNavigationEvent = 0;
            }
            drawerKtExternalSyntheticLambda9.onExtraCallback(iOnNavigationEvent);
            this.getInterfaceDescriptor = onwarmupcompletedOnNavigationEvent;
        }
        if (this.onRelationshipValidationResult == 3) {
            this.newSessionWithExtras = onwarmupcompletedOnNavigationEvent.onExtraCallbackWithResult();
            this.onActivityResized = !onNavigationEvent(onwarmupcompletedOnNavigationEvent.IAuthTabCallbackStub.IAuthTabCallbackDefault.onNavigationEvent);
            if (onwarmupcompletedOnNavigationEvent.IAuthTabCallback < onwarmupcompletedOnNavigationEvent.onExtraCallback) {
                drawerKtExternalSyntheticLambda9.onExtraCallback(this.newSessionWithExtras);
                onwarmupcompletedOnNavigationEvent.onTransact();
                if (!onwarmupcompletedOnNavigationEvent.asInterface()) {
                    this.getInterfaceDescriptor = null;
                }
                this.onRelationshipValidationResult = 3;
                return true;
            }
            if (onwarmupcompletedOnNavigationEvent.IAuthTabCallbackStub.IAuthTabCallbackDefault.asBinder == 1) {
                this.newSessionWithExtras -= 8;
                drawerKtExternalSyntheticLambda9.onExtraCallback(8);
            }
            if ("audio/ac4".equals(onwarmupcompletedOnNavigationEvent.IAuthTabCallbackStub.IAuthTabCallbackDefault.onNavigationEvent.isEngagementSignalsApiAvailable)) {
                this.isEngagementSignalsApiAvailable = onwarmupcompletedOnNavigationEvent.IAuthTabCallback(this.newSessionWithExtras, 7);
                DrawerKtExternalSyntheticLambda3.onExtraCallbackWithResult(this.newSessionWithExtras, this.prefetch);
                onwarmupcompletedOnNavigationEvent.asInterface.onNavigationEvent(this.prefetch, 7);
                this.isEngagementSignalsApiAvailable += 7;
            } else {
                this.isEngagementSignalsApiAvailable = onwarmupcompletedOnNavigationEvent.IAuthTabCallback(this.newSessionWithExtras, 0);
            }
            this.newSessionWithExtras += this.isEngagementSignalsApiAvailable;
            this.onRelationshipValidationResult = 4;
            this.ICustomTabsCallback_Parcel = 0;
        }
        ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12 = onwarmupcompletedOnNavigationEvent.IAuthTabCallbackStub.IAuthTabCallbackDefault;
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5 = onwarmupcompletedOnNavigationEvent.asInterface;
        long jOnExtraCallback = onwarmupcompletedOnNavigationEvent.onExtraCallback();
        TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24 = this.requestPostMessageChannelWithExtras;
        if (textFieldDecoratorModifierNodeExternalSyntheticLambda24 != null) {
            jOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda24.onExtraCallback(jOnExtraCallback);
        }
        long j = jOnExtraCallback;
        if (progressIndicatorKtExternalSyntheticLambda12.onTransact == 0) {
            while (true) {
                int i2 = this.isEngagementSignalsApiAvailable;
                int i3 = this.newSessionWithExtras;
                if (i2 >= i3) {
                    break;
                }
                this.isEngagementSignalsApiAvailable += exposedDropdownMenu_androidKtExternalSyntheticLambda5.onExtraCallback(drawerKtExternalSyntheticLambda9, i3 - i2, false);
            }
        } else {
            byte[] bArrOnExtraCallback = this.onMinimized.onExtraCallback();
            bArrOnExtraCallback[0] = 0;
            bArrOnExtraCallback[1] = 0;
            bArrOnExtraCallback[2] = 0;
            int i4 = 4 - progressIndicatorKtExternalSyntheticLambda12.onTransact;
            while (this.isEngagementSignalsApiAvailable < this.newSessionWithExtras) {
                int i5 = this.ICustomTabsCallback_Parcel;
                if (i5 == 0) {
                    if (this.IAuthTabCallbackDefault.length > 0 || !this.onActivityResized) {
                        int iOnWarmupCompleted = TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(progressIndicatorKtExternalSyntheticLambda12.onNavigationEvent);
                        if (progressIndicatorKtExternalSyntheticLambda12.onTransact + iOnWarmupCompleted > this.newSessionWithExtras - this.isEngagementSignalsApiAvailable) {
                            iOnWarmupCompleted = 0;
                        }
                        drawerKtExternalSyntheticLambda9.onNavigationEvent(bArrOnExtraCallback, i4, progressIndicatorKtExternalSyntheticLambda12.onTransact + iOnWarmupCompleted);
                        this.onMinimized.asBinder(0);
                        int iAsBinder = this.onMinimized.asBinder();
                        if (iAsBinder < 0) {
                            throw ParserException.onNavigationEvent("Invalid NAL length", (Throwable) null);
                        }
                        this.ICustomTabsCallback_Parcel = iAsBinder - iOnWarmupCompleted;
                        this.ICustomTabsCallbackStub.asBinder(0);
                        exposedDropdownMenu_androidKtExternalSyntheticLambda5.onNavigationEvent(this.ICustomTabsCallbackStub, 4);
                        this.isEngagementSignalsApiAvailable += 4;
                        this.newSessionWithExtras += i4;
                        this.extraCommand = this.IAuthTabCallbackDefault.length > 0 && iOnWarmupCompleted > 0 && TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(progressIndicatorKtExternalSyntheticLambda12.onNavigationEvent, bArrOnExtraCallback[4]);
                        exposedDropdownMenu_androidKtExternalSyntheticLambda5.onNavigationEvent(this.onMinimized, iOnWarmupCompleted);
                        this.isEngagementSignalsApiAvailable += iOnWarmupCompleted;
                        if (iOnWarmupCompleted > 0 && !this.onActivityResized && TextFieldKeyEventHandlerExternalSyntheticLambda1.IAuthTabCallback(bArrOnExtraCallback, 4, iOnWarmupCompleted, progressIndicatorKtExternalSyntheticLambda12.onNavigationEvent)) {
                            this.onActivityResized = true;
                        }
                    }
                } else {
                    if (this.extraCommand) {
                        this.onUnminimized.onExtraCallback(i5);
                        drawerKtExternalSyntheticLambda9.onNavigationEvent(this.onUnminimized.onExtraCallback(), 0, this.ICustomTabsCallback_Parcel);
                        exposedDropdownMenu_androidKtExternalSyntheticLambda5.onNavigationEvent(this.onUnminimized, this.ICustomTabsCallback_Parcel);
                        iOnExtraCallback = this.ICustomTabsCallback_Parcel;
                        int iOnWarmupCompleted2 = TextFieldKeyEventHandlerExternalSyntheticLambda1.onWarmupCompleted(this.onUnminimized.onExtraCallback(), this.onUnminimized.onExtraCallbackWithResult());
                        this.onUnminimized.asBinder(0);
                        this.onUnminimized.onNavigationEvent(iOnWarmupCompleted2);
                        if (progressIndicatorKtExternalSyntheticLambda12.onNavigationEvent.onRelationshipValidationResult == -1) {
                            if (this.mayLaunchUrl.onWarmupCompleted() != 0) {
                                this.mayLaunchUrl.onExtraCallbackWithResult(0);
                            }
                        } else {
                            int iOnWarmupCompleted3 = this.mayLaunchUrl.onWarmupCompleted();
                            int i6 = progressIndicatorKtExternalSyntheticLambda12.onNavigationEvent.onRelationshipValidationResult;
                            if (iOnWarmupCompleted3 != i6) {
                                this.mayLaunchUrl.onExtraCallbackWithResult(i6);
                            }
                        }
                        this.mayLaunchUrl.onNavigationEvent(j, this.onUnminimized);
                        if ((onwarmupcompletedOnNavigationEvent.IAuthTabCallback() & 4) != 0) {
                            this.mayLaunchUrl.onExtraCallback();
                        }
                    } else {
                        iOnExtraCallback = exposedDropdownMenu_androidKtExternalSyntheticLambda5.onExtraCallback(drawerKtExternalSyntheticLambda9, i5, false);
                    }
                    this.isEngagementSignalsApiAvailable += iOnExtraCallback;
                    this.ICustomTabsCallback_Parcel -= iOnExtraCallback;
                }
            }
        }
        int iIAuthTabCallback2 = onwarmupcompletedOnNavigationEvent.IAuthTabCallback();
        if (!this.onActivityResized) {
            iIAuthTabCallback2 |= 67108864;
        }
        int i7 = iIAuthTabCallback2;
        ProgressIndicatorKtExternalSyntheticLambda11 progressIndicatorKtExternalSyntheticLambda11OnWarmupCompleted = onwarmupcompletedOnNavigationEvent.onWarmupCompleted();
        exposedDropdownMenu_androidKtExternalSyntheticLambda5.onExtraCallback(j, i7, this.newSessionWithExtras, 0, progressIndicatorKtExternalSyntheticLambda11OnWarmupCompleted != null ? progressIndicatorKtExternalSyntheticLambda11OnWarmupCompleted.onWarmupCompleted : null);
        IAuthTabCallback(j);
        if (!onwarmupcompletedOnNavigationEvent.asInterface()) {
            this.getInterfaceDescriptor = null;
        }
        this.onRelationshipValidationResult = 3;
        return true;
    }

    private boolean onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "video/avc") ? (this.readTypedObject & 64) != 0 : Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "video/hevc") && (this.readTypedObject & 128) != 0;
    }

    private void IAuthTabCallback(long j) {
        while (!this.ICustomTabsCallbackDefault.isEmpty()) {
            onNavigationEvent onnavigationeventRemoveFirst = this.ICustomTabsCallbackDefault.removeFirst();
            this.ICustomTabsCallbackStubProxy -= onnavigationeventRemoveFirst.onWarmupCompleted;
            long jOnExtraCallback = onnavigationeventRemoveFirst.onNavigationEvent;
            if (onnavigationeventRemoveFirst.IAuthTabCallback) {
                jOnExtraCallback += j;
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24 = this.requestPostMessageChannelWithExtras;
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda24 != null) {
                jOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda24.onExtraCallback(jOnExtraCallback);
            }
            for (ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5 : this.ICustomTabsCallback) {
                exposedDropdownMenu_androidKtExternalSyntheticLambda5.onExtraCallback(jOnExtraCallback, 1, onnavigationeventRemoveFirst.onWarmupCompleted, this.ICustomTabsCallbackStubProxy, null);
            }
        }
    }

    private static onWarmupCompleted onNavigationEvent(SparseArray<onWarmupCompleted> sparseArray) {
        int size = sparseArray.size();
        onWarmupCompleted onwarmupcompleted = null;
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            onWarmupCompleted onwarmupcompletedValueAt = sparseArray.valueAt(i2);
            if ((onwarmupcompletedValueAt.IAuthTabCallbackStubProxy || onwarmupcompletedValueAt.IAuthTabCallback != onwarmupcompletedValueAt.IAuthTabCallbackStub.onNavigationEvent) && (!onwarmupcompletedValueAt.IAuthTabCallbackStubProxy || onwarmupcompletedValueAt.onNavigationEvent != onwarmupcompletedValueAt.asBinder.extraCallback)) {
                long jOnNavigationEvent = onwarmupcompletedValueAt.onNavigationEvent();
                if (jOnNavigationEvent < j) {
                    onwarmupcompleted = onwarmupcompletedValueAt;
                    j = jOnNavigationEvent;
                }
            }
        }
        return onwarmupcompleted;
    }

    private static BasicTextContextMenuProviderExternalSyntheticLambda0 onExtraCallback(List<TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            TextFieldDecoratorModifierNodestartInputSession11ExternalSyntheticLambda1.onExtraCallbackWithResult onextracallbackwithresult = list.get(i2);
            if (onextracallbackwithresult.onExtraCallback == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrOnExtraCallback = onextracallbackwithresult.onNavigationEvent.onExtraCallback();
                UUID uuidOnNavigationEvent = OutlinedTextFieldMeasurePolicyExternalSyntheticLambda4.onNavigationEvent(bArrOnExtraCallback);
                if (uuidOnNavigationEvent == null) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback(uuidOnNavigationEvent, "video/mp4", bArrOnExtraCallback));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new BasicTextContextMenuProviderExternalSyntheticLambda0(arrayList);
    }

    static final class onNavigationEvent {
        public final boolean IAuthTabCallback;
        public final long onNavigationEvent;
        public final int onWarmupCompleted;

        public onNavigationEvent(long j, boolean z, int i2) {
            this.onNavigationEvent = j;
            this.IAuthTabCallback = z;
            this.onWarmupCompleted = i2;
        }
    }

    static final class onWarmupCompleted {
        public int IAuthTabCallback;
        private final BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallbackDefault;
        public ProgressIndicatorKtExternalSyntheticLambda14 IAuthTabCallbackStub;
        private boolean IAuthTabCallbackStubProxy;
        public final ExposedDropdownMenu_androidKtExternalSyntheticLambda5 asInterface;
        public int onExtraCallback;
        public OutlinedTextFieldKtExternalSyntheticLambda7 onExtraCallbackWithResult;
        public int onNavigationEvent;
        public int onWarmupCompleted;
        public final ProgressIndicatorKtExternalSyntheticLambda15 asBinder = new ProgressIndicatorKtExternalSyntheticLambda15();
        public final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onTransact = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 getInterfaceDescriptor = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(1);
        private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallback_Parcel = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();

        public onWarmupCompleted(ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5, ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda14, OutlinedTextFieldKtExternalSyntheticLambda7 outlinedTextFieldKtExternalSyntheticLambda7, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            this.asInterface = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
            this.IAuthTabCallbackStub = progressIndicatorKtExternalSyntheticLambda14;
            this.onExtraCallbackWithResult = outlinedTextFieldKtExternalSyntheticLambda7;
            this.IAuthTabCallbackDefault = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            onNavigationEvent(progressIndicatorKtExternalSyntheticLambda14, outlinedTextFieldKtExternalSyntheticLambda7);
        }

        public void onNavigationEvent(ProgressIndicatorKtExternalSyntheticLambda14 progressIndicatorKtExternalSyntheticLambda14, OutlinedTextFieldKtExternalSyntheticLambda7 outlinedTextFieldKtExternalSyntheticLambda7) {
            this.IAuthTabCallbackStub = progressIndicatorKtExternalSyntheticLambda14;
            this.onExtraCallbackWithResult = outlinedTextFieldKtExternalSyntheticLambda7;
            this.asInterface.onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
            IAuthTabCallbackDefault();
        }

        public void onExtraCallbackWithResult(BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0) {
            ProgressIndicatorKtExternalSyntheticLambda12 progressIndicatorKtExternalSyntheticLambda12 = this.IAuthTabCallbackStub.IAuthTabCallbackDefault;
            Object[] objArr = {this.asBinder.onExtraCallbackWithResult};
            ProgressIndicatorKtExternalSyntheticLambda11 progressIndicatorKtExternalSyntheticLambda11IAuthTabCallback = progressIndicatorKtExternalSyntheticLambda12.IAuthTabCallback(((OutlinedTextFieldKtExternalSyntheticLambda7) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -1084655742)).onExtraCallback);
            this.asInterface.onExtraCallbackWithResult(this.IAuthTabCallbackDefault.onExtraCallback().onNavigationEvent(basicTextContextMenuProviderExternalSyntheticLambda0.onExtraCallbackWithResult(progressIndicatorKtExternalSyntheticLambda11IAuthTabCallback != null ? progressIndicatorKtExternalSyntheticLambda11IAuthTabCallback.IAuthTabCallback : null)).onNavigationEvent());
        }

        public void IAuthTabCallbackDefault() {
            this.asBinder.onWarmupCompleted();
            this.IAuthTabCallback = 0;
            this.onNavigationEvent = 0;
            this.onWarmupCompleted = 0;
            this.onExtraCallback = 0;
            this.IAuthTabCallbackStubProxy = false;
        }

        public void IAuthTabCallback(long j) {
            int i2 = this.IAuthTabCallback;
            while (true) {
                ProgressIndicatorKtExternalSyntheticLambda15 progressIndicatorKtExternalSyntheticLambda15 = this.asBinder;
                if (i2 >= progressIndicatorKtExternalSyntheticLambda15.asInterface || progressIndicatorKtExternalSyntheticLambda15.onExtraCallback(i2) > j) {
                    return;
                }
                if (this.asBinder.IAuthTabCallback_Parcel[i2]) {
                    this.onExtraCallback = i2;
                }
                i2++;
            }
        }

        public long onExtraCallback() {
            if (!this.IAuthTabCallbackStubProxy) {
                return this.IAuthTabCallbackStub.IAuthTabCallbackStub[this.IAuthTabCallback];
            }
            return this.asBinder.onExtraCallback(this.IAuthTabCallback);
        }

        public long onNavigationEvent() {
            if (!this.IAuthTabCallbackStubProxy) {
                return this.IAuthTabCallbackStub.IAuthTabCallback[this.IAuthTabCallback];
            }
            return this.asBinder.ICustomTabsCallback[this.onNavigationEvent];
        }

        public int onExtraCallbackWithResult() {
            if (!this.IAuthTabCallbackStubProxy) {
                return this.IAuthTabCallbackStub.onTransact[this.IAuthTabCallback];
            }
            return this.asBinder.getInterfaceDescriptor[this.IAuthTabCallback];
        }

        public int IAuthTabCallback() {
            int i2;
            if (!this.IAuthTabCallbackStubProxy) {
                i2 = this.IAuthTabCallbackStub.onWarmupCompleted[this.IAuthTabCallback];
            } else {
                i2 = this.asBinder.IAuthTabCallback_Parcel[this.IAuthTabCallback] ? 1 : 0;
            }
            return onWarmupCompleted() != null ? i2 | 1073741824 : i2;
        }

        public boolean asInterface() {
            this.IAuthTabCallback++;
            if (!this.IAuthTabCallbackStubProxy) {
                return false;
            }
            int i2 = this.onWarmupCompleted + 1;
            this.onWarmupCompleted = i2;
            int[] iArr = this.asBinder.writeTypedObject;
            int i3 = this.onNavigationEvent;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.onNavigationEvent = i3 + 1;
            this.onWarmupCompleted = 0;
            return false;
        }

        public int IAuthTabCallback(int i2, int i3) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20;
            ProgressIndicatorKtExternalSyntheticLambda11 progressIndicatorKtExternalSyntheticLambda11OnWarmupCompleted = onWarmupCompleted();
            if (progressIndicatorKtExternalSyntheticLambda11OnWarmupCompleted == null) {
                return 0;
            }
            int length = progressIndicatorKtExternalSyntheticLambda11OnWarmupCompleted.onNavigationEvent;
            if (length != 0) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20 = this.asBinder.onTransact;
            } else {
                Object[] objArr = {progressIndicatorKtExternalSyntheticLambda11OnWarmupCompleted.onExtraCallbackWithResult};
                byte[] bArr = (byte[]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, -1084655742);
                this.IAuthTabCallback_Parcel.onExtraCallback(bArr, bArr.length);
                TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda202 = this.IAuthTabCallback_Parcel;
                length = bArr.length;
                textFieldDecoratorModifierNodeExternalSyntheticLambda20 = textFieldDecoratorModifierNodeExternalSyntheticLambda202;
            }
            boolean zOnWarmupCompleted = this.asBinder.onWarmupCompleted(this.IAuthTabCallback);
            boolean z = zOnWarmupCompleted || i3 != 0;
            this.getInterfaceDescriptor.onExtraCallback()[0] = (byte) ((z ? 128 : 0) | length);
            this.getInterfaceDescriptor.asBinder(0);
            this.asInterface.IAuthTabCallback(this.getInterfaceDescriptor, 1, 1);
            this.asInterface.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda20, length, 1);
            if (!z) {
                return length + 1;
            }
            if (!zOnWarmupCompleted) {
                this.onTransact.onExtraCallback(8);
                byte[] bArrOnExtraCallback = this.onTransact.onExtraCallback();
                bArrOnExtraCallback[0] = 0;
                bArrOnExtraCallback[1] = 1;
                bArrOnExtraCallback[2] = (byte) (i3 >> 8);
                bArrOnExtraCallback[3] = (byte) i3;
                bArrOnExtraCallback[4] = (byte) (i2 >>> 24);
                bArrOnExtraCallback[5] = (byte) (i2 >> 16);
                bArrOnExtraCallback[6] = (byte) (i2 >> 8);
                bArrOnExtraCallback[7] = (byte) i2;
                this.asInterface.IAuthTabCallback(this.onTransact, 8, 1);
                return length + 9;
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda203 = this.asBinder.onTransact;
            int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda203.onUnminimized();
            textFieldDecoratorModifierNodeExternalSyntheticLambda203.IAuthTabCallbackDefault(-2);
            int i4 = (iOnUnminimized * 6) + 2;
            if (i3 != 0) {
                this.onTransact.onExtraCallback(i4);
                byte[] bArrOnExtraCallback2 = this.onTransact.onExtraCallback();
                textFieldDecoratorModifierNodeExternalSyntheticLambda203.onWarmupCompleted(bArrOnExtraCallback2, 0, i4);
                int i5 = (((bArrOnExtraCallback2[2] & 255) << 8) | (bArrOnExtraCallback2[3] & 255)) + i3;
                bArrOnExtraCallback2[2] = (byte) (i5 >> 8);
                bArrOnExtraCallback2[3] = (byte) i5;
                textFieldDecoratorModifierNodeExternalSyntheticLambda203 = this.onTransact;
            }
            this.asInterface.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda203, i4, 1);
            return length + 1 + i4;
        }

        public void onTransact() {
            ProgressIndicatorKtExternalSyntheticLambda11 progressIndicatorKtExternalSyntheticLambda11OnWarmupCompleted = onWarmupCompleted();
            if (progressIndicatorKtExternalSyntheticLambda11OnWarmupCompleted != null) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = this.asBinder.onTransact;
                int i2 = progressIndicatorKtExternalSyntheticLambda11OnWarmupCompleted.onNavigationEvent;
                if (i2 != 0) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(i2);
                }
                if (this.asBinder.onWarmupCompleted(this.IAuthTabCallback)) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized() * 6);
                }
            }
        }

        public ProgressIndicatorKtExternalSyntheticLambda11 onWarmupCompleted() {
            if (!this.IAuthTabCallbackStubProxy) {
                return null;
            }
            Object[] objArr = {this.asBinder.onExtraCallbackWithResult};
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            int i2 = ((OutlinedTextFieldKtExternalSyntheticLambda7) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(1084655768, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -1084655742)).onExtraCallback;
            ProgressIndicatorKtExternalSyntheticLambda11 progressIndicatorKtExternalSyntheticLambda11IAuthTabCallback = this.asBinder.access000;
            if (progressIndicatorKtExternalSyntheticLambda11IAuthTabCallback == null) {
                progressIndicatorKtExternalSyntheticLambda11IAuthTabCallback = this.IAuthTabCallbackStub.IAuthTabCallbackDefault.IAuthTabCallback(i2);
            }
            if (progressIndicatorKtExternalSyntheticLambda11IAuthTabCallback == null || !progressIndicatorKtExternalSyntheticLambda11IAuthTabCallback.onExtraCallback) {
                return null;
            }
            return progressIndicatorKtExternalSyntheticLambda11IAuthTabCallback;
        }
    }
}
