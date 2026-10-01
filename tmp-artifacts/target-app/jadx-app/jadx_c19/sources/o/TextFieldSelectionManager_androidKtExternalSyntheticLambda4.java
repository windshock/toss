package o;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.hls.HlsSampleStreamWrapper$;
import androidx.media3.exoplayer.upstream.Loader;
import com.google.android.exoplayer2.source.hls.HlsMediaChunk;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.primitives.Ints;
import com.google.firebase.messaging.FcmBroadcastProcessor$;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.BottomNavigationKtExternalSyntheticLambda3;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5;
import o.HandwritingHandlerNodeExternalSyntheticLambda0;
import o.PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1;
import o.TextFieldSelectionManager_androidKtExternalSyntheticLambda0;
import o.setApTextSize;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldSelectionManager_androidKtExternalSyntheticLambda4 implements Loader.onExtraCallbackWithResult<BottomSheetScaffoldKtExternalSyntheticLambda8>, Loader.onWarmupCompleted, BottomNavigationKtExternalSyntheticLambda8, DrawerStateExternalSyntheticLambda1, BottomNavigationKtExternalSyntheticLambda3.onWarmupCompleted {
    private static final Set<Integer> onExtraCallback = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private final TextFieldSelectionManager_androidKtExternalSyntheticLambda0 IAuthTabCallback;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallbackDefault;
    private final SelectionRegistrarImplExternalSyntheticLambda0 IAuthTabCallbackStub;
    private boolean IAuthTabCallbackStubProxy;
    private long IAuthTabCallback_Parcel;
    private final Runnable ICustomTabsCallback;
    private final Runnable ICustomTabsCallbackDefault;
    private boolean ICustomTabsCallbackStub;
    private Set<CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1> ICustomTabsCallbackStubProxy;
    private int ICustomTabsCallback_Parcel;
    private int ICustomTabsService;
    private BottomSheetScaffoldKtExternalSyntheticLambda11 ICustomTabsServiceDefault;
    private final int ICustomTabsServiceStub;
    private BasicTextContextMenuProviderKtExternalSyntheticLambda4 ICustomTabsServiceStubProxy;
    private final String ICustomTabsService_Parcel;
    private final ArrayList<TextFieldSelectionManager_androidKtExternalSyntheticLambda6> access000;
    private final Handler access100;
    private final SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted asBinder;
    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 asInterface;
    private BottomSheetScaffoldKtExternalSyntheticLambda8 extraCallbackWithResult;
    private boolean extraCommand;
    private int getInterfaceDescriptor;
    private int isEngagementSignalsApiAvailable;
    private final List<TextFieldSelectionManager_androidKtExternalSyntheticLambda3> mayLaunchUrl;
    private boolean newAuthTabSession;
    private long newSession;
    private boolean[] newSessionWithExtras;
    private final ArrayList<TextFieldSelectionManager_androidKtExternalSyntheticLambda3> onActivityLayout;
    private final int onActivityResized;
    private final onWarmupCompleted onExtraCallbackWithResult;
    private final BottomNavigationKtExternalSyntheticLambda0$onExtraCallback onMinimized;
    private final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onPostMessage;
    private long onRelationshipValidationResult;
    private BasicTextContextMenuProviderExternalSyntheticLambda0 onTransact;
    private final Map<String, BasicTextContextMenuProviderExternalSyntheticLambda0> onUnminimized;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda3 onWarmupCompleted;
    private SparseIntArray postMessage;
    private Set<Integer> prefetch;
    private boolean[] prefetchWithMultipleUrls;
    private final ComposableSingletonsScaffoldKtExternalSyntheticLambda5 readTypedObject;
    private boolean receiveFile;
    private IAuthTabCallback[] requestPostMessageChannel;
    private boolean setEngagementSignalsCallback;
    private int[] updateVisuals;
    private boolean validateRelationship;
    private TextFieldSelectionManager_androidKtExternalSyntheticLambda3 warmup;
    private boolean writeTypedObject;
    private final androidx.media3.exoplayer.upstream.Loader extraCallback = new androidx.media3.exoplayer.upstream.Loader("Loader:HlsSampleStreamWrapper");
    private final TextFieldSelectionManager_androidKtExternalSyntheticLambda0.onExtraCallback onMessageChannelReady = new TextFieldSelectionManager_androidKtExternalSyntheticLambda0.onExtraCallback();
    private int[] requestPostMessageChannelWithExtras = new int[0];

    public interface onWarmupCompleted extends BottomNavigationKtExternalSyntheticLambda8$onExtraCallback<TextFieldSelectionManager_androidKtExternalSyntheticLambda4> {
        void onExtraCallbackWithResult(Uri uri);

        void onNavigationEvent();
    }

    private static int asBinder(int i2) {
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // o.DrawerStateExternalSyntheticLambda1
    public void IAuthTabCallback(ExposedDropdownMenu_androidKtExternalSyntheticLambda4 exposedDropdownMenu_androidKtExternalSyntheticLambda4) {
    }

    public TextFieldSelectionManager_androidKtExternalSyntheticLambda4(String str, int i2, onWarmupCompleted onwarmupcompleted, TextFieldSelectionManager_androidKtExternalSyntheticLambda0 textFieldSelectionManager_androidKtExternalSyntheticLambda0, Map<String, BasicTextContextMenuProviderExternalSyntheticLambda0> map, ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, long j, @Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, SelectionRegistrarImplExternalSyntheticLambda0 selectionRegistrarImplExternalSyntheticLambda0, SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted, ComposableSingletonsScaffoldKtExternalSyntheticLambda5 composableSingletonsScaffoldKtExternalSyntheticLambda5, BottomNavigationKtExternalSyntheticLambda0$onExtraCallback bottomNavigationKtExternalSyntheticLambda0$onExtraCallback, int i3) {
        this.ICustomTabsService_Parcel = str;
        this.ICustomTabsServiceStub = i2;
        this.onExtraCallbackWithResult = onwarmupcompleted;
        this.IAuthTabCallback = textFieldSelectionManager_androidKtExternalSyntheticLambda0;
        this.onUnminimized = map;
        this.onWarmupCompleted = composableSingletonsScaffoldKtExternalSyntheticLambda3;
        this.onPostMessage = basicTextContextMenuProviderKtExternalSyntheticLambda4;
        this.IAuthTabCallbackStub = selectionRegistrarImplExternalSyntheticLambda0;
        this.asBinder = selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted;
        this.readTypedObject = composableSingletonsScaffoldKtExternalSyntheticLambda5;
        this.onMinimized = bottomNavigationKtExternalSyntheticLambda0$onExtraCallback;
        this.onActivityResized = i3;
        Set<Integer> set = onExtraCallback;
        this.prefetch = new HashSet(set.size());
        this.postMessage = new SparseIntArray(set.size());
        this.requestPostMessageChannel = new IAuthTabCallback[0];
        this.newSessionWithExtras = new boolean[0];
        this.prefetchWithMultipleUrls = new boolean[0];
        ArrayList<TextFieldSelectionManager_androidKtExternalSyntheticLambda3> arrayList = new ArrayList<>();
        this.onActivityLayout = arrayList;
        this.mayLaunchUrl = Collections.unmodifiableList(arrayList);
        this.access000 = new ArrayList<>();
        this.ICustomTabsCallback = new Runnable() { // from class: androidx.media3.exoplayer.hls.HlsSampleStreamWrapper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.writeTypedObject();
            }
        };
        this.ICustomTabsCallbackDefault = new Runnable() { // from class: androidx.media3.exoplayer.hls.HlsSampleStreamWrapper$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.onActivityLayout();
            }
        };
        this.access100 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult();
        this.IAuthTabCallback_Parcel = j;
        this.onRelationshipValidationResult = j;
    }

    public void onNavigationEvent() {
        if (this.extraCommand) {
            return;
        }
        IAuthTabCallback(new PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1.IAuthTabCallback().onExtraCallback(this.IAuthTabCallback_Parcel).onExtraCallbackWithResult());
    }

    public void onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[] coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr, int i2, int... iArr) {
        this.ICustomTabsServiceDefault = onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr);
        this.ICustomTabsCallbackStubProxy = new HashSet();
        for (int i3 : iArr) {
            this.ICustomTabsCallbackStubProxy.add(this.ICustomTabsServiceDefault.onWarmupCompleted(i3));
        }
        this.isEngagementSignalsApiAvailable = i2;
        Handler handler = this.access100;
        final onWarmupCompleted onwarmupcompleted = this.onExtraCallbackWithResult;
        Objects.requireNonNull(onwarmupcompleted);
        handler.post(new Runnable() { // from class: androidx.media3.exoplayer.hls.HlsSampleStreamWrapper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                onwarmupcompleted.onNavigationEvent();
            }
        });
        onActivityResized();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public void onTransact() throws ParserException, IOException {
        IAuthTabCallbackStub();
        if (this.writeTypedObject && !this.extraCommand) {
            throw ParserException.onNavigationEvent("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public BottomSheetScaffoldKtExternalSyntheticLambda11 IAuthTabCallbackDefault() {
        access100();
        return this.ICustomTabsServiceDefault;
    }

    public int asInterface() {
        return this.isEngagementSignalsApiAvailable;
    }

    public int IAuthTabCallback(int i2) {
        access100();
        int i3 = this.updateVisuals[i2];
        if (i3 == -1) {
            return this.ICustomTabsCallbackStubProxy.contains(this.ICustomTabsServiceDefault.onWarmupCompleted(i2)) ? -3 : -2;
        }
        boolean[] zArr = this.prefetchWithMultipleUrls;
        if (zArr[i3]) {
            return -2;
        }
        zArr[i3] = true;
        return i3;
    }

    public void onNavigationEvent(int i2) {
        access100();
        int i3 = this.updateVisuals[i2];
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.prefetchWithMultipleUrls[i3]);
        this.prefetchWithMultipleUrls[i3] = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNavigationEvent(ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr, boolean[] zArr, BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr, boolean[] zArr2, long j, boolean z) {
        boolean z2;
        access100();
        int i2 = this.getInterfaceDescriptor;
        int i3 = 0;
        for (int i4 = 0; i4 < colorsKtExternalSyntheticLambda0Arr.length; i4++) {
            TextFieldSelectionManager_androidKtExternalSyntheticLambda6 textFieldSelectionManager_androidKtExternalSyntheticLambda6 = (TextFieldSelectionManager_androidKtExternalSyntheticLambda6) bottomNavigationKtExternalSyntheticLambda5Arr[i4];
            if (textFieldSelectionManager_androidKtExternalSyntheticLambda6 != null && (colorsKtExternalSyntheticLambda0Arr[i4] == null || !zArr[i4])) {
                this.getInterfaceDescriptor--;
                textFieldSelectionManager_androidKtExternalSyntheticLambda6.onNavigationEvent();
                bottomNavigationKtExternalSyntheticLambda5Arr[i4] = null;
            }
        }
        boolean z3 = z || (!this.setEngagementSignalsCallback ? j == this.IAuthTabCallback_Parcel : i2 != 0);
        ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0OnExtraCallback = this.IAuthTabCallback.onExtraCallback();
        boolean z4 = z3;
        ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 = colorsKtExternalSyntheticLambda0OnExtraCallback;
        for (int i5 = 0; i5 < colorsKtExternalSyntheticLambda0Arr.length; i5++) {
            ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda02 = colorsKtExternalSyntheticLambda0Arr[i5];
            if (colorsKtExternalSyntheticLambda02 != null) {
                int iIAuthTabCallback = this.ICustomTabsServiceDefault.IAuthTabCallback(colorsKtExternalSyntheticLambda02.onExtraCallback());
                if (iIAuthTabCallback == this.isEngagementSignalsApiAvailable) {
                    this.IAuthTabCallback.onNavigationEvent(colorsKtExternalSyntheticLambda02);
                    colorsKtExternalSyntheticLambda0 = colorsKtExternalSyntheticLambda02;
                }
                if (bottomNavigationKtExternalSyntheticLambda5Arr[i5] == null) {
                    this.getInterfaceDescriptor++;
                    TextFieldSelectionManager_androidKtExternalSyntheticLambda6 textFieldSelectionManager_androidKtExternalSyntheticLambda62 = new TextFieldSelectionManager_androidKtExternalSyntheticLambda6(this, iIAuthTabCallback);
                    bottomNavigationKtExternalSyntheticLambda5Arr[i5] = textFieldSelectionManager_androidKtExternalSyntheticLambda62;
                    zArr2[i5] = true;
                    if (this.updateVisuals != null) {
                        textFieldSelectionManager_androidKtExternalSyntheticLambda62.onExtraCallback();
                        if (!z4) {
                            IAuthTabCallback iAuthTabCallback = this.requestPostMessageChannel[this.updateVisuals[iIAuthTabCallback]];
                            z4 = (iAuthTabCallback.onExtraCallbackWithResult() == 0 || iAuthTabCallback.onExtraCallbackWithResult(j, true)) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.getInterfaceDescriptor == 0) {
            this.IAuthTabCallback.onExtraCallbackWithResult();
            this.IAuthTabCallbackDefault = null;
            this.ICustomTabsCallbackStub = true;
            this.onActivityLayout.clear();
            if (this.extraCallback.onWarmupCompleted()) {
                if (this.receiveFile) {
                    IAuthTabCallback[] iAuthTabCallbackArr = this.requestPostMessageChannel;
                    int length = iAuthTabCallbackArr.length;
                    while (i3 < length) {
                        iAuthTabCallbackArr[i3].onExtraCallback();
                        i3++;
                    }
                }
                this.extraCallback.onNavigationEvent();
            } else {
                onMessageChannelReady();
            }
        } else if (this.onActivityLayout.isEmpty() || Objects.equals(colorsKtExternalSyntheticLambda0, colorsKtExternalSyntheticLambda0OnExtraCallback)) {
            z2 = z;
            if (z4) {
                onExtraCallback(j, z2);
                while (i3 < bottomNavigationKtExternalSyntheticLambda5Arr.length) {
                    if (bottomNavigationKtExternalSyntheticLambda5Arr[i3] != null) {
                        zArr2[i3] = true;
                    }
                    i3++;
                }
            }
        } else {
            if (!this.setEngagementSignalsCallback) {
                long j2 = j < 0 ? -j : 0L;
                TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3ExtraCallback = extraCallback();
                colorsKtExternalSyntheticLambda0.onNavigationEvent(j, j2, -9223372036854775807L, this.mayLaunchUrl, this.IAuthTabCallback.onNavigationEvent(textFieldSelectionManager_androidKtExternalSyntheticLambda3ExtraCallback, j));
                if (colorsKtExternalSyntheticLambda0.asBinder() != this.IAuthTabCallback.onWarmupCompleted().onExtraCallbackWithResult(textFieldSelectionManager_androidKtExternalSyntheticLambda3ExtraCallback.access100)) {
                }
                if (z4) {
                }
            }
            this.ICustomTabsCallbackStub = true;
            z2 = true;
            z4 = true;
            if (z4) {
            }
        }
        onNavigationEvent(bottomNavigationKtExternalSyntheticLambda5Arr);
        this.setEngagementSignalsCallback = true;
        return z4;
    }

    public void onExtraCallbackWithResult(long j, boolean z) {
        if (!this.receiveFile || extraCallbackWithResult()) {
            return;
        }
        int length = this.requestPostMessageChannel.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.requestPostMessageChannel[i2].IAuthTabCallback(j, z, this.prefetchWithMultipleUrls[i2]);
        }
    }

    public boolean onExtraCallback(long j, boolean z) {
        TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3;
        this.IAuthTabCallback_Parcel = j;
        if (extraCallbackWithResult()) {
            this.onRelationshipValidationResult = j;
            return true;
        }
        if (this.IAuthTabCallback.IAuthTabCallback()) {
            for (int i2 = 0; i2 < this.onActivityLayout.size(); i2++) {
                textFieldSelectionManager_androidKtExternalSyntheticLambda3 = this.onActivityLayout.get(i2);
                if (textFieldSelectionManager_androidKtExternalSyntheticLambda3.IAuthTabCallbackStub == j) {
                    break;
                }
            }
            textFieldSelectionManager_androidKtExternalSyntheticLambda3 = null;
        } else {
            textFieldSelectionManager_androidKtExternalSyntheticLambda3 = null;
        }
        if (this.receiveFile && !z && !this.onActivityLayout.isEmpty() && onExtraCallbackWithResult(j, textFieldSelectionManager_androidKtExternalSyntheticLambda3)) {
            return false;
        }
        this.onRelationshipValidationResult = j;
        this.writeTypedObject = false;
        this.onActivityLayout.clear();
        if (this.extraCallback.onWarmupCompleted()) {
            if (this.receiveFile) {
                for (IAuthTabCallback iAuthTabCallback : this.requestPostMessageChannel) {
                    iAuthTabCallback.onExtraCallback();
                }
            }
            this.extraCallback.onNavigationEvent();
        } else {
            this.extraCallback.onExtraCallbackWithResult();
            onMessageChannelReady();
        }
        return true;
    }

    public void getInterfaceDescriptor() {
        if (this.onActivityLayout.isEmpty()) {
            return;
        }
        TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3 = (TextFieldSelectionManager_androidKtExternalSyntheticLambda3) Iterables.getLast(this.onActivityLayout);
        int iIAuthTabCallback = this.IAuthTabCallback.IAuthTabCallback(textFieldSelectionManager_androidKtExternalSyntheticLambda3);
        if (iIAuthTabCallback == 1) {
            if (textFieldSelectionManager_androidKtExternalSyntheticLambda3.asInterface()) {
                return;
            }
            textFieldSelectionManager_androidKtExternalSyntheticLambda3.onNavigationEvent(this.IAuthTabCallback.onExtraCallback(textFieldSelectionManager_androidKtExternalSyntheticLambda3));
        } else if (iIAuthTabCallback == 0) {
            this.access100.post(new HlsSampleStreamWrapper$.ExternalSyntheticLambda0(this, textFieldSelectionManager_androidKtExternalSyntheticLambda3));
        } else if (iIAuthTabCallback == 2 && !this.writeTypedObject && this.extraCallback.onWarmupCompleted()) {
            this.extraCallback.onNavigationEvent();
        }
    }

    public void access000() {
        if (this.extraCommand) {
            for (IAuthTabCallback iAuthTabCallback : this.requestPostMessageChannel) {
                iAuthTabCallback.IAuthTabCallback_Parcel();
            }
        }
        this.IAuthTabCallback.onExtraCallbackWithResult();
        this.extraCallback.onWarmupCompleted(this);
        this.access100.removeCallbacksAndMessages(null);
        this.newAuthTabSession = true;
        this.access000.clear();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onWarmupCompleted
    public void IAuthTabCallbackStubProxy() {
        for (IAuthTabCallback iAuthTabCallback : this.requestPostMessageChannel) {
            iAuthTabCallback.getInterfaceDescriptor();
        }
    }

    public void onWarmupCompleted(boolean z) {
        this.IAuthTabCallback.onExtraCallbackWithResult(z);
    }

    public boolean onExtraCallback(Uri uri, ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent composableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent, boolean z) {
        ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onExtraCallback composableSingletonsScaffoldKtExternalSyntheticLambda5$onExtraCallbackOnExtraCallback;
        if (this.IAuthTabCallback.onExtraCallbackWithResult(uri)) {
            return this.IAuthTabCallback.IAuthTabCallback(uri, (z || (composableSingletonsScaffoldKtExternalSyntheticLambda5$onExtraCallbackOnExtraCallback = this.readTypedObject.onExtraCallback(ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda0.onWarmupCompleted(this.IAuthTabCallback.onExtraCallback()), composableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent)) == null || composableSingletonsScaffoldKtExternalSyntheticLambda5$onExtraCallbackOnExtraCallback.onWarmupCompleted != 2) ? -9223372036854775807L : composableSingletonsScaffoldKtExternalSyntheticLambda5$onExtraCallbackOnExtraCallback.onExtraCallbackWithResult);
        }
        return true;
    }

    public boolean asBinder() {
        return this.ICustomTabsCallback_Parcel == 2;
    }

    public long IAuthTabCallback(long j, SelectionContainerKtExternalSyntheticLambda2 selectionContainerKtExternalSyntheticLambda2) {
        return this.IAuthTabCallback.onExtraCallbackWithResult(j, selectionContainerKtExternalSyntheticLambda2);
    }

    public boolean onExtraCallback(int i2) {
        return !extraCallbackWithResult() && this.requestPostMessageChannel[i2].onExtraCallback(this.writeTypedObject);
    }

    public void onExtraCallbackWithResult(int i2) throws IOException {
        IAuthTabCallbackStub();
        this.requestPostMessageChannel[i2].asInterface();
    }

    public void IAuthTabCallbackStub() throws IOException {
        this.extraCallback.IAuthTabCallback();
        this.IAuthTabCallback.onNavigationEvent();
    }

    public int onWarmupCompleted(int i2, AndroidSelectionHandles_androidKtExternalSyntheticLambda7 androidSelectionHandles_androidKtExternalSyntheticLambda7, SelectionControllerExternalSyntheticLambda2 selectionControllerExternalSyntheticLambda2, int i3) {
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4;
        if (extraCallbackWithResult()) {
            return -3;
        }
        int i4 = 0;
        if (!this.onActivityLayout.isEmpty()) {
            int i5 = 0;
            while (i5 < this.onActivityLayout.size() - 1 && onNavigationEvent(this.onActivityLayout.get(i5))) {
                i5++;
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(this.onActivityLayout, 0, i5);
            TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3 = this.onActivityLayout.get(0);
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = textFieldSelectionManager_androidKtExternalSyntheticLambda3.access100;
            if (!basicTextContextMenuProviderKtExternalSyntheticLambda42.equals(this.IAuthTabCallbackDefault)) {
                this.onMinimized.onNavigationEvent(this.ICustomTabsServiceStub, basicTextContextMenuProviderKtExternalSyntheticLambda42, textFieldSelectionManager_androidKtExternalSyntheticLambda3.getInterfaceDescriptor, textFieldSelectionManager_androidKtExternalSyntheticLambda3.IAuthTabCallback_Parcel, textFieldSelectionManager_androidKtExternalSyntheticLambda3.IAuthTabCallbackStub);
            }
            this.IAuthTabCallbackDefault = basicTextContextMenuProviderKtExternalSyntheticLambda42;
        }
        if (!this.onActivityLayout.isEmpty() && !this.onActivityLayout.get(0).asInterface()) {
            return -3;
        }
        int iOnWarmupCompleted = this.requestPostMessageChannel[i2].onWarmupCompleted(androidSelectionHandles_androidKtExternalSyntheticLambda7, selectionControllerExternalSyntheticLambda2, i3, this.writeTypedObject);
        if (iOnWarmupCompleted == -5) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(androidSelectionHandles_androidKtExternalSyntheticLambda7.onWarmupCompleted);
            if (i2 == this.ICustomTabsService) {
                int iCheckedCast = Ints.checkedCast(this.requestPostMessageChannel[i2].access100());
                while (i4 < this.onActivityLayout.size() && this.onActivityLayout.get(i4).onWarmupCompleted != iCheckedCast) {
                    i4++;
                }
                if (i4 < this.onActivityLayout.size()) {
                    basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.onActivityLayout.get(i4).access100;
                } else {
                    basicTextContextMenuProviderKtExternalSyntheticLambda4 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.ICustomTabsServiceStubProxy);
                }
                basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            }
            androidSelectionHandles_androidKtExternalSyntheticLambda7.onWarmupCompleted = basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent;
        }
        return iOnWarmupCompleted;
    }

    public int onExtraCallbackWithResult(int i2, long j) {
        if (extraCallbackWithResult()) {
            return 0;
        }
        IAuthTabCallback iAuthTabCallback = this.requestPostMessageChannel[i2];
        int iOnExtraCallback = iAuthTabCallback.onExtraCallback(j, this.writeTypedObject);
        TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3 = (TextFieldSelectionManager_androidKtExternalSyntheticLambda3) Iterables.getLast(this.onActivityLayout, (Object) null);
        if (textFieldSelectionManager_androidKtExternalSyntheticLambda3 != null && !textFieldSelectionManager_androidKtExternalSyntheticLambda3.asInterface()) {
            iOnExtraCallback = Math.min(iOnExtraCallback, textFieldSelectionManager_androidKtExternalSyntheticLambda3.onNavigationEvent(i2) - iAuthTabCallback.onExtraCallbackWithResult());
        }
        iAuthTabCallback.IAuthTabCallback(iOnExtraCallback);
        return iOnExtraCallback;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    public long onWarmupCompleted() {
        /*
            r7 = this;
            boolean r0 = r7.writeTypedObject
            if (r0 == 0) goto L7
            r0 = -9223372036854775808
            return r0
        L7:
            boolean r0 = r7.extraCallbackWithResult()
            if (r0 == 0) goto L10
            long r0 = r7.onRelationshipValidationResult
            return r0
        L10:
            long r0 = r7.IAuthTabCallback_Parcel
            o.TextFieldSelectionManager_androidKtExternalSyntheticLambda3 r2 = r7.extraCallback()
            boolean r3 = r2.onWarmupCompleted()
            if (r3 != 0) goto L35
            java.util.ArrayList<o.TextFieldSelectionManager_androidKtExternalSyntheticLambda3> r2 = r7.onActivityLayout
            int r2 = r2.size()
            r3 = 1
            if (r2 <= r3) goto L34
            java.util.ArrayList<o.TextFieldSelectionManager_androidKtExternalSyntheticLambda3> r2 = r7.onActivityLayout
            int r3 = r2.size()
            int r3 = r3 + (-2)
            java.lang.Object r2 = r2.get(r3)
            o.TextFieldSelectionManager_androidKtExternalSyntheticLambda3 r2 = (o.TextFieldSelectionManager_androidKtExternalSyntheticLambda3) r2
            goto L35
        L34:
            r2 = 0
        L35:
            if (r2 == 0) goto L3d
            long r2 = r2.IAuthTabCallbackDefault
            long r0 = java.lang.Math.max(r0, r2)
        L3d:
            boolean r2 = r7.receiveFile
            if (r2 == 0) goto L54
            o.TextFieldSelectionManager_androidKtExternalSyntheticLambda4$IAuthTabCallback[] r2 = r7.requestPostMessageChannel
            int r3 = r2.length
            r4 = 0
        L45:
            if (r4 >= r3) goto L54
            r5 = r2[r4]
            long r5 = r5.onWarmupCompleted()
            long r0 = java.lang.Math.max(r0, r5)
            int r4 = r4 + 1
            goto L45
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.TextFieldSelectionManager_androidKtExternalSyntheticLambda4.onWarmupCompleted():long");
    }

    public long onExtraCallback() {
        if (extraCallbackWithResult()) {
            return this.onRelationshipValidationResult;
        }
        if (this.writeTypedObject) {
            return Long.MIN_VALUE;
        }
        return extraCallback().IAuthTabCallbackDefault;
    }

    public boolean IAuthTabCallback(PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1 platformSelectionBehaviors_androidKtExternalSyntheticLambda1) {
        long jMax;
        List<TextFieldSelectionManager_androidKtExternalSyntheticLambda3> list;
        long j;
        long j2;
        if (this.writeTypedObject || this.extraCallback.onWarmupCompleted() || this.extraCallback.onExtraCallback()) {
            return false;
        }
        if (extraCallbackWithResult()) {
            List<TextFieldSelectionManager_androidKtExternalSyntheticLambda3> list2 = Collections.EMPTY_LIST;
            long j3 = this.onRelationshipValidationResult;
            for (IAuthTabCallback iAuthTabCallback : this.requestPostMessageChannel) {
                iAuthTabCallback.onExtraCallbackWithResult(this.onRelationshipValidationResult);
            }
            list = list2;
            j = j3;
            j2 = j;
        } else {
            List<TextFieldSelectionManager_androidKtExternalSyntheticLambda3> list3 = this.mayLaunchUrl;
            TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3ExtraCallback = extraCallback();
            if (!textFieldSelectionManager_androidKtExternalSyntheticLambda3ExtraCallback.onWarmupCompleted() || !textFieldSelectionManager_androidKtExternalSyntheticLambda3ExtraCallback.asInterface()) {
                jMax = Math.max(this.IAuthTabCallback_Parcel, textFieldSelectionManager_androidKtExternalSyntheticLambda3ExtraCallback.IAuthTabCallbackStub);
            } else {
                jMax = textFieldSelectionManager_androidKtExternalSyntheticLambda3ExtraCallback.onNavigationEvent();
            }
            long jMax2 = this.IAuthTabCallback_Parcel;
            if (this.receiveFile) {
                for (IAuthTabCallback iAuthTabCallback2 : this.requestPostMessageChannel) {
                    jMax2 = Math.max(jMax2, iAuthTabCallback2.onNavigationEvent());
                }
            }
            list = list3;
            j = jMax;
            j2 = jMax2;
        }
        this.onMessageChannelReady.onExtraCallback();
        this.IAuthTabCallback.onExtraCallback(platformSelectionBehaviors_androidKtExternalSyntheticLambda1, j, j2, list, this.extraCommand || !list.isEmpty(), this.onMessageChannelReady);
        TextFieldSelectionManager_androidKtExternalSyntheticLambda0.onExtraCallback onextracallback = this.onMessageChannelReady;
        boolean z = onextracallback.onExtraCallback;
        BottomSheetScaffoldKtExternalSyntheticLambda8 bottomSheetScaffoldKtExternalSyntheticLambda8 = onextracallback.onNavigationEvent;
        Uri uri = onextracallback.onExtraCallbackWithResult;
        if (z) {
            this.onRelationshipValidationResult = -9223372036854775807L;
            this.writeTypedObject = true;
            return true;
        }
        if (bottomSheetScaffoldKtExternalSyntheticLambda8 == null) {
            if (uri != null) {
                this.onExtraCallbackWithResult.onExtraCallbackWithResult(uri);
            }
            return false;
        }
        if (onWarmupCompleted(bottomSheetScaffoldKtExternalSyntheticLambda8)) {
            TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3 = (TextFieldSelectionManager_androidKtExternalSyntheticLambda3) bottomSheetScaffoldKtExternalSyntheticLambda8;
            onExtraCallbackWithResult(textFieldSelectionManager_androidKtExternalSyntheticLambda3);
            IAuthTabCallback(textFieldSelectionManager_androidKtExternalSyntheticLambda3);
        }
        this.extraCallbackWithResult = bottomSheetScaffoldKtExternalSyntheticLambda8;
        this.extraCallback.onWarmupCompleted(bottomSheetScaffoldKtExternalSyntheticLambda8, this, this.readTypedObject.IAuthTabCallback(bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStubProxy));
        return true;
    }

    private void onExtraCallbackWithResult(TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3) {
        if (this.onActivityLayout.isEmpty()) {
            return;
        }
        if (!extraCallback().asInterface()) {
            IAuthTabCallbackDefault(this.onActivityLayout.size() - 1);
        }
        if (textFieldSelectionManager_androidKtExternalSyntheticLambda3.onExtraCallback && textFieldSelectionManager_androidKtExternalSyntheticLambda3.onTransact()) {
            for (int size = this.onActivityLayout.size() - 1; size >= 0; size--) {
                long j = this.onActivityLayout.get(size).IAuthTabCallbackStub;
                long j2 = textFieldSelectionManager_androidKtExternalSyntheticLambda3.IAuthTabCallbackStub;
                if (j < j2) {
                    return;
                }
                if (j == j2 && onWarmupCompleted(size)) {
                    IAuthTabCallbackDefault(size);
                    textFieldSelectionManager_androidKtExternalSyntheticLambda3.onExtraCallback();
                    return;
                }
            }
        }
    }

    public boolean IAuthTabCallback() {
        return this.extraCallback.onWarmupCompleted();
    }

    public void IAuthTabCallback(long j) {
        if (this.extraCallback.onExtraCallback() || extraCallbackWithResult()) {
            return;
        }
        if (this.extraCallback.onWarmupCompleted()) {
            if (this.IAuthTabCallback.onNavigationEvent(j, this.extraCallbackWithResult, this.mayLaunchUrl)) {
                this.extraCallback.onNavigationEvent();
                return;
            }
            return;
        }
        int size = this.mayLaunchUrl.size();
        while (size > 0 && this.IAuthTabCallback.IAuthTabCallback(this.mayLaunchUrl.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.mayLaunchUrl.size()) {
            IAuthTabCallbackDefault(size);
        }
        int iOnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted(j, this.mayLaunchUrl);
        if (iOnWarmupCompleted < this.onActivityLayout.size()) {
            IAuthTabCallbackDefault(iOnWarmupCompleted);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public void onWarmupCompleted(BottomSheetScaffoldKtExternalSyntheticLambda8 bottomSheetScaffoldKtExternalSyntheticLambda8, long j, long j2, int i2) {
        BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0;
        if (i2 == 0) {
            badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(bottomSheetScaffoldKtExternalSyntheticLambda8.asInterface, bottomSheetScaffoldKtExternalSyntheticLambda8.asBinder, j);
        } else {
            badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(bottomSheetScaffoldKtExternalSyntheticLambda8.asInterface, bottomSheetScaffoldKtExternalSyntheticLambda8.asBinder, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallback_Parcel(), bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStubProxy(), j, j2, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStub());
        }
        this.onMinimized.onExtraCallback(badgeKtExternalSyntheticLambda0, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStubProxy, this.ICustomTabsServiceStub, bottomSheetScaffoldKtExternalSyntheticLambda8.access100, bottomSheetScaffoldKtExternalSyntheticLambda8.getInterfaceDescriptor, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallback_Parcel, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStub, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackDefault, i2);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult
    /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
    public void onExtraCallbackWithResult(BottomSheetScaffoldKtExternalSyntheticLambda8 bottomSheetScaffoldKtExternalSyntheticLambda8, long j, long j2) {
        this.extraCallbackWithResult = null;
        this.IAuthTabCallback.onWarmupCompleted(bottomSheetScaffoldKtExternalSyntheticLambda8);
        BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(bottomSheetScaffoldKtExternalSyntheticLambda8.asInterface, bottomSheetScaffoldKtExternalSyntheticLambda8.asBinder, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallback_Parcel(), bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStubProxy(), j, j2, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStub());
        long j3 = bottomSheetScaffoldKtExternalSyntheticLambda8.asInterface;
        this.onMinimized.IAuthTabCallback(badgeKtExternalSyntheticLambda0, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStubProxy, this.ICustomTabsServiceStub, bottomSheetScaffoldKtExternalSyntheticLambda8.access100, bottomSheetScaffoldKtExternalSyntheticLambda8.getInterfaceDescriptor, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallback_Parcel, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStub, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackDefault);
        if (!this.extraCommand) {
            IAuthTabCallback(new PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1.IAuthTabCallback().onExtraCallback(this.IAuthTabCallback_Parcel).onExtraCallbackWithResult());
        } else {
            this.onExtraCallbackWithResult.onWarmupCompleted(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult
    /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
    public void onNavigationEvent(BottomSheetScaffoldKtExternalSyntheticLambda8 bottomSheetScaffoldKtExternalSyntheticLambda8, long j, long j2, boolean z) {
        this.extraCallbackWithResult = null;
        BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(bottomSheetScaffoldKtExternalSyntheticLambda8.asInterface, bottomSheetScaffoldKtExternalSyntheticLambda8.asBinder, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallback_Parcel(), bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStubProxy(), j, j2, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStub());
        long j3 = bottomSheetScaffoldKtExternalSyntheticLambda8.asInterface;
        this.onMinimized.onNavigationEvent(badgeKtExternalSyntheticLambda0, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStubProxy, this.ICustomTabsServiceStub, bottomSheetScaffoldKtExternalSyntheticLambda8.access100, bottomSheetScaffoldKtExternalSyntheticLambda8.getInterfaceDescriptor, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallback_Parcel, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStub, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackDefault);
        if (z) {
            return;
        }
        if (extraCallbackWithResult() || this.getInterfaceDescriptor == 0) {
            onMessageChannelReady();
        }
        if (this.getInterfaceDescriptor > 0) {
            this.onExtraCallbackWithResult.onWarmupCompleted(this);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult
    /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
    public Loader.IAuthTabCallback onExtraCallbackWithResult(BottomSheetScaffoldKtExternalSyntheticLambda8 bottomSheetScaffoldKtExternalSyntheticLambda8, long j, long j2, IOException iOException, int i2) {
        Loader.IAuthTabCallback iAuthTabCallbackOnExtraCallback;
        int i3;
        boolean zOnWarmupCompleted = onWarmupCompleted(bottomSheetScaffoldKtExternalSyntheticLambda8);
        if (zOnWarmupCompleted && !((TextFieldSelectionManager_androidKtExternalSyntheticLambda3) bottomSheetScaffoldKtExternalSyntheticLambda8).asInterface() && (iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((i3 = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode) == 410 || i3 == 404)) {
            return androidx.media3.exoplayer.upstream.Loader.onExtraCallback;
        }
        long jIAuthTabCallbackStub = bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStub();
        BadgeKtExternalSyntheticLambda0 badgeKtExternalSyntheticLambda0 = new BadgeKtExternalSyntheticLambda0(bottomSheetScaffoldKtExternalSyntheticLambda8.asInterface, bottomSheetScaffoldKtExternalSyntheticLambda8.asBinder, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallback_Parcel(), bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStubProxy(), j, j2, jIAuthTabCallbackStub);
        ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent composableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent = new ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent(badgeKtExternalSyntheticLambda0, new BadgeKtExternalSyntheticLambda2(bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStubProxy, this.ICustomTabsServiceStub, bottomSheetScaffoldKtExternalSyntheticLambda8.access100, bottomSheetScaffoldKtExternalSyntheticLambda8.getInterfaceDescriptor, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallback_Parcel, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStub), TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackDefault)), iOException, i2);
        ComposableSingletonsScaffoldKtExternalSyntheticLambda5$onExtraCallback composableSingletonsScaffoldKtExternalSyntheticLambda5$onExtraCallbackOnExtraCallback = this.readTypedObject.onExtraCallback(ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda0.onWarmupCompleted(this.IAuthTabCallback.onExtraCallback()), composableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent);
        boolean zOnExtraCallbackWithResult = (composableSingletonsScaffoldKtExternalSyntheticLambda5$onExtraCallbackOnExtraCallback == null || composableSingletonsScaffoldKtExternalSyntheticLambda5$onExtraCallbackOnExtraCallback.onWarmupCompleted != 2) ? false : this.IAuthTabCallback.onExtraCallbackWithResult(bottomSheetScaffoldKtExternalSyntheticLambda8, composableSingletonsScaffoldKtExternalSyntheticLambda5$onExtraCallbackOnExtraCallback.onExtraCallbackWithResult);
        if (zOnExtraCallbackWithResult) {
            if (zOnWarmupCompleted && jIAuthTabCallbackStub == 0) {
                ArrayList<TextFieldSelectionManager_androidKtExternalSyntheticLambda3> arrayList = this.onActivityLayout;
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(arrayList.remove(arrayList.size() - 1) == bottomSheetScaffoldKtExternalSyntheticLambda8);
                if (this.onActivityLayout.isEmpty()) {
                    this.onRelationshipValidationResult = this.IAuthTabCallback_Parcel;
                } else {
                    ((TextFieldSelectionManager_androidKtExternalSyntheticLambda3) Iterables.getLast(this.onActivityLayout)).onExtraCallbackWithResult();
                }
            }
            iAuthTabCallbackOnExtraCallback = androidx.media3.exoplayer.upstream.Loader.IAuthTabCallback;
        } else {
            long jOnWarmupCompleted = this.readTypedObject.onWarmupCompleted(composableSingletonsScaffoldKtExternalSyntheticLambda5$onNavigationEvent);
            if (jOnWarmupCompleted != -9223372036854775807L) {
                iAuthTabCallbackOnExtraCallback = androidx.media3.exoplayer.upstream.Loader.onExtraCallback(false, jOnWarmupCompleted);
            } else {
                iAuthTabCallbackOnExtraCallback = androidx.media3.exoplayer.upstream.Loader.onExtraCallbackWithResult;
            }
        }
        Loader.IAuthTabCallback iAuthTabCallback = iAuthTabCallbackOnExtraCallback;
        boolean zOnExtraCallbackWithResult2 = iAuthTabCallback.onExtraCallbackWithResult();
        this.onMinimized.IAuthTabCallback(badgeKtExternalSyntheticLambda0, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStubProxy, this.ICustomTabsServiceStub, bottomSheetScaffoldKtExternalSyntheticLambda8.access100, bottomSheetScaffoldKtExternalSyntheticLambda8.getInterfaceDescriptor, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallback_Parcel, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackStub, bottomSheetScaffoldKtExternalSyntheticLambda8.IAuthTabCallbackDefault, iOException, !zOnExtraCallbackWithResult2);
        if (!zOnExtraCallbackWithResult2) {
            this.extraCallbackWithResult = null;
            long j3 = bottomSheetScaffoldKtExternalSyntheticLambda8.asInterface;
        }
        if (zOnExtraCallbackWithResult) {
            if (!this.extraCommand) {
                IAuthTabCallback(new PlatformSelectionBehaviors_androidKtExternalSyntheticLambda1.IAuthTabCallback().onExtraCallback(this.IAuthTabCallback_Parcel).onExtraCallbackWithResult());
                return iAuthTabCallback;
            }
            this.onExtraCallbackWithResult.onWarmupCompleted(this);
        }
        return iAuthTabCallback;
    }

    private void IAuthTabCallback(TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3) {
        this.warmup = textFieldSelectionManager_androidKtExternalSyntheticLambda3;
        this.ICustomTabsServiceStubProxy = textFieldSelectionManager_androidKtExternalSyntheticLambda3.access100;
        this.onRelationshipValidationResult = -9223372036854775807L;
        this.onActivityLayout.add(textFieldSelectionManager_androidKtExternalSyntheticLambda3);
        ImmutableList.Builder builder = ImmutableList.builder();
        for (IAuthTabCallback iAuthTabCallback : this.requestPostMessageChannel) {
            builder.add(Integer.valueOf(iAuthTabCallback.asBinder()));
        }
        textFieldSelectionManager_androidKtExternalSyntheticLambda3.onNavigationEvent(this, builder.build());
        for (IAuthTabCallback iAuthTabCallback2 : this.requestPostMessageChannel) {
            iAuthTabCallback2.onWarmupCompleted(textFieldSelectionManager_androidKtExternalSyntheticLambda3);
            if (textFieldSelectionManager_androidKtExternalSyntheticLambda3.onTransact()) {
                iAuthTabCallback2.IAuthTabCallbackStubProxy();
            }
        }
    }

    private void IAuthTabCallbackDefault(int i2) {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(!this.extraCallback.onWarmupCompleted());
        while (true) {
            if (i2 >= this.onActivityLayout.size()) {
                i2 = -1;
                break;
            } else if (onWarmupCompleted(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        long j = extraCallback().IAuthTabCallbackDefault;
        TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3AsInterface = asInterface(i2);
        if (this.onActivityLayout.isEmpty()) {
            this.onRelationshipValidationResult = this.IAuthTabCallback_Parcel;
        } else {
            ((TextFieldSelectionManager_androidKtExternalSyntheticLambda3) Iterables.getLast(this.onActivityLayout)).onExtraCallbackWithResult();
        }
        this.writeTypedObject = false;
        this.onMinimized.onWarmupCompleted(this.ICustomTabsCallback_Parcel, textFieldSelectionManager_androidKtExternalSyntheticLambda3AsInterface.IAuthTabCallbackStub, j);
    }

    @Override // o.DrawerStateExternalSyntheticLambda1
    public ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onExtraCallbackWithResult(int i2, int i3) {
        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnNavigationEvent;
        if (!onExtraCallback.contains(Integer.valueOf(i3))) {
            int i4 = 0;
            while (true) {
                ExposedDropdownMenu_androidKtExternalSyntheticLambda5[] exposedDropdownMenu_androidKtExternalSyntheticLambda5Arr = this.requestPostMessageChannel;
                if (i4 >= exposedDropdownMenu_androidKtExternalSyntheticLambda5Arr.length) {
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnNavigationEvent = null;
                    break;
                }
                if (this.requestPostMessageChannelWithExtras[i4] == i2) {
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnNavigationEvent = exposedDropdownMenu_androidKtExternalSyntheticLambda5Arr[i4];
                    break;
                }
                i4++;
            }
        } else {
            exposedDropdownMenu_androidKtExternalSyntheticLambda5OnNavigationEvent = onWarmupCompleted(i2, i3);
        }
        if (exposedDropdownMenu_androidKtExternalSyntheticLambda5OnNavigationEvent == null) {
            if (this.validateRelationship) {
                return onExtraCallback(i2, i3);
            }
            exposedDropdownMenu_androidKtExternalSyntheticLambda5OnNavigationEvent = onNavigationEvent(i2, i3);
        }
        if (i3 != 5) {
            return exposedDropdownMenu_androidKtExternalSyntheticLambda5OnNavigationEvent;
        }
        if (this.asInterface == null) {
            this.asInterface = new onExtraCallback(exposedDropdownMenu_androidKtExternalSyntheticLambda5OnNavigationEvent, this.onActivityResized);
        }
        return this.asInterface;
    }

    private ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onWarmupCompleted(int i2, int i3) {
        RecordingInputConnection_androidKt.onNavigationEvent(onExtraCallback.contains(Integer.valueOf(i3)));
        int i4 = this.postMessage.get(i3, -1);
        if (i4 == -1) {
            return null;
        }
        if (this.prefetch.add(Integer.valueOf(i3))) {
            this.requestPostMessageChannelWithExtras[i4] = i2;
        }
        if (this.requestPostMessageChannelWithExtras[i4] == i2) {
            return this.requestPostMessageChannel[i4];
        }
        return onExtraCallback(i2, i3);
    }

    private BottomNavigationKtExternalSyntheticLambda3 onNavigationEvent(int i2, int i3) {
        int length = this.requestPostMessageChannel.length;
        boolean z = true;
        if (i3 != 1 && i3 != 2) {
            z = false;
        }
        IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(this.onWarmupCompleted, this.IAuthTabCallbackStub, this.asBinder, this.onUnminimized);
        iAuthTabCallback.onExtraCallbackWithResult(this.IAuthTabCallback_Parcel);
        if (z) {
            iAuthTabCallback.onExtraCallback(this.onTransact);
        }
        iAuthTabCallback.IAuthTabCallback(this.newSession);
        TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3 = this.warmup;
        if (textFieldSelectionManager_androidKtExternalSyntheticLambda3 != null) {
            iAuthTabCallback.onWarmupCompleted(textFieldSelectionManager_androidKtExternalSyntheticLambda3);
        }
        iAuthTabCallback.onNavigationEvent(this);
        int i4 = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.requestPostMessageChannelWithExtras, i4);
        this.requestPostMessageChannelWithExtras = iArrCopyOf;
        iArrCopyOf[length] = i2;
        Object[] objArr = {this.requestPostMessageChannel, iAuthTabCallback};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        this.requestPostMessageChannel = (IAuthTabCallback[]) ((Object[]) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(52392013, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, -52391993));
        boolean[] zArrCopyOf = Arrays.copyOf(this.newSessionWithExtras, i4);
        this.newSessionWithExtras = zArrCopyOf;
        zArrCopyOf[length] = z;
        this.IAuthTabCallbackStubProxy = z | this.IAuthTabCallbackStubProxy;
        this.prefetch.add(Integer.valueOf(i3));
        this.postMessage.append(i3, length);
        if (asBinder(i3) > asBinder(this.ICustomTabsCallback_Parcel)) {
            this.ICustomTabsService = length;
            this.ICustomTabsCallback_Parcel = i3;
        }
        this.prefetchWithMultipleUrls = Arrays.copyOf(this.prefetchWithMultipleUrls, i4);
        return iAuthTabCallback;
    }

    @Override // o.DrawerStateExternalSyntheticLambda1
    public void onExtraCallbackWithResult() {
        this.validateRelationship = true;
        this.access100.post(this.ICustomTabsCallbackDefault);
    }

    @Override // o.BottomNavigationKtExternalSyntheticLambda3.onWarmupCompleted
    public void IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        this.access100.post(this.ICustomTabsCallback);
    }

    public void IAuthTabCallback_Parcel() {
        this.prefetch.clear();
    }

    public void onNavigationEvent(long j) {
        if (this.newSession != j) {
            this.newSession = j;
            for (IAuthTabCallback iAuthTabCallback : this.requestPostMessageChannel) {
                iAuthTabCallback.IAuthTabCallback(j);
            }
        }
    }

    public void onExtraCallbackWithResult(@Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0) {
        if (Objects.equals(this.onTransact, basicTextContextMenuProviderExternalSyntheticLambda0)) {
            return;
        }
        this.onTransact = basicTextContextMenuProviderExternalSyntheticLambda0;
        int i2 = 0;
        while (true) {
            IAuthTabCallback[] iAuthTabCallbackArr = this.requestPostMessageChannel;
            if (i2 >= iAuthTabCallbackArr.length) {
                return;
            }
            if (this.newSessionWithExtras[i2]) {
                iAuthTabCallbackArr[i2].onExtraCallback(basicTextContextMenuProviderExternalSyntheticLambda0);
            }
            i2++;
        }
    }

    private void onNavigationEvent(BottomNavigationKtExternalSyntheticLambda5[] bottomNavigationKtExternalSyntheticLambda5Arr) {
        this.access000.clear();
        for (BottomNavigationKtExternalSyntheticLambda5 bottomNavigationKtExternalSyntheticLambda5 : bottomNavigationKtExternalSyntheticLambda5Arr) {
            if (bottomNavigationKtExternalSyntheticLambda5 != null) {
                this.access000.add((TextFieldSelectionManager_androidKtExternalSyntheticLambda6) bottomNavigationKtExternalSyntheticLambda5);
            }
        }
    }

    private boolean onNavigationEvent(TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3) {
        int i2 = textFieldSelectionManager_androidKtExternalSyntheticLambda3.onWarmupCompleted;
        int length = this.requestPostMessageChannel.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.prefetchWithMultipleUrls[i3] && this.requestPostMessageChannel[i3].access100() == i2) {
                return false;
            }
        }
        return true;
    }

    private boolean onWarmupCompleted(int i2) {
        for (int i3 = i2; i3 < this.onActivityLayout.size(); i3++) {
            if (this.onActivityLayout.get(i3).onTransact()) {
                return false;
            }
        }
        TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3 = this.onActivityLayout.get(i2);
        for (int i4 = 0; i4 < this.requestPostMessageChannel.length; i4++) {
            if (this.requestPostMessageChannel[i4].onExtraCallbackWithResult() > textFieldSelectionManager_androidKtExternalSyntheticLambda3.onNavigationEvent(i4)) {
                return false;
            }
        }
        return true;
    }

    private TextFieldSelectionManager_androidKtExternalSyntheticLambda3 asInterface(int i2) {
        TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3 = this.onActivityLayout.get(i2);
        ArrayList<TextFieldSelectionManager_androidKtExternalSyntheticLambda3> arrayList = this.onActivityLayout;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(arrayList, i2, arrayList.size());
        for (int i3 = 0; i3 < this.requestPostMessageChannel.length; i3++) {
            this.requestPostMessageChannel[i3].onExtraCallback(textFieldSelectionManager_androidKtExternalSyntheticLambda3.onNavigationEvent(i3));
        }
        return textFieldSelectionManager_androidKtExternalSyntheticLambda3;
    }

    private void onMessageChannelReady() {
        for (IAuthTabCallback iAuthTabCallback : this.requestPostMessageChannel) {
            iAuthTabCallback.onWarmupCompleted(this.ICustomTabsCallbackStub);
        }
        this.ICustomTabsCallbackStub = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onActivityLayout() {
        this.receiveFile = true;
        writeTypedObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeTypedObject() {
        if (!this.newAuthTabSession && this.updateVisuals == null && this.receiveFile) {
            for (IAuthTabCallback iAuthTabCallback : this.requestPostMessageChannel) {
                if (iAuthTabCallback.IAuthTabCallbackStub() == null) {
                    return;
                }
            }
            if (this.ICustomTabsServiceDefault != null) {
                ICustomTabsCallback();
                return;
            }
            readTypedObject();
            onActivityResized();
            this.onExtraCallbackWithResult.onNavigationEvent();
        }
    }

    @EnsuresNonNull
    @RequiresNonNull
    private void ICustomTabsCallback() {
        int i2 = this.ICustomTabsServiceDefault.onExtraCallbackWithResult;
        int[] iArr = new int[i2];
        this.updateVisuals = iArr;
        Arrays.fill(iArr, -1);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            while (true) {
                IAuthTabCallback[] iAuthTabCallbackArr = this.requestPostMessageChannel;
                if (i4 >= iAuthTabCallbackArr.length) {
                    break;
                }
                if (onWarmupCompleted((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(iAuthTabCallbackArr[i4].IAuthTabCallbackStub()), this.ICustomTabsServiceDefault.onWarmupCompleted(i3).IAuthTabCallback(0))) {
                    this.updateVisuals[i3] = i4;
                    break;
                }
                i4++;
            }
        }
        Iterator<TextFieldSelectionManager_androidKtExternalSyntheticLambda6> it = this.access000.iterator();
        while (it.hasNext()) {
            it.next().onExtraCallback();
        }
    }

    @EnsuresNonNull
    private void readTypedObject() {
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnExtraCallbackWithResult;
        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4;
        int length = this.requestPostMessageChannel.length;
        int i2 = 0;
        int i3 = -2;
        int i4 = -1;
        while (true) {
            int i5 = 2;
            if (i2 >= length) {
                break;
            }
            String str = ((BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(this.requestPostMessageChannel[i2].IAuthTabCallbackStub())).isEngagementSignalsApiAvailable;
            if (!AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onTransact(str)) {
                if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str)) {
                    i5 = 1;
                } else {
                    i5 = ((Boolean) AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallbackWithResult(FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), 1680259949, -1680259949, FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), FcmBroadcastProcessor$.ExternalSyntheticLambda2.onExtraCallback(), new Object[]{str})).booleanValue() ? 3 : -2;
                }
            }
            if (asBinder(i5) > asBinder(i3)) {
                i4 = i2;
                i3 = i5;
            } else if (i5 == i3 && i4 != -1) {
                i4 = -1;
            }
            i2++;
        }
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted = this.IAuthTabCallback.onWarmupCompleted();
        int i6 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.onWarmupCompleted;
        this.isEngagementSignalsApiAvailable = -1;
        this.updateVisuals = new int[length];
        for (int i7 = 0; i7 < length; i7++) {
            this.updateVisuals[i7] = i7;
        }
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[] coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[length];
        int i8 = 0;
        while (i8 < length) {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = (BasicTextContextMenuProviderKtExternalSyntheticLambda4) RecordingInputConnection_androidKt.onWarmupCompleted(this.requestPostMessageChannel[i8].IAuthTabCallbackStub());
            if (i8 == i4) {
                BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr = new BasicTextContextMenuProviderKtExternalSyntheticLambda4[i6];
                for (int i9 = 0; i9 < i6; i9++) {
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallback(i9);
                    if (i3 == 1 && (basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.onPostMessage) != null) {
                        basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback = basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4);
                    }
                    if (i6 == 1) {
                        basicTextContextMenuProviderKtExternalSyntheticLambda4OnExtraCallbackWithResult = basicTextContextMenuProviderKtExternalSyntheticLambda42.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback);
                    } else {
                        basicTextContextMenuProviderKtExternalSyntheticLambda4OnExtraCallbackWithResult = onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback, basicTextContextMenuProviderKtExternalSyntheticLambda42, true);
                    }
                    basicTextContextMenuProviderKtExternalSyntheticLambda4Arr[i9] = basicTextContextMenuProviderKtExternalSyntheticLambda4OnExtraCallbackWithResult;
                }
                coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr[i8] = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(this.ICustomTabsService_Parcel, basicTextContextMenuProviderKtExternalSyntheticLambda4Arr);
                this.isEngagementSignalsApiAvailable = i8;
            } else {
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda43 = (i3 == 2 && AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(basicTextContextMenuProviderKtExternalSyntheticLambda42.isEngagementSignalsApiAvailable)) ? this.onPostMessage : null;
                StringBuilder sb = new StringBuilder();
                sb.append(this.ICustomTabsService_Parcel);
                sb.append(":muxed:");
                sb.append(i8 < i4 ? i8 : i8 - 1);
                coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr[i8] = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(sb.toString(), new BasicTextContextMenuProviderKtExternalSyntheticLambda4[]{onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda43, basicTextContextMenuProviderKtExternalSyntheticLambda42, false)});
            }
            i8++;
        }
        this.ICustomTabsServiceDefault = onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr);
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.ICustomTabsCallbackStubProxy == null);
        this.ICustomTabsCallbackStubProxy = Collections.EMPTY_SET;
    }

    private BottomSheetScaffoldKtExternalSyntheticLambda11 onExtraCallback(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1[] coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr) {
        for (int i2 = 0; i2 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr.length; i2++) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr[i2];
            BasicTextContextMenuProviderKtExternalSyntheticLambda4[] basicTextContextMenuProviderKtExternalSyntheticLambda4Arr = new BasicTextContextMenuProviderKtExternalSyntheticLambda4[coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.onWarmupCompleted];
            for (int i3 = 0; i3 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.onWarmupCompleted; i3++) {
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.IAuthTabCallback(i3);
                basicTextContextMenuProviderKtExternalSyntheticLambda4Arr[i3] = basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback.IAuthTabCallback(this.IAuthTabCallbackStub.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback));
            }
            coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr[i2] = new CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.onExtraCallbackWithResult, basicTextContextMenuProviderKtExternalSyntheticLambda4Arr);
        }
        return new BottomSheetScaffoldKtExternalSyntheticLambda11(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1Arr);
    }

    private TextFieldSelectionManager_androidKtExternalSyntheticLambda3 extraCallback() {
        return this.onActivityLayout.get(r0.size() - 1);
    }

    private boolean extraCallbackWithResult() {
        return this.onRelationshipValidationResult != -9223372036854775807L;
    }

    private boolean onExtraCallbackWithResult(long j, @Nullable TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3) {
        boolean zOnExtraCallbackWithResult;
        int length = this.requestPostMessageChannel.length;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= length) {
                return true;
            }
            IAuthTabCallback iAuthTabCallback = this.requestPostMessageChannel[i2];
            if (textFieldSelectionManager_androidKtExternalSyntheticLambda3 != null) {
                zOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(textFieldSelectionManager_androidKtExternalSyntheticLambda3.onNavigationEvent(i2));
            } else {
                long jOnExtraCallback = onExtraCallback();
                if (jOnExtraCallback != Long.MIN_VALUE && j >= jOnExtraCallback) {
                    z = false;
                }
                zOnExtraCallbackWithResult = iAuthTabCallback.onExtraCallbackWithResult(j, z);
            }
            if (!zOnExtraCallbackWithResult && (this.newSessionWithExtras[i2] || !this.IAuthTabCallbackStubProxy)) {
                break;
            }
            i2++;
        }
        return false;
    }

    @RequiresNonNull
    private void onActivityResized() {
        this.extraCommand = true;
    }

    @EnsuresNonNull
    private void access100() {
        RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.extraCommand);
    }

    private static BasicTextContextMenuProviderKtExternalSyntheticLambda4 onExtraCallbackWithResult(@Nullable BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42, boolean z) {
        String strOnExtraCallback;
        String strOnNavigationEvent;
        if (basicTextContextMenuProviderKtExternalSyntheticLambda4 == null) {
            return basicTextContextMenuProviderKtExternalSyntheticLambda42;
        }
        int iOnExtraCallback = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda42.isEngagementSignalsApiAvailable);
        if (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, iOnExtraCallback) == 1) {
            Object[] objArr = {basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, Integer.valueOf(iOnExtraCallback)};
            strOnExtraCallback = (String) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-143057283, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), objArr, 143057290);
            strOnNavigationEvent = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onNavigationEvent(strOnExtraCallback);
        } else {
            strOnExtraCallback = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, basicTextContextMenuProviderKtExternalSyntheticLambda42.isEngagementSignalsApiAvailable);
            strOnNavigationEvent = basicTextContextMenuProviderKtExternalSyntheticLambda42.isEngagementSignalsApiAvailable;
        }
        BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresultOnExtraCallback = basicTextContextMenuProviderKtExternalSyntheticLambda42.onExtraCallback().onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4.readTypedObject).IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.onMinimized).onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4.onActivityResized).onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4.onActivityLayout).onActivityResized(basicTextContextMenuProviderKtExternalSyntheticLambda4.newAuthTabSession).readTypedObject(basicTextContextMenuProviderKtExternalSyntheticLambda4.mayLaunchUrl).onNavigationEvent(z ? basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult : -1).extraCallback(z ? basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallbackStub : -1).onExtraCallback(strOnExtraCallback);
        if (iOnExtraCallback == 2) {
            onextracallbackwithresultOnExtraCallback.onActivityLayout(basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetchWithMultipleUrls).access100(basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback).onWarmupCompleted(basicTextContextMenuProviderKtExternalSyntheticLambda4.writeTypedObject);
        }
        if (strOnNavigationEvent != null) {
            onextracallbackwithresultOnExtraCallback.IAuthTabCallbackDefault(strOnNavigationEvent);
        }
        int i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent;
        if (i2 != -1 && iOnExtraCallback == 1) {
            onextracallbackwithresultOnExtraCallback.onExtraCallback(i2);
        }
        HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallbackDefault;
        if (handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent != null) {
            HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0 = basicTextContextMenuProviderKtExternalSyntheticLambda42.ICustomTabsCallbackDefault;
            if (handwritingHandlerNodeExternalSyntheticLambda0 != null) {
                handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent = handwritingHandlerNodeExternalSyntheticLambda0.onNavigationEvent(handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent);
            }
            onextracallbackwithresultOnExtraCallback.onExtraCallbackWithResult(handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent);
        }
        return onextracallbackwithresultOnExtraCallback.onNavigationEvent();
    }

    private static boolean onWarmupCompleted(BottomSheetScaffoldKtExternalSyntheticLambda8 bottomSheetScaffoldKtExternalSyntheticLambda8) {
        return bottomSheetScaffoldKtExternalSyntheticLambda8 instanceof TextFieldSelectionManager_androidKtExternalSyntheticLambda3;
    }

    private static boolean onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42) {
        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
        String str2 = basicTextContextMenuProviderKtExternalSyntheticLambda42.isEngagementSignalsApiAvailable;
        int iOnExtraCallback = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallback(str);
        if (iOnExtraCallback != 3) {
            return iOnExtraCallback == AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onExtraCallback(str2);
        }
        if (Objects.equals(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || basicTextContextMenuProviderKtExternalSyntheticLambda4.onWarmupCompleted == basicTextContextMenuProviderKtExternalSyntheticLambda42.onWarmupCompleted;
        }
        return false;
    }

    private static DrawerKtExternalSyntheticLambda6 onExtraCallback(int i2, int i3) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("HlsSampleStreamWrapper", "Unmapped track with id " + i2 + " of type " + i3);
        return new DrawerKtExternalSyntheticLambda6();
    }

    static final class IAuthTabCallback extends BottomNavigationKtExternalSyntheticLambda3 {
        private final Map<String, BasicTextContextMenuProviderExternalSyntheticLambda0> IAuthTabCallback;
        private BasicTextContextMenuProviderExternalSyntheticLambda0 onWarmupCompleted;

        private IAuthTabCallback(ComposableSingletonsScaffoldKtExternalSyntheticLambda3 composableSingletonsScaffoldKtExternalSyntheticLambda3, SelectionRegistrarImplExternalSyntheticLambda0 selectionRegistrarImplExternalSyntheticLambda0, SelectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted, Map<String, BasicTextContextMenuProviderExternalSyntheticLambda0> map) {
            super(composableSingletonsScaffoldKtExternalSyntheticLambda3, selectionRegistrarImplExternalSyntheticLambda0, selectionManager_androidKtExternalSyntheticLambda8$onWarmupCompleted);
            this.IAuthTabCallback = map;
        }

        public void onWarmupCompleted(TextFieldSelectionManager_androidKtExternalSyntheticLambda3 textFieldSelectionManager_androidKtExternalSyntheticLambda3) {
            onExtraCallback(textFieldSelectionManager_androidKtExternalSyntheticLambda3.onWarmupCompleted);
        }

        public void onExtraCallback(@Nullable BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0) {
            this.onWarmupCompleted = basicTextContextMenuProviderExternalSyntheticLambda0;
            onTransact();
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda3
        public BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda0;
            BasicTextContextMenuProviderExternalSyntheticLambda0 basicTextContextMenuProviderExternalSyntheticLambda02 = this.onWarmupCompleted;
            if (basicTextContextMenuProviderExternalSyntheticLambda02 == null) {
                basicTextContextMenuProviderExternalSyntheticLambda02 = basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallback_Parcel;
            }
            if (basicTextContextMenuProviderExternalSyntheticLambda02 != null && (basicTextContextMenuProviderExternalSyntheticLambda0 = this.IAuthTabCallback.get(basicTextContextMenuProviderExternalSyntheticLambda02.onWarmupCompleted)) != null) {
                basicTextContextMenuProviderExternalSyntheticLambda02 = basicTextContextMenuProviderExternalSyntheticLambda0;
            }
            HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent = onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallbackDefault);
            if (basicTextContextMenuProviderExternalSyntheticLambda02 != basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallback_Parcel || handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent != basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallbackDefault) {
                basicTextContextMenuProviderKtExternalSyntheticLambda4 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback().onNavigationEvent(basicTextContextMenuProviderExternalSyntheticLambda02).onExtraCallbackWithResult(handwritingHandlerNodeExternalSyntheticLambda0OnNavigationEvent).onNavigationEvent();
            }
            return super.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4);
        }

        private HandwritingHandlerNodeExternalSyntheticLambda0 onNavigationEvent(@Nullable HandwritingHandlerNodeExternalSyntheticLambda0 handwritingHandlerNodeExternalSyntheticLambda0) {
            if (handwritingHandlerNodeExternalSyntheticLambda0 == null) {
                return null;
            }
            int iOnExtraCallback = handwritingHandlerNodeExternalSyntheticLambda0.onExtraCallback();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= iOnExtraCallback) {
                    i3 = -1;
                    break;
                }
                HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback IAuthTabCallback = handwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback(i3);
                if ((IAuthTabCallback instanceof ModalBottomSheetStateExternalSyntheticLambda0) && HlsMediaChunk.PRIV_TIMESTAMP_FRAME_OWNER.equals(((ModalBottomSheetStateExternalSyntheticLambda0) IAuthTabCallback).onExtraCallback)) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                return handwritingHandlerNodeExternalSyntheticLambda0;
            }
            if (iOnExtraCallback == 1) {
                return null;
            }
            HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[] iAuthTabCallbackArr = new HandwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback[iOnExtraCallback - 1];
            while (i2 < iOnExtraCallback) {
                if (i2 != i3) {
                    iAuthTabCallbackArr[i2 < i3 ? i2 : i2 - 1] = handwritingHandlerNodeExternalSyntheticLambda0.IAuthTabCallback(i2);
                }
                i2++;
            }
            return new HandwritingHandlerNodeExternalSyntheticLambda0(iAuthTabCallbackArr);
        }

        @Override // o.BottomNavigationKtExternalSyntheticLambda3, o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
        public void onExtraCallback(long j, int i2, int i3, int i4, @Nullable ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback iAuthTabCallback) {
            super.onExtraCallback(j, i2, i3, i4, iAuthTabCallback);
        }
    }

    static class onExtraCallback implements ExposedDropdownMenu_androidKtExternalSyntheticLambda5 {
        private static final BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallbackDefault("application/id3").onNavigationEvent();
        private static final BasicTextContextMenuProviderKtExternalSyntheticLambda4 onNavigationEvent = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult().IAuthTabCallbackDefault("application/x-emsg").onNavigationEvent();
        private final BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallbackDefault;
        private BasicTextContextMenuProviderKtExternalSyntheticLambda4 asBinder;
        private final MinimumInteractiveModifierNodeExternalSyntheticLambda0 asInterface = new MinimumInteractiveModifierNodeExternalSyntheticLambda0();
        private int onExtraCallback;
        private byte[] onExtraCallbackWithResult;
        private final ExposedDropdownMenu_androidKtExternalSyntheticLambda5 onWarmupCompleted;

        public onExtraCallback(ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5, int i2) {
            this.onWarmupCompleted = exposedDropdownMenu_androidKtExternalSyntheticLambda5;
            if (i2 == 1) {
                this.IAuthTabCallbackDefault = IAuthTabCallback;
            } else if (i2 == 3) {
                this.IAuthTabCallbackDefault = onNavigationEvent;
            } else {
                throw new IllegalArgumentException("Unknown metadataType: " + i2);
            }
            this.onExtraCallbackWithResult = new byte[0];
            this.onExtraCallback = 0;
        }

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
        public void onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
            this.asBinder = basicTextContextMenuProviderKtExternalSyntheticLambda4;
            this.onWarmupCompleted.onExtraCallbackWithResult(this.IAuthTabCallbackDefault);
        }

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
        public int IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda0 basicTextContextMenuProviderKtExternalSyntheticLambda0, int i2, boolean z, int i3) throws IOException {
            onWarmupCompleted(this.onExtraCallback + i2);
            int iOnWarmupCompleted = basicTextContextMenuProviderKtExternalSyntheticLambda0.onWarmupCompleted(this.onExtraCallbackWithResult, this.onExtraCallback, i2);
            if (iOnWarmupCompleted != -1) {
                this.onExtraCallback += iOnWarmupCompleted;
                return iOnWarmupCompleted;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
        public void IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20, int i2, int i3) {
            onWarmupCompleted(this.onExtraCallback + i2);
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(this.onExtraCallbackWithResult, this.onExtraCallback, i2);
            this.onExtraCallback += i2;
        }

        @Override // o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5
        public void onExtraCallback(long j, int i2, int i3, int i4, @Nullable ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback iAuthTabCallback) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20IAuthTabCallback = IAuthTabCallback(i3, i4);
            if (!Objects.equals(this.asBinder.isEngagementSignalsApiAvailable, this.IAuthTabCallbackDefault.isEngagementSignalsApiAvailable)) {
                if ("application/x-emsg".equals(this.asBinder.isEngagementSignalsApiAvailable)) {
                    MenuKtExternalSyntheticLambda3 menuKtExternalSyntheticLambda3OnWarmupCompleted = this.asInterface.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20IAuthTabCallback);
                    if (!onExtraCallback(menuKtExternalSyntheticLambda3OnWarmupCompleted)) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("HlsSampleStreamWrapper", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.IAuthTabCallbackDefault.isEngagementSignalsApiAvailable, menuKtExternalSyntheticLambda3OnWarmupCompleted.onWarmupCompleted()));
                        return;
                    }
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20IAuthTabCallback = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20((byte[]) RecordingInputConnection_androidKt.onExtraCallbackWithResult(menuKtExternalSyntheticLambda3OnWarmupCompleted.onExtraCallback()));
                } else {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.asBinder.isEngagementSignalsApiAvailable);
                    return;
                }
            }
            int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda20IAuthTabCallback.onNavigationEvent();
            this.onWarmupCompleted.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20IAuthTabCallback, iOnNavigationEvent);
            this.onWarmupCompleted.onExtraCallback(j, i2, iOnNavigationEvent, 0, iAuthTabCallback);
        }

        private boolean onExtraCallback(MenuKtExternalSyntheticLambda3 menuKtExternalSyntheticLambda3) throws Throwable {
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnWarmupCompleted = menuKtExternalSyntheticLambda3.onWarmupCompleted();
            return basicTextContextMenuProviderKtExternalSyntheticLambda4OnWarmupCompleted != null && Objects.equals(this.IAuthTabCallbackDefault.isEngagementSignalsApiAvailable, basicTextContextMenuProviderKtExternalSyntheticLambda4OnWarmupCompleted.isEngagementSignalsApiAvailable);
        }

        private void onWarmupCompleted(int i2) {
            byte[] bArr = this.onExtraCallbackWithResult;
            if (bArr.length < i2) {
                this.onExtraCallbackWithResult = Arrays.copyOf(bArr, i2 + (i2 / 2));
            }
        }

        private TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IAuthTabCallback(int i2, int i3) {
            int i4 = this.onExtraCallback - i3;
            TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(Arrays.copyOfRange(this.onExtraCallbackWithResult, i4 - i2, i4));
            byte[] bArr = this.onExtraCallbackWithResult;
            System.arraycopy(bArr, i4, bArr, 0, i3);
            this.onExtraCallback = i3;
            return textFieldDecoratorModifierNodeExternalSyntheticLambda20;
        }
    }
}
