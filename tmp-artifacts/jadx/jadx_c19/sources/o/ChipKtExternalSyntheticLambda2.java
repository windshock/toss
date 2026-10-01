package o;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsClient$2$;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.BottomDrawerStateExternalSyntheticLambda2;
import o.BottomSheetScaffoldKtExternalSyntheticLambda11;
import o.ChipKtExternalSyntheticLambda2;
import o.ChipKtExternalSyntheticLambda5;
import o.ChipKtExternalSyntheticLambda9;
import o.ColorsKtExternalSyntheticLambda0;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class ChipKtExternalSyntheticLambda2 extends ChipKtExternalSyntheticLambda9 implements RendererCapabilities.Listener {
    private static final Ordering<Integer> onExtraCallbackWithResult = Ordering.from(new Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ChipKtExternalSyntheticLambda2.onWarmupCompleted((Integer) obj, (Integer) obj2);
        }
    });
    private final Object IAuthTabCallback;
    private IAuthTabCallback IAuthTabCallbackDefault;
    private final ColorsKtExternalSyntheticLambda0.onExtraCallback IAuthTabCallbackStub;
    private Thread asInterface;
    private Boolean onExtraCallback;
    private TextContextMenuHelperApi28ExternalSyntheticLambda5 onNavigationEvent;
    private onTransact onTransact;
    public final Context onWarmupCompleted;

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda0
    public RendererCapabilities.Listener onExtraCallback() {
        return this;
    }

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda0
    public boolean onExtraCallbackWithResult() {
        return true;
    }

    public static final class IAuthTabCallback extends CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 {

        @Deprecated
        public static final IAuthTabCallback ICustomTabsService;
        private static final String ICustomTabsServiceStubProxy;
        private static final String ICustomTabsService_Parcel;
        private static final String IEngagementSignalsCallback;
        private static final String IEngagementSignalsCallbackDefault;
        private static final String IEngagementSignalsCallbackStub;
        private static final String IEngagementSignalsCallbackStubProxy;
        private static final String IEngagementSignalsCallback_Parcel;
        private static final String IPostMessageService;
        private static final String IPostMessageServiceDefault;
        private static final String IPostMessageServiceStub;
        private static final String IPostMessageServiceStubProxy;
        private static final String ITrustedWebActivityCallback;
        private static final String ITrustedWebActivityCallbackDefault;
        private static final String ITrustedWebActivityCallbackStub;
        private static final String access200;
        public static final IAuthTabCallback isEngagementSignalsApiAvailable;
        private static final String onGreatestScrollPercentageIncreased;
        private static final String onSessionEnded;
        private static final String onVerticalScrollEvent;
        private static final String writeTypedList;
        public final boolean ICustomTabsServiceDefault;
        public final boolean ICustomTabsServiceStub;
        private final SparseBooleanArray IPostMessageService_Parcel;
        private final SparseArray<Map<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult>> ITrustedWebActivityCallbackStubProxy;
        public final boolean newAuthTabSession;
        public final boolean newSession;
        public final boolean newSessionWithExtras;
        public final boolean postMessage;
        public final boolean prefetch;
        public final boolean prefetchWithMultipleUrls;
        public final boolean receiveFile;
        public final boolean requestPostMessageChannel;
        public final boolean requestPostMessageChannelWithExtras;
        public final boolean setEngagementSignalsCallback;
        public final boolean updateVisuals;
        public final boolean validateRelationship;
        public final boolean warmup;

        /* renamed from: o.ChipKtExternalSyntheticLambda2$IAuthTabCallback$IAuthTabCallback, reason: collision with other inner class name */
        public static final class C0039IAuthTabCallback extends CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3.onExtraCallback {
            private boolean IAuthTabCallback;
            private boolean IAuthTabCallbackDefault;
            private boolean IAuthTabCallbackStub;
            private boolean IAuthTabCallbackStubProxy;
            private boolean IAuthTabCallback_Parcel;
            private boolean ICustomTabsCallback;
            private boolean access000;
            private boolean access100;
            private boolean asBinder;
            private boolean asInterface;
            private final SparseBooleanArray getInterfaceDescriptor;
            private boolean onExtraCallback;
            private boolean onExtraCallbackWithResult;
            private boolean onNavigationEvent;
            private boolean onTransact;
            private boolean onWarmupCompleted;
            private final SparseArray<Map<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult>> writeTypedObject;

            public /* synthetic */ CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3.onExtraCallback onNavigationEvent(Set set) {
                return IAuthTabCallback((Set<Integer>) set);
            }

            public C0039IAuthTabCallback() {
                this.writeTypedObject = new SparseArray<>();
                this.getInterfaceDescriptor = new SparseBooleanArray();
                onWarmupCompleted();
            }

            private C0039IAuthTabCallback(IAuthTabCallback iAuthTabCallback) {
                super(iAuthTabCallback);
                this.access000 = iAuthTabCallback.warmup;
                this.IAuthTabCallbackStub = iAuthTabCallback.requestPostMessageChannelWithExtras;
                this.asInterface = iAuthTabCallback.prefetchWithMultipleUrls;
                this.onTransact = iAuthTabCallback.setEngagementSignalsCallback;
                this.IAuthTabCallbackStubProxy = iAuthTabCallback.updateVisuals;
                this.onWarmupCompleted = iAuthTabCallback.prefetch;
                this.IAuthTabCallback = iAuthTabCallback.postMessage;
                this.onNavigationEvent = iAuthTabCallback.newAuthTabSession;
                this.onExtraCallback = iAuthTabCallback.newSessionWithExtras;
                this.onExtraCallbackWithResult = iAuthTabCallback.newSession;
                this.access100 = iAuthTabCallback.ICustomTabsServiceStub;
                this.IAuthTabCallback_Parcel = iAuthTabCallback.ICustomTabsServiceDefault;
                this.ICustomTabsCallback = iAuthTabCallback.validateRelationship;
                this.asBinder = iAuthTabCallback.receiveFile;
                this.IAuthTabCallbackDefault = iAuthTabCallback.requestPostMessageChannel;
                this.writeTypedObject = onNavigationEvent((SparseArray<Map<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult>>) iAuthTabCallback.ITrustedWebActivityCallbackStubProxy);
                this.getInterfaceDescriptor = iAuthTabCallback.IPostMessageService_Parcel.clone();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
            public C0039IAuthTabCallback onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) {
                super.onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3);
                return this;
            }

            public C0039IAuthTabCallback onExtraCallbackWithResult(boolean z) {
                this.access100 = z;
                return this;
            }

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public C0039IAuthTabCallback onExtraCallback(boolean z) {
                super.onExtraCallback(z);
                return this;
            }

            /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
            public C0039IAuthTabCallback onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda11 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda11) {
                super.onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda11);
                return this;
            }

            /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
            public C0039IAuthTabCallback onExtraCallback() {
                super.onExtraCallback();
                return this;
            }

            public C0039IAuthTabCallback IAuthTabCallback(Set<Integer> set) {
                super.onNavigationEvent(set);
                return this;
            }

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public C0039IAuthTabCallback onExtraCallbackWithResult(int i2, boolean z) {
                super.onExtraCallbackWithResult(i2, z);
                return this;
            }

            /* renamed from: IAuthTabCallback, reason: merged with bridge method [inline-methods] */
            public IAuthTabCallback onNavigationEvent() {
                return new IAuthTabCallback(this);
            }

            private void onWarmupCompleted() {
                this.access000 = true;
                this.IAuthTabCallbackStub = false;
                this.asInterface = true;
                this.onTransact = false;
                this.IAuthTabCallbackStubProxy = true;
                this.onWarmupCompleted = false;
                this.IAuthTabCallback = false;
                this.onNavigationEvent = false;
                this.onExtraCallback = false;
                this.onExtraCallbackWithResult = true;
                this.access100 = true;
                this.IAuthTabCallback_Parcel = true;
                this.ICustomTabsCallback = false;
                this.asBinder = true;
                this.IAuthTabCallbackDefault = false;
            }

            private static SparseArray<Map<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult>> onNavigationEvent(SparseArray<Map<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult>> sparseArray) {
                SparseArray<Map<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult>> sparseArray2 = new SparseArray<>();
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    sparseArray2.put(sparseArray.keyAt(i2), new HashMap(sparseArray.valueAt(i2)));
                }
                return sparseArray2;
            }
        }

        static {
            IAuthTabCallback iAuthTabCallbackOnNavigationEvent = new C0039IAuthTabCallback().onNavigationEvent();
            isEngagementSignalsApiAvailable = iAuthTabCallbackOnNavigationEvent;
            ICustomTabsService = iAuthTabCallbackOnNavigationEvent;
            IPostMessageServiceStub = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1000);
            onGreatestScrollPercentageIncreased = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1001);
            onSessionEnded = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1002);
            IEngagementSignalsCallbackStubProxy = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1003);
            writeTypedList = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1004);
            access200 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1005);
            ICustomTabsService_Parcel = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1006);
            IEngagementSignalsCallback_Parcel = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1007);
            ITrustedWebActivityCallbackStub = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1008);
            IEngagementSignalsCallbackDefault = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1009);
            ITrustedWebActivityCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1010);
            ITrustedWebActivityCallbackDefault = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1011);
            IPostMessageServiceStubProxy = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1012);
            IPostMessageServiceDefault = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1013);
            IEngagementSignalsCallbackStub = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1014);
            IEngagementSignalsCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1015);
            IPostMessageService = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1016);
            onVerticalScrollEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1017);
            ICustomTabsServiceStubProxy = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1018);
        }

        private IAuthTabCallback(C0039IAuthTabCallback c0039IAuthTabCallback) {
            super(c0039IAuthTabCallback);
            this.warmup = c0039IAuthTabCallback.access000;
            this.requestPostMessageChannelWithExtras = c0039IAuthTabCallback.IAuthTabCallbackStub;
            this.prefetchWithMultipleUrls = c0039IAuthTabCallback.asInterface;
            this.setEngagementSignalsCallback = c0039IAuthTabCallback.onTransact;
            this.updateVisuals = c0039IAuthTabCallback.IAuthTabCallbackStubProxy;
            this.prefetch = c0039IAuthTabCallback.onWarmupCompleted;
            this.postMessage = c0039IAuthTabCallback.IAuthTabCallback;
            this.newAuthTabSession = c0039IAuthTabCallback.onNavigationEvent;
            this.newSessionWithExtras = c0039IAuthTabCallback.onExtraCallback;
            this.newSession = c0039IAuthTabCallback.onExtraCallbackWithResult;
            this.ICustomTabsServiceStub = c0039IAuthTabCallback.access100;
            this.ICustomTabsServiceDefault = c0039IAuthTabCallback.IAuthTabCallback_Parcel;
            this.validateRelationship = c0039IAuthTabCallback.ICustomTabsCallback;
            this.receiveFile = c0039IAuthTabCallback.asBinder;
            this.requestPostMessageChannel = c0039IAuthTabCallback.IAuthTabCallbackDefault;
            this.ITrustedWebActivityCallbackStubProxy = c0039IAuthTabCallback.writeTypedObject;
            this.IPostMessageService_Parcel = c0039IAuthTabCallback.getInterfaceDescriptor;
        }

        public boolean onWarmupCompleted(int i2) {
            return this.IPostMessageService_Parcel.get(i2);
        }

        @Deprecated
        public boolean onWarmupCompleted(int i2, BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11) {
            Map<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult> map = this.ITrustedWebActivityCallbackStubProxy.get(i2);
            return map != null && map.containsKey(bottomSheetScaffoldKtExternalSyntheticLambda11);
        }

        @Deprecated
        public onExtraCallbackWithResult onExtraCallbackWithResult(int i2, BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11) {
            Map<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult> map = this.ITrustedWebActivityCallbackStubProxy.get(i2);
            if (map != null) {
                return map.get(bottomSheetScaffoldKtExternalSyntheticLambda11);
            }
            return null;
        }

        /* renamed from: postMessage, reason: merged with bridge method [inline-methods] */
        public C0039IAuthTabCallback ICustomTabsCallback_Parcel() {
            return new C0039IAuthTabCallback();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || IAuthTabCallback.class != obj.getClass()) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = (IAuthTabCallback) obj;
            return super.equals(iAuthTabCallback) && this.warmup == iAuthTabCallback.warmup && this.requestPostMessageChannelWithExtras == iAuthTabCallback.requestPostMessageChannelWithExtras && this.prefetchWithMultipleUrls == iAuthTabCallback.prefetchWithMultipleUrls && this.setEngagementSignalsCallback == iAuthTabCallback.setEngagementSignalsCallback && this.updateVisuals == iAuthTabCallback.updateVisuals && this.prefetch == iAuthTabCallback.prefetch && this.postMessage == iAuthTabCallback.postMessage && this.newAuthTabSession == iAuthTabCallback.newAuthTabSession && this.newSessionWithExtras == iAuthTabCallback.newSessionWithExtras && this.newSession == iAuthTabCallback.newSession && this.ICustomTabsServiceStub == iAuthTabCallback.ICustomTabsServiceStub && this.ICustomTabsServiceDefault == iAuthTabCallback.ICustomTabsServiceDefault && this.validateRelationship == iAuthTabCallback.validateRelationship && this.receiveFile == iAuthTabCallback.receiveFile && this.requestPostMessageChannel == iAuthTabCallback.requestPostMessageChannel && onNavigationEvent(this.IPostMessageService_Parcel, iAuthTabCallback.IPostMessageService_Parcel) && onWarmupCompleted(this.ITrustedWebActivityCallbackStubProxy, iAuthTabCallback.ITrustedWebActivityCallbackStubProxy);
        }

        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.warmup ? 1 : 0)) * 31) + (this.requestPostMessageChannelWithExtras ? 1 : 0)) * 31) + (this.prefetchWithMultipleUrls ? 1 : 0)) * 31) + (this.setEngagementSignalsCallback ? 1 : 0)) * 31) + (this.updateVisuals ? 1 : 0)) * 31) + (this.prefetch ? 1 : 0)) * 31) + (this.postMessage ? 1 : 0)) * 31) + (this.newAuthTabSession ? 1 : 0)) * 31) + (this.newSessionWithExtras ? 1 : 0)) * 31) + (this.newSession ? 1 : 0)) * 31) + (this.ICustomTabsServiceStub ? 1 : 0)) * 31) + (this.ICustomTabsServiceDefault ? 1 : 0)) * 31) + (this.validateRelationship ? 1 : 0)) * 31) + (this.receiveFile ? 1 : 0)) * 31) + (this.requestPostMessageChannel ? 1 : 0);
        }

        public Bundle newSession() {
            Bundle bundleNewSession = super.newSession();
            bundleNewSession.putBoolean(IPostMessageServiceStub, this.warmup);
            bundleNewSession.putBoolean(onGreatestScrollPercentageIncreased, this.requestPostMessageChannelWithExtras);
            bundleNewSession.putBoolean(onSessionEnded, this.prefetchWithMultipleUrls);
            bundleNewSession.putBoolean(IEngagementSignalsCallbackStub, this.setEngagementSignalsCallback);
            bundleNewSession.putBoolean(IEngagementSignalsCallbackStubProxy, this.updateVisuals);
            bundleNewSession.putBoolean(writeTypedList, this.prefetch);
            bundleNewSession.putBoolean(access200, this.postMessage);
            bundleNewSession.putBoolean(ICustomTabsService_Parcel, this.newAuthTabSession);
            bundleNewSession.putBoolean(IEngagementSignalsCallback, this.newSessionWithExtras);
            bundleNewSession.putBoolean(ICustomTabsServiceStubProxy, this.newSession);
            bundleNewSession.putBoolean(IPostMessageService, this.ICustomTabsServiceStub);
            bundleNewSession.putBoolean(IEngagementSignalsCallback_Parcel, this.ICustomTabsServiceDefault);
            bundleNewSession.putBoolean(ITrustedWebActivityCallbackStub, this.validateRelationship);
            bundleNewSession.putBoolean(IEngagementSignalsCallbackDefault, this.receiveFile);
            bundleNewSession.putBoolean(onVerticalScrollEvent, this.requestPostMessageChannel);
            onExtraCallbackWithResult(bundleNewSession, this.ITrustedWebActivityCallbackStubProxy);
            bundleNewSession.putIntArray(IPostMessageServiceDefault, onWarmupCompleted(this.IPostMessageService_Parcel));
            return bundleNewSession;
        }

        private static void onExtraCallbackWithResult(Bundle bundle, SparseArray<Map<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                for (Map.Entry<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult> entry : sparseArray.valueAt(i2).entrySet()) {
                    onExtraCallbackWithResult value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(ITrustedWebActivityCallback, Ints.toArray(arrayList));
                bundle.putParcelableArrayList(ITrustedWebActivityCallbackDefault, TextFieldDecoratorModifierNodeExternalSyntheticLambda1.IAuthTabCallback(arrayList2, new Function() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$Parameters$$ExternalSyntheticLambda0
                    public final Object apply(Object obj) {
                        return ((BottomSheetScaffoldKtExternalSyntheticLambda11) obj).IAuthTabCallback();
                    }
                }));
                bundle.putSparseParcelableArray(IPostMessageServiceStubProxy, TextFieldDecoratorModifierNodeExternalSyntheticLambda1.onNavigationEvent(sparseArray2, new Function() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$Parameters$$ExternalSyntheticLambda1
                    public final Object apply(Object obj) {
                        return ((ChipKtExternalSyntheticLambda2.onExtraCallbackWithResult) obj).onWarmupCompleted();
                    }
                }));
            }
        }

        private static int[] onWarmupCompleted(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i2 = 0; i2 < sparseBooleanArray.size(); i2++) {
                iArr[i2] = sparseBooleanArray.keyAt(i2);
            }
            return iArr;
        }

        private static boolean onNavigationEvent(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean onWarmupCompleted(SparseArray<Map<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult>> sparseArray, SparseArray<Map<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                if (iIndexOfKey < 0 || !onExtraCallback(sparseArray.valueAt(i2), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean onExtraCallback(Map<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult> map, Map<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<BottomSheetScaffoldKtExternalSyntheticLambda11, onExtraCallbackWithResult> entry : map.entrySet()) {
                BottomSheetScaffoldKtExternalSyntheticLambda11 key = entry.getKey();
                if (!map2.containsKey(key) || !Objects.equals(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static final class onExtraCallbackWithResult {
        public final int IAuthTabCallback;
        public final int onExtraCallbackWithResult;
        public final int[] onNavigationEvent;
        public final int onWarmupCompleted;
        private static final String onExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(0);
        private static final String IAuthTabCallbackStub = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(1);
        private static final String IAuthTabCallbackDefault = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.access000(2);

        public onExtraCallbackWithResult(int i2, int[] iArr, int i3) {
            this.onWarmupCompleted = i2;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.onNavigationEvent = iArrCopyOf;
            this.onExtraCallbackWithResult = iArr.length;
            this.IAuthTabCallback = i3;
            Arrays.sort(iArrCopyOf);
        }

        public int hashCode() {
            return (((this.onWarmupCompleted * 31) + Arrays.hashCode(this.onNavigationEvent)) * 31) + this.IAuthTabCallback;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || onExtraCallbackWithResult.class != obj.getClass()) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return this.onWarmupCompleted == onextracallbackwithresult.onWarmupCompleted && Arrays.equals(this.onNavigationEvent, onextracallbackwithresult.onNavigationEvent) && this.IAuthTabCallback == onextracallbackwithresult.IAuthTabCallback;
        }

        public Bundle onWarmupCompleted() {
            Bundle bundle = new Bundle();
            bundle.putInt(onExtraCallback, this.onWarmupCompleted);
            bundle.putIntArray(IAuthTabCallbackStub, this.onNavigationEvent);
            bundle.putInt(IAuthTabCallbackDefault, this.IAuthTabCallback);
            return bundle;
        }

        public static onExtraCallbackWithResult onWarmupCompleted(Bundle bundle) {
            int i2 = bundle.getInt(onExtraCallback, -1);
            int[] intArray = bundle.getIntArray(IAuthTabCallbackStub);
            int i3 = bundle.getInt(IAuthTabCallbackDefault, -1);
            RecordingInputConnection_androidKt.onNavigationEvent(i2 >= 0 && i3 >= 0);
            return new onExtraCallbackWithResult(i2, intArray, i3);
        }
    }

    public static /* synthetic */ int onWarmupCompleted(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public ChipKtExternalSyntheticLambda2(Context context) {
        this(context, new ChipKtExternalSyntheticLambda5.onExtraCallbackWithResult());
    }

    public ChipKtExternalSyntheticLambda2(Context context, ColorsKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        this(context, IAuthTabCallback.isEngagementSignalsApiAvailable, onextracallback);
    }

    @Deprecated
    public ChipKtExternalSyntheticLambda2(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3, ColorsKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        this(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3, onextracallback, (Context) null);
    }

    public ChipKtExternalSyntheticLambda2(Context context, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3, ColorsKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        this(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3, onextracallback, context);
    }

    private ChipKtExternalSyntheticLambda2(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3, ColorsKtExternalSyntheticLambda0.onExtraCallback onextracallback, @Nullable Context context) {
        this.IAuthTabCallback = new Object();
        this.onWarmupCompleted = context != null ? context.getApplicationContext() : null;
        this.IAuthTabCallbackStub = onextracallback;
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 instanceof IAuthTabCallback) {
            this.IAuthTabCallbackDefault = (IAuthTabCallback) coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3;
        } else {
            this.IAuthTabCallbackDefault = IAuthTabCallback.isEngagementSignalsApiAvailable.ICustomTabsCallback_Parcel().onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3).onNavigationEvent();
        }
        this.onNavigationEvent = TextContextMenuHelperApi28ExternalSyntheticLambda5.onNavigationEvent;
        if (this.IAuthTabCallbackDefault.ICustomTabsServiceStub && context == null) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda0
    public void IAuthTabCallbackStub() {
        onTransact ontransact;
        synchronized (this.IAuthTabCallback) {
            Thread thread = this.asInterface;
            if (thread != null) {
                RecordingInputConnection_androidKt.onExtraCallbackWithResult(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (ontransact = this.onTransact) != null) {
            ontransact.onExtraCallback();
            this.onTransact = null;
        }
        super.IAuthTabCallbackStub();
    }

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda0
    /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
    public IAuthTabCallback onNavigationEvent() {
        IAuthTabCallback iAuthTabCallback;
        synchronized (this.IAuthTabCallback) {
            iAuthTabCallback = this.IAuthTabCallbackDefault;
        }
        return iAuthTabCallback;
    }

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda0
    public void onWarmupCompleted(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) {
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 instanceof IAuthTabCallback) {
            onExtraCallback((IAuthTabCallback) coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3);
        }
        onExtraCallback(new IAuthTabCallback.C0039IAuthTabCallback().onWarmupCompleted(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3).onNavigationEvent());
    }

    @Override // o.ComposableSingletonsAppBarKtExternalSyntheticLambda0
    public void onWarmupCompleted(TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
        if (this.onNavigationEvent.equals(textContextMenuHelperApi28ExternalSyntheticLambda5)) {
            return;
        }
        this.onNavigationEvent = textContextMenuHelperApi28ExternalSyntheticLambda5;
        asBinder();
    }

    private void onExtraCallback(IAuthTabCallback iAuthTabCallback) {
        boolean zEquals;
        synchronized (this.IAuthTabCallback) {
            zEquals = this.IAuthTabCallbackDefault.equals(iAuthTabCallback);
            this.IAuthTabCallbackDefault = iAuthTabCallback;
        }
        if (zEquals) {
            return;
        }
        if (iAuthTabCallback.ICustomTabsServiceStub && this.onWarmupCompleted == null) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        onTransact();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities.Listener
    public void onExtraCallback(Renderer renderer) {
        onNavigationEvent(renderer);
    }

    @Override // o.ChipKtExternalSyntheticLambda9
    protected final Pair<RendererConfiguration[], ColorsKtExternalSyntheticLambda0[]> onExtraCallback(ChipKtExternalSyntheticLambda9.onNavigationEvent onnavigationevent, int[][][] iArr, int[] iArr2, BottomDrawerStateExternalSyntheticLambda2.onExtraCallbackWithResult onextracallbackwithresult, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda10 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        IAuthTabCallback iAuthTabCallback;
        Context context;
        synchronized (this.IAuthTabCallback) {
            this.asInterface = Thread.currentThread();
            iAuthTabCallback = this.IAuthTabCallbackDefault;
        }
        if (this.onExtraCallback == null && (context = this.onWarmupCompleted) != null) {
            this.onExtraCallback = Boolean.valueOf(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onTransact(context));
        }
        if (iAuthTabCallback.ICustomTabsServiceStub && Build.VERSION.SDK_INT >= 32 && this.onTransact == null) {
            this.onTransact = new onTransact(this.onWarmupCompleted, this, this.onExtraCallback);
        }
        int iIAuthTabCallback = onnavigationevent.IAuthTabCallback();
        ColorsKtExternalSyntheticLambda0.onNavigationEvent[] onnavigationeventArrOnWarmupCompleted = onWarmupCompleted(onnavigationevent, iArr, iArr2, iAuthTabCallback);
        IAuthTabCallback(onnavigationevent, iAuthTabCallback, onnavigationeventArrOnWarmupCompleted);
        onExtraCallback(onnavigationevent, iAuthTabCallback, onnavigationeventArrOnWarmupCompleted);
        for (int i2 = 0; i2 < iIAuthTabCallback; i2++) {
            int iOnNavigationEvent = onnavigationevent.onNavigationEvent(i2);
            if (iAuthTabCallback.onWarmupCompleted(i2) || ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onNavigationEvent.contains(Integer.valueOf(iOnNavigationEvent))) {
                onnavigationeventArrOnWarmupCompleted[i2] = null;
            }
        }
        ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0ArrOnExtraCallback = this.IAuthTabCallbackStub.onExtraCallback(onnavigationeventArrOnWarmupCompleted, IAuthTabCallbackDefault(), onextracallbackwithresult, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda10);
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[iIAuthTabCallback];
        for (int i3 = 0; i3 < iIAuthTabCallback; i3++) {
            rendererConfigurationArr[i3] = (iAuthTabCallback.onWarmupCompleted(i3) || ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onNavigationEvent.contains(Integer.valueOf(onnavigationevent.onNavigationEvent(i3))) || (onnavigationevent.onNavigationEvent(i3) != -2 && colorsKtExternalSyntheticLambda0ArrOnExtraCallback[i3] == null)) ? null : RendererConfiguration.onExtraCallbackWithResult;
        }
        if (iAuthTabCallback.validateRelationship) {
            onWarmupCompleted(onnavigationevent, iArr, rendererConfigurationArr, colorsKtExternalSyntheticLambda0ArrOnExtraCallback);
        }
        if (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onExtraCallback.onWarmupCompleted != 0) {
            onExtraCallback(iAuthTabCallback, onnavigationevent, iArr, rendererConfigurationArr, colorsKtExternalSyntheticLambda0ArrOnExtraCallback);
        }
        return Pair.create(rendererConfigurationArr, colorsKtExternalSyntheticLambda0ArrOnExtraCallback);
    }

    protected ColorsKtExternalSyntheticLambda0.onNavigationEvent[] onWarmupCompleted(ChipKtExternalSyntheticLambda9.onNavigationEvent onnavigationevent, int[][][] iArr, int[] iArr2, IAuthTabCallback iAuthTabCallback) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        String str;
        int iIAuthTabCallback = onnavigationevent.IAuthTabCallback();
        ColorsKtExternalSyntheticLambda0.onNavigationEvent[] onnavigationeventArr = new ColorsKtExternalSyntheticLambda0.onNavigationEvent[iIAuthTabCallback];
        Pair<ColorsKtExternalSyntheticLambda0.onNavigationEvent, Integer> pairOnExtraCallbackWithResult = onExtraCallbackWithResult(onnavigationevent, iArr, iArr2, iAuthTabCallback);
        if (pairOnExtraCallbackWithResult != null) {
            onnavigationeventArr[((Integer) pairOnExtraCallbackWithResult.second).intValue()] = (ColorsKtExternalSyntheticLambda0.onNavigationEvent) pairOnExtraCallbackWithResult.first;
        }
        if (pairOnExtraCallbackWithResult == null) {
            str = null;
        } else {
            ColorsKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent2 = (ColorsKtExternalSyntheticLambda0.onNavigationEvent) pairOnExtraCallbackWithResult.first;
            str = onnavigationevent2.onWarmupCompleted.IAuthTabCallback(onnavigationevent2.onNavigationEvent[0]).onActivityLayout;
        }
        Pair<ColorsKtExternalSyntheticLambda0.onNavigationEvent, Integer> pairOnExtraCallbackWithResult2 = onExtraCallbackWithResult(onnavigationevent, iArr, iArr2, iAuthTabCallback, str);
        Pair<ColorsKtExternalSyntheticLambda0.onNavigationEvent, Integer> pairIAuthTabCallback = (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onTransact || pairOnExtraCallbackWithResult2 == null) ? IAuthTabCallback(onnavigationevent, iArr, iAuthTabCallback) : null;
        if (pairIAuthTabCallback != null) {
            onnavigationeventArr[((Integer) pairIAuthTabCallback.second).intValue()] = (ColorsKtExternalSyntheticLambda0.onNavigationEvent) pairIAuthTabCallback.first;
        } else if (pairOnExtraCallbackWithResult2 != null) {
            onnavigationeventArr[((Integer) pairOnExtraCallbackWithResult2.second).intValue()] = (ColorsKtExternalSyntheticLambda0.onNavigationEvent) pairOnExtraCallbackWithResult2.first;
        }
        Pair<ColorsKtExternalSyntheticLambda0.onNavigationEvent, Integer> pairOnNavigationEvent = onNavigationEvent(onnavigationevent, iArr, iAuthTabCallback, str);
        if (pairOnNavigationEvent != null) {
            onnavigationeventArr[((Integer) pairOnNavigationEvent.second).intValue()] = (ColorsKtExternalSyntheticLambda0.onNavigationEvent) pairOnNavigationEvent.first;
        }
        for (int i2 = 0; i2 < iIAuthTabCallback; i2++) {
            int iOnNavigationEvent = onnavigationevent.onNavigationEvent(i2);
            if (iOnNavigationEvent != 2 && iOnNavigationEvent != 1 && iOnNavigationEvent != 3 && iOnNavigationEvent != 4) {
                onnavigationeventArr[i2] = onWarmupCompleted(iOnNavigationEvent, onnavigationevent.onExtraCallbackWithResult(i2), iArr[i2], iAuthTabCallback);
            }
        }
        return onnavigationeventArr;
    }

    protected Pair<ColorsKtExternalSyntheticLambda0.onNavigationEvent, Integer> onExtraCallbackWithResult(ChipKtExternalSyntheticLambda9.onNavigationEvent onnavigationevent, int[][][] iArr, final int[] iArr2, final IAuthTabCallback iAuthTabCallback, @Nullable final String str) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        Context context;
        final Point point = null;
        if (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onExtraCallback.onWarmupCompleted == 2) {
            return null;
        }
        if (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).IAuthTabCallbackStub && (context = this.onWarmupCompleted) != null) {
            int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
            point = (Point) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-1578219381, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, new Object[]{context}, 1578219386);
        }
        return onExtraCallback(2, onnavigationevent, iArr, new IAuthTabCallbackStub.onExtraCallbackWithResult() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda4
            @Override // o.ChipKtExternalSyntheticLambda2.IAuthTabCallbackStub.onExtraCallbackWithResult
            public final List create(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int[] iArr3) {
                return ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault.onWarmupCompleted(i2, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, iAuthTabCallback, iArr3, str, iArr2[i2], point);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault.IAuthTabCallback((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<ColorsKtExternalSyntheticLambda0.onNavigationEvent, Integer> onExtraCallbackWithResult(ChipKtExternalSyntheticLambda9.onNavigationEvent onnavigationevent, int[][][] iArr, final int[] iArr2, final IAuthTabCallback iAuthTabCallback) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        final boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < onnavigationevent.IAuthTabCallback()) {
                if (2 == onnavigationevent.onNavigationEvent(i2) && onnavigationevent.onExtraCallbackWithResult(i2).onExtraCallbackWithResult > 0) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return onExtraCallback(1, onnavigationevent, iArr, new IAuthTabCallbackStub.onExtraCallbackWithResult() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda6
            @Override // o.ChipKtExternalSyntheticLambda2.IAuthTabCallbackStub.onExtraCallbackWithResult
            public final List create(int i3, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int[] iArr3) {
                ChipKtExternalSyntheticLambda2 chipKtExternalSyntheticLambda2 = this.f$0;
                ChipKtExternalSyntheticLambda2.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallback;
                return ChipKtExternalSyntheticLambda2.onWarmupCompleted.IAuthTabCallback(i3, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, iAuthTabCallback2, iArr3, z, new Predicate() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda3
                    public final boolean apply(Object obj) {
                        return this.f$0.onWarmupCompleted((BasicTextContextMenuProviderKtExternalSyntheticLambda4) obj, iAuthTabCallback2);
                    }
                }, iArr2[i3]);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda7
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ChipKtExternalSyntheticLambda2.onWarmupCompleted.onNavigationEvent((List) obj, (List) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, IAuthTabCallback iAuthTabCallback) {
        int i2;
        onTransact ontransact;
        onTransact ontransact2;
        if (!iAuthTabCallback.ICustomTabsServiceStub) {
            return true;
        }
        Boolean bool = this.onExtraCallback;
        if ((bool != null && bool.booleanValue()) || (i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent) == -1 || i2 <= 2) {
            return true;
        }
        if (!onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4) || (Build.VERSION.SDK_INT >= 32 && (ontransact2 = this.onTransact) != null && ontransact2.onWarmupCompleted())) {
            return Build.VERSION.SDK_INT >= 32 && (ontransact = this.onTransact) != null && ontransact.onWarmupCompleted() && this.onTransact.IAuthTabCallback() && this.onTransact.onNavigationEvent() && this.onTransact.onWarmupCompleted(this.onNavigationEvent, basicTextContextMenuProviderKtExternalSyntheticLambda4);
        }
        return true;
    }

    protected Pair<ColorsKtExternalSyntheticLambda0.onNavigationEvent, Integer> onNavigationEvent(ChipKtExternalSyntheticLambda9.onNavigationEvent onnavigationevent, int[][][] iArr, final IAuthTabCallback iAuthTabCallback, @Nullable final String str) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onExtraCallback.onWarmupCompleted == 2) {
            return null;
        }
        final String strIAuthTabCallback = ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).ICustomTabsCallbackStubProxy ? IAuthTabCallback(this.onWarmupCompleted) : null;
        return onExtraCallback(3, onnavigationevent, iArr, new IAuthTabCallbackStub.onExtraCallbackWithResult() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda8
            @Override // o.ChipKtExternalSyntheticLambda2.IAuthTabCallbackStub.onExtraCallbackWithResult
            public final List create(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int[] iArr2) {
                return ChipKtExternalSyntheticLambda2.asInterface.IAuthTabCallback(i2, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, iAuthTabCallback, iArr2, str, strIAuthTabCallback);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda9
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ChipKtExternalSyntheticLambda2.asInterface.onNavigationEvent((List) obj, (List) obj2);
            }
        });
    }

    protected Pair<ColorsKtExternalSyntheticLambda0.onNavigationEvent, Integer> IAuthTabCallback(ChipKtExternalSyntheticLambda9.onNavigationEvent onnavigationevent, int[][][] iArr, final IAuthTabCallback iAuthTabCallback) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onExtraCallback.onWarmupCompleted == 2) {
            return null;
        }
        return onExtraCallback(4, onnavigationevent, iArr, new IAuthTabCallbackStub.onExtraCallbackWithResult() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda1
            @Override // o.ChipKtExternalSyntheticLambda2.IAuthTabCallbackStub.onExtraCallbackWithResult
            public final List create(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int[] iArr2) {
                return ChipKtExternalSyntheticLambda2.onNavigationEvent.onExtraCallback(i2, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, iAuthTabCallback, iArr2);
            }
        }, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$$ExternalSyntheticLambda2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ChipKtExternalSyntheticLambda2.onNavigationEvent.onWarmupCompleted((List) obj, (List) obj2);
            }
        });
    }

    protected ColorsKtExternalSyntheticLambda0.onNavigationEvent onWarmupCompleted(int i2, BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11, int[][] iArr, IAuthTabCallback iAuthTabCallback) throws AndroidSelectionHandles_androidKtExternalSyntheticLambda4 {
        if (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onExtraCallback.onWarmupCompleted == 2) {
            return null;
        }
        int i3 = 0;
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 = null;
        onExtraCallback onextracallback = null;
        for (int i4 = 0; i4 < bottomSheetScaffoldKtExternalSyntheticLambda11.onExtraCallbackWithResult; i4++) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted = bottomSheetScaffoldKtExternalSyntheticLambda11.onWarmupCompleted(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.onWarmupCompleted; i5++) {
                if (RendererCapabilities.onExtraCallback(iArr2[i5], iAuthTabCallback.ICustomTabsServiceDefault)) {
                    onExtraCallback onextracallback2 = new onExtraCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.IAuthTabCallback(i5), iArr2[i5]);
                    if (onextracallback == null || onextracallback2.compareTo(onextracallback) > 0) {
                        coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted;
                        i3 = i5;
                        onextracallback = onextracallback2;
                    }
                }
            }
        }
        if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 == null) {
            return null;
        }
        return new ColorsKtExternalSyntheticLambda0.onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, i3);
    }

    private <T extends IAuthTabCallbackStub<T>> Pair<ColorsKtExternalSyntheticLambda0.onNavigationEvent, Integer> onExtraCallback(int i2, ChipKtExternalSyntheticLambda9.onNavigationEvent onnavigationevent, int[][][] iArr, IAuthTabCallbackStub.onExtraCallbackWithResult<T> onextracallbackwithresult, Comparator<List<T>> comparator) {
        int i3;
        ImmutableList immutableListOf;
        ChipKtExternalSyntheticLambda9.onNavigationEvent onnavigationevent2 = onnavigationevent;
        ArrayList arrayList = new ArrayList();
        int iIAuthTabCallback = onnavigationevent.IAuthTabCallback();
        int i4 = 0;
        while (i4 < iIAuthTabCallback) {
            if (i2 == onnavigationevent2.onNavigationEvent(i4)) {
                BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11OnExtraCallbackWithResult = onnavigationevent2.onExtraCallbackWithResult(i4);
                for (int i5 = 0; i5 < bottomSheetScaffoldKtExternalSyntheticLambda11OnExtraCallbackWithResult.onExtraCallbackWithResult; i5++) {
                    CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted = bottomSheetScaffoldKtExternalSyntheticLambda11OnExtraCallbackWithResult.onWarmupCompleted(i5);
                    List<T> listCreate = onextracallbackwithresult.create(i4, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted, iArr[i4][i5]);
                    boolean[] zArr = new boolean[coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.onWarmupCompleted];
                    int i6 = 0;
                    while (i6 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.onWarmupCompleted) {
                        T t = listCreate.get(i6);
                        int iIAuthTabCallback2 = t.IAuthTabCallback();
                        if (zArr[i6] || iIAuthTabCallback2 == 0) {
                            i3 = iIAuthTabCallback;
                        } else {
                            if (iIAuthTabCallback2 == 1) {
                                immutableListOf = ImmutableList.of(t);
                                i3 = iIAuthTabCallback;
                            } else {
                                ImmutableList arrayList2 = new ArrayList();
                                arrayList2.add(t);
                                int i7 = i6 + 1;
                                while (i7 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1OnWarmupCompleted.onWarmupCompleted) {
                                    T t2 = listCreate.get(i7);
                                    int i8 = iIAuthTabCallback;
                                    if (t2.IAuthTabCallback() == 2 && t.onExtraCallback(t2)) {
                                        arrayList2.add(t2);
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    iIAuthTabCallback = i8;
                                }
                                i3 = iIAuthTabCallback;
                                immutableListOf = arrayList2;
                            }
                            arrayList.add(immutableListOf);
                        }
                        i6++;
                        iIAuthTabCallback = i3;
                    }
                }
            }
            i4++;
            onnavigationevent2 = onnavigationevent;
            iIAuthTabCallback = iIAuthTabCallback;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((IAuthTabCallbackStub) list.get(i9)).onNavigationEvent;
        }
        IAuthTabCallbackStub iAuthTabCallbackStub = (IAuthTabCallbackStub) list.get(0);
        return Pair.create(new ColorsKtExternalSyntheticLambda0.onNavigationEvent(iAuthTabCallbackStub.onExtraCallbackWithResult, iArr2), Integer.valueOf(iAuthTabCallbackStub.onExtraCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void asBinder() {
        boolean z;
        onTransact ontransact;
        synchronized (this.IAuthTabCallback) {
            if (!this.IAuthTabCallbackDefault.ICustomTabsServiceStub || Build.VERSION.SDK_INT < 32 || (ontransact = this.onTransact) == null) {
                z = false;
            } else if (ontransact.onWarmupCompleted()) {
                z = true;
            }
        }
        if (z) {
            onTransact();
        }
    }

    private void onNavigationEvent(Renderer renderer) {
        boolean z;
        synchronized (this.IAuthTabCallback) {
            z = this.IAuthTabCallbackDefault.requestPostMessageChannel;
        }
        if (z) {
            IAuthTabCallback(renderer);
        }
    }

    private static void IAuthTabCallback(ChipKtExternalSyntheticLambda9.onNavigationEvent onnavigationevent, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3, ColorsKtExternalSyntheticLambda0.onNavigationEvent[] onnavigationeventArr) {
        int iIAuthTabCallback = onnavigationevent.IAuthTabCallback();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < iIAuthTabCallback; i2++) {
            onExtraCallback(onnavigationevent.onExtraCallbackWithResult(i2), coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3, map);
        }
        onExtraCallback(onnavigationevent.onExtraCallbackWithResult(), coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3, map);
        for (int i3 = 0; i3 < iIAuthTabCallback; i3++) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda11 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda11 = (CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda11) map.get(Integer.valueOf(onnavigationevent.onNavigationEvent(i3)));
            if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda11 != null) {
                onnavigationeventArr[i3] = (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda11.onExtraCallbackWithResult.isEmpty() || onnavigationevent.onExtraCallbackWithResult(i3).IAuthTabCallback(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda11.onNavigationEvent) == -1) ? null : new ColorsKtExternalSyntheticLambda0.onNavigationEvent(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda11.onNavigationEvent, Ints.toArray(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda11.onExtraCallbackWithResult));
            }
        }
    }

    private static void onExtraCallback(BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3, Map<Integer, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda11> map) {
        CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda11 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda11;
        for (int i2 = 0; i2 < bottomSheetScaffoldKtExternalSyntheticLambda11.onExtraCallbackWithResult; i2++) {
            CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda11 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda112 = (CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda11) coreTextFieldSemanticsModifierNodeExternalSyntheticLambda3.writeTypedObject.get(bottomSheetScaffoldKtExternalSyntheticLambda11.onWarmupCompleted(i2));
            if (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda112 != null && ((coreTextFieldSemanticsModifierNodeExternalSyntheticLambda11 = map.get(Integer.valueOf(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda112.onWarmupCompleted()))) == null || (coreTextFieldSemanticsModifierNodeExternalSyntheticLambda11.onExtraCallbackWithResult.isEmpty() && !coreTextFieldSemanticsModifierNodeExternalSyntheticLambda112.onExtraCallbackWithResult.isEmpty()))) {
                map.put(Integer.valueOf(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda112.onWarmupCompleted()), coreTextFieldSemanticsModifierNodeExternalSyntheticLambda112);
            }
        }
    }

    private static void onExtraCallback(ChipKtExternalSyntheticLambda9.onNavigationEvent onnavigationevent, IAuthTabCallback iAuthTabCallback, ColorsKtExternalSyntheticLambda0.onNavigationEvent[] onnavigationeventArr) {
        int iIAuthTabCallback = onnavigationevent.IAuthTabCallback();
        for (int i2 = 0; i2 < iIAuthTabCallback; i2++) {
            BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11OnExtraCallbackWithResult = onnavigationevent.onExtraCallbackWithResult(i2);
            if (iAuthTabCallback.onWarmupCompleted(i2, bottomSheetScaffoldKtExternalSyntheticLambda11OnExtraCallbackWithResult)) {
                onExtraCallbackWithResult onExtraCallbackWithResult2 = iAuthTabCallback.onExtraCallbackWithResult(i2, bottomSheetScaffoldKtExternalSyntheticLambda11OnExtraCallbackWithResult);
                onnavigationeventArr[i2] = (onExtraCallbackWithResult2 == null || onExtraCallbackWithResult2.onNavigationEvent.length == 0) ? null : new ColorsKtExternalSyntheticLambda0.onNavigationEvent(bottomSheetScaffoldKtExternalSyntheticLambda11OnExtraCallbackWithResult.onWarmupCompleted(onExtraCallbackWithResult2.onWarmupCompleted), onExtraCallbackWithResult2.onNavigationEvent, onExtraCallbackWithResult2.IAuthTabCallback);
            }
        }
    }

    private static void onWarmupCompleted(ChipKtExternalSyntheticLambda9.onNavigationEvent onnavigationevent, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr) {
        boolean z;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < onnavigationevent.IAuthTabCallback(); i4++) {
            int iOnNavigationEvent = onnavigationevent.onNavigationEvent(i4);
            ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 = colorsKtExternalSyntheticLambda0Arr[i4];
            if ((iOnNavigationEvent == 1 || iOnNavigationEvent == 2) && colorsKtExternalSyntheticLambda0 != null && onWarmupCompleted(iArr[i4], onnavigationevent.onExtraCallbackWithResult(i4), colorsKtExternalSyntheticLambda0)) {
                if (iOnNavigationEvent != 1) {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i4;
                } else {
                    if (i3 != -1) {
                        z = false;
                        break;
                    }
                    i3 = i4;
                }
            }
        }
        z = true;
        if (z && ((i3 == -1 || i2 == -1) ? false : true)) {
            RendererConfiguration rendererConfiguration = new RendererConfiguration(0, true);
            rendererConfigurationArr[i3] = rendererConfiguration;
            rendererConfigurationArr[i2] = rendererConfiguration;
        }
    }

    private static boolean onWarmupCompleted(int[][] iArr, BottomSheetScaffoldKtExternalSyntheticLambda11 bottomSheetScaffoldKtExternalSyntheticLambda11, ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0) {
        if (colorsKtExternalSyntheticLambda0 == null) {
            return false;
        }
        int iIAuthTabCallback = bottomSheetScaffoldKtExternalSyntheticLambda11.IAuthTabCallback(colorsKtExternalSyntheticLambda0.onExtraCallback());
        for (int i2 = 0; i2 < colorsKtExternalSyntheticLambda0.access100(); i2++) {
            if (RendererCapabilities.IAuthTabCallbackStub(iArr[iIAuthTabCallback][colorsKtExternalSyntheticLambda0.onWarmupCompleted(i2)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static void onExtraCallback(IAuthTabCallback iAuthTabCallback, ChipKtExternalSyntheticLambda9.onNavigationEvent onnavigationevent, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ColorsKtExternalSyntheticLambda0[] colorsKtExternalSyntheticLambda0Arr) {
        int i2 = -1;
        boolean z = false;
        int i3 = 0;
        for (int i4 = 0; i4 < onnavigationevent.IAuthTabCallback(); i4++) {
            int iOnNavigationEvent = onnavigationevent.onNavigationEvent(i4);
            ColorsKtExternalSyntheticLambda0 colorsKtExternalSyntheticLambda0 = colorsKtExternalSyntheticLambda0Arr[i4];
            if (iOnNavigationEvent != 1 && colorsKtExternalSyntheticLambda0 != null) {
                return;
            }
            if (iOnNavigationEvent == 1 && colorsKtExternalSyntheticLambda0 != null && colorsKtExternalSyntheticLambda0.access100() == 1) {
                if (onExtraCallback(iAuthTabCallback, iArr[i4][onnavigationevent.onExtraCallbackWithResult(i4).IAuthTabCallback(colorsKtExternalSyntheticLambda0.onExtraCallback())][colorsKtExternalSyntheticLambda0.onWarmupCompleted(0)], colorsKtExternalSyntheticLambda0.IAuthTabCallback())) {
                    i3++;
                    i2 = i4;
                }
            }
        }
        if (i3 == 1) {
            int i5 = ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onExtraCallback.IAuthTabCallback ? 1 : 2;
            RendererConfiguration rendererConfiguration = rendererConfigurationArr[i2];
            if (rendererConfiguration != null && rendererConfiguration.onWarmupCompleted) {
                z = true;
            }
            rendererConfigurationArr[i2] = new RendererConfiguration(i5, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean onExtraCallback(IAuthTabCallback iAuthTabCallback, int i2, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        if (RendererCapabilities.onNavigationEvent(i2) == 0) {
            return false;
        }
        if (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onExtraCallback.onNavigationEvent && (RendererCapabilities.onNavigationEvent(i2) & 2048) == 0) {
            return false;
        }
        if (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onExtraCallback.IAuthTabCallback) {
            boolean z = (basicTextContextMenuProviderKtExternalSyntheticLambda4.access100 == 0 && basicTextContextMenuProviderKtExternalSyntheticLambda4.extraCallbackWithResult == 0) ? false : true;
            boolean z2 = (RendererCapabilities.onNavigationEvent(i2) & 1024) != 0;
            if (z && !z2) {
                return false;
            }
        }
        return true;
    }

    protected static String onNavigationEvent(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static int onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.onActivityLayout)) {
            return 4;
        }
        String strOnNavigationEvent = onNavigationEvent(str);
        String strOnNavigationEvent2 = onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4.onActivityLayout);
        if (strOnNavigationEvent2 == null || strOnNavigationEvent == null) {
            return (z && strOnNavigationEvent2 == null) ? 1 : 0;
        }
        if (strOnNavigationEvent2.startsWith(strOnNavigationEvent) || strOnNavigationEvent.startsWith(strOnNavigationEvent2)) {
            return 3;
        }
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(strOnNavigationEvent2, "-")[0].equals(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(strOnNavigationEvent, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int onExtraCallbackWithResult(CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int i2, int i3, boolean z) {
        int i4;
        int i5 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
            for (int i6 = 0; i6 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.onWarmupCompleted; i6++) {
                BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.IAuthTabCallback(i6);
                int i7 = basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback.prefetchWithMultipleUrls;
                if (i7 > 0 && (i4 = basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback.ICustomTabsCallback) > 0) {
                    Point pointOnExtraCallbackWithResult = ComposableSingletonsBottomSheetScaffoldKtExternalSyntheticLambda0.onExtraCallbackWithResult(z, i2, i3, i7, i4);
                    int i8 = basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback.prefetchWithMultipleUrls;
                    int i9 = basicTextContextMenuProviderKtExternalSyntheticLambda4IAuthTabCallback.ICustomTabsCallback;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (pointOnExtraCallbackWithResult.x * 0.98f)) && i9 >= ((int) (pointOnExtraCallbackWithResult.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
        }
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int onExtraCallback(int i2, int i3) {
        if (i2 == 0 || i2 != i3) {
            return Integer.bitCount(i2 & i3);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int IAuthTabCallback(@Nullable String str) {
        char c;
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1851077871:
                if (!str.equals("video/dolby-vision")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -1662735862:
                if (str.equals("video/av01")) {
                    c = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 4;
                    break;
                }
                break;
        }
        if (c == 0) {
            return 5;
        }
        if (c == 1) {
            return 4;
        }
        if (c == 2) {
            return 3;
        }
        if (c != 3) {
            return c != 4 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        char c;
        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
        if (str == null) {
            return false;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2123537834) {
            if (iHashCode != 187078297) {
                c = (iHashCode == 1504698186 && str.equals("audio/iamf")) ? (char) 2 : (char) 65535;
            } else if (str.equals("audio/ac4")) {
                c = 1;
            }
        } else if (str.equals("audio/eac3-joc")) {
            c = 0;
        }
        return c == 0 || c == 1 || c == 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        char c;
        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable;
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -2123537834:
                if (!str.equals("audio/eac3-joc")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 1;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 3;
                    break;
                }
                break;
        }
        return c == 0 || c == 1 || c == 2 || c == 3;
    }

    private static String IAuthTabCallback(@Nullable Context context) {
        CaptioningManager captioningManager;
        Locale locale;
        if (context == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            return null;
        }
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(locale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static abstract class IAuthTabCallbackStub<T extends IAuthTabCallbackStub<T>> {
        public final BasicTextContextMenuProviderKtExternalSyntheticLambda4 IAuthTabCallback;
        public final int onExtraCallback;
        public final CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 onExtraCallbackWithResult;
        public final int onNavigationEvent;

        public interface onExtraCallbackWithResult<T extends IAuthTabCallbackStub<T>> {
            List<T> create(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int[] iArr);
        }

        public abstract int IAuthTabCallback();

        public abstract boolean onExtraCallback(T t);

        public IAuthTabCallbackStub(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int i3) {
            this.onExtraCallback = i2;
            this.onExtraCallbackWithResult = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1;
            this.onNavigationEvent = i3;
            this.IAuthTabCallback = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.IAuthTabCallback(i3);
        }
    }

    public static final class IAuthTabCallbackDefault extends IAuthTabCallbackStub<IAuthTabCallbackDefault> {
        private final boolean IAuthTabCallbackDefault;
        private final int IAuthTabCallbackStub;
        private final int IAuthTabCallbackStubProxy;
        private final IAuthTabCallback IAuthTabCallback_Parcel;
        private final int ICustomTabsCallback;
        private final boolean access000;
        private final boolean access100;
        private final boolean asBinder;
        private final boolean asInterface;
        private final int extraCallback;
        private final int extraCallbackWithResult;
        private final int getInterfaceDescriptor;
        private final boolean onActivityResized;
        private final boolean onPostMessage;
        private final int onTransact;
        private final boolean onWarmupCompleted;
        private final int readTypedObject;
        private final int writeTypedObject;

        public static ImmutableList<IAuthTabCallbackDefault> onWarmupCompleted(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, IAuthTabCallback iAuthTabCallback, int[] iArr, @Nullable String str, int i3, @Nullable Point point) {
            int iOnExtraCallbackWithResult = ChipKtExternalSyntheticLambda2.onExtraCallbackWithResult(coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, point != null ? point.x : ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).extraCommand, point != null ? point.y : ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).mayLaunchUrl, ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).ICustomTabsCallback_Parcel);
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i4 = 0; i4 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.onWarmupCompleted; i4++) {
                int iOnNavigationEvent = coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.IAuthTabCallback(i4).onNavigationEvent();
                builder.add(new IAuthTabCallbackDefault(i2, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, i4, iAuthTabCallback, iArr[i4], str, i3, iOnExtraCallbackWithResult == Integer.MAX_VALUE || (iOnNavigationEvent != -1 && iOnNavigationEvent <= iOnExtraCallbackWithResult)));
            }
            return builder.build();
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public IAuthTabCallbackDefault(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int i3, IAuthTabCallback iAuthTabCallback, int i4, @Nullable String str, int i5, boolean z) {
            boolean z2;
            boolean z3;
            int i6;
            int iOnExtraCallback;
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4;
            int i7;
            int i8;
            int i9;
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42;
            int i10;
            int i11;
            int i12;
            super(i2, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, i3);
            this.IAuthTabCallback_Parcel = iAuthTabCallback;
            int i13 = iAuthTabCallback.prefetchWithMultipleUrls ? 24 : 16;
            this.onWarmupCompleted = iAuthTabCallback.requestPostMessageChannelWithExtras && (i5 & i13) != 0;
            if (!z || (((i10 = (basicTextContextMenuProviderKtExternalSyntheticLambda42 = this.IAuthTabCallback).prefetchWithMultipleUrls) != -1 && i10 > ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).IAuthTabCallbackStubProxy) || ((i11 = basicTextContextMenuProviderKtExternalSyntheticLambda42.ICustomTabsCallback) != -1 && i11 > ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).getInterfaceDescriptor))) {
                z2 = false;
            } else {
                float f = basicTextContextMenuProviderKtExternalSyntheticLambda42.writeTypedObject;
                if ((f == -1.0f || f <= ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).access000) && ((i12 = basicTextContextMenuProviderKtExternalSyntheticLambda42.onExtraCallback) == -1 || i12 <= ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).IAuthTabCallback_Parcel)) {
                    z2 = true;
                }
            }
            this.asInterface = z2;
            if (!z || (((i7 = (basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.IAuthTabCallback).prefetchWithMultipleUrls) != -1 && i7 < ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).extraCallback) || ((i8 = basicTextContextMenuProviderKtExternalSyntheticLambda4.ICustomTabsCallback) != -1 && i8 < ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).ICustomTabsCallback))) {
                z3 = false;
            } else {
                float f2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.writeTypedObject;
                if ((f2 == -1.0f || f2 >= ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).readTypedObject) && ((i9 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallback) == -1 || i9 >= ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).extraCallbackWithResult)) {
                    z3 = true;
                }
            }
            this.access100 = z3;
            this.access000 = RendererCapabilities.onExtraCallback(i4, false);
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda43 = this.IAuthTabCallback;
            float f3 = basicTextContextMenuProviderKtExternalSyntheticLambda43.writeTypedObject;
            this.IAuthTabCallbackDefault = f3 != -1.0f && f3 >= 10.0f;
            this.IAuthTabCallbackStub = basicTextContextMenuProviderKtExternalSyntheticLambda43.onExtraCallback;
            this.getInterfaceDescriptor = basicTextContextMenuProviderKtExternalSyntheticLambda43.onNavigationEvent();
            int i14 = 0;
            while (true) {
                i6 = Integer.MAX_VALUE;
                if (i14 >= ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).ICustomTabsCallbackDefault.size()) {
                    i14 = Integer.MAX_VALUE;
                    iOnExtraCallback = 0;
                    break;
                } else {
                    iOnExtraCallback = ChipKtExternalSyntheticLambda2.onExtraCallback(this.IAuthTabCallback, (String) ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).ICustomTabsCallbackDefault.get(i14), false);
                    if (iOnExtraCallback > 0) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.IAuthTabCallbackStubProxy = i14;
            this.ICustomTabsCallback = iOnExtraCallback;
            this.writeTypedObject = ChipKtExternalSyntheticLambda2.onExtraCallback(this.IAuthTabCallback.mayLaunchUrl, ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onUnminimized);
            int i15 = this.IAuthTabCallback.mayLaunchUrl;
            this.asBinder = i15 == 0 || (i15 & 1) != 0;
            this.readTypedObject = ChipKtExternalSyntheticLambda2.onExtraCallback(this.IAuthTabCallback, str, ChipKtExternalSyntheticLambda2.onNavigationEvent(str) == null);
            int i16 = 0;
            while (true) {
                if (i16 < ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onRelationshipValidationResult.size()) {
                    String str2 = this.IAuthTabCallback.isEngagementSignalsApiAvailable;
                    if (str2 != null && str2.equals(((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onRelationshipValidationResult.get(i16))) {
                        i6 = i16;
                        break;
                    }
                    i16++;
                } else {
                    break;
                }
            }
            this.extraCallback = i6;
            this.onPostMessage = RendererCapabilities.onExtraCallback(i4) == 128;
            this.onActivityResized = RendererCapabilities.asBinder(i4) == 64;
            this.onTransact = ChipKtExternalSyntheticLambda2.IAuthTabCallback(this.IAuthTabCallback.isEngagementSignalsApiAvailable);
            this.extraCallbackWithResult = onExtraCallbackWithResult(i4, i13);
        }

        @Override // o.ChipKtExternalSyntheticLambda2.IAuthTabCallbackStub
        public int IAuthTabCallback() {
            return this.extraCallbackWithResult;
        }

        @Override // o.ChipKtExternalSyntheticLambda2.IAuthTabCallbackStub
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public boolean onExtraCallback(IAuthTabCallbackDefault iAuthTabCallbackDefault) {
            if (!this.onWarmupCompleted && !Objects.equals(this.IAuthTabCallback.isEngagementSignalsApiAvailable, iAuthTabCallbackDefault.IAuthTabCallback.isEngagementSignalsApiAvailable)) {
                return false;
            }
            if (this.IAuthTabCallback_Parcel.setEngagementSignalsCallback) {
                return true;
            }
            return this.onPostMessage == iAuthTabCallbackDefault.onPostMessage && this.onActivityResized == iAuthTabCallbackDefault.onActivityResized;
        }

        private int onExtraCallbackWithResult(int i2, int i3) {
            if ((this.IAuthTabCallback.mayLaunchUrl & 16384) != 0 || !RendererCapabilities.onExtraCallback(i2, this.IAuthTabCallback_Parcel.ICustomTabsServiceDefault)) {
                return 0;
            }
            if (!this.asInterface && !this.IAuthTabCallback_Parcel.warmup) {
                return 0;
            }
            if (!RendererCapabilities.onExtraCallback(i2, false) || !this.access100 || !this.asInterface || this.IAuthTabCallback.onExtraCallback == -1) {
                return 1;
            }
            IAuthTabCallback iAuthTabCallback = this.IAuthTabCallback_Parcel;
            return (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onWarmupCompleted || ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).IAuthTabCallbackDefault || (i2 & i3) == 0) ? 1 : 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int onNavigationEvent(IAuthTabCallbackDefault iAuthTabCallbackDefault, IAuthTabCallbackDefault iAuthTabCallbackDefault2) {
            ComparisonChain comparisonChainCompareFalseFirst = ComparisonChain.start().compareFalseFirst(iAuthTabCallbackDefault.access000, iAuthTabCallbackDefault2.access000);
            int i2 = iAuthTabCallbackDefault.IAuthTabCallbackStubProxy;
            int i3 = iAuthTabCallbackDefault2.IAuthTabCallbackStubProxy;
            ComparisonChain comparisonChainCompareFalseFirst2 = comparisonChainCompareFalseFirst.compare(Integer.valueOf(i2), Integer.valueOf(i3), Ordering.natural().reverse()).compare(iAuthTabCallbackDefault.ICustomTabsCallback, iAuthTabCallbackDefault2.ICustomTabsCallback).compare(iAuthTabCallbackDefault.writeTypedObject, iAuthTabCallbackDefault2.writeTypedObject).compareFalseFirst(iAuthTabCallbackDefault.asBinder, iAuthTabCallbackDefault2.asBinder).compare(iAuthTabCallbackDefault.readTypedObject, iAuthTabCallbackDefault2.readTypedObject).compareFalseFirst(iAuthTabCallbackDefault.IAuthTabCallbackDefault, iAuthTabCallbackDefault2.IAuthTabCallbackDefault).compareFalseFirst(iAuthTabCallbackDefault.asInterface, iAuthTabCallbackDefault2.asInterface).compareFalseFirst(iAuthTabCallbackDefault.access100, iAuthTabCallbackDefault2.access100);
            int i4 = iAuthTabCallbackDefault.extraCallback;
            int i5 = iAuthTabCallbackDefault2.extraCallback;
            ComparisonChain comparisonChainCompareFalseFirst3 = comparisonChainCompareFalseFirst2.compare(Integer.valueOf(i4), Integer.valueOf(i5), Ordering.natural().reverse()).compareFalseFirst(iAuthTabCallbackDefault.onPostMessage, iAuthTabCallbackDefault2.onPostMessage).compareFalseFirst(iAuthTabCallbackDefault.onActivityResized, iAuthTabCallbackDefault2.onActivityResized);
            if (iAuthTabCallbackDefault.onPostMessage && iAuthTabCallbackDefault.onActivityResized) {
                comparisonChainCompareFalseFirst3 = comparisonChainCompareFalseFirst3.compare(iAuthTabCallbackDefault.onTransact, iAuthTabCallbackDefault2.onTransact);
            }
            return comparisonChainCompareFalseFirst3.result();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int onExtraCallback(IAuthTabCallbackDefault iAuthTabCallbackDefault, IAuthTabCallbackDefault iAuthTabCallbackDefault2) {
            Ordering orderingReverse = (iAuthTabCallbackDefault.asInterface && iAuthTabCallbackDefault.access000) ? ChipKtExternalSyntheticLambda2.onExtraCallbackWithResult : ChipKtExternalSyntheticLambda2.onExtraCallbackWithResult.reverse();
            ComparisonChain comparisonChainStart = ComparisonChain.start();
            if (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallbackDefault.IAuthTabCallback_Parcel).IAuthTabCallbackDefault) {
                comparisonChainStart = comparisonChainStart.compare(Integer.valueOf(iAuthTabCallbackDefault.IAuthTabCallbackStub), Integer.valueOf(iAuthTabCallbackDefault2.IAuthTabCallbackStub), ChipKtExternalSyntheticLambda2.onExtraCallbackWithResult.reverse());
            }
            return comparisonChainStart.compare(Integer.valueOf(iAuthTabCallbackDefault.getInterfaceDescriptor), Integer.valueOf(iAuthTabCallbackDefault2.getInterfaceDescriptor), orderingReverse).compare(Integer.valueOf(iAuthTabCallbackDefault.IAuthTabCallbackStub), Integer.valueOf(iAuthTabCallbackDefault2.IAuthTabCallbackStub), orderingReverse).result();
        }

        public static int IAuthTabCallback(List<IAuthTabCallbackDefault> list, List<IAuthTabCallbackDefault> list2) {
            return ComparisonChain.start().compare((IAuthTabCallbackDefault) Collections.max(list, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault.onNavigationEvent((ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault) obj, (ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault) obj2);
                }
            }), (IAuthTabCallbackDefault) Collections.max(list2, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault.onNavigationEvent((ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault) obj, (ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault) obj2);
                }
            }), new Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault.onNavigationEvent((ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault) obj, (ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault) obj2);
                }
            }).compare(list.size(), list2.size()).compare((IAuthTabCallbackDefault) Collections.max(list, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault.onExtraCallback((ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault) obj, (ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault) obj2);
                }
            }), (IAuthTabCallbackDefault) Collections.max(list2, new Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault.onExtraCallback((ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault) obj, (ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault) obj2);
                }
            }), new Comparator() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector$VideoTrackInfo$$ExternalSyntheticLambda1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault.onExtraCallback((ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault) obj, (ChipKtExternalSyntheticLambda2.IAuthTabCallbackDefault) obj2);
                }
            }).result();
        }
    }

    public static final class onWarmupCompleted extends IAuthTabCallbackStub<onWarmupCompleted> implements Comparable<onWarmupCompleted> {
        private final int IAuthTabCallbackDefault;
        private final boolean IAuthTabCallbackStub;
        private final int IAuthTabCallbackStubProxy;
        private final int IAuthTabCallback_Parcel;
        private final int ICustomTabsCallback;
        private final String access000;
        private final boolean access100;
        private final int asBinder;
        private final boolean asInterface;
        private final int extraCallback;
        private final int extraCallbackWithResult;
        private final boolean getInterfaceDescriptor;
        private final int onActivityLayout;
        private final boolean onActivityResized;
        private final int onMessageChannelReady;
        private final boolean onMinimized;
        private final boolean onTransact;
        private final boolean onWarmupCompleted;
        private final IAuthTabCallback readTypedObject;
        private final int writeTypedObject;

        public static ImmutableList<onWarmupCompleted> IAuthTabCallback(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, IAuthTabCallback iAuthTabCallback, int[] iArr, boolean z, Predicate<BasicTextContextMenuProviderKtExternalSyntheticLambda4> predicate, int i3) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i4 = 0; i4 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.onWarmupCompleted; i4++) {
                builder.add(new onWarmupCompleted(i2, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, i4, iAuthTabCallback, iArr[i4], z, predicate, i3));
            }
            return builder.build();
        }

        public onWarmupCompleted(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int i3, IAuthTabCallback iAuthTabCallback, int i4, boolean z, Predicate<BasicTextContextMenuProviderKtExternalSyntheticLambda4> predicate, int i5) {
            int i6;
            int iOnExtraCallback;
            int iOnExtraCallback2;
            super(i2, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, i3);
            this.readTypedObject = iAuthTabCallback;
            int i7 = iAuthTabCallback.newSession ? 24 : 16;
            this.onWarmupCompleted = iAuthTabCallback.prefetch && (i5 & i7) != 0;
            this.access000 = ChipKtExternalSyntheticLambda2.onNavigationEvent(this.IAuthTabCallback.onActivityLayout);
            this.access100 = RendererCapabilities.onExtraCallback(i4, false);
            int i8 = 0;
            while (true) {
                i6 = Integer.MAX_VALUE;
                if (i8 >= ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onMinimized.size()) {
                    iOnExtraCallback = 0;
                    i8 = Integer.MAX_VALUE;
                    break;
                } else {
                    iOnExtraCallback = ChipKtExternalSyntheticLambda2.onExtraCallback(this.IAuthTabCallback, (String) ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onMinimized.get(i8), false);
                    if (iOnExtraCallback > 0) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.writeTypedObject = i8;
            this.extraCallback = iOnExtraCallback;
            this.ICustomTabsCallback = ChipKtExternalSyntheticLambda2.onExtraCallback(this.IAuthTabCallback.mayLaunchUrl, ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onActivityLayout);
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4 = this.IAuthTabCallback;
            int i9 = basicTextContextMenuProviderKtExternalSyntheticLambda4.mayLaunchUrl;
            this.asInterface = i9 == 0 || (i9 & 1) != 0;
            this.IAuthTabCallbackStub = (basicTextContextMenuProviderKtExternalSyntheticLambda4.newAuthTabSession & 1) != 0;
            this.onTransact = ChipKtExternalSyntheticLambda2.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4);
            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda42 = this.IAuthTabCallback;
            int i10 = basicTextContextMenuProviderKtExternalSyntheticLambda42.onNavigationEvent;
            this.IAuthTabCallbackDefault = i10;
            this.onMessageChannelReady = basicTextContextMenuProviderKtExternalSyntheticLambda42.prefetch;
            int i11 = basicTextContextMenuProviderKtExternalSyntheticLambda42.onExtraCallback;
            this.asBinder = i11;
            this.getInterfaceDescriptor = (i11 == -1 || i11 <= ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).asBinder) && (i10 == -1 || i10 <= ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).access100) && predicate.apply(basicTextContextMenuProviderKtExternalSyntheticLambda42);
            String[] strArrOnNavigationEvent = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent();
            int i12 = 0;
            while (true) {
                if (i12 >= strArrOnNavigationEvent.length) {
                    iOnExtraCallback2 = 0;
                    i12 = Integer.MAX_VALUE;
                    break;
                } else {
                    iOnExtraCallback2 = ChipKtExternalSyntheticLambda2.onExtraCallback(this.IAuthTabCallback, strArrOnNavigationEvent[i12], false);
                    if (iOnExtraCallback2 > 0) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.IAuthTabCallbackStubProxy = i12;
            this.IAuthTabCallback_Parcel = iOnExtraCallback2;
            int i13 = 0;
            while (true) {
                if (i13 < ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onActivityResized.size()) {
                    String str = this.IAuthTabCallback.isEngagementSignalsApiAvailable;
                    if (str != null && str.equals(((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onActivityResized.get(i13))) {
                        i6 = i13;
                        break;
                    }
                    i13++;
                } else {
                    break;
                }
            }
            this.extraCallbackWithResult = i6;
            this.onActivityResized = RendererCapabilities.onExtraCallback(i4) == 128;
            this.onMinimized = RendererCapabilities.asBinder(i4) == 64;
            this.onActivityLayout = onExtraCallbackWithResult(i4, z, i7);
        }

        @Override // o.ChipKtExternalSyntheticLambda2.IAuthTabCallbackStub
        public int IAuthTabCallback() {
            return this.onActivityLayout;
        }

        @Override // o.ChipKtExternalSyntheticLambda2.IAuthTabCallbackStub
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public boolean onExtraCallback(onWarmupCompleted onwarmupcompleted) {
            int i2;
            String str;
            int i3;
            if (!this.readTypedObject.newAuthTabSession && ((i3 = this.IAuthTabCallback.onNavigationEvent) == -1 || i3 != onwarmupcompleted.IAuthTabCallback.onNavigationEvent)) {
                return false;
            }
            if (!this.onWarmupCompleted && ((str = this.IAuthTabCallback.isEngagementSignalsApiAvailable) == null || !TextUtils.equals(str, onwarmupcompleted.IAuthTabCallback.isEngagementSignalsApiAvailable))) {
                return false;
            }
            IAuthTabCallback iAuthTabCallback = this.readTypedObject;
            if (!iAuthTabCallback.postMessage && ((i2 = this.IAuthTabCallback.prefetch) == -1 || i2 != onwarmupcompleted.IAuthTabCallback.prefetch)) {
                return false;
            }
            if (iAuthTabCallback.newSessionWithExtras) {
                return true;
            }
            return this.onActivityResized == onwarmupcompleted.onActivityResized && this.onMinimized == onwarmupcompleted.onMinimized;
        }

        @Override // java.lang.Comparable
        /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
        public int compareTo(onWarmupCompleted onwarmupcompleted) {
            Ordering orderingReverse = (this.getInterfaceDescriptor && this.access100) ? ChipKtExternalSyntheticLambda2.onExtraCallbackWithResult : ChipKtExternalSyntheticLambda2.onExtraCallbackWithResult.reverse();
            ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.access100, onwarmupcompleted.access100).compare(Integer.valueOf(this.writeTypedObject), Integer.valueOf(onwarmupcompleted.writeTypedObject), Ordering.natural().reverse()).compare(this.extraCallback, onwarmupcompleted.extraCallback).compare(this.ICustomTabsCallback, onwarmupcompleted.ICustomTabsCallback).compareFalseFirst(this.IAuthTabCallbackStub, onwarmupcompleted.IAuthTabCallbackStub).compareFalseFirst(this.asInterface, onwarmupcompleted.asInterface).compare(Integer.valueOf(this.IAuthTabCallbackStubProxy), Integer.valueOf(onwarmupcompleted.IAuthTabCallbackStubProxy), Ordering.natural().reverse()).compare(this.IAuthTabCallback_Parcel, onwarmupcompleted.IAuthTabCallback_Parcel).compareFalseFirst(this.getInterfaceDescriptor, onwarmupcompleted.getInterfaceDescriptor).compare(Integer.valueOf(this.extraCallbackWithResult), Integer.valueOf(onwarmupcompleted.extraCallbackWithResult), Ordering.natural().reverse());
            if (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) this.readTypedObject).IAuthTabCallbackDefault) {
                comparisonChainCompare = comparisonChainCompare.compare(Integer.valueOf(this.asBinder), Integer.valueOf(onwarmupcompleted.asBinder), ChipKtExternalSyntheticLambda2.onExtraCallbackWithResult.reverse());
            }
            ComparisonChain comparisonChainCompare2 = comparisonChainCompare.compareFalseFirst(this.onActivityResized, onwarmupcompleted.onActivityResized).compareFalseFirst(this.onMinimized, onwarmupcompleted.onMinimized).compareFalseFirst(this.onTransact, onwarmupcompleted.onTransact).compare(Integer.valueOf(this.IAuthTabCallbackDefault), Integer.valueOf(onwarmupcompleted.IAuthTabCallbackDefault), orderingReverse).compare(Integer.valueOf(this.onMessageChannelReady), Integer.valueOf(onwarmupcompleted.onMessageChannelReady), orderingReverse);
            if (Objects.equals(this.access000, onwarmupcompleted.access000)) {
                comparisonChainCompare2 = comparisonChainCompare2.compare(Integer.valueOf(this.asBinder), Integer.valueOf(onwarmupcompleted.asBinder), orderingReverse);
            }
            return comparisonChainCompare2.result();
        }

        private int onExtraCallbackWithResult(int i2, boolean z, int i3) {
            if (!RendererCapabilities.onExtraCallback(i2, this.readTypedObject.ICustomTabsServiceDefault)) {
                return 0;
            }
            if (!this.getInterfaceDescriptor && !this.readTypedObject.updateVisuals) {
                return 0;
            }
            IAuthTabCallback iAuthTabCallback = this.readTypedObject;
            if (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onExtraCallback.onWarmupCompleted == 2 && !ChipKtExternalSyntheticLambda2.onExtraCallback(iAuthTabCallback, i2, this.IAuthTabCallback)) {
                return 0;
            }
            if (!RendererCapabilities.onExtraCallback(i2, false) || !this.getInterfaceDescriptor || this.IAuthTabCallback.onExtraCallback == -1) {
                return 1;
            }
            IAuthTabCallback iAuthTabCallback2 = this.readTypedObject;
            if (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback2).onWarmupCompleted || ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback2).IAuthTabCallbackDefault) {
                return 1;
            }
            return ((!iAuthTabCallback2.receiveFile && z) || ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback2).onExtraCallback.onWarmupCompleted == 2 || (i2 & i3) == 0) ? 1 : 2;
        }

        public static int onNavigationEvent(List<onWarmupCompleted> list, List<onWarmupCompleted> list2) {
            return ((onWarmupCompleted) Collections.max(list)).compareTo((onWarmupCompleted) Collections.max(list2));
        }
    }

    public static final class asInterface extends IAuthTabCallbackStub<asInterface> implements Comparable<asInterface> {
        private final int IAuthTabCallbackDefault;
        private final int IAuthTabCallbackStub;
        private final int IAuthTabCallbackStubProxy;
        private final int access100;
        private final boolean asBinder;
        private final boolean asInterface;
        private final int getInterfaceDescriptor;
        private final boolean onTransact;
        private final boolean onWarmupCompleted;

        @Override // o.ChipKtExternalSyntheticLambda2.IAuthTabCallbackStub
        public boolean onExtraCallback(asInterface asinterface) {
            return false;
        }

        public static ImmutableList<asInterface> IAuthTabCallback(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, IAuthTabCallback iAuthTabCallback, int[] iArr, @Nullable String str, @Nullable String str2) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i3 = 0; i3 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.onWarmupCompleted; i3++) {
                builder.add(new asInterface(i2, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, i3, iAuthTabCallback, iArr[i3], str, str2));
            }
            return builder.build();
        }

        public asInterface(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int i3, IAuthTabCallback iAuthTabCallback, int i4, @Nullable String str, @Nullable String str2) {
            ImmutableList immutableListOf;
            int iOnExtraCallback;
            super(i2, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, i3);
            int i5 = 0;
            this.asInterface = RendererCapabilities.onExtraCallback(i4, false);
            int i6 = this.IAuthTabCallback.newAuthTabSession & (~((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).asInterface);
            this.onTransact = (i6 & 1) != 0;
            this.asBinder = (i6 & 2) != 0;
            if (str2 != null) {
                immutableListOf = ImmutableList.of(str2);
            } else if (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onMessageChannelReady.isEmpty()) {
                immutableListOf = ImmutableList.of("");
            } else {
                immutableListOf = ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onMessageChannelReady;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= immutableListOf.size()) {
                    i7 = Integer.MAX_VALUE;
                    iOnExtraCallback = 0;
                    break;
                } else {
                    iOnExtraCallback = ChipKtExternalSyntheticLambda2.onExtraCallback(this.IAuthTabCallback, (String) immutableListOf.get(i7), ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).ICustomTabsCallbackStub);
                    if (iOnExtraCallback > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.IAuthTabCallbackStub = i7;
            this.IAuthTabCallbackDefault = iOnExtraCallback;
            int iOnExtraCallback2 = ChipKtExternalSyntheticLambda2.onExtraCallback(this.IAuthTabCallback.mayLaunchUrl, str2 != null ? 1088 : ((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onPostMessage);
            this.access100 = iOnExtraCallback2;
            this.onWarmupCompleted = (1088 & this.IAuthTabCallback.mayLaunchUrl) != 0;
            int iOnExtraCallback3 = ChipKtExternalSyntheticLambda2.onExtraCallback(this.IAuthTabCallback, str, ChipKtExternalSyntheticLambda2.onNavigationEvent(str) == null);
            this.IAuthTabCallbackStubProxy = iOnExtraCallback3;
            boolean z = iOnExtraCallback > 0 || (((CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda3) iAuthTabCallback).onMessageChannelReady.isEmpty() && iOnExtraCallback2 > 0) || this.onTransact || (this.asBinder && iOnExtraCallback3 > 0);
            if (RendererCapabilities.onExtraCallback(i4, iAuthTabCallback.ICustomTabsServiceDefault) && z) {
                i5 = 1;
            }
            this.getInterfaceDescriptor = i5;
        }

        @Override // o.ChipKtExternalSyntheticLambda2.IAuthTabCallbackStub
        public int IAuthTabCallback() {
            return this.getInterfaceDescriptor;
        }

        @Override // java.lang.Comparable
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public int compareTo(asInterface asinterface) {
            ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.asInterface, asinterface.asInterface).compare(Integer.valueOf(this.IAuthTabCallbackStub), Integer.valueOf(asinterface.IAuthTabCallbackStub), Ordering.natural().reverse()).compare(this.IAuthTabCallbackDefault, asinterface.IAuthTabCallbackDefault).compare(this.access100, asinterface.access100).compareFalseFirst(this.onTransact, asinterface.onTransact).compare(Boolean.valueOf(this.asBinder), Boolean.valueOf(asinterface.asBinder), this.IAuthTabCallbackDefault == 0 ? Ordering.natural() : Ordering.natural().reverse()).compare(this.IAuthTabCallbackStubProxy, asinterface.IAuthTabCallbackStubProxy);
            if (this.access100 == 0) {
                comparisonChainCompare = comparisonChainCompare.compareTrueFirst(this.onWarmupCompleted, asinterface.onWarmupCompleted);
            }
            return comparisonChainCompare.result();
        }

        public static int onNavigationEvent(List<asInterface> list, List<asInterface> list2) {
            return list.get(0).compareTo(list2.get(0));
        }
    }

    public static final class onNavigationEvent extends IAuthTabCallbackStub<onNavigationEvent> implements Comparable<onNavigationEvent> {
        private final int IAuthTabCallbackStub;
        private final int onWarmupCompleted;

        @Override // o.ChipKtExternalSyntheticLambda2.IAuthTabCallbackStub
        /* renamed from: onNavigationEvent, reason: merged with bridge method [inline-methods] */
        public boolean onExtraCallback(onNavigationEvent onnavigationevent) {
            return false;
        }

        public static ImmutableList<onNavigationEvent> onExtraCallback(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, IAuthTabCallback iAuthTabCallback, int[] iArr) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i3 = 0; i3 < coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1.onWarmupCompleted; i3++) {
                builder.add(new onNavigationEvent(i2, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, i3, iAuthTabCallback, iArr[i3]));
            }
            return builder.build();
        }

        public onNavigationEvent(int i2, CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda1 coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, int i3, IAuthTabCallback iAuthTabCallback, int i4) {
            super(i2, coreTextFieldSemanticsModifierNodeExternalSyntheticLambda1, i3);
            this.IAuthTabCallbackStub = RendererCapabilities.onExtraCallback(i4, iAuthTabCallback.ICustomTabsServiceDefault) ? 1 : 0;
            this.onWarmupCompleted = this.IAuthTabCallback.onNavigationEvent();
        }

        @Override // o.ChipKtExternalSyntheticLambda2.IAuthTabCallbackStub
        public int IAuthTabCallback() {
            return this.IAuthTabCallbackStub;
        }

        @Override // java.lang.Comparable
        /* renamed from: onWarmupCompleted, reason: merged with bridge method [inline-methods] */
        public int compareTo(onNavigationEvent onnavigationevent) {
            return Integer.compare(this.onWarmupCompleted, onnavigationevent.onWarmupCompleted);
        }

        public static int onWarmupCompleted(List<onNavigationEvent> list, List<onNavigationEvent> list2) {
            return list.get(0).compareTo(list2.get(0));
        }
    }

    static final class onExtraCallback implements Comparable<onExtraCallback> {
        private final boolean onNavigationEvent;
        private final boolean onWarmupCompleted;

        public onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, int i2) {
            this.onNavigationEvent = (basicTextContextMenuProviderKtExternalSyntheticLambda4.newAuthTabSession & 1) != 0;
            this.onWarmupCompleted = RendererCapabilities.onExtraCallback(i2, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: onExtraCallbackWithResult, reason: merged with bridge method [inline-methods] */
        public int compareTo(onExtraCallback onextracallback) {
            return ComparisonChain.start().compareFalseFirst(this.onWarmupCompleted, onextracallback.onWarmupCompleted).compareFalseFirst(this.onNavigationEvent, onextracallback.onNavigationEvent).result();
        }
    }

    static class onTransact {
        private final Handler onExtraCallback;
        private final boolean onExtraCallbackWithResult;
        private final Spatializer onNavigationEvent;
        private final Spatializer.OnSpatializerStateChangedListener onWarmupCompleted;

        public onTransact(@Nullable Context context, final ChipKtExternalSyntheticLambda2 chipKtExternalSyntheticLambda2, @Nullable Boolean bool) {
            AudioManager audioManagerOnNavigationEvent = context == null ? null : CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7.onNavigationEvent(context);
            if (audioManagerOnNavigationEvent == null || (bool != null && bool.booleanValue())) {
                this.onNavigationEvent = null;
                this.onExtraCallbackWithResult = false;
                this.onExtraCallback = null;
                this.onWarmupCompleted = null;
                return;
            }
            Spatializer spatializer = audioManagerOnNavigationEvent.getSpatializer();
            this.onNavigationEvent = spatializer;
            this.onExtraCallbackWithResult = spatializer.getImmersiveAudioLevel() != 0;
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = new Spatializer.OnSpatializerStateChangedListener() { // from class: o.ChipKtExternalSyntheticLambda2.onTransact.1
                @Override // android.media.Spatializer.OnSpatializerStateChangedListener
                public void onSpatializerEnabledChanged(Spatializer spatializer2, boolean z) {
                    chipKtExternalSyntheticLambda2.asBinder();
                }

                @Override // android.media.Spatializer.OnSpatializerStateChangedListener
                public void onSpatializerAvailableChanged(Spatializer spatializer2, boolean z) {
                    chipKtExternalSyntheticLambda2.asBinder();
                }
            };
            this.onWarmupCompleted = onSpatializerStateChangedListener;
            Handler handler = new Handler((Looper) RecordingInputConnection_androidKt.onWarmupCompleted(Looper.myLooper()));
            this.onExtraCallback = handler;
            spatializer.addOnSpatializerStateChangedListener(new CustomTabsClient$2$.ExternalSyntheticLambda3(handler), onSpatializerStateChangedListener);
        }

        public boolean onWarmupCompleted() {
            return this.onExtraCallbackWithResult;
        }

        public boolean IAuthTabCallback() {
            return ChipKtExternalSyntheticLambda7.ok_(RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)).isAvailable();
        }

        public boolean onNavigationEvent() {
            return ChipKtExternalSyntheticLambda7.ok_(RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)).isEnabled();
        }

        public boolean onWarmupCompleted(TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) throws IllegalArgumentException {
            int i2;
            if (Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "audio/eac3-joc")) {
                i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent;
                if (i2 == 16) {
                    i2 = 12;
                }
            } else if (Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "audio/iamf")) {
                i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent;
                if (i2 == -1) {
                    i2 = 6;
                }
            } else if (Objects.equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, "audio/ac4")) {
                i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent;
                if (i2 == 18 || i2 == 21) {
                    i2 = 24;
                }
            } else {
                i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent;
            }
            int iOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(i2);
            if (iOnExtraCallback == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iOnExtraCallback);
            int i3 = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch;
            if (i3 != -1) {
                channelMask.setSampleRate(i3);
            }
            return ChipKtExternalSyntheticLambda7.ok_(RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent)).canBeSpatialized(textContextMenuHelperApi28ExternalSyntheticLambda5.onNavigationEvent().onNavigationEvent, channelMask.build());
        }

        public void onExtraCallback() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener;
            Spatializer spatializer = this.onNavigationEvent;
            if (spatializer == null || (onSpatializerStateChangedListener = this.onWarmupCompleted) == null || this.onExtraCallback == null) {
                return;
            }
            spatializer.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            this.onExtraCallback.removeCallbacksAndMessages(null);
        }
    }
}
