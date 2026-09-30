package o;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.hls.HlsMediaChunk;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import o.AlertDialogKtExternalSyntheticLambda3;
import o.ComposableSingletonsScaffoldKtExternalSyntheticLambda1;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.TextFieldSelectionManager_androidKtExternalSyntheticLambda0;
import o.TextFieldSelectionStateExternalSyntheticLambda12;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionManager_androidKtExternalSyntheticLambda3 extends BottomSheetScaffoldKtExternalSyntheticLambda7 {
    private static final AtomicInteger writeTypedObject = new AtomicInteger();
    public final int IAuthTabCallback;
    private boolean ICustomTabsCallback;
    private final boolean ICustomTabsCallbackDefault;
    private volatile boolean ICustomTabsCallbackStub;
    private boolean ICustomTabsCallbackStubProxy;
    private int ICustomTabsCallback_Parcel;
    private final TextFieldSelectionManager_androidKtExternalSyntheticLambda10 ICustomTabsService;
    private final BasicTextContextMenuProviderExternalSyntheticLambda0 extraCallback;
    private TextFieldSelectionManager_androidKtExternalSyntheticLambda10 extraCallbackWithResult;
    private final List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> extraCommand;
    private final SelectionManagerExternalSyntheticLambda12 isEngagementSignalsApiAvailable;
    private TextFieldSelectionManager_androidKtExternalSyntheticLambda4 mayLaunchUrl;
    private long newAuthTabSession;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda24 newSession;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 newSessionWithExtras;
    private final ModalBottomSheetKtExternalSyntheticLambda2 onActivityLayout;
    private boolean onActivityResized;
    public final boolean onExtraCallback;
    public final Uri onExtraCallbackWithResult;
    private final boolean onMessageChannelReady;
    private final TextFieldSelectionStateExternalSyntheticLambda0 onMinimized;
    public final int onNavigationEvent;
    private final TextFieldSelectionStateExternalSyntheticLambda12 onPostMessage;
    private final boolean onRelationshipValidationResult;
    private final boolean onUnminimized;
    public final int onWarmupCompleted;
    private ImmutableList<Integer> postMessage;
    private boolean prefetch;
    private final TextFieldSelectionManager_androidKtExternalSyntheticLambda11 readTypedObject;
    private final long requestPostMessageChannelWithExtras;

    public static TextFieldSelectionManager_androidKtExternalSyntheticLambda3 onWarmupCompleted(TextFieldSelectionManager_androidKtExternalSyntheticLambda11 textFieldSelectionManager_androidKtExternalSyntheticLambda11, TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, long j, AlertDialogKtExternalSyntheticLambda3 alertDialogKtExternalSyntheticLambda3, TextFieldSelectionManager_androidKtExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, Uri uri, @Nullable List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list, int i2, @Nullable Object obj, boolean z, AlertDialogKtExternalSyntheticLambda2 alertDialogKtExternalSyntheticLambda2, long j2, @Nullable TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3, @Nullable byte[] bArr, @Nullable byte[] bArr2, boolean z2, boolean z3, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12, @Nullable ComposableSingletonsScaffoldKtExternalSyntheticLambda1.IAuthTabCallback iAuthTabCallback2) {
        TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0OnExtraCallbackWithResult;
        TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult;
        boolean z4;
        ModalBottomSheetKtExternalSyntheticLambda2 modalBottomSheetKtExternalSyntheticLambda2;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20;
        TextFieldSelectionManager_androidKtExternalSyntheticLambda10 textFieldSelectionManager_androidKtExternalSyntheticLambda10;
        AlertDialogKtExternalSyntheticLambda3.onTransact ontransact = iAuthTabCallback.IAuthTabCallback;
        TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult2 = new TextFieldSelectionStateExternalSyntheticLambda12.onExtraCallback().IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda8.IAuthTabCallback(alertDialogKtExternalSyntheticLambda3.onPostMessage, ontransact.IAuthTabCallbackStubProxy)).onExtraCallbackWithResult(ontransact.onNavigationEvent).onWarmupCompleted(ontransact.onWarmupCompleted).onExtraCallbackWithResult(iAuthTabCallback.onWarmupCompleted ? 8 : 0).onExtraCallbackWithResult();
        if (iAuthTabCallback2 != null) {
            textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult2 = iAuthTabCallback2.onWarmupCompleted().IAuthTabCallback(textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult2);
        }
        TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12 = textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult2;
        boolean z5 = bArr != null;
        TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0OnExtraCallbackWithResult2 = onExtraCallbackWithResult(textFieldSelectionStateExternalSyntheticLambda0, bArr, z5 ? onNavigationEvent((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(ontransact.asInterface)) : null);
        AlertDialogKtExternalSyntheticLambda3.onExtraCallbackWithResult onextracallbackwithresult = ontransact.access000;
        if (onextracallbackwithresult != null) {
            boolean z6 = bArr2 != null;
            byte[] bArrOnNavigationEvent = z6 ? onNavigationEvent((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(onextracallbackwithresult.asInterface)) : null;
            boolean z7 = z6;
            textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult = new TextFieldSelectionStateExternalSyntheticLambda12.onExtraCallback().IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda8.IAuthTabCallback(alertDialogKtExternalSyntheticLambda3.onPostMessage, onextracallbackwithresult.IAuthTabCallbackStubProxy)).onExtraCallbackWithResult(onextracallbackwithresult.onNavigationEvent).onWarmupCompleted(onextracallbackwithresult.onWarmupCompleted).onExtraCallbackWithResult();
            if (iAuthTabCallback2 != null) {
                textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult = iAuthTabCallback2.onExtraCallback("i").onWarmupCompleted().IAuthTabCallback(textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult);
            }
            textFieldSelectionStateExternalSyntheticLambda0OnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldSelectionStateExternalSyntheticLambda0, bArr2, bArrOnNavigationEvent);
            z4 = z7;
        } else {
            textFieldSelectionStateExternalSyntheticLambda0OnExtraCallbackWithResult = null;
            textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult = null;
            z4 = false;
        }
        long j3 = j + ontransact.getInterfaceDescriptor;
        long j4 = ontransact.onTransact;
        int i3 = alertDialogKtExternalSyntheticLambda3.onWarmupCompleted + ontransact.IAuthTabCallback_Parcel;
        if (textFieldSelectionManager_androidKtExternalSyntheticLambda3 != null) {
            TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda122 = textFieldSelectionManager_androidKtExternalSyntheticLambda3.onPostMessage;
            boolean z8 = textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult == textFieldSelectionStateExternalSyntheticLambda122 || (textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult != null && textFieldSelectionStateExternalSyntheticLambda122 != null && textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult.asInterface.equals(textFieldSelectionStateExternalSyntheticLambda122.asInterface) && textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult.onTransact == textFieldSelectionManager_androidKtExternalSyntheticLambda3.onPostMessage.onTransact);
            boolean z9 = uri.equals(textFieldSelectionManager_androidKtExternalSyntheticLambda3.onExtraCallbackWithResult) && textFieldSelectionManager_androidKtExternalSyntheticLambda3.ICustomTabsCallbackStubProxy;
            ModalBottomSheetKtExternalSyntheticLambda2 modalBottomSheetKtExternalSyntheticLambda22 = textFieldSelectionManager_androidKtExternalSyntheticLambda3.onActivityLayout;
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda202 = textFieldSelectionManager_androidKtExternalSyntheticLambda3.newSessionWithExtras;
            textFieldSelectionManager_androidKtExternalSyntheticLambda10 = (z8 && z9 && !textFieldSelectionManager_androidKtExternalSyntheticLambda3.ICustomTabsCallback && textFieldSelectionManager_androidKtExternalSyntheticLambda3.IAuthTabCallback == i3) ? textFieldSelectionManager_androidKtExternalSyntheticLambda3.extraCallbackWithResult : null;
            modalBottomSheetKtExternalSyntheticLambda2 = modalBottomSheetKtExternalSyntheticLambda22;
            textFieldDecoratorModifierNodeExternalSyntheticLambda20 = textFieldDecoratorModifierNodeExternalSyntheticLambda202;
        } else {
            modalBottomSheetKtExternalSyntheticLambda2 = new ModalBottomSheetKtExternalSyntheticLambda2();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(10);
            textFieldSelectionManager_androidKtExternalSyntheticLambda10 = null;
        }
        return new TextFieldSelectionManager_androidKtExternalSyntheticLambda3(textFieldSelectionManager_androidKtExternalSyntheticLambda11, textFieldSelectionStateExternalSyntheticLambda0OnExtraCallbackWithResult2, textFieldSelectionStateExternalSyntheticLambda12, basicTextContextMenuProviderKtExternalSyntheticLambda4, z5, textFieldSelectionStateExternalSyntheticLambda0OnExtraCallbackWithResult, textFieldSelectionStateExternalSyntheticLambda12OnExtraCallbackWithResult, z4, uri, list, i2, obj, j3, j3 + j4, iAuthTabCallback.onExtraCallbackWithResult, iAuthTabCallback.onExtraCallback, !iAuthTabCallback.onWarmupCompleted, i3, ontransact.IAuthTabCallbackStub, z, alertDialogKtExternalSyntheticLambda2.onExtraCallback(i3), j2, ontransact.asBinder, textFieldSelectionManager_androidKtExternalSyntheticLambda10, modalBottomSheetKtExternalSyntheticLambda2, textFieldDecoratorModifierNodeExternalSyntheticLambda20, z2, z3, selectionManagerExternalSyntheticLambda12);
    }

    public static boolean onExtraCallbackWithResult(@Nullable TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3, long j, Uri uri, boolean z, TextFieldSelectionManager_androidKtExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback, long j2) {
        if (textFieldSelectionManager_androidKtExternalSyntheticLambda3 == null) {
            return false;
        }
        if (uri.equals(textFieldSelectionManager_androidKtExternalSyntheticLambda3.onExtraCallbackWithResult) && textFieldSelectionManager_androidKtExternalSyntheticLambda3.ICustomTabsCallbackStubProxy) {
            return false;
        }
        return !z || j2 + iAuthTabCallback.IAuthTabCallback.getInterfaceDescriptor < j;
    }

    private TextFieldSelectionManager_androidKtExternalSyntheticLambda3(TextFieldSelectionManager_androidKtExternalSyntheticLambda11 textFieldSelectionManager_androidKtExternalSyntheticLambda11, TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, boolean z, @Nullable TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda02, @Nullable TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda122, boolean z2, Uri uri, @Nullable List<BasicTextContextMenuProviderKtExternalSyntheticLambda4> list, int i2, @Nullable Object obj, long j, long j2, long j3, int i3, boolean z3, int i4, boolean z4, boolean z5, TextFieldDecoratorModifierNodeExternalSyntheticLambda24 textFieldDecoratorModifierNodeExternalSyntheticLambda24, long j4, @Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0, @Nullable TextFieldSelectionManager_androidKtExternalSyntheticLambda10 textFieldSelectionManager_androidKtExternalSyntheticLambda10, ModalBottomSheetKtExternalSyntheticLambda2 modalBottomSheetKtExternalSyntheticLambda2, TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, boolean z6, boolean z7, SelectionManagerExternalSyntheticLambda12 selectionManagerExternalSyntheticLambda12) {
        super(textFieldSelectionStateExternalSyntheticLambda0, textFieldSelectionStateExternalSyntheticLambda12, basicTextContextMenuProviderKtExternalSyntheticLambda4, i2, obj, j, j2, j3);
        this.ICustomTabsCallbackDefault = z;
        this.onNavigationEvent = i3;
        this.newAuthTabSession = z3 ? j2 - j : -9223372036854775807L;
        this.IAuthTabCallback = i4;
        this.onPostMessage = textFieldSelectionStateExternalSyntheticLambda122;
        this.onMinimized = textFieldSelectionStateExternalSyntheticLambda02;
        this.onActivityResized = textFieldSelectionStateExternalSyntheticLambda122 != null;
        this.onRelationshipValidationResult = z2;
        this.onExtraCallbackWithResult = uri;
        this.onUnminimized = z5;
        this.newSession = textFieldDecoratorModifierNodeExternalSyntheticLambda24;
        this.requestPostMessageChannelWithExtras = j4;
        this.onMessageChannelReady = z4;
        this.readTypedObject = textFieldSelectionManager_androidKtExternalSyntheticLambda11;
        this.extraCommand = list;
        this.extraCallback = basicTextContextMenuProviderExternalSyntheticLambda0;
        this.ICustomTabsService = textFieldSelectionManager_androidKtExternalSyntheticLambda10;
        this.onActivityLayout = modalBottomSheetKtExternalSyntheticLambda2;
        this.newSessionWithExtras = textFieldDecoratorModifierNodeExternalSyntheticLambda20;
        this.prefetch = z6;
        this.onExtraCallback = z7;
        this.isEngagementSignalsApiAvailable = selectionManagerExternalSyntheticLambda12;
        this.postMessage = ImmutableList.of();
        this.onWarmupCompleted = writeTypedObject.getAndIncrement();
    }

    public void onNavigationEvent(TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda4, ImmutableList<Integer> immutableList) {
        this.mayLaunchUrl = textFieldSelectionManager_androidKtExternalSyntheticLambda4;
        this.postMessage = immutableList;
    }

    public int onNavigationEvent(int i2) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.prefetch);
        if (i2 >= this.postMessage.size()) {
            return 0;
        }
        return ((Integer) this.postMessage.get(i2)).intValue();
    }

    public void onExtraCallbackWithResult() {
        this.ICustomTabsCallback = true;
    }

    public boolean onTransact() {
        return this.prefetch;
    }

    public void onExtraCallback() {
        this.prefetch = false;
    }

    public boolean onWarmupCompleted() {
        return this.ICustomTabsCallbackStubProxy;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onNavigationEvent
    public void IAuthTabCallback() {
        this.ICustomTabsCallbackStub = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onNavigationEvent
    public void IAuthTabCallbackDefault() throws IOException {
        TextFieldSelectionManager_androidKtExternalSyntheticLambda10 textFieldSelectionManager_androidKtExternalSyntheticLambda10;
        if (this.extraCallbackWithResult == null && (textFieldSelectionManager_androidKtExternalSyntheticLambda10 = this.ICustomTabsService) != null && textFieldSelectionManager_androidKtExternalSyntheticLambda10.onExtraCallback()) {
            this.extraCallbackWithResult = this.ICustomTabsService;
            this.onActivityResized = false;
        }
        getInterfaceDescriptor();
        if (this.ICustomTabsCallbackStub) {
            return;
        }
        if (!this.onMessageChannelReady) {
            access100();
        }
        this.ICustomTabsCallbackStubProxy = !this.ICustomTabsCallbackStub;
    }

    public boolean asInterface() {
        return this.newAuthTabSession != -9223372036854775807L;
    }

    public long onNavigationEvent() {
        long j = this.newAuthTabSession;
        if (j != -9223372036854775807L) {
            return this.IAuthTabCallbackStub + j;
        }
        return -9223372036854775807L;
    }

    public void onNavigationEvent(long j) {
        this.newAuthTabSession = j;
    }

    @RequiresNonNull
    private void getInterfaceDescriptor() throws IOException {
        if (this.onActivityResized) {
            onExtraCallbackWithResult(this.onMinimized, this.onPostMessage, this.onRelationshipValidationResult, false);
            this.ICustomTabsCallback_Parcel = 0;
            this.onActivityResized = false;
        }
    }

    @RequiresNonNull
    private void access100() throws IOException {
        onExtraCallbackWithResult(this.onTransact, this.asBinder, this.ICustomTabsCallbackDefault, true);
    }

    @RequiresNonNull
    private void onExtraCallbackWithResult(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, boolean z, boolean z2) throws IOException {
        TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12OnExtraCallback;
        if (z) {
            z = this.ICustomTabsCallback_Parcel != 0;
            textFieldSelectionStateExternalSyntheticLambda12OnExtraCallback = textFieldSelectionStateExternalSyntheticLambda12;
        } else {
            textFieldSelectionStateExternalSyntheticLambda12OnExtraCallback = textFieldSelectionStateExternalSyntheticLambda12.onExtraCallback(this.ICustomTabsCallback_Parcel);
        }
        try {
            DrawerKtExternalSyntheticLambda5 drawerKtExternalSyntheticLambda5OnExtraCallback = onExtraCallback(textFieldSelectionStateExternalSyntheticLambda0, textFieldSelectionStateExternalSyntheticLambda12OnExtraCallback, z2);
            if (z) {
                drawerKtExternalSyntheticLambda5OnExtraCallback.onExtraCallback(this.ICustomTabsCallback_Parcel);
            }
            while (!this.ICustomTabsCallbackStub && this.extraCallbackWithResult.onNavigationEvent(drawerKtExternalSyntheticLambda5OnExtraCallback)) {
                try {
                    try {
                    } catch (EOFException e) {
                        if ((this.access100.mayLaunchUrl & 16384) != 0) {
                            this.extraCallbackWithResult.onExtraCallbackWithResult();
                        } else {
                            throw e;
                        }
                    }
                } catch (Throwable th) {
                    this.ICustomTabsCallback_Parcel = (int) (drawerKtExternalSyntheticLambda5OnExtraCallback.IAuthTabCallback() - textFieldSelectionStateExternalSyntheticLambda12.onTransact);
                    throw th;
                }
            }
            this.ICustomTabsCallback_Parcel = (int) (drawerKtExternalSyntheticLambda5OnExtraCallback.IAuthTabCallback() - textFieldSelectionStateExternalSyntheticLambda12.onTransact);
        } finally {
            TextFieldSelectionStateExternalSyntheticLambda5.IAuthTabCallback(textFieldSelectionStateExternalSyntheticLambda0);
        }
    }

    @EnsuresNonNull
    @RequiresNonNull
    private DrawerKtExternalSyntheticLambda5 onExtraCallback(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, TextFieldSelectionStateExternalSyntheticLambda12 textFieldSelectionStateExternalSyntheticLambda12, boolean z) throws IOException {
        TextFieldSelectionManager_androidKtExternalSyntheticLambda10 textFieldSelectionManager_androidKtExternalSyntheticLambda10CreateExtractor;
        long jIAuthTabCallback;
        long jOnNavigationEvent = textFieldSelectionStateExternalSyntheticLambda0.onNavigationEvent(textFieldSelectionStateExternalSyntheticLambda12);
        if (z) {
            try {
                this.newSession.onExtraCallbackWithResult(this.onUnminimized, this.IAuthTabCallbackStub, this.requestPostMessageChannelWithExtras);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        DrawerKtExternalSyntheticLambda5 drawerKtExternalSyntheticLambda5 = new DrawerKtExternalSyntheticLambda5(textFieldSelectionStateExternalSyntheticLambda0, textFieldSelectionStateExternalSyntheticLambda12.onTransact, jOnNavigationEvent);
        if (this.extraCallbackWithResult == null) {
            long jOnExtraCallback = onExtraCallback(drawerKtExternalSyntheticLambda5);
            drawerKtExternalSyntheticLambda5.onExtraCallbackWithResult();
            TextFieldSelectionManager_androidKtExternalSyntheticLambda10 textFieldSelectionManager_androidKtExternalSyntheticLambda10 = this.ICustomTabsService;
            if (textFieldSelectionManager_androidKtExternalSyntheticLambda10 != null) {
                textFieldSelectionManager_androidKtExternalSyntheticLambda10CreateExtractor = textFieldSelectionManager_androidKtExternalSyntheticLambda10.onNavigationEvent();
            } else {
                textFieldSelectionManager_androidKtExternalSyntheticLambda10CreateExtractor = this.readTypedObject.createExtractor(textFieldSelectionStateExternalSyntheticLambda12.asInterface, this.access100, this.extraCommand, this.newSession, textFieldSelectionStateExternalSyntheticLambda0.onExtraCallbackWithResult(), drawerKtExternalSyntheticLambda5, this.isEngagementSignalsApiAvailable);
            }
            this.extraCallbackWithResult = textFieldSelectionManager_androidKtExternalSyntheticLambda10CreateExtractor;
            if (textFieldSelectionManager_androidKtExternalSyntheticLambda10CreateExtractor.onWarmupCompleted()) {
                TextFieldSelectionManager_androidKtExternalSyntheticLambda4 textFieldSelectionManager_androidKtExternalSyntheticLambda4 = this.mayLaunchUrl;
                if (jOnExtraCallback != -9223372036854775807L) {
                    jIAuthTabCallback = this.newSession.IAuthTabCallback(jOnExtraCallback);
                } else {
                    jIAuthTabCallback = this.IAuthTabCallbackStub;
                }
                textFieldSelectionManager_androidKtExternalSyntheticLambda4.onNavigationEvent(jIAuthTabCallback);
            } else {
                this.mayLaunchUrl.onNavigationEvent(0L);
            }
            this.mayLaunchUrl.IAuthTabCallback_Parcel();
            this.extraCallbackWithResult.onWarmupCompleted(this.mayLaunchUrl);
        }
        this.mayLaunchUrl.onExtraCallbackWithResult(this.extraCallback);
        return drawerKtExternalSyntheticLambda5;
    }

    private long onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        drawerKtExternalSyntheticLambda9.onExtraCallbackWithResult();
        try {
            this.newSessionWithExtras.onExtraCallback(10);
            drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.newSessionWithExtras.onExtraCallback(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.newSessionWithExtras.onMessageChannelReady() != 4801587) {
            return -9223372036854775807L;
        }
        this.newSessionWithExtras.IAuthTabCallbackDefault(3);
        int iOnPostMessage = this.newSessionWithExtras.onPostMessage();
        int i2 = iOnPostMessage + 10;
        if (i2 > this.newSessionWithExtras.IAuthTabCallback()) {
            byte[] bArrOnExtraCallback = this.newSessionWithExtras.onExtraCallback();
            this.newSessionWithExtras.onExtraCallback(i2);
            System.arraycopy(bArrOnExtraCallback, 0, this.newSessionWithExtras.onExtraCallback(), 0, 10);
        }
        drawerKtExternalSyntheticLambda9.IAuthTabCallback(this.newSessionWithExtras.onExtraCallback(), 10, iOnPostMessage);
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent = this.onActivityLayout.onNavigationEvent(this.newSessionWithExtras.onExtraCallback(), iOnPostMessage);
        if (handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent == null) {
            return -9223372036854775807L;
        }
        int iOnExtraCallback = handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent.onExtraCallback();
        for (int i3 = 0; i3 < iOnExtraCallback; i3++) {
            HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback = handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent.IAuthTabCallback(i3);
            if (IAuthTabCallback instanceof ModalBottomSheetStateExternalSyntheticLambda0) {
                ModalBottomSheetStateExternalSyntheticLambda0 modalBottomSheetStateExternalSyntheticLambda0 = (ModalBottomSheetStateExternalSyntheticLambda0) IAuthTabCallback;
                if (HlsMediaChunk.PRIV_TIMESTAMP_FRAME_OWNER.equals(modalBottomSheetStateExternalSyntheticLambda0.onExtraCallback)) {
                    System.arraycopy(modalBottomSheetStateExternalSyntheticLambda0.onNavigationEvent, 0, this.newSessionWithExtras.onExtraCallback(), 0, 8);
                    this.newSessionWithExtras.asBinder(0);
                    this.newSessionWithExtras.onNavigationEvent(8);
                    return this.newSessionWithExtras.readTypedObject() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private static byte[] onNavigationEvent(String str) {
        if (Ascii.toLowerCase(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static TextFieldSelectionStateExternalSyntheticLambda0 onExtraCallbackWithResult(TextFieldSelectionStateExternalSyntheticLambda0 textFieldSelectionStateExternalSyntheticLambda0, @Nullable byte[] bArr, @Nullable byte[] bArr2) {
        return bArr != null ? new TextFieldSelectionManagerKtExternalSyntheticLambda1(textFieldSelectionStateExternalSyntheticLambda0, bArr, bArr2) : textFieldSelectionStateExternalSyntheticLambda0;
    }
}
