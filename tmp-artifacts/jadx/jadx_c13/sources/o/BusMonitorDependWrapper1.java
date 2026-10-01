package o;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;
import java.security.InvalidParameterException;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import no.nordicsemi.android.ble.BleManagerHandler$;
import no.nordicsemi.android.ble.BleManagerHandler$1$;
import no.nordicsemi.android.ble.BleManagerHandler$2$;
import no.nordicsemi.android.ble.BleManagerHandler$3$;
import no.nordicsemi.android.ble.ReliableWriteRequest;
import no.nordicsemi.android.ble.Request;
import no.nordicsemi.android.ble.RequestHandler;
import no.nordicsemi.android.ble.RequestQueue;
import o.BusMonitorDependWrapper1;
import o.CustomEventInterstitialListener;
import o.IABLandingPageActivity21;
import o.IABLandingPageActivity4;
import o.InitConfig;
import o.getICacheDir;
import o.getOptions;
import o.getReflectContext;
import o.hasSecondOptions;
import o.onInterstitialClicked;
import o.onInterstitialDismissed;
import o.onMonitorUpload;
import o.onSuggestionSubmit;
import okhttp3.internal.url._UrlKt;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public abstract class BusMonitorDependWrapper1 extends RequestHandler {
    private BluetoothGatt IAuthTabCallbackDefault;
    private getAdxId IAuthTabCallback_Parcel;
    private boolean ICustomTabsCallback;
    private boolean ICustomTabsCallbackDefault;
    private int ICustomTabsCallbackStub;
    private getReflectContext ICustomTabsCallbackStubProxy;
    private RequestQueue ICustomTabsCallback_Parcel;
    private Deque<Pair<Object, byte[]>> ICustomTabsService;
    private long access000;
    private Map<BluetoothGattCharacteristic, byte[]> asBinder;
    private CustomEventInterstitialListener asInterface;
    private Handler extraCallbackWithResult;
    private boolean extraCommand;
    private boolean isEngagementSignalsApiAvailable;
    private Request mayLaunchUrl;
    private boolean newAuthTabSession;
    private boolean newSession;
    private int newSessionWithExtras;
    private int onActivityLayout;
    private Deque<Request> onActivityResized;
    private getOnceLogInterval<?> onExtraCallback;

    @Deprecated
    private getOptions onExtraCallbackWithResult;
    private boolean onMessageChannelReady;
    private int onMinimized;
    private BluetoothDevice onNavigationEvent;
    private boolean onPostMessage;
    private boolean onTransact;
    private getDiskCacheDirPath postMessage;
    private Map<BluetoothGattDescriptor, byte[]> readTypedObject;
    private boolean setEngagementSignalsCallback;
    private final Object IAuthTabCallback = new Object();
    private final Deque<Request> prefetch = new LinkedBlockingDeque();
    private int IAuthTabCallbackStubProxy = 0;
    private int getInterfaceDescriptor = 0;
    private boolean access100 = false;
    private int onRelationshipValidationResult = 23;

    @Deprecated
    private int onWarmupCompleted = -1;
    private final HashMap<Object, getOptions> requestPostMessageChannelWithExtras = new HashMap<>();
    private final HashMap<Object, getLayoutParams> writeTypedObject = new HashMap<>();
    private final BroadcastReceiver IAuthTabCallbackStub = new BroadcastReceiver() { // from class: o.BusMonitorDependWrapper1.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 10);
            BusMonitorDependWrapper1.this.IAuthTabCallback(3, (onExtraCallback) new BleManagerHandler$1$.ExternalSyntheticLambda0(this, intExtra));
            if (intExtra == 10 || intExtra == 13) {
                if (intExtra2 != 13 && intExtra2 != 10) {
                    BusMonitorDependWrapper1.this.ICustomTabsCallbackDefault = true;
                    BusMonitorDependWrapper1.this.prefetch.clear();
                    BusMonitorDependWrapper1.this.onActivityResized = null;
                    boolean z = BusMonitorDependWrapper1.this.onTransact;
                    BusMonitorDependWrapper1.this.onTransact = false;
                    BusMonitorDependWrapper1.this.isEngagementSignalsApiAvailable = false;
                    BusMonitorDependWrapper1.this.getInterfaceDescriptor = 0;
                    BluetoothDevice bluetoothDevice = BusMonitorDependWrapper1.this.onNavigationEvent;
                    if (bluetoothDevice != null) {
                        if (BusMonitorDependWrapper1.this.mayLaunchUrl != null && BusMonitorDependWrapper1.this.mayLaunchUrl.extraCallback != Request.Type.DISCONNECT) {
                            BusMonitorDependWrapper1.this.mayLaunchUrl.onExtraCallbackWithResult(bluetoothDevice, -100);
                            BusMonitorDependWrapper1.this.mayLaunchUrl = null;
                        }
                        if (BusMonitorDependWrapper1.this.onExtraCallback != null) {
                            BusMonitorDependWrapper1.this.onExtraCallback.onExtraCallbackWithResult(bluetoothDevice, -100);
                            BusMonitorDependWrapper1.this.onExtraCallback = null;
                        }
                        if (BusMonitorDependWrapper1.this.asInterface != null) {
                            BusMonitorDependWrapper1.this.asInterface.onExtraCallbackWithResult(bluetoothDevice, -100);
                            BusMonitorDependWrapper1.this.asInterface = null;
                        }
                    }
                    BusMonitorDependWrapper1.this.setEngagementSignalsCallback = true;
                    BusMonitorDependWrapper1.this.ICustomTabsCallbackDefault = false;
                    if (bluetoothDevice != null) {
                        BusMonitorDependWrapper1.this.onTransact = z;
                        BusMonitorDependWrapper1.this.onWarmupCompleted(bluetoothDevice, 1);
                        return;
                    }
                    return;
                }
                BusMonitorDependWrapper1.this.IPostMessageService_Parcel();
            }
        }

        public static /* synthetic */ String onExtraCallback(AnonymousClass5 anonymousClass5, int i) {
            return "[Broadcast] Action received: android.bluetooth.adapter.action.STATE_CHANGED, state changed to " + anonymousClass5.onExtraCallback(i);
        }

        private String onExtraCallback(int i) {
            switch (i) {
                case 10:
                    return "OFF";
                case 11:
                    return "TURNING ON";
                case 12:
                    return "ON";
                case 13:
                    return "TURNING OFF";
                default:
                    return "UNKNOWN (" + i + ")";
            }
        }
    };
    private final BroadcastReceiver onUnminimized = new BroadcastReceiver() { // from class: o.BusMonitorDependWrapper1.4
        public static /* synthetic */ void IAuthTabCallback(BluetoothDevice bluetoothDevice, onMonitorUpload onmonitorupload) {
        }

        public static /* synthetic */ void onExtraCallback(BluetoothDevice bluetoothDevice, onMonitorUpload onmonitorupload) {
        }

        public static /* synthetic */ void onExtraCallbackWithResult(BluetoothDevice bluetoothDevice, TTUnifyWebActivity tTUnifyWebActivity) {
        }

        public static /* synthetic */ void onNavigationEvent(BluetoothDevice bluetoothDevice, TTUnifyWebActivity tTUnifyWebActivity) {
        }

        public static /* synthetic */ void onWarmupCompleted(BluetoothDevice bluetoothDevice, TTUnifyWebActivity tTUnifyWebActivity) {
        }

        public static /* synthetic */ void onWarmupCompleted(BluetoothDevice bluetoothDevice, onMonitorUpload onmonitorupload) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
            int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
            if (BusMonitorDependWrapper1.this.onNavigationEvent == null || bluetoothDevice == null || !bluetoothDevice.getAddress().equals(BusMonitorDependWrapper1.this.onNavigationEvent.getAddress())) {
                return;
            }
            BusMonitorDependWrapper1.this.IAuthTabCallback(3, (onExtraCallback) new BleManagerHandler$2$.ExternalSyntheticLambda0(intExtra));
            switch (intExtra) {
                case 10:
                    if (intExtra2 != 11) {
                        if (intExtra2 == 12) {
                            BusMonitorDependWrapper1.this.setEngagementSignalsCallback = true;
                            if (BusMonitorDependWrapper1.this.mayLaunchUrl != null && BusMonitorDependWrapper1.this.mayLaunchUrl.extraCallback == Request.Type.REMOVE_BOND) {
                                BusMonitorDependWrapper1.this.IAuthTabCallback(4, (onExtraCallback) new BleManagerHandler$2$.ExternalSyntheticLambda7());
                                BusMonitorDependWrapper1.this.mayLaunchUrl.onNavigationEvent(bluetoothDevice);
                                BusMonitorDependWrapper1.this.mayLaunchUrl = null;
                            }
                            if (!BusMonitorDependWrapper1.this.areNotificationsEnabled()) {
                                BusMonitorDependWrapper1.this.IPostMessageService_Parcel();
                                break;
                            }
                        }
                    } else {
                        BusMonitorDependWrapper1.this.onExtraCallback((onNavigationEvent) new BleManagerHandler$2$.ExternalSyntheticLambda3(bluetoothDevice));
                        BusMonitorDependWrapper1.this.onExtraCallback((onWarmupCompleted) new BleManagerHandler$2$.ExternalSyntheticLambda4(bluetoothDevice));
                        BusMonitorDependWrapper1.this.IAuthTabCallback(5, (onExtraCallback) new BleManagerHandler$2$.ExternalSyntheticLambda5());
                        if (BusMonitorDependWrapper1.this.mayLaunchUrl != null && BusMonitorDependWrapper1.this.mayLaunchUrl.extraCallback == Request.Type.CREATE_BOND) {
                            BusMonitorDependWrapper1.this.mayLaunchUrl.onExtraCallbackWithResult(bluetoothDevice, -4);
                            BusMonitorDependWrapper1.this.mayLaunchUrl = null;
                        }
                        if (!BusMonitorDependWrapper1.this.newSession && !BusMonitorDependWrapper1.this.newAuthTabSession) {
                            BusMonitorDependWrapper1.this.onExtraCallbackWithResult((Runnable) new BleManagerHandler$2$.ExternalSyntheticLambda6(this));
                            return;
                        }
                    }
                    break;
                case 11:
                    BusMonitorDependWrapper1.this.onExtraCallback((onNavigationEvent) new BleManagerHandler$2$.ExternalSyntheticLambda8(bluetoothDevice));
                    BusMonitorDependWrapper1.this.onExtraCallback((onWarmupCompleted) new BleManagerHandler$2$.ExternalSyntheticLambda9(bluetoothDevice));
                    return;
                case 12:
                    BusMonitorDependWrapper1.this.IAuthTabCallback(4, (onExtraCallback) new BleManagerHandler$2$.ExternalSyntheticLambda10());
                    BusMonitorDependWrapper1.this.onExtraCallback((onNavigationEvent) new BleManagerHandler$2$.ExternalSyntheticLambda11(bluetoothDevice));
                    BusMonitorDependWrapper1.this.onExtraCallback((onWarmupCompleted) new BleManagerHandler$2$.ExternalSyntheticLambda1(bluetoothDevice));
                    if (BusMonitorDependWrapper1.this.mayLaunchUrl == null || BusMonitorDependWrapper1.this.mayLaunchUrl.extraCallback != Request.Type.CREATE_BOND) {
                        if (!BusMonitorDependWrapper1.this.newSession && !BusMonitorDependWrapper1.this.newAuthTabSession) {
                            BusMonitorDependWrapper1.this.onExtraCallbackWithResult((Runnable) new BleManagerHandler$2$.ExternalSyntheticLambda2(this));
                            return;
                        } else if (Build.VERSION.SDK_INT < 26 && BusMonitorDependWrapper1.this.mayLaunchUrl != null) {
                            BusMonitorDependWrapper1 busMonitorDependWrapper1 = BusMonitorDependWrapper1.this;
                            busMonitorDependWrapper1.IAuthTabCallback(busMonitorDependWrapper1.mayLaunchUrl);
                            break;
                        } else {
                            return;
                        }
                    } else {
                        BusMonitorDependWrapper1.this.mayLaunchUrl.onNavigationEvent(bluetoothDevice);
                        BusMonitorDependWrapper1.this.mayLaunchUrl = null;
                        break;
                    }
                    break;
            }
            BusMonitorDependWrapper1.this.onExtraCallback(true);
        }

        public static /* synthetic */ String IAuthTabCallback(int i) {
            return "[Broadcast] Action received: android.bluetooth.device.action.BOND_STATE_CHANGED, bond state changed to: " + IABLandingPageActivity4.onExtraCallback(i) + " (" + i + ")";
        }

        public static /* synthetic */ String onWarmupCompleted() {
            return "Bonding failed";
        }

        public static /* synthetic */ void onExtraCallbackWithResult(AnonymousClass4 anonymousClass4) {
            BluetoothGatt bluetoothGatt = BusMonitorDependWrapper1.this.IAuthTabCallbackDefault;
            if (BusMonitorDependWrapper1.this.newSession || BusMonitorDependWrapper1.this.newAuthTabSession || bluetoothGatt == null) {
                return;
            }
            BusMonitorDependWrapper1.this.newAuthTabSession = true;
            BusMonitorDependWrapper1.this.IAuthTabCallback(2, (onExtraCallback) new BleManagerHandler$2$.ExternalSyntheticLambda14());
            BusMonitorDependWrapper1.this.IAuthTabCallback(3, (onExtraCallback) new BleManagerHandler$2$.ExternalSyntheticLambda15());
            bluetoothGatt.discoverServices();
        }

        public static /* synthetic */ String onExtraCallbackWithResult() {
            return "Discovering services...";
        }

        public static /* synthetic */ String IAuthTabCallbackDefault() {
            return "gatt.discoverServices()";
        }

        public static /* synthetic */ String onExtraCallback() {
            return "Bond information removed";
        }

        public static /* synthetic */ String asInterface() {
            return "Device bonded";
        }

        public static /* synthetic */ void onNavigationEvent(AnonymousClass4 anonymousClass4) {
            BluetoothGatt bluetoothGatt = BusMonitorDependWrapper1.this.IAuthTabCallbackDefault;
            if (BusMonitorDependWrapper1.this.newSession || BusMonitorDependWrapper1.this.newAuthTabSession || bluetoothGatt == null) {
                return;
            }
            BusMonitorDependWrapper1.this.newAuthTabSession = true;
            BusMonitorDependWrapper1.this.IAuthTabCallback(2, (onExtraCallback) new BleManagerHandler$2$.ExternalSyntheticLambda12());
            BusMonitorDependWrapper1.this.IAuthTabCallback(3, (onExtraCallback) new BleManagerHandler$2$.ExternalSyntheticLambda13());
            bluetoothGatt.discoverServices();
        }

        public static /* synthetic */ String onNavigationEvent() {
            return "Discovering services...";
        }

        public static /* synthetic */ String IAuthTabCallback() {
            return "gatt.discoverServices()";
        }
    };
    private final BluetoothGattCallback extraCallback = new BluetoothGattCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$3
        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(@NonNull BluetoothGatt bluetoothGatt, int i, int i2) {
            this.onWarmupCompleted.IAuthTabCallback(3, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda46(i, i2));
            int interfaceDescriptor = 4;
            if (i != 0 || i2 != 2) {
                if (i2 == 0) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    boolean z = this.onWarmupCompleted.access000 > 0;
                    boolean z2 = z && jElapsedRealtime > this.onWarmupCompleted.access000 + 20000;
                    if (i != 0) {
                        this.onWarmupCompleted.IAuthTabCallback(5, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda57(i));
                    }
                    if (i == 0 || !z || z2 || this.onWarmupCompleted.asInterface == null || !this.onWarmupCompleted.asInterface.onWarmupCompleted()) {
                        if (this.onWarmupCompleted.asInterface == null || !this.onWarmupCompleted.asInterface.asInterface() || !this.onWarmupCompleted.onPostMessage || bluetoothGatt.getDevice().getBondState() != 12) {
                            this.onWarmupCompleted.ICustomTabsCallbackDefault = true;
                            this.onWarmupCompleted.prefetch.clear();
                            this.onWarmupCompleted.onActivityResized = null;
                            this.onWarmupCompleted.isEngagementSignalsApiAvailable = false;
                            boolean z3 = this.onWarmupCompleted.onTransact;
                            boolean z4 = this.onWarmupCompleted.ICustomTabsCallback;
                            BusMonitorDependWrapper1 busMonitorDependWrapper1 = this.onWarmupCompleted;
                            BluetoothDevice device = bluetoothGatt.getDevice();
                            if (z2) {
                                interfaceDescriptor = 10;
                            } else if (!z4) {
                                interfaceDescriptor = this.onWarmupCompleted.getInterfaceDescriptor(i);
                            }
                            busMonitorDependWrapper1.onWarmupCompleted(device, interfaceDescriptor);
                            int i3 = -1;
                            if (this.onWarmupCompleted.mayLaunchUrl != null && this.onWarmupCompleted.mayLaunchUrl.extraCallback != Request.Type.DISCONNECT && this.onWarmupCompleted.mayLaunchUrl.extraCallback != Request.Type.REMOVE_BOND) {
                                this.onWarmupCompleted.mayLaunchUrl.onExtraCallbackWithResult(bluetoothGatt.getDevice(), i == 0 ? -1 : i);
                                this.onWarmupCompleted.mayLaunchUrl = null;
                            }
                            if (this.onWarmupCompleted.onExtraCallback != null) {
                                this.onWarmupCompleted.onExtraCallback.onExtraCallbackWithResult(bluetoothGatt.getDevice(), -1);
                                this.onWarmupCompleted.onExtraCallback = null;
                            }
                            if (this.onWarmupCompleted.asInterface != null) {
                                if (z4) {
                                    i3 = -2;
                                } else if (i != 0) {
                                    i3 = (i == 133 && z2) ? -5 : i;
                                }
                                this.onWarmupCompleted.asInterface.onExtraCallbackWithResult(bluetoothGatt.getDevice(), i3);
                                this.onWarmupCompleted.asInterface = null;
                            }
                            this.onWarmupCompleted.ICustomTabsCallbackDefault = false;
                            if (!z3 || !this.onWarmupCompleted.onPostMessage) {
                                this.onWarmupCompleted.onPostMessage = false;
                                this.onWarmupCompleted.onExtraCallback(false);
                            } else {
                                this.onWarmupCompleted.onWarmupCompleted(bluetoothGatt.getDevice(), (CustomEventInterstitialListener) null);
                            }
                            if (z3 || i == 0) {
                                return;
                            }
                        } else {
                            this.onWarmupCompleted.IAuthTabCallback(3, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda47());
                            this.onWarmupCompleted.onExtraCallbackWithResult((Runnable) new BleManagerHandler$3$.ExternalSyntheticLambda48(this, bluetoothGatt));
                            return;
                        }
                    } else {
                        int iOnExtraCallbackWithResult = this.onWarmupCompleted.asInterface.onExtraCallbackWithResult();
                        if (iOnExtraCallbackWithResult > 0) {
                            this.onWarmupCompleted.IAuthTabCallback(3, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda58(iOnExtraCallbackWithResult));
                        }
                        this.onWarmupCompleted.onNavigationEvent((Runnable) new BleManagerHandler$3$.ExternalSyntheticLambda59(this, bluetoothGatt), iOnExtraCallbackWithResult);
                        return;
                    }
                } else if (i != 0) {
                    this.onWarmupCompleted.IAuthTabCallback(6, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda49(i));
                }
                this.onWarmupCompleted.onExtraCallback((BusMonitorDependWrapper1.onNavigationEvent) new BleManagerHandler$3$.ExternalSyntheticLambda50(bluetoothGatt, i));
                return;
            }
            if (this.onWarmupCompleted.onNavigationEvent == null) {
                this.onWarmupCompleted.IAuthTabCallback(3, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda51());
                try {
                    bluetoothGatt.close();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda52(bluetoothGatt));
            this.onWarmupCompleted.onTransact = true;
            this.onWarmupCompleted.access000 = 0L;
            this.onWarmupCompleted.getInterfaceDescriptor = 2;
            this.onWarmupCompleted.onExtraCallback((BusMonitorDependWrapper1.onNavigationEvent) new BleManagerHandler$3$.ExternalSyntheticLambda53(bluetoothGatt));
            this.onWarmupCompleted.onExtraCallbackWithResult((BusMonitorDependWrapper1.onExtraCallbackWithResult) new BleManagerHandler$3$.ExternalSyntheticLambda54(bluetoothGatt));
            if (this.onWarmupCompleted.newAuthTabSession) {
                return;
            }
            int iOnExtraCallbackWithResult2 = this.onWarmupCompleted.ICustomTabsCallbackStubProxy.onExtraCallbackWithResult(bluetoothGatt.getDevice().getBondState() == 12);
            if (iOnExtraCallbackWithResult2 > 0) {
                this.onWarmupCompleted.IAuthTabCallback(3, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda55(iOnExtraCallbackWithResult2));
            }
            this.onWarmupCompleted.onNavigationEvent((Runnable) new BleManagerHandler$3$.ExternalSyntheticLambda56(this, BusMonitorDependWrapper1.asBinder(this.onWarmupCompleted), bluetoothGatt), iOnExtraCallbackWithResult2);
        }

        public static /* synthetic */ String onExtraCallbackWithResult(int i, int i2) {
            return "[Callback] Connection state changed with status: " + i + " and new state: " + i2 + " (" + IABLandingPageActivity4.IAuthTabCallbackDefault(i2) + ")";
        }

        public static /* synthetic */ String IAuthTabCallback() {
            return "gatt.close()";
        }

        public static /* synthetic */ String onWarmupCompleted(BluetoothGatt bluetoothGatt) {
            return "Connected to " + bluetoothGatt.getDevice().getAddress();
        }

        public static /* synthetic */ String onExtraCallbackWithResult(int i) {
            return "wait(" + i + ")";
        }

        public static /* synthetic */ void onExtraCallbackWithResult(BleManagerHandler$3 bleManagerHandler$3, int i, BluetoothGatt bluetoothGatt) {
            if (i != bleManagerHandler$3.onWarmupCompleted.IAuthTabCallbackStubProxy || !bleManagerHandler$3.onWarmupCompleted.onTransact || bleManagerHandler$3.onWarmupCompleted.newSession || bleManagerHandler$3.onWarmupCompleted.newAuthTabSession || bluetoothGatt.getDevice().getBondState() == 11) {
                return;
            }
            bleManagerHandler$3.onWarmupCompleted.newAuthTabSession = true;
            bleManagerHandler$3.onWarmupCompleted.IAuthTabCallback(2, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda11());
            bleManagerHandler$3.onWarmupCompleted.IAuthTabCallback(3, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda12());
            bluetoothGatt.discoverServices();
        }

        public static /* synthetic */ String onExtraCallback() {
            return "Discovering services...";
        }

        public static /* synthetic */ String onTransact() {
            return "gatt.discoverServices()";
        }

        public static /* synthetic */ String IAuthTabCallbackStub(int i) {
            return "Error: (0x" + Integer.toHexString(i) + "): " + onSuggestionSubmit.IAuthTabCallback(i);
        }

        public static /* synthetic */ String onTransact(int i) {
            return "wait(" + i + ")";
        }

        public static /* synthetic */ String IAuthTabCallback_Parcel() {
            return "autoConnect = false called failed; retrying with autoConnect = true";
        }

        public static /* synthetic */ String IAuthTabCallback_Parcel(int i) {
            return "Error (0x" + Integer.toHexString(i) + "): " + onSuggestionSubmit.IAuthTabCallback(i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(@NonNull BluetoothGatt bluetoothGatt, int i) {
            if (this.onWarmupCompleted.newAuthTabSession) {
                this.onWarmupCompleted.newAuthTabSession = false;
                if (i == 0) {
                    this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda20());
                    this.onWarmupCompleted.newSession = true;
                    if (this.onWarmupCompleted.ICustomTabsCallbackStubProxy.onExtraCallback(bluetoothGatt)) {
                        this.onWarmupCompleted.IAuthTabCallback(2, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda21());
                        this.onWarmupCompleted.ICustomTabsCallback = false;
                        boolean zOnNavigationEvent = this.onWarmupCompleted.ICustomTabsCallbackStubProxy.onNavigationEvent(bluetoothGatt);
                        if (zOnNavigationEvent) {
                            this.onWarmupCompleted.IAuthTabCallback(2, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda22());
                        }
                        this.onWarmupCompleted.onExtraCallback((BusMonitorDependWrapper1.onNavigationEvent) new BleManagerHandler$3$.ExternalSyntheticLambda23(bluetoothGatt, zOnNavigationEvent));
                        this.onWarmupCompleted.getSmallIconBitmap();
                        this.onWarmupCompleted.ICustomTabsCallbackDefault = true;
                        this.onWarmupCompleted.onMessageChannelReady = true;
                        BusMonitorDependWrapper1 busMonitorDependWrapper1 = this.onWarmupCompleted;
                        busMonitorDependWrapper1.onActivityResized = busMonitorDependWrapper1.IAuthTabCallback(bluetoothGatt);
                        boolean z = this.onWarmupCompleted.onActivityResized != null;
                        if (z) {
                            for (Request request : this.onWarmupCompleted.onActivityResized) {
                                request.onNavigationEvent(this.onWarmupCompleted);
                                request.onExtraCallbackWithResult = true;
                            }
                        }
                        if (this.onWarmupCompleted.onActivityResized == null) {
                            this.onWarmupCompleted.onActivityResized = new LinkedBlockingDeque();
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 == 26 || i2 == 27 || i2 == 28) {
                            this.onWarmupCompleted.IAuthTabCallback(Request.IAuthTabCallback_Parcel().onNavigationEvent(this.onWarmupCompleted));
                            this.onWarmupCompleted.ICustomTabsCallbackDefault = true;
                        }
                        if (z) {
                            this.onWarmupCompleted.ICustomTabsCallbackStubProxy.IAuthTabCallbackStubProxy();
                            if (this.onWarmupCompleted.ICustomTabsCallbackStubProxy.asInterface != null && this.onWarmupCompleted.ICustomTabsCallbackStubProxy.asInterface.onExtraCallbackWithResult(bluetoothGatt.getDevice())) {
                                this.onWarmupCompleted.ICustomTabsCallbackStubProxy.IAuthTabCallbackStub();
                            }
                        }
                        this.onWarmupCompleted.ICustomTabsCallbackStubProxy.onExtraCallback();
                        this.onWarmupCompleted.onMessageChannelReady = false;
                        this.onWarmupCompleted.onExtraCallback(true);
                        return;
                    }
                    this.onWarmupCompleted.IAuthTabCallback(5, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda24());
                    this.onWarmupCompleted.ICustomTabsCallback = true;
                    this.onWarmupCompleted.onExtraCallback((BusMonitorDependWrapper1.onNavigationEvent) new BleManagerHandler$3$.ExternalSyntheticLambda25(bluetoothGatt));
                    this.onWarmupCompleted.asBinder(4);
                    return;
                }
                this.onWarmupCompleted.onNavigationEvent(bluetoothGatt.getDevice(), "Error on discovering services", i);
                if (this.onWarmupCompleted.asInterface != null) {
                    this.onWarmupCompleted.asInterface.onExtraCallbackWithResult(bluetoothGatt.getDevice(), -4);
                    this.onWarmupCompleted.asInterface = null;
                }
                this.onWarmupCompleted.asBinder(-1);
            }
        }

        public static /* synthetic */ String IAuthTabCallbackDefault() {
            return "Services discovered";
        }

        public static /* synthetic */ String access000() {
            return "Primary service found";
        }

        public static /* synthetic */ String onMinimized() {
            return "Secondary service found";
        }

        public static /* synthetic */ String onExtraCallbackWithResult() {
            return "Device is not supported";
        }

        public static /* synthetic */ String IAuthTabCallbackStub() {
            return "Service changed, invalidating services";
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServiceChanged(@NonNull BluetoothGatt bluetoothGatt) {
            this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda43());
            this.onWarmupCompleted.ICustomTabsCallbackDefault = true;
            this.onWarmupCompleted.ICustomTabsCallbackStubProxy.onExtraCallbackWithResult();
            this.onWarmupCompleted.prefetch.clear();
            this.onWarmupCompleted.onActivityResized = null;
            this.onWarmupCompleted.newAuthTabSession = true;
            this.onWarmupCompleted.newSession = false;
            this.onWarmupCompleted.IAuthTabCallback(2, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda44());
            this.onWarmupCompleted.IAuthTabCallback(3, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda45());
            bluetoothGatt.discoverServices();
        }

        public static /* synthetic */ String onWarmupCompleted() {
            return "Discovering Services...";
        }

        public static /* synthetic */ String extraCallbackWithResult() {
            return "gatt.discoverServices()";
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue(), i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr, int i) {
            if (i == 0) {
                this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda40(bluetoothGattCharacteristic, bArr));
                if (this.onWarmupCompleted.mayLaunchUrl instanceof ReadRequest) {
                    ReadRequest readRequest = this.onWarmupCompleted.mayLaunchUrl;
                    boolean zOnExtraCallbackWithResult = readRequest.onExtraCallbackWithResult(bArr);
                    if (zOnExtraCallbackWithResult) {
                        readRequest.onExtraCallback(bluetoothGatt.getDevice(), bArr);
                    }
                    if (!zOnExtraCallbackWithResult || readRequest.onWarmupCompleted()) {
                        this.onWarmupCompleted.IAuthTabCallback((Request) readRequest);
                    } else {
                        readRequest.onNavigationEvent(bluetoothGatt.getDevice());
                    }
                }
            } else {
                if (i == 5 || i == 8 || i == 137) {
                    this.onWarmupCompleted.IAuthTabCallback(5, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda41(i));
                    if (bluetoothGatt.getDevice().getBondState() != 10) {
                        this.onWarmupCompleted.onExtraCallback((BusMonitorDependWrapper1.onNavigationEvent) new BleManagerHandler$3$.ExternalSyntheticLambda42(bluetoothGatt, i));
                        return;
                    }
                    return;
                }
                if (this.onWarmupCompleted.mayLaunchUrl instanceof ReadRequest) {
                    this.onWarmupCompleted.mayLaunchUrl.onExtraCallbackWithResult(bluetoothGatt.getDevice(), i);
                }
                this.onWarmupCompleted.onExtraCallback = null;
                this.onWarmupCompleted.onNavigationEvent(bluetoothGatt.getDevice(), "Error on reading characteristic", i);
            }
            this.onWarmupCompleted.ITrustedWebActivityCallbackStubProxy();
            this.onWarmupCompleted.onExtraCallback(true);
        }

        public static /* synthetic */ String IAuthTabCallback(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            return "Read Response received from " + bluetoothGattCharacteristic.getUuid() + ", value: " + IABLandingPageActivity4.onExtraCallbackWithResult(bArr);
        }

        public static /* synthetic */ String onNavigationEvent(int i) {
            return "Authentication required (" + i + ")";
        }

        public static /* synthetic */ String onExtraCallbackWithResult(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            return "Data written to " + bluetoothGattCharacteristic.getUuid();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (i == 0) {
                this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda37(bluetoothGattCharacteristic));
                if (this.onWarmupCompleted.mayLaunchUrl instanceof InitConfig) {
                    InitConfig initConfig = (InitConfig) this.onWarmupCompleted.mayLaunchUrl;
                    if (!initConfig.onNavigationEvent(bluetoothGatt.getDevice(), bluetoothGattCharacteristic.getValue()) && (this.onWarmupCompleted.ICustomTabsCallback_Parcel instanceof ReliableWriteRequest)) {
                        initConfig.onExtraCallbackWithResult(bluetoothGatt.getDevice(), -6);
                        this.onWarmupCompleted.ICustomTabsCallback_Parcel.onExtraCallbackWithResult();
                    } else if (initConfig.onExtraCallbackWithResult()) {
                        this.onWarmupCompleted.IAuthTabCallback(initConfig);
                    } else {
                        initConfig.onNavigationEvent(bluetoothGatt.getDevice());
                    }
                }
            } else {
                if (i == 5 || i == 8 || i == 137) {
                    this.onWarmupCompleted.IAuthTabCallback(5, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda38(i));
                    if (bluetoothGatt.getDevice().getBondState() != 10) {
                        this.onWarmupCompleted.onExtraCallback((BusMonitorDependWrapper1.onNavigationEvent) new BleManagerHandler$3$.ExternalSyntheticLambda39(bluetoothGatt, i));
                        return;
                    }
                    return;
                }
                if (this.onWarmupCompleted.mayLaunchUrl instanceof InitConfig) {
                    this.onWarmupCompleted.mayLaunchUrl.onExtraCallbackWithResult(bluetoothGatt.getDevice(), i);
                    if (this.onWarmupCompleted.ICustomTabsCallback_Parcel instanceof ReliableWriteRequest) {
                        this.onWarmupCompleted.ICustomTabsCallback_Parcel.onExtraCallbackWithResult();
                    }
                }
                this.onWarmupCompleted.onExtraCallback = null;
                this.onWarmupCompleted.onNavigationEvent(bluetoothGatt.getDevice(), "Error on writing characteristic", i);
            }
            this.onWarmupCompleted.ITrustedWebActivityCallbackStubProxy();
            this.onWarmupCompleted.onExtraCallback(true);
        }

        public static /* synthetic */ String onExtraCallback(int i) {
            return "Authentication required (" + i + ")";
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(@NonNull BluetoothGatt bluetoothGatt, int i) {
            boolean z = this.onWarmupCompleted.mayLaunchUrl.extraCallback == Request.Type.EXECUTE_RELIABLE_WRITE;
            this.onWarmupCompleted.extraCommand = false;
            if (i != 0) {
                this.onWarmupCompleted.mayLaunchUrl.onExtraCallbackWithResult(bluetoothGatt.getDevice(), i);
                this.onWarmupCompleted.onNavigationEvent(bluetoothGatt.getDevice(), "Error on Execute Reliable Write", i);
            } else if (z) {
                this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda9());
                this.onWarmupCompleted.mayLaunchUrl.onNavigationEvent(bluetoothGatt.getDevice());
            } else {
                this.onWarmupCompleted.IAuthTabCallback(5, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda10());
                this.onWarmupCompleted.mayLaunchUrl.onNavigationEvent(bluetoothGatt.getDevice());
                this.onWarmupCompleted.ICustomTabsCallback_Parcel.onExtraCallbackWithResult(bluetoothGatt.getDevice(), -4);
            }
            this.onWarmupCompleted.ITrustedWebActivityCallbackStubProxy();
            this.onWarmupCompleted.onExtraCallback(true);
        }

        public static /* synthetic */ String ICustomTabsCallback() {
            return "Reliable Write executed";
        }

        public static /* synthetic */ String extraCallback() {
            return "Reliable Write aborted";
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            byte[] value = bluetoothGattDescriptor.getValue();
            if (i == 0) {
                this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda13(bluetoothGattDescriptor, value));
                if (this.onWarmupCompleted.mayLaunchUrl instanceof ReadRequest) {
                    ReadRequest readRequest = this.onWarmupCompleted.mayLaunchUrl;
                    readRequest.onExtraCallback(bluetoothGatt.getDevice(), value);
                    if (readRequest.onWarmupCompleted()) {
                        this.onWarmupCompleted.IAuthTabCallback((Request) readRequest);
                    } else {
                        readRequest.onNavigationEvent(bluetoothGatt.getDevice());
                    }
                }
            } else {
                if (i == 5 || i == 8 || i == 137) {
                    this.onWarmupCompleted.IAuthTabCallback(5, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda14(i));
                    if (bluetoothGatt.getDevice().getBondState() != 10) {
                        this.onWarmupCompleted.onExtraCallback((BusMonitorDependWrapper1.onNavigationEvent) new BleManagerHandler$3$.ExternalSyntheticLambda15(bluetoothGatt, i));
                        return;
                    }
                    return;
                }
                if (this.onWarmupCompleted.mayLaunchUrl instanceof ReadRequest) {
                    this.onWarmupCompleted.mayLaunchUrl.onExtraCallbackWithResult(bluetoothGatt.getDevice(), i);
                }
                this.onWarmupCompleted.onExtraCallback = null;
                this.onWarmupCompleted.onNavigationEvent(bluetoothGatt.getDevice(), "Error on reading descriptor", i);
            }
            this.onWarmupCompleted.ITrustedWebActivityCallbackStubProxy();
            this.onWarmupCompleted.onExtraCallback(true);
        }

        public static /* synthetic */ String onNavigationEvent(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
            return "Read Response received from descr. " + bluetoothGattDescriptor.getUuid() + ", value: " + IABLandingPageActivity4.onExtraCallbackWithResult(bArr);
        }

        public static /* synthetic */ String asInterface(int i) {
            return "Authentication required (" + i + ")";
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            byte[] value = bluetoothGattDescriptor.getValue();
            if (i == 0) {
                this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda30(bluetoothGattDescriptor));
                if (this.onWarmupCompleted.IAuthTabCallback_Parcel(bluetoothGattDescriptor)) {
                    this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda31());
                } else if (this.onWarmupCompleted.IAuthTabCallbackStub(bluetoothGattDescriptor) && value != null && value.length == 2 && value[1] == 0) {
                    byte b = value[0];
                    if (b == 0) {
                        this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda32());
                    } else if (b == 1) {
                        this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda33());
                    } else if (b == 2) {
                        this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda34());
                    }
                }
                if (this.onWarmupCompleted.mayLaunchUrl instanceof InitConfig) {
                    InitConfig initConfig = (InitConfig) this.onWarmupCompleted.mayLaunchUrl;
                    if (!initConfig.onNavigationEvent(bluetoothGatt.getDevice(), value) && (this.onWarmupCompleted.ICustomTabsCallback_Parcel instanceof ReliableWriteRequest)) {
                        initConfig.onExtraCallbackWithResult(bluetoothGatt.getDevice(), -6);
                        this.onWarmupCompleted.ICustomTabsCallback_Parcel.onExtraCallbackWithResult();
                    } else if (initConfig.onExtraCallbackWithResult()) {
                        this.onWarmupCompleted.IAuthTabCallback(initConfig);
                    } else {
                        initConfig.onNavigationEvent(bluetoothGatt.getDevice());
                    }
                }
            } else {
                if (i == 5 || i == 8 || i == 137) {
                    this.onWarmupCompleted.IAuthTabCallback(5, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda35(i));
                    if (bluetoothGatt.getDevice().getBondState() != 10) {
                        this.onWarmupCompleted.onExtraCallback((BusMonitorDependWrapper1.onNavigationEvent) new BleManagerHandler$3$.ExternalSyntheticLambda36(bluetoothGatt, i));
                        return;
                    }
                    return;
                }
                if (this.onWarmupCompleted.mayLaunchUrl instanceof InitConfig) {
                    this.onWarmupCompleted.mayLaunchUrl.onExtraCallbackWithResult(bluetoothGatt.getDevice(), i);
                    if (this.onWarmupCompleted.ICustomTabsCallback_Parcel instanceof ReliableWriteRequest) {
                        this.onWarmupCompleted.ICustomTabsCallback_Parcel.onExtraCallbackWithResult();
                    }
                }
                this.onWarmupCompleted.onExtraCallback = null;
                this.onWarmupCompleted.onNavigationEvent(bluetoothGatt.getDevice(), "Error on writing descriptor", i);
            }
            this.onWarmupCompleted.ITrustedWebActivityCallbackStubProxy();
            this.onWarmupCompleted.onExtraCallback(true);
        }

        public static /* synthetic */ String onWarmupCompleted(BluetoothGattDescriptor bluetoothGattDescriptor) {
            return "Data written to descr. " + bluetoothGattDescriptor.getUuid();
        }

        public static /* synthetic */ String onNavigationEvent() {
            return "Service Changed notifications enabled";
        }

        public static /* synthetic */ String access100() {
            return "Notifications and indications disabled";
        }

        public static /* synthetic */ String writeTypedObject() {
            return "Notifications enabled";
        }

        public static /* synthetic */ String getInterfaceDescriptor() {
            return "Indications enabled";
        }

        public static /* synthetic */ String asBinder(int i) {
            return "Authentication required (" + i + ")";
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(@NonNull BluetoothGatt bluetoothGatt, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr) {
            if (this.onWarmupCompleted.extraCallback(bluetoothGattCharacteristic)) {
                if (Build.VERSION.SDK_INT <= 30) {
                    this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda3());
                    this.onWarmupCompleted.ICustomTabsCallbackDefault = true;
                    this.onWarmupCompleted.ICustomTabsCallbackStubProxy.onExtraCallbackWithResult();
                    this.onWarmupCompleted.prefetch.clear();
                    this.onWarmupCompleted.onActivityResized = null;
                    this.onWarmupCompleted.newAuthTabSession = true;
                    this.onWarmupCompleted.IAuthTabCallback(2, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda4());
                    this.onWarmupCompleted.IAuthTabCallback(3, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda5());
                    bluetoothGatt.discoverServices();
                    return;
                }
                return;
            }
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(getReflectContext.onExtraCallback);
            if (descriptor == null || descriptor.getValue() == null || descriptor.getValue().length != 2 || descriptor.getValue()[0] == 1) {
                this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda6(bluetoothGattCharacteristic, bArr));
            } else {
                this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda7(bluetoothGattCharacteristic, bArr));
            }
            if (this.onWarmupCompleted.onExtraCallbackWithResult != null && this.onWarmupCompleted.extraCallbackWithResult(bluetoothGattCharacteristic)) {
                this.onWarmupCompleted.onExtraCallbackWithResult.onExtraCallbackWithResult(bluetoothGatt.getDevice(), bArr);
            }
            getOptions getoptions = (getOptions) this.onWarmupCompleted.requestPostMessageChannelWithExtras.get(bluetoothGattCharacteristic);
            if (getoptions != null && getoptions.IAuthTabCallback(bArr)) {
                getoptions.onExtraCallbackWithResult(bluetoothGatt.getDevice(), bArr);
            }
            if ((this.onWarmupCompleted.onExtraCallback instanceof hasSecondOptions) && this.onWarmupCompleted.onExtraCallback.onWarmupCompleted == bluetoothGattCharacteristic && !this.onWarmupCompleted.onExtraCallback.onNavigationEvent()) {
                hasSecondOptions hassecondoptions = (hasSecondOptions) this.onWarmupCompleted.onExtraCallback;
                if (hassecondoptions.onNavigationEvent(bArr)) {
                    hassecondoptions.onExtraCallbackWithResult(bluetoothGatt.getDevice(), bArr);
                    if (hassecondoptions.IAuthTabCallback()) {
                        this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda8());
                        hassecondoptions.onNavigationEvent(bluetoothGatt.getDevice());
                        this.onWarmupCompleted.onExtraCallback = null;
                        if (hassecondoptions.onExtraCallback()) {
                            this.onWarmupCompleted.onExtraCallback(true);
                        }
                    }
                }
            }
            if (this.onWarmupCompleted.ITrustedWebActivityCallbackStubProxy()) {
                this.onWarmupCompleted.onExtraCallback(true);
            }
        }

        public static /* synthetic */ String readTypedObject() {
            return "Service Changed indication received";
        }

        public static /* synthetic */ String asInterface() {
            return "Discovering Services...";
        }

        public static /* synthetic */ String IAuthTabCallbackStubProxy() {
            return "gatt.discoverServices()";
        }

        public static /* synthetic */ String onWarmupCompleted(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            return "Notification received from " + bluetoothGattCharacteristic.getUuid() + ", value: " + IABLandingPageActivity4.onExtraCallbackWithResult(bArr);
        }

        public static /* synthetic */ String onExtraCallback(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            return "Indication received from " + bluetoothGattCharacteristic.getUuid() + ", value: " + IABLandingPageActivity4.onExtraCallbackWithResult(bArr);
        }

        public static /* synthetic */ String asBinder() {
            return "Wait for value changed complete";
        }

        public static /* synthetic */ String IAuthTabCallbackDefault(int i) {
            return "MTU changed to: " + i;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(@NonNull BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i2 == 0) {
                this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda19(i));
                this.onWarmupCompleted.onRelationshipValidationResult = i;
                if (this.onWarmupCompleted.mayLaunchUrl instanceof onInterstitialClicked) {
                    ((onInterstitialClicked) this.onWarmupCompleted.mayLaunchUrl).onWarmupCompleted(bluetoothGatt.getDevice(), i);
                    this.onWarmupCompleted.mayLaunchUrl.onNavigationEvent(bluetoothGatt.getDevice());
                }
            } else {
                if (this.onWarmupCompleted.mayLaunchUrl instanceof onInterstitialClicked) {
                    this.onWarmupCompleted.mayLaunchUrl.onExtraCallbackWithResult(bluetoothGatt.getDevice(), i2);
                    this.onWarmupCompleted.onExtraCallback = null;
                }
                this.onWarmupCompleted.onNavigationEvent(bluetoothGatt.getDevice(), "Error on mtu request", i2);
            }
            this.onWarmupCompleted.ITrustedWebActivityCallbackStubProxy();
            if (this.onWarmupCompleted.newSession) {
                this.onWarmupCompleted.onExtraCallback(true);
            }
        }

        public void onConnectionUpdated(@NonNull BluetoothGatt bluetoothGatt, int i, int i2, int i3, int i4) {
            if (i4 == 0) {
                this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda26(i, i2, i3));
                this.onWarmupCompleted.onMinimized = i;
                this.onWarmupCompleted.onActivityLayout = i2;
                this.onWarmupCompleted.newSessionWithExtras = i3;
                if (this.onWarmupCompleted.IAuthTabCallback_Parcel != null) {
                    bluetoothGatt.getDevice();
                }
                if (this.onWarmupCompleted.mayLaunchUrl instanceof getICacheDir) {
                    bluetoothGatt.getDevice();
                    this.onWarmupCompleted.mayLaunchUrl.onNavigationEvent(bluetoothGatt.getDevice());
                }
            } else if (i4 == 59) {
                this.onWarmupCompleted.IAuthTabCallback(5, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda27(i, i2, i3));
                if (this.onWarmupCompleted.mayLaunchUrl instanceof getICacheDir) {
                    this.onWarmupCompleted.mayLaunchUrl.onExtraCallbackWithResult(bluetoothGatt.getDevice(), i4);
                    this.onWarmupCompleted.onExtraCallback = null;
                }
            } else {
                this.onWarmupCompleted.IAuthTabCallback(5, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda28(i4, i, i2, i3));
                if (this.onWarmupCompleted.mayLaunchUrl instanceof getICacheDir) {
                    this.onWarmupCompleted.mayLaunchUrl.onExtraCallbackWithResult(bluetoothGatt.getDevice(), i4);
                    this.onWarmupCompleted.onExtraCallback = null;
                }
                this.onWarmupCompleted.onExtraCallback((BusMonitorDependWrapper1.onNavigationEvent) new BleManagerHandler$3$.ExternalSyntheticLambda29(bluetoothGatt, i4));
            }
            if (this.onWarmupCompleted.access100) {
                this.onWarmupCompleted.access100 = false;
                this.onWarmupCompleted.ITrustedWebActivityCallbackStubProxy();
                this.onWarmupCompleted.onExtraCallback(true);
            }
        }

        public static /* synthetic */ String onWarmupCompleted(int i, int i2, int i3) {
            return "Connection parameters updated (interval: " + (i * 1.25d) + "ms, latency: " + i2 + ", timeout: " + (i3 * 10) + "ms)";
        }

        public static /* synthetic */ String onNavigationEvent(int i, int i2, int i3) {
            return "Connection parameters update failed with status: UNACCEPT CONN INTERVAL (0x3b) (interval: " + (i * 1.25d) + "ms, latency: " + i2 + ", timeout: " + (i3 * 10) + "ms)";
        }

        public static /* synthetic */ String onExtraCallback(int i, int i2, int i3, int i4) {
            return "Connection parameters update failed with status " + i + " (interval: " + (i2 * 1.25d) + "ms, latency: " + i3 + ", timeout: " + (i4 * 10) + "ms)";
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyUpdate(@NonNull BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
            if (i3 == 0) {
                this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda60(i, i2));
                if (this.onWarmupCompleted.mayLaunchUrl instanceof onInterstitialDismissed) {
                    ((onInterstitialDismissed) this.onWarmupCompleted.mayLaunchUrl).IAuthTabCallback(bluetoothGatt.getDevice(), i, i2);
                    this.onWarmupCompleted.mayLaunchUrl.onNavigationEvent(bluetoothGatt.getDevice());
                }
            } else {
                this.onWarmupCompleted.IAuthTabCallback(5, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda61(i3));
                if (this.onWarmupCompleted.mayLaunchUrl instanceof onInterstitialDismissed) {
                    this.onWarmupCompleted.mayLaunchUrl.onExtraCallbackWithResult(bluetoothGatt.getDevice(), i3);
                    this.onWarmupCompleted.onExtraCallback = null;
                }
                this.onWarmupCompleted.onExtraCallback((BusMonitorDependWrapper1.onNavigationEvent) new BleManagerHandler$3$.ExternalSyntheticLambda62(bluetoothGatt, i3));
            }
            if (this.onWarmupCompleted.ITrustedWebActivityCallbackStubProxy() || (this.onWarmupCompleted.mayLaunchUrl instanceof onInterstitialDismissed)) {
                this.onWarmupCompleted.onExtraCallback(true);
            }
        }

        public static /* synthetic */ String IAuthTabCallback(int i, int i2) {
            return "PHY updated (TX: " + IABLandingPageActivity4.onWarmupCompleted(i) + ", RX: " + IABLandingPageActivity4.onWarmupCompleted(i2) + ")";
        }

        public static /* synthetic */ String IAuthTabCallback(int i) {
            return "PHY updated failed with status " + i;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyRead(@NonNull BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
            if (i3 == 0) {
                this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda0(i, i2));
                if (this.onWarmupCompleted.mayLaunchUrl instanceof onInterstitialDismissed) {
                    ((onInterstitialDismissed) this.onWarmupCompleted.mayLaunchUrl).IAuthTabCallback(bluetoothGatt.getDevice(), i, i2);
                    this.onWarmupCompleted.mayLaunchUrl.onNavigationEvent(bluetoothGatt.getDevice());
                }
            } else {
                this.onWarmupCompleted.IAuthTabCallback(5, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda1(i3));
                if (this.onWarmupCompleted.mayLaunchUrl instanceof onInterstitialDismissed) {
                    this.onWarmupCompleted.mayLaunchUrl.onExtraCallbackWithResult(bluetoothGatt.getDevice(), i3);
                }
                this.onWarmupCompleted.onExtraCallback = null;
                this.onWarmupCompleted.onExtraCallback((BusMonitorDependWrapper1.onNavigationEvent) new BleManagerHandler$3$.ExternalSyntheticLambda2(bluetoothGatt, i3));
            }
            this.onWarmupCompleted.ITrustedWebActivityCallbackStubProxy();
            this.onWarmupCompleted.onExtraCallback(true);
        }

        public static /* synthetic */ String onWarmupCompleted(int i, int i2) {
            return "PHY read (TX: " + IABLandingPageActivity4.onWarmupCompleted(i) + ", RX: " + IABLandingPageActivity4.onWarmupCompleted(i2) + ")";
        }

        public static /* synthetic */ String onWarmupCompleted(int i) {
            return "PHY read failed with status " + i;
        }

        public static /* synthetic */ String IAuthTabCallbackStubProxy(int i) {
            return "Remote RSSI received: " + i + " dBm";
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(@NonNull BluetoothGatt bluetoothGatt, int i, int i2) {
            if (i2 == 0) {
                this.onWarmupCompleted.IAuthTabCallback(4, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda16(i));
                if (this.onWarmupCompleted.mayLaunchUrl instanceof ReadRssiRequest) {
                    this.onWarmupCompleted.mayLaunchUrl.IAuthTabCallback(bluetoothGatt.getDevice(), i);
                    this.onWarmupCompleted.mayLaunchUrl.onNavigationEvent(bluetoothGatt.getDevice());
                }
            } else {
                this.onWarmupCompleted.IAuthTabCallback(5, (BusMonitorDependWrapper1.onExtraCallback) new BleManagerHandler$3$.ExternalSyntheticLambda17(i2));
                if (this.onWarmupCompleted.mayLaunchUrl instanceof ReadRssiRequest) {
                    this.onWarmupCompleted.mayLaunchUrl.onExtraCallbackWithResult(bluetoothGatt.getDevice(), i2);
                }
                this.onWarmupCompleted.onExtraCallback = null;
                this.onWarmupCompleted.onExtraCallback((BusMonitorDependWrapper1.onNavigationEvent) new BleManagerHandler$3$.ExternalSyntheticLambda18(bluetoothGatt, i2));
            }
            this.onWarmupCompleted.ITrustedWebActivityCallbackStubProxy();
            this.onWarmupCompleted.onExtraCallback(true);
        }

        public static /* synthetic */ String getInterfaceDescriptor(int i) {
            return "Reading remote RSSI failed with status " + i;
        }
    };

    @FunctionalInterface
    public interface onExtraCallback {
        String log();
    }

    public interface onExtraCallbackWithResult {
        void run(@NonNull IABLandingPageActivity21 iABLandingPageActivity21);
    }

    @Deprecated
    public interface onNavigationEvent {
        void run(@NonNull onMonitorUpload onmonitorupload);
    }

    public static /* synthetic */ void IAuthTabCallback(BluetoothDevice bluetoothDevice, int i, IABLandingPageActivity21 iABLandingPageActivity21) {
    }

    public static /* synthetic */ void IAuthTabCallback(BluetoothDevice bluetoothDevice, int i, onMonitorUpload onmonitorupload) {
    }

    public static /* synthetic */ void IAuthTabCallback(BluetoothDevice bluetoothDevice, onMonitorUpload onmonitorupload) {
    }

    public static /* synthetic */ void IAuthTabCallbackDefault(BluetoothDevice bluetoothDevice, onMonitorUpload onmonitorupload) {
    }

    public static /* synthetic */ void IAuthTabCallbackStub(BluetoothDevice bluetoothDevice, onMonitorUpload onmonitorupload) {
    }

    public static /* synthetic */ void asBinder(BluetoothDevice bluetoothDevice, onMonitorUpload onmonitorupload) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getInterfaceDescriptor(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 8) {
            return 10;
        }
        if (i != 19) {
            return i != 22 ? -1 : 1;
        }
        return 2;
    }

    public static /* synthetic */ void onExtraCallback(BluetoothDevice bluetoothDevice, int i, IABLandingPageActivity21 iABLandingPageActivity21) {
    }

    public static /* synthetic */ void onExtraCallback(BluetoothDevice bluetoothDevice, String str, int i, onMonitorUpload onmonitorupload) {
    }

    public static /* synthetic */ void onExtraCallback(BluetoothDevice bluetoothDevice, IABLandingPageActivity21 iABLandingPageActivity21) {
    }

    public static /* synthetic */ void onExtraCallback(BluetoothDevice bluetoothDevice, onMonitorUpload onmonitorupload) {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BluetoothDevice bluetoothDevice, int i, IABLandingPageActivity21 iABLandingPageActivity21) {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BluetoothDevice bluetoothDevice, IABLandingPageActivity21 iABLandingPageActivity21) {
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BluetoothDevice bluetoothDevice, onMonitorUpload onmonitorupload) {
    }

    public static /* synthetic */ void onNavigationEvent(BluetoothDevice bluetoothDevice, int i, IABLandingPageActivity21 iABLandingPageActivity21) {
    }

    public static /* synthetic */ void onNavigationEvent(BluetoothDevice bluetoothDevice, int i, onMonitorUpload onmonitorupload) {
    }

    public static /* synthetic */ void onNavigationEvent(BluetoothDevice bluetoothDevice, IABLandingPageActivity21 iABLandingPageActivity21) {
    }

    public static /* synthetic */ void onNavigationEvent(BluetoothDevice bluetoothDevice, onMonitorUpload onmonitorupload) {
    }

    public static /* synthetic */ void onWarmupCompleted(BluetoothDevice bluetoothDevice, IABLandingPageActivity21 iABLandingPageActivity21) {
    }

    public static /* synthetic */ void onWarmupCompleted(BluetoothDevice bluetoothDevice, onMonitorUpload onmonitorupload) {
    }

    @Deprecated
    public Deque<Request> IAuthTabCallback(@NonNull BluetoothGatt bluetoothGatt) {
        return null;
    }

    @Deprecated
    protected boolean onNavigationEvent(@NonNull BluetoothGatt bluetoothGatt) {
        return false;
    }

    protected abstract boolean onWarmupCompleted(@NonNull BluetoothGatt bluetoothGatt);

    BusMonitorDependWrapper1() {
    }

    public static /* synthetic */ int asBinder(BusMonitorDependWrapper1 busMonitorDependWrapper1) {
        int i = busMonitorDependWrapper1.IAuthTabCallbackStubProxy + 1;
        busMonitorDependWrapper1.IAuthTabCallbackStubProxy = i;
        return i;
    }

    void onExtraCallbackWithResult(@NonNull getReflectContext getreflectcontext, @NonNull Handler handler) {
        this.ICustomTabsCallbackStubProxy = getreflectcontext;
        this.extraCallbackWithResult = handler;
    }

    void onNavigationEvent(@Nullable getDiskCacheDirPath getdiskcachedirpath) {
        this.postMessage = getdiskcachedirpath;
    }

    public static /* synthetic */ String onWarmupCompleted() {
        return "attachClientConnection called on existing connection, call ignored";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getSmallIconBitmap() {
        BluetoothGattServer bluetoothGattServerOnNavigationEvent;
        getDiskCacheDirPath getdiskcachedirpath = this.postMessage;
        if (getdiskcachedirpath == null || (bluetoothGattServerOnNavigationEvent = getdiskcachedirpath.onNavigationEvent()) == null) {
            return;
        }
        Iterator<BluetoothGattService> it = bluetoothGattServerOnNavigationEvent.getServices().iterator();
        while (it.hasNext()) {
            for (BluetoothGattCharacteristic bluetoothGattCharacteristic : it.next().getCharacteristics()) {
                if (!this.postMessage.onExtraCallback(bluetoothGattCharacteristic)) {
                    if (this.asBinder == null) {
                        this.asBinder = new HashMap();
                    }
                    this.asBinder.put(bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
                }
                for (BluetoothGattDescriptor bluetoothGattDescriptor : bluetoothGattCharacteristic.getDescriptors()) {
                    if (!this.postMessage.onNavigationEvent(bluetoothGattDescriptor)) {
                        if (this.readTypedObject == null) {
                            this.readTypedObject = new HashMap();
                        }
                        this.readTypedObject.put(bluetoothGattDescriptor, bluetoothGattDescriptor.getValue());
                    }
                }
            }
        }
        this.ICustomTabsCallbackStubProxy.IAuthTabCallback(bluetoothGattServerOnNavigationEvent);
    }

    void IPostMessageService_Parcel() {
        try {
            Context contextAsBinder = this.ICustomTabsCallbackStubProxy.asBinder();
            contextAsBinder.unregisterReceiver(this.IAuthTabCallbackStub);
            contextAsBinder.unregisterReceiver(this.onUnminimized);
        } catch (Exception unused) {
        }
        synchronized (this.IAuthTabCallback) {
            if (this.IAuthTabCallbackDefault != null) {
                if (this.ICustomTabsCallbackStubProxy.access000()) {
                    if (RemoteActionCompatParcelizer()) {
                        IAuthTabCallback(4, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda63
                            @Override // o.BusMonitorDependWrapper1.onExtraCallback
                            public final String log() {
                                return BusMonitorDependWrapper1.ICustomTabsCallback_Parcel();
                            }
                        });
                    } else {
                        IAuthTabCallback(5, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda64
                            @Override // o.BusMonitorDependWrapper1.onExtraCallback
                            public final String log() {
                                return BusMonitorDependWrapper1.onNavigationEvent();
                            }
                        });
                    }
                }
                IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda65
                    @Override // o.BusMonitorDependWrapper1.onExtraCallback
                    public final String log() {
                        return BusMonitorDependWrapper1.onMessageChannelReady();
                    }
                });
                try {
                    this.IAuthTabCallbackDefault.close();
                } catch (Throwable unused2) {
                }
                this.IAuthTabCallbackDefault = null;
            }
            this.extraCommand = false;
            this.onPostMessage = false;
            this.prefetch.clear();
            this.onActivityResized = null;
            this.onMessageChannelReady = false;
            this.onNavigationEvent = null;
            this.onTransact = false;
        }
    }

    public static /* synthetic */ String ICustomTabsCallback_Parcel() {
        return "Cache refreshed";
    }

    public static /* synthetic */ String onNavigationEvent() {
        return "Refreshing failed";
    }

    public static /* synthetic */ String onMessageChannelReady() {
        return "gatt.close()";
    }

    public BluetoothDevice ITrustedWebActivityService() {
        return this.onNavigationEvent;
    }

    public final byte[] asInterface(@NonNull BluetoothGattDescriptor bluetoothGattDescriptor) {
        Map<BluetoothGattDescriptor, byte[]> map = this.readTypedObject;
        if (map != null && map.containsKey(bluetoothGattDescriptor)) {
            return this.readTypedObject.get(bluetoothGattDescriptor);
        }
        return bluetoothGattDescriptor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean onWarmupCompleted(@NonNull final BluetoothDevice bluetoothDevice, @Nullable final CustomEventInterstitialListener customEventInterstitialListener) {
        boolean zIsEnabled = BluetoothAdapter.getDefaultAdapter().isEnabled();
        if (this.onTransact || !zIsEnabled) {
            BluetoothDevice bluetoothDevice2 = this.onNavigationEvent;
            if (zIsEnabled && bluetoothDevice2 != null && bluetoothDevice2.equals(bluetoothDevice)) {
                CustomEventInterstitialListener customEventInterstitialListener2 = this.asInterface;
                if (customEventInterstitialListener2 != null) {
                    customEventInterstitialListener2.onNavigationEvent(bluetoothDevice);
                }
            } else {
                CustomEventInterstitialListener customEventInterstitialListener3 = this.asInterface;
                if (customEventInterstitialListener3 != null) {
                    customEventInterstitialListener3.onExtraCallbackWithResult(bluetoothDevice, zIsEnabled ? -4 : -100);
                }
            }
            this.asInterface = null;
            onExtraCallback(true);
            return true;
        }
        Context contextAsBinder = this.ICustomTabsCallbackStubProxy.asBinder();
        synchronized (this.IAuthTabCallback) {
            if (this.IAuthTabCallbackDefault != null) {
                if (!this.onPostMessage) {
                    IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda38
                        @Override // o.BusMonitorDependWrapper1.onExtraCallback
                        public final String log() {
                            return BusMonitorDependWrapper1.onTransact();
                        }
                    });
                    try {
                        this.IAuthTabCallbackDefault.close();
                    } catch (Throwable unused) {
                    }
                    this.IAuthTabCallbackDefault = null;
                    try {
                        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda42
                            @Override // o.BusMonitorDependWrapper1.onExtraCallback
                            public final String log() {
                                return BusMonitorDependWrapper1.ICustomTabsCallback();
                            }
                        });
                        Thread.sleep(200L);
                    } catch (InterruptedException unused2) {
                    }
                } else {
                    this.onPostMessage = false;
                    this.access000 = 0L;
                    this.getInterfaceDescriptor = 1;
                    IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda43
                        @Override // o.BusMonitorDependWrapper1.onExtraCallback
                        public final String log() {
                            return BusMonitorDependWrapper1.onActivityResized();
                        }
                    });
                    onExtraCallback(new onNavigationEvent() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda44
                        @Override // o.BusMonitorDependWrapper1.onNavigationEvent
                        public final void run(onMonitorUpload onmonitorupload) {
                            BusMonitorDependWrapper1.onNavigationEvent(bluetoothDevice, onmonitorupload);
                        }
                    });
                    onExtraCallbackWithResult(new onExtraCallbackWithResult() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda45
                        @Override // o.BusMonitorDependWrapper1.onExtraCallbackWithResult
                        public final void run(IABLandingPageActivity21 iABLandingPageActivity21) {
                            BusMonitorDependWrapper1.onExtraCallbackWithResult(bluetoothDevice, iABLandingPageActivity21);
                        }
                    });
                    IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda46
                        @Override // o.BusMonitorDependWrapper1.onExtraCallback
                        public final String log() {
                            return BusMonitorDependWrapper1.IPostMessageServiceStub();
                        }
                    });
                    this.IAuthTabCallbackDefault.connect();
                    return true;
                }
            } else if (customEventInterstitialListener != null) {
                contextAsBinder.registerReceiver(this.IAuthTabCallbackStub, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                contextAsBinder.registerReceiver(this.onUnminimized, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
            }
            if (customEventInterstitialListener == null) {
                return false;
            }
            boolean zAsInterface = customEventInterstitialListener.asInterface();
            this.setEngagementSignalsCallback = !zAsInterface;
            if (zAsInterface) {
                this.onPostMessage = true;
            }
            this.onNavigationEvent = bluetoothDevice;
            IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda47
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.onExtraCallbackWithResult(customEventInterstitialListener);
                }
            });
            this.getInterfaceDescriptor = 1;
            onExtraCallback(new onNavigationEvent() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda48
                @Override // o.BusMonitorDependWrapper1.onNavigationEvent
                public final void run(onMonitorUpload onmonitorupload) {
                    BusMonitorDependWrapper1.onExtraCallback(bluetoothDevice, onmonitorupload);
                }
            });
            onExtraCallbackWithResult(new onExtraCallbackWithResult() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda49
                @Override // o.BusMonitorDependWrapper1.onExtraCallbackWithResult
                public final void run(IABLandingPageActivity21 iABLandingPageActivity21) {
                    BusMonitorDependWrapper1.onWarmupCompleted(bluetoothDevice, iABLandingPageActivity21);
                }
            });
            this.access000 = SystemClock.elapsedRealtime();
            int i = Build.VERSION.SDK_INT;
            if (i > 26) {
                final int iOnExtraCallback = customEventInterstitialListener.onExtraCallback();
                IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda50
                    @Override // o.BusMonitorDependWrapper1.onExtraCallback
                    public final String log() {
                        return BusMonitorDependWrapper1.onWarmupCompleted(iOnExtraCallback);
                    }
                });
                this.IAuthTabCallbackDefault = bluetoothDevice.connectGatt(contextAsBinder, false, this.extraCallback, 2, iOnExtraCallback, this.extraCallbackWithResult);
            } else if (i == 26) {
                final int iOnExtraCallback2 = customEventInterstitialListener.onExtraCallback();
                IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda39
                    @Override // o.BusMonitorDependWrapper1.onExtraCallback
                    public final String log() {
                        return BusMonitorDependWrapper1.IAuthTabCallback(iOnExtraCallback2);
                    }
                });
                this.IAuthTabCallbackDefault = bluetoothDevice.connectGatt(contextAsBinder, false, this.extraCallback, 2, iOnExtraCallback2);
            } else {
                IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda40
                    @Override // o.BusMonitorDependWrapper1.onExtraCallback
                    public final String log() {
                        return BusMonitorDependWrapper1.asInterface();
                    }
                });
                this.IAuthTabCallbackDefault = bluetoothDevice.connectGatt(contextAsBinder, false, this.extraCallback, 2);
            }
            return true;
        }
    }

    public static /* synthetic */ String onTransact() {
        return "gatt.close()";
    }

    public static /* synthetic */ String ICustomTabsCallback() {
        return "wait(200)";
    }

    public static /* synthetic */ String onActivityResized() {
        return "Connecting...";
    }

    public static /* synthetic */ String IPostMessageServiceStub() {
        return "gatt.connect()";
    }

    public static /* synthetic */ String onExtraCallbackWithResult(CustomEventInterstitialListener customEventInterstitialListener) {
        return customEventInterstitialListener.asBinder() ? "Connecting..." : "Retrying...";
    }

    public static /* synthetic */ String onWarmupCompleted(int i) {
        return "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, " + IABLandingPageActivity4.IAuthTabCallback(i) + ")";
    }

    public static /* synthetic */ String IAuthTabCallback(int i) {
        return "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, " + IABLandingPageActivity4.IAuthTabCallback(i) + ")";
    }

    public static /* synthetic */ String asInterface() {
        return "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE)";
    }

    public static /* synthetic */ String IPostMessageServiceDefault() {
        return "gatt = device.connectGatt(autoConnect = false)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean asBinder(final int i) {
        this.setEngagementSignalsCallback = true;
        this.onPostMessage = false;
        this.isEngagementSignalsApiAvailable = false;
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt != null) {
            final boolean z = this.onTransact;
            this.getInterfaceDescriptor = 3;
            IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda28
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.onWarmupCompleted(z);
                }
            });
            final BluetoothDevice device = bluetoothGatt.getDevice();
            if (z) {
                onExtraCallback(new onNavigationEvent() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda29
                    @Override // o.BusMonitorDependWrapper1.onNavigationEvent
                    public final void run(onMonitorUpload onmonitorupload) {
                        BusMonitorDependWrapper1.onWarmupCompleted(device, onmonitorupload);
                    }
                });
                onExtraCallbackWithResult(new onExtraCallbackWithResult() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda30
                    @Override // o.BusMonitorDependWrapper1.onExtraCallbackWithResult
                    public final void run(IABLandingPageActivity21 iABLandingPageActivity21) {
                        BusMonitorDependWrapper1.onExtraCallback(device, iABLandingPageActivity21);
                    }
                });
            }
            IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda31
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.onMinimized();
                }
            });
            bluetoothGatt.disconnect();
            if (z) {
                return true;
            }
            this.getInterfaceDescriptor = 0;
            IAuthTabCallback(4, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda32
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.updateVisuals();
                }
            });
            IPostMessageService_Parcel();
            onExtraCallback(new onNavigationEvent() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda33
                @Override // o.BusMonitorDependWrapper1.onNavigationEvent
                public final void run(onMonitorUpload onmonitorupload) {
                    BusMonitorDependWrapper1.IAuthTabCallbackDefault(device, onmonitorupload);
                }
            });
            onExtraCallbackWithResult(new onExtraCallbackWithResult() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda34
                @Override // o.BusMonitorDependWrapper1.onExtraCallbackWithResult
                public final void run(IABLandingPageActivity21 iABLandingPageActivity21) {
                    BusMonitorDependWrapper1.onExtraCallback(device, i, iABLandingPageActivity21);
                }
            });
        }
        Request request = this.mayLaunchUrl;
        if (request != null && request.extraCallback == Request.Type.DISCONNECT) {
            BluetoothDevice device2 = this.onNavigationEvent;
            if (device2 == null && bluetoothGatt == null) {
                request.writeTypedObject();
            } else {
                if (device2 == null) {
                    device2 = bluetoothGatt.getDevice();
                }
                request.onNavigationEvent(device2);
            }
        }
        onExtraCallback(true);
        return true;
    }

    public static /* synthetic */ String onWarmupCompleted(boolean z) {
        return z ? "Disconnecting..." : "Cancelling connection...";
    }

    public static /* synthetic */ String onMinimized() {
        return "gatt.disconnect()";
    }

    public static /* synthetic */ String updateVisuals() {
        return "Disconnected";
    }

    private boolean onExtraCallbackWithResult(boolean z) {
        BluetoothDevice bluetoothDevice = this.onNavigationEvent;
        if (bluetoothDevice == null) {
            return false;
        }
        if (z) {
            IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda88
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.onRelationshipValidationResult();
                }
            });
        } else {
            IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda89
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.ICustomTabsCallbackStubProxy();
                }
            });
        }
        if (!z && bluetoothDevice.getBondState() == 12) {
            IAuthTabCallback(5, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda90
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.newAuthTabSession();
                }
            });
            this.mayLaunchUrl.onNavigationEvent(bluetoothDevice);
            onExtraCallback(true);
            return true;
        }
        boolean zOnExtraCallback = onExtraCallback(bluetoothDevice);
        if (!z || zOnExtraCallback) {
            return zOnExtraCallback;
        }
        Request requestOnNavigationEvent = Request.IAuthTabCallbackStub().onNavigationEvent(this);
        Request request = this.mayLaunchUrl;
        requestOnNavigationEvent.access100 = request.access100;
        requestOnNavigationEvent.getInterfaceDescriptor = request.getInterfaceDescriptor;
        requestOnNavigationEvent.IAuthTabCallbackDefault = request.IAuthTabCallbackDefault;
        requestOnNavigationEvent.IAuthTabCallbackStubProxy = request.IAuthTabCallbackStubProxy;
        requestOnNavigationEvent.asBinder = request.asBinder;
        request.access100 = null;
        request.getInterfaceDescriptor = null;
        request.IAuthTabCallbackDefault = null;
        request.IAuthTabCallbackStubProxy = null;
        request.asBinder = null;
        IAuthTabCallback(requestOnNavigationEvent);
        IAuthTabCallback(Request.extraCallbackWithResult().onNavigationEvent(this));
        onExtraCallback(true);
        return true;
    }

    public static /* synthetic */ String onRelationshipValidationResult() {
        return "Ensuring bonding...";
    }

    public static /* synthetic */ String ICustomTabsCallbackStubProxy() {
        return "Starting bonding...";
    }

    public static /* synthetic */ String newAuthTabSession() {
        return "Bond information present on client, skipping bonding";
    }

    public static /* synthetic */ String onActivityLayout() {
        return "device.createBond()";
    }

    private boolean onExtraCallback(@NonNull BluetoothDevice bluetoothDevice) {
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda125
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onActivityLayout();
            }
        });
        return bluetoothDevice.createBond();
    }

    public static /* synthetic */ String writeTypedObject() {
        return "device.createBond() (hidden)";
    }

    private boolean read() throws NoSuchMethodException, SecurityException {
        Method method;
        BluetoothDevice bluetoothDevice = this.onNavigationEvent;
        if (bluetoothDevice == null) {
            return false;
        }
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda5
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.access000();
            }
        });
        if (bluetoothDevice.getBondState() == 10) {
            IAuthTabCallback(5, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda6
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.receiveFile();
                }
            });
            this.mayLaunchUrl.onNavigationEvent(bluetoothDevice);
            onExtraCallback(true);
            return true;
        }
        try {
            method = bluetoothDevice.getClass().getMethod("removeBond", null);
            IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda7
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.extraCallback();
                }
            });
            this.setEngagementSignalsCallback = true;
        } catch (Exception unused) {
        }
        return method.invoke(bluetoothDevice, null) == Boolean.TRUE;
    }

    public static /* synthetic */ String access000() {
        return "Removing bond information...";
    }

    public static /* synthetic */ String receiveFile() {
        return "Device is not bonded";
    }

    public static /* synthetic */ String extraCallback() {
        return "device.removeBond() (hidden)";
    }

    private boolean cancelNotification() {
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || !this.onTransact || bluetoothGatt.getDevice().getBondState() != 12 || (service = bluetoothGatt.getService(getReflectContext.onExtraCallbackWithResult)) == null || (characteristic = service.getCharacteristic(getReflectContext.onNavigationEvent)) == null) {
            return false;
        }
        IAuthTabCallback(4, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda57
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.ICustomTabsServiceStubProxy();
            }
        });
        return access000(characteristic);
    }

    public static /* synthetic */ String ICustomTabsServiceStubProxy() {
        return "Service Changed characteristic found on a bonded device";
    }

    private boolean access100(@Nullable final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor bluetoothGattDescriptorOnExtraCallbackWithResult;
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.onTransact || (bluetoothGattDescriptorOnExtraCallbackWithResult = onExtraCallbackWithResult(bluetoothGattCharacteristic, 16)) == null) {
            return false;
        }
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda103
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onNavigationEvent(bluetoothGattCharacteristic);
            }
        });
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda104
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onExtraCallback(bluetoothGattCharacteristic);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda105
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.ICustomTabsCallbackDefault();
                }
            });
            return bluetoothGatt.writeDescriptor(bluetoothGattDescriptorOnExtraCallbackWithResult, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE) == 0;
        }
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda106
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.validateRelationship();
            }
        });
        bluetoothGattDescriptorOnExtraCallbackWithResult.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda107
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.extraCallbackWithResult();
            }
        });
        return bluetoothGatt.writeDescriptor(bluetoothGattDescriptorOnExtraCallbackWithResult);
    }

    public static /* synthetic */ String onNavigationEvent(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", true)";
    }

    public static /* synthetic */ String onExtraCallback(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "Enabling notifications for " + bluetoothGattCharacteristic.getUuid();
    }

    public static /* synthetic */ String ICustomTabsCallbackDefault() {
        return "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb, value=0x01-00)";
    }

    public static /* synthetic */ String validateRelationship() {
        return "descriptor.setValue(0x01-00)";
    }

    public static /* synthetic */ String extraCallbackWithResult() {
        return "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb)";
    }

    private boolean getInterfaceDescriptor(@Nullable final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor bluetoothGattDescriptorOnExtraCallbackWithResult;
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.onTransact || (bluetoothGattDescriptorOnExtraCallbackWithResult = onExtraCallbackWithResult(bluetoothGattCharacteristic, 48)) == null) {
            return false;
        }
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda111
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.IAuthTabCallback(bluetoothGattCharacteristic);
            }
        });
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, false);
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda112
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.IAuthTabCallbackDefault(bluetoothGattCharacteristic);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda113
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.postMessage();
                }
            });
            return bluetoothGatt.writeDescriptor(bluetoothGattDescriptorOnExtraCallbackWithResult, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE) == 0;
        }
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda114
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.IAuthTabCallbackStub();
            }
        });
        bluetoothGattDescriptorOnExtraCallbackWithResult.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda115
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.access200();
            }
        });
        return bluetoothGatt.writeDescriptor(bluetoothGattDescriptorOnExtraCallbackWithResult);
    }

    public static /* synthetic */ String IAuthTabCallback(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", false)";
    }

    public static /* synthetic */ String IAuthTabCallbackDefault(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "Disabling notifications and indications for " + bluetoothGattCharacteristic.getUuid();
    }

    public static /* synthetic */ String postMessage() {
        return "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb, value=0x00-00)";
    }

    public static /* synthetic */ String IAuthTabCallbackStub() {
        return "descriptor.setValue(0x00-00)";
    }

    public static /* synthetic */ String access200() {
        return "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb)";
    }

    private boolean access000(@Nullable final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor bluetoothGattDescriptorOnExtraCallbackWithResult;
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.onTransact || (bluetoothGattDescriptorOnExtraCallbackWithResult = onExtraCallbackWithResult(bluetoothGattCharacteristic, 32)) == null) {
            return false;
        }
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda19
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.IAuthTabCallbackStub(bluetoothGattCharacteristic);
            }
        });
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda20
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.asInterface(bluetoothGattCharacteristic);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda21
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.isEngagementSignalsApiAvailable();
                }
            });
            return bluetoothGatt.writeDescriptor(bluetoothGattDescriptorOnExtraCallbackWithResult, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE) == 0;
        }
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda22
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.IEngagementSignalsCallbackStub();
            }
        });
        bluetoothGattDescriptorOnExtraCallbackWithResult.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda23
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onUnminimized();
            }
        });
        return bluetoothGatt.writeDescriptor(bluetoothGattDescriptorOnExtraCallbackWithResult);
    }

    public static /* synthetic */ String IAuthTabCallbackStub(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", true)";
    }

    public static /* synthetic */ String asInterface(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "Enabling indications for " + bluetoothGattCharacteristic.getUuid();
    }

    public static /* synthetic */ String isEngagementSignalsApiAvailable() {
        return "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb, value=0x02-00)";
    }

    public static /* synthetic */ String IEngagementSignalsCallbackStub() {
        return "descriptor.setValue(0x02-00)";
    }

    public static /* synthetic */ String onUnminimized() {
        return "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb)";
    }

    private boolean IAuthTabCallbackStubProxy(@Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return getInterfaceDescriptor(bluetoothGattCharacteristic);
    }

    private boolean onExtraCallbackWithResult(@Nullable final BluetoothGattCharacteristic bluetoothGattCharacteristic, final boolean z, @Nullable final byte[] bArr) {
        BluetoothGattDescriptor descriptor;
        getDiskCacheDirPath getdiskcachedirpath = this.postMessage;
        if (getdiskcachedirpath == null || getdiskcachedirpath.onNavigationEvent() == null || bluetoothGattCharacteristic == null) {
            return false;
        }
        if (((z ? 32 : 16) & bluetoothGattCharacteristic.getProperties()) == 0 || (descriptor = bluetoothGattCharacteristic.getDescriptor(getReflectContext.onExtraCallback)) == null) {
            return false;
        }
        Map<BluetoothGattDescriptor, byte[]> map = this.readTypedObject;
        byte[] value = (map == null || !map.containsKey(descriptor)) ? descriptor.getValue() : this.readTypedObject.get(descriptor);
        if (value != null && value.length == 2 && value[0] != 0) {
            IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda98
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.onExtraCallback(z, bluetoothGattCharacteristic);
                }
            });
            if (Build.VERSION.SDK_INT >= 33) {
                IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda99
                    @Override // o.BusMonitorDependWrapper1.onExtraCallback
                    public final String log() {
                        return BusMonitorDependWrapper1.onNavigationEvent(bluetoothGattCharacteristic, z, bArr);
                    }
                });
                return this.postMessage.onNavigationEvent().notifyCharacteristicChanged(this.onNavigationEvent, bluetoothGattCharacteristic, z, bArr) == 0;
            }
            IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda100
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.IAuthTabCallback(bArr);
                }
            });
            bluetoothGattCharacteristic.setValue(bArr);
            IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda101
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.IAuthTabCallback(bluetoothGattCharacteristic, z);
                }
            });
            return this.postMessage.onNavigationEvent().notifyCharacteristicChanged(this.onNavigationEvent, bluetoothGattCharacteristic, z);
        }
        onExtraCallback(true);
        return true;
    }

    public static /* synthetic */ String onExtraCallback(boolean z, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        StringBuilder sb = new StringBuilder();
        sb.append("[Server] Sending ");
        sb.append(z ? "indication" : "notification");
        sb.append(" to ");
        sb.append(bluetoothGattCharacteristic.getUuid());
        return sb.toString();
    }

    public static /* synthetic */ String onNavigationEvent(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, byte[] bArr) {
        return "[Server] gattServer.notifyCharacteristicChanged(" + bluetoothGattCharacteristic.getUuid() + ", confirm=" + z + ", value=" + IABLandingPageActivity4.onExtraCallback(bArr) + ")";
    }

    public static /* synthetic */ String IAuthTabCallback(byte[] bArr) {
        return "[Server] characteristic.setValue(" + IABLandingPageActivity4.onExtraCallback(bArr) + ")";
    }

    public static /* synthetic */ String IAuthTabCallback(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        return "[Server] gattServer.notifyCharacteristicChanged(" + bluetoothGattCharacteristic.getUuid() + ", confirm=" + z + ")";
    }

    public static /* synthetic */ void onWarmupCompleted(BusMonitorDependWrapper1 busMonitorDependWrapper1) {
        busMonitorDependWrapper1.onExtraCallbackWithResult(busMonitorDependWrapper1.onNavigationEvent);
        busMonitorDependWrapper1.onExtraCallback(true);
    }

    private static BluetoothGattDescriptor onExtraCallbackWithResult(@Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        if (bluetoothGattCharacteristic == null || (i & bluetoothGattCharacteristic.getProperties()) == 0) {
            return null;
        }
        return bluetoothGattCharacteristic.getDescriptor(getReflectContext.onExtraCallback);
    }

    private boolean IAuthTabCallback_Parcel(@Nullable final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.onTransact || (bluetoothGattCharacteristic.getProperties() & 2) == 0) {
            return false;
        }
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda77
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onTransact(bluetoothGattCharacteristic);
            }
        });
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda78
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.asBinder(bluetoothGattCharacteristic);
            }
        });
        return bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
    }

    public static /* synthetic */ String onTransact(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "Reading characteristic " + bluetoothGattCharacteristic.getUuid();
    }

    public static /* synthetic */ String asBinder(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "gatt.readCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")";
    }

    private boolean onExtraCallbackWithResult(@Nullable final BluetoothGattCharacteristic bluetoothGattCharacteristic, @Nullable final byte[] bArr, final int i) {
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.onTransact || (bluetoothGattCharacteristic.getProperties() & 12) == 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda66
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.onExtraCallback(bluetoothGattCharacteristic, i);
                }
            });
            IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda67
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.IAuthTabCallback(bluetoothGattCharacteristic, bArr, i);
                }
            });
            return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, i) == 0;
        }
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda68
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onNavigationEvent(bluetoothGattCharacteristic, i);
            }
        });
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda69
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onWarmupCompleted(bArr);
            }
        });
        bluetoothGattCharacteristic.setValue(bArr);
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda70
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onExtraCallback(i);
            }
        });
        bluetoothGattCharacteristic.setWriteType(i);
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda71
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onExtraCallbackWithResult(bluetoothGattCharacteristic);
            }
        });
        return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
    }

    public static /* synthetic */ String onExtraCallback(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return "Writing characteristic " + bluetoothGattCharacteristic.getUuid() + " (" + IABLandingPageActivity4.IAuthTabCallbackStub(i) + ")";
    }

    public static /* synthetic */ String IAuthTabCallback(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        return "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ", value=" + IABLandingPageActivity4.onExtraCallback(bArr) + ", " + IABLandingPageActivity4.IAuthTabCallbackStub(i) + ")";
    }

    public static /* synthetic */ String onNavigationEvent(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return "Writing characteristic " + bluetoothGattCharacteristic.getUuid() + " (" + IABLandingPageActivity4.IAuthTabCallbackStub(i) + ")";
    }

    public static /* synthetic */ String onWarmupCompleted(byte[] bArr) {
        return "characteristic.setValue(" + IABLandingPageActivity4.onExtraCallback(bArr) + ")";
    }

    public static /* synthetic */ String onExtraCallback(int i) {
        return "characteristic.setWriteType(" + IABLandingPageActivity4.IAuthTabCallbackStub(i) + ")";
    }

    public static /* synthetic */ String onExtraCallbackWithResult(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")";
    }

    private boolean IAuthTabCallbackDefault(@Nullable final BluetoothGattDescriptor bluetoothGattDescriptor) {
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || bluetoothGattDescriptor == null || !this.onTransact) {
            return false;
        }
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda0
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onWarmupCompleted(bluetoothGattDescriptor);
            }
        });
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda1
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onExtraCallbackWithResult(bluetoothGattDescriptor);
            }
        });
        return bluetoothGatt.readDescriptor(bluetoothGattDescriptor);
    }

    public static /* synthetic */ String onWarmupCompleted(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "Reading descriptor " + bluetoothGattDescriptor.getUuid();
    }

    public static /* synthetic */ String onExtraCallbackWithResult(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "gatt.readDescriptor(" + bluetoothGattDescriptor.getUuid() + ")";
    }

    private boolean IAuthTabCallback(@Nullable final BluetoothGattDescriptor bluetoothGattDescriptor, @Nullable final byte[] bArr) {
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || bluetoothGattDescriptor == null || !this.onTransact) {
            return false;
        }
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda8
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onTransact(bluetoothGattDescriptor);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda9
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.onWarmupCompleted(bluetoothGattDescriptor, bArr);
                }
            });
            return bluetoothGatt.writeDescriptor(bluetoothGattDescriptor, bArr) == 0;
        }
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda10
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.IAuthTabCallback(bluetoothGattDescriptor);
            }
        });
        bluetoothGattDescriptor.setValue(bArr);
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda11
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onExtraCallback(bluetoothGattDescriptor);
            }
        });
        return asBinder(bluetoothGattDescriptor);
    }

    public static /* synthetic */ String onTransact(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "Writing descriptor " + bluetoothGattDescriptor.getUuid();
    }

    public static /* synthetic */ String onWarmupCompleted(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        return "gatt.writeDescriptor(" + bluetoothGattDescriptor.getUuid() + ", value=" + IABLandingPageActivity4.onExtraCallback(bArr) + ")";
    }

    public static /* synthetic */ String IAuthTabCallback(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "descriptor.setValue(" + bluetoothGattDescriptor.getUuid() + ")";
    }

    public static /* synthetic */ String onExtraCallback(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "gatt.writeDescriptor(" + bluetoothGattDescriptor.getUuid() + ")";
    }

    private boolean asBinder(@Nullable BluetoothGattDescriptor bluetoothGattDescriptor) {
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || bluetoothGattDescriptor == null || !this.onTransact) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
        int writeType = characteristic.getWriteType();
        characteristic.setWriteType(2);
        boolean zWriteDescriptor = bluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
        characteristic.setWriteType(writeType);
        return zWriteDescriptor;
    }

    private boolean getSmallIconId() {
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || !this.onTransact) {
            return false;
        }
        if (this.extraCommand) {
            return true;
        }
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda12
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.IEngagementSignalsCallback_Parcel();
            }
        });
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda13
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.IEngagementSignalsCallbackDefault();
            }
        });
        boolean zBeginReliableWrite = bluetoothGatt.beginReliableWrite();
        this.extraCommand = zBeginReliableWrite;
        return zBeginReliableWrite;
    }

    public static /* synthetic */ String IEngagementSignalsCallback_Parcel() {
        return "Beginning reliable write...";
    }

    public static /* synthetic */ String IEngagementSignalsCallbackDefault() {
        return "gatt.beginReliableWrite()";
    }

    private boolean getActiveNotifications() {
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || !this.onTransact || !this.extraCommand) {
            return false;
        }
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda55
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.ICustomTabsService();
            }
        });
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda56
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.requestPostMessageChannelWithExtras();
            }
        });
        return bluetoothGatt.executeReliableWrite();
    }

    public static /* synthetic */ String ICustomTabsService() {
        return "Executing reliable write...";
    }

    public static /* synthetic */ String requestPostMessageChannelWithExtras() {
        return "gatt.executeReliableWrite()";
    }

    private boolean notifyNotificationWithChannel() {
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || !this.onTransact || !this.extraCommand) {
            return false;
        }
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda91
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.ICustomTabsCallbackStub();
            }
        });
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda92
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.IAuthTabCallbackStubProxy();
            }
        });
        bluetoothGatt.abortReliableWrite();
        return true;
    }

    public static /* synthetic */ String ICustomTabsCallbackStub() {
        return "Aborting reliable write...";
    }

    public static /* synthetic */ String IAuthTabCallbackStubProxy() {
        return "gatt.abortReliableWrite()";
    }

    public static /* synthetic */ String asBinder() {
        return "gatt.abortReliableWrite(device)";
    }

    @Deprecated
    private boolean ITrustedWebActivityServiceDefault() {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || !this.onTransact || (service = bluetoothGatt.getService(getReflectContext.IAuthTabCallback)) == null) {
            return false;
        }
        return IAuthTabCallback_Parcel(service.getCharacteristic(getReflectContext.onWarmupCompleted));
    }

    @Deprecated
    private boolean onNavigationEvent(boolean z) {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || !this.onTransact || (service = bluetoothGatt.getService(getReflectContext.IAuthTabCallback)) == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(getReflectContext.onWarmupCompleted);
        if (z) {
            return access100(characteristic);
        }
        return getInterfaceDescriptor(characteristic);
    }

    private boolean access100(final int i) {
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || !this.onTransact) {
            return false;
        }
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda118
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.warmup();
            }
        });
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda119
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.IAuthTabCallbackDefault(i);
            }
        });
        return bluetoothGatt.requestMtu(i);
    }

    public static /* synthetic */ String warmup() {
        return "Requesting new MTU...";
    }

    public static /* synthetic */ String IAuthTabCallbackDefault(int i) {
        return "gatt.requestMtu(" + i + ")";
    }

    private boolean access000(final int i) {
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || !this.onTransact) {
            return false;
        }
        final int i2 = Build.VERSION.SDK_INT >= 26 ? 5 : 20;
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda2
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.IAuthTabCallback(i, i2);
            }
        });
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda3
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.asInterface(i);
            }
        });
        return bluetoothGatt.requestConnectionPriority(i);
    }

    public static /* synthetic */ String IAuthTabCallback(int i, int i2) {
        String str;
        if (i == 1) {
            str = "HIGH (11.25–15ms, 0, " + i2 + "s)";
        } else if (i == 2) {
            str = "LOW POWER (100–125ms, 2, " + i2 + "s)";
        } else {
            str = "BALANCED (30–50ms, 0, " + i2 + "s)";
        }
        return "Requesting connection priority: " + str + "...";
    }

    public static /* synthetic */ String asInterface(int i) {
        String str;
        if (i == 1) {
            str = "HIGH";
        } else if (i == 2) {
            str = "LOW POWER";
        } else {
            str = "BALANCED";
        }
        return "gatt.requestConnectionPriority(" + str + ")";
    }

    private boolean onNavigationEvent(final int i, final int i2, final int i3) {
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || !this.onTransact) {
            return false;
        }
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda122
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.ICustomTabsServiceStub();
            }
        });
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda123
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onExtraCallback(i, i2, i3);
            }
        });
        bluetoothGatt.setPreferredPhy(i, i2, i3);
        return true;
    }

    public static /* synthetic */ String ICustomTabsServiceStub() {
        return "Requesting preferred PHYs...";
    }

    public static /* synthetic */ String onExtraCallback(int i, int i2, int i3) {
        return "gatt.setPreferredPhy(" + IABLandingPageActivity4.IAuthTabCallback(i) + ", " + IABLandingPageActivity4.IAuthTabCallback(i2) + ", coding option = " + IABLandingPageActivity4.onNavigationEvent(i3) + ")";
    }

    private boolean ITrustedWebActivityServiceStubProxy() {
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || !this.onTransact) {
            return false;
        }
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda24
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.extraCommand();
            }
        });
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda25
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.getInterfaceDescriptor();
            }
        });
        bluetoothGatt.readPhy();
        return true;
    }

    public static /* synthetic */ String extraCommand() {
        return "Reading PHY...";
    }

    public static /* synthetic */ String getInterfaceDescriptor() {
        return "gatt.readPhy()";
    }

    private boolean ITrustedWebActivityServiceStub() {
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null || !this.onTransact) {
            return false;
        }
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda94
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.newSessionWithExtras();
            }
        });
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda95
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onSessionEnded();
            }
        });
        return bluetoothGatt.readRemoteRssi();
    }

    public static /* synthetic */ String newSessionWithExtras() {
        return "Reading remote RSSI...";
    }

    public static /* synthetic */ String onSessionEnded() {
        return "gatt.readRemoteRssi()";
    }

    @Deprecated
    TTAdConstantNETWORK_STATE ITrustedWebActivityCallbackDefault() {
        return new BleManagerHandler$.ExternalSyntheticLambda14(this);
    }

    public static /* synthetic */ void onNavigationEvent(BusMonitorDependWrapper1 busMonitorDependWrapper1, BluetoothDevice bluetoothDevice, loss lossVar) {
        if (lossVar.onExtraCallback() == 1) {
            int iIntValue = lossVar.onExtraCallbackWithResult(17, 0).intValue();
            busMonitorDependWrapper1.IAuthTabCallback(4, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda116(iIntValue));
            busMonitorDependWrapper1.onWarmupCompleted = iIntValue;
            BluetoothGatt bluetoothGatt = busMonitorDependWrapper1.IAuthTabCallbackDefault;
            busMonitorDependWrapper1.onExtraCallback((onNavigationEvent) new BleManagerHandler$.ExternalSyntheticLambda117(bluetoothDevice, iIntValue));
        }
    }

    public static /* synthetic */ String onExtraCallbackWithResult(int i) {
        return "Battery Level received: " + i + "%";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public void ITrustedWebActivityCallback_Parcel() {
        if (this.onExtraCallbackWithResult == null) {
            this.onExtraCallbackWithResult = new getOptions(this).onExtraCallbackWithResult(new BleManagerHandler$.ExternalSyntheticLambda62(this));
        }
    }

    public static /* synthetic */ void onWarmupCompleted(BusMonitorDependWrapper1 busMonitorDependWrapper1, BluetoothDevice bluetoothDevice, loss lossVar) {
        if (lossVar.onExtraCallback() == 1) {
            int iIntValue = lossVar.onExtraCallbackWithResult(17, 0).intValue();
            busMonitorDependWrapper1.onWarmupCompleted = iIntValue;
            BluetoothGatt bluetoothGatt = busMonitorDependWrapper1.IAuthTabCallbackDefault;
            busMonitorDependWrapper1.onExtraCallback((onNavigationEvent) new BleManagerHandler$.ExternalSyntheticLambda26(bluetoothDevice, iIntValue));
        }
    }

    private boolean RemoteActionCompatParcelizer() {
        BluetoothGatt bluetoothGatt = this.IAuthTabCallbackDefault;
        if (bluetoothGatt == null) {
            return false;
        }
        IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda73
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.IEngagementSignalsCallbackStubProxy();
            }
        });
        IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda74
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.writeTypedList();
            }
        });
        try {
            return bluetoothGatt.getClass().getMethod("refresh", null).invoke(bluetoothGatt, null) == Boolean.TRUE;
        } catch (Exception unused) {
            IAuthTabCallback(5, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda75
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.onExtraCallbackWithResult();
                }
            });
            return false;
        }
    }

    public static /* synthetic */ String IEngagementSignalsCallbackStubProxy() {
        return "Refreshing device cache...";
    }

    public static /* synthetic */ String writeTypedList() {
        return "gatt.refresh() (hidden)";
    }

    public static /* synthetic */ String onExtraCallbackWithResult() {
        return "gatt.refresh() method not found";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallback(@NonNull Request request) {
        Deque<Request> deque;
        RequestQueue requestQueue = this.ICustomTabsCallback_Parcel;
        if (requestQueue == null) {
            if (!this.onMessageChannelReady || (deque = this.onActivityResized) == null) {
                deque = this.prefetch;
            }
            deque.addFirst(request);
        } else {
            requestQueue.IAuthTabCallback(request);
        }
        request.onExtraCallbackWithResult = true;
        this.ICustomTabsCallbackDefault = false;
    }

    @Override // no.nordicsemi.android.ble.RequestHandler
    public final void onExtraCallback(@NonNull Request request) {
        Deque<Request> deque;
        if (!request.onExtraCallbackWithResult) {
            if (!this.onMessageChannelReady || (deque = this.onActivityResized) == null) {
                deque = this.prefetch;
            }
            deque.add(request);
            request.onExtraCallbackWithResult = true;
        }
        onExtraCallback(false);
    }

    @Override // no.nordicsemi.android.ble.RequestHandler
    public final void IPostMessageServiceStubProxy() {
        this.prefetch.clear();
        this.onActivityResized = null;
        this.onMessageChannelReady = false;
        BluetoothDevice bluetoothDevice = this.onNavigationEvent;
        if (bluetoothDevice != null) {
            if (this.ICustomTabsCallbackDefault) {
                ITrustedWebActivityCallback();
            }
            CustomEventInterstitialListener customEventInterstitialListener = this.asInterface;
            if (customEventInterstitialListener != null) {
                customEventInterstitialListener.onExtraCallbackWithResult(bluetoothDevice, -7);
                this.asInterface = null;
                asBinder(5);
            }
        }
    }

    @Override // no.nordicsemi.android.ble.RequestHandler
    public final void ITrustedWebActivityCallback() {
        BluetoothDevice bluetoothDevice = this.onNavigationEvent;
        if (bluetoothDevice == null) {
            return;
        }
        IAuthTabCallback(5, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda72());
        Request request = this.mayLaunchUrl;
        if (request instanceof getIsSelected) {
            request.onExtraCallbackWithResult(bluetoothDevice, -7);
        }
        getOnceLogInterval<?> getonceloginterval = this.onExtraCallback;
        if (getonceloginterval != null) {
            getonceloginterval.onExtraCallbackWithResult(bluetoothDevice, -7);
            this.onExtraCallback = null;
        }
        RequestQueue requestQueue = this.ICustomTabsCallback_Parcel;
        if (requestQueue instanceof ReliableWriteRequest) {
            requestQueue.onExtraCallbackWithResult();
        } else if (requestQueue != null) {
            requestQueue.onExtraCallbackWithResult(bluetoothDevice, -7);
            this.ICustomTabsCallback_Parcel = null;
        }
        Request request2 = this.mayLaunchUrl;
        onExtraCallback(request2 == null || request2.onTransact);
    }

    public static /* synthetic */ String onGreatestScrollPercentageIncreased() {
        return "Request cancelled";
    }

    @Override // no.nordicsemi.android.ble.RequestHandler
    public final void onWarmupCompleted(@NonNull BluetoothDevice bluetoothDevice, @NonNull getIsSelected getisselected) {
        if (getisselected instanceof onInterstitialShowFail) {
            getisselected.onNavigationEvent(bluetoothDevice);
        } else {
            IAuthTabCallback(5, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda124
                @Override // o.BusMonitorDependWrapper1.onExtraCallback
                public final String log() {
                    return BusMonitorDependWrapper1.IEngagementSignalsCallback();
                }
            });
        }
        Request request = this.mayLaunchUrl;
        if (request instanceof getIsSelected) {
            request.onExtraCallbackWithResult(bluetoothDevice, -5);
        }
        getOnceLogInterval<?> getonceloginterval = this.onExtraCallback;
        if (getonceloginterval != null) {
            getonceloginterval.onExtraCallbackWithResult(bluetoothDevice, -5);
            this.onExtraCallback = null;
        }
        getisselected.onExtraCallbackWithResult(bluetoothDevice, -5);
        Request.Type type = getisselected.extraCallback;
        if (type == Request.Type.CONNECT) {
            this.asInterface = null;
            asBinder(10);
        } else if (type == Request.Type.DISCONNECT) {
            IPostMessageService_Parcel();
        } else {
            Request request2 = this.mayLaunchUrl;
            onExtraCallback(request2 == null || request2.onTransact);
        }
    }

    public static /* synthetic */ String IEngagementSignalsCallback() {
        return "Request timed out";
    }

    @Override // o.isMonitorOpen
    public void onExtraCallbackWithResult(@NonNull Runnable runnable) {
        this.extraCallbackWithResult.post(runnable);
    }

    @Override // o.isMonitorOpen
    public void onNavigationEvent(@NonNull Runnable runnable, long j) {
        this.extraCallbackWithResult.postDelayed(runnable, j);
    }

    @Override // o.isMonitorOpen
    public void onWarmupCompleted(@NonNull Runnable runnable) {
        this.extraCallbackWithResult.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public void onExtraCallback(@NonNull final onNavigationEvent onnavigationevent) {
        final onMonitorUpload onmonitorupload = this.ICustomTabsCallbackStubProxy.asInterface;
        if (onmonitorupload != null) {
            onExtraCallbackWithResult(new Runnable() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    onnavigationevent.run(onmonitorupload);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallback(@NonNull onWarmupCompleted onwarmupcompleted) {
        TTUnifyWebActivity tTUnifyWebActivity = this.ICustomTabsCallbackStubProxy.IAuthTabCallbackDefault;
        if (tTUnifyWebActivity != null) {
            onExtraCallbackWithResult((Runnable) new BleManagerHandler$.ExternalSyntheticLambda51(onwarmupcompleted, tTUnifyWebActivity));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onExtraCallbackWithResult(@NonNull final onExtraCallbackWithResult onextracallbackwithresult) {
        final IABLandingPageActivity21 iABLandingPageActivity21 = this.ICustomTabsCallbackStubProxy.IAuthTabCallbackStub;
        if (iABLandingPageActivity21 != null) {
            onExtraCallbackWithResult(new Runnable() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda76
                @Override // java.lang.Runnable
                public final void run() {
                    onextracallbackwithresult.run(iABLandingPageActivity21);
                }
            });
        }
    }

    final boolean areNotificationsEnabled() {
        return this.onTransact;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWarmupCompleted(@NonNull BluetoothDevice bluetoothDevice, int i) {
        boolean z = this.onTransact;
        this.onTransact = false;
        this.isEngagementSignalsApiAvailable = false;
        this.newSession = false;
        this.newAuthTabSession = false;
        this.ICustomTabsCallback = false;
        this.onRelationshipValidationResult = 23;
        this.newSessionWithExtras = 0;
        this.onActivityLayout = 0;
        this.onMinimized = 0;
        this.getInterfaceDescriptor = 0;
        ITrustedWebActivityCallbackStubProxy();
        if (!z) {
            IAuthTabCallback(5, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda79());
            IPostMessageService_Parcel();
            onExtraCallback((onNavigationEvent) new BleManagerHandler$.ExternalSyntheticLambda80(bluetoothDevice));
            onExtraCallbackWithResult((onExtraCallbackWithResult) new BleManagerHandler$.ExternalSyntheticLambda81(bluetoothDevice, i));
        } else if (this.setEngagementSignalsCallback) {
            IAuthTabCallback(4, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda82());
            Request request = this.mayLaunchUrl;
            if (request == null || request.extraCallback != Request.Type.REMOVE_BOND) {
                IPostMessageService_Parcel();
            }
            onExtraCallback((onNavigationEvent) new BleManagerHandler$.ExternalSyntheticLambda83(bluetoothDevice));
            onExtraCallbackWithResult((onExtraCallbackWithResult) new BleManagerHandler$.ExternalSyntheticLambda84(bluetoothDevice, i));
            if (request != null && request.extraCallback == Request.Type.DISCONNECT) {
                request.onNavigationEvent(bluetoothDevice);
                this.mayLaunchUrl = null;
            }
        } else {
            IAuthTabCallback(5, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda85());
            onExtraCallback((onNavigationEvent) new BleManagerHandler$.ExternalSyntheticLambda86(bluetoothDevice));
            onExtraCallbackWithResult((onExtraCallbackWithResult) new BleManagerHandler$.ExternalSyntheticLambda87(bluetoothDevice, i != 2 ? 3 : 2));
        }
        Iterator<getOptions> it = this.requestPostMessageChannelWithExtras.values().iterator();
        while (it.hasNext()) {
            it.next().onWarmupCompleted();
        }
        this.requestPostMessageChannelWithExtras.clear();
        this.writeTypedObject.clear();
        this.onExtraCallbackWithResult = null;
        this.onWarmupCompleted = -1;
        this.ICustomTabsCallbackStubProxy.onExtraCallbackWithResult();
    }

    public static /* synthetic */ String ICustomTabsServiceDefault() {
        return "Connection attempt timed out";
    }

    public static /* synthetic */ String IAuthTabCallbackDefault() {
        return "Disconnected";
    }

    public static /* synthetic */ String onPostMessage() {
        return "Connection lost";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNavigationEvent(BluetoothDevice bluetoothDevice, String str, int i) {
        IAuthTabCallback(6, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda58(i));
        onExtraCallback((onNavigationEvent) new BleManagerHandler$.ExternalSyntheticLambda59(bluetoothDevice, str, i));
    }

    public static /* synthetic */ String onTransact(int i) {
        return "Error (0x" + Integer.toHexString(i) + "): " + onSuggestionSubmit.onExtraCallbackWithResult(i);
    }

    public static /* synthetic */ String onNavigationEvent(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, int i2) {
        return "[Server callback] Read request for characteristic " + bluetoothGattCharacteristic.getUuid() + " (requestId=" + i + ", offset: " + i2 + ")";
    }

    final void onExtraCallback(@NonNull BluetoothGattServer bluetoothGattServer, @NonNull BluetoothDevice bluetoothDevice, int i, int i2, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        FilterWord filterWord;
        IAuthTabCallback(3, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda138(bluetoothGattCharacteristic, i, i2));
        if (i2 == 0) {
            IAuthTabCallback(4, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda139(bluetoothGattCharacteristic));
        }
        getLayoutParams getlayoutparams = this.writeTypedObject.get(bluetoothGattCharacteristic);
        byte[] bArrOnExtraCallbackWithResult = (i2 != 0 || getlayoutparams == null) ? null : getlayoutparams.onExtraCallbackWithResult(bluetoothDevice);
        if (bArrOnExtraCallbackWithResult != null) {
            onExtraCallbackWithResult(bluetoothGattCharacteristic, bArrOnExtraCallbackWithResult);
        } else {
            Map<BluetoothGattCharacteristic, byte[]> map = this.asBinder;
            if (map == null || !map.containsKey(bluetoothGattCharacteristic)) {
                bArrOnExtraCallbackWithResult = bluetoothGattCharacteristic.getValue();
            } else {
                bArrOnExtraCallbackWithResult = this.asBinder.get(bluetoothGattCharacteristic);
            }
        }
        getOnceLogInterval<?> getonceloginterval = this.onExtraCallback;
        if ((getonceloginterval instanceof FilterWord) && getonceloginterval.onWarmupCompleted == bluetoothGattCharacteristic && !getonceloginterval.onNavigationEvent()) {
            FilterWord filterWord2 = (FilterWord) this.onExtraCallback;
            filterWord2.onWarmupCompleted(bArrOnExtraCallbackWithResult);
            bArrOnExtraCallbackWithResult = filterWord2.onExtraCallbackWithResult(this.onRelationshipValidationResult);
            filterWord = filterWord2;
        } else {
            filterWord = null;
        }
        if (bArrOnExtraCallbackWithResult != null) {
            int length = bArrOnExtraCallbackWithResult.length;
            int i3 = this.onRelationshipValidationResult - 1;
            if (length > i3) {
                bArrOnExtraCallbackWithResult = CacheDirFactory.IAuthTabCallback(bArrOnExtraCallbackWithResult, i2, i3);
            }
        }
        byte[] bArr = bArrOnExtraCallbackWithResult;
        onExtraCallback(bluetoothGattServer, bluetoothDevice, 0, i, i2, bArr);
        if (filterWord != null) {
            filterWord.IAuthTabCallback(bluetoothDevice, bArr);
            if (filterWord.onWarmupCompleted()) {
                return;
            }
            if (bArr == null || bArr.length < this.onRelationshipValidationResult - 1) {
                IAuthTabCallback(4, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda140());
                filterWord.onNavigationEvent(bluetoothDevice);
                this.onExtraCallback = null;
                onExtraCallback(true);
                return;
            }
            return;
        }
        if (ITrustedWebActivityCallbackStubProxy()) {
            onExtraCallback(true);
        }
    }

    public static /* synthetic */ String onWarmupCompleted(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "[Server] READ request for characteristic " + bluetoothGattCharacteristic.getUuid() + " received";
    }

    public static /* synthetic */ String IAuthTabCallback_Parcel() {
        return "Wait for read complete";
    }

    final void onExtraCallbackWithResult(@NonNull BluetoothGattServer bluetoothGattServer, @NonNull BluetoothDevice bluetoothDevice, int i, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, boolean z2, int i2, @NonNull byte[] bArr) {
        IAuthTabCallback(3, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda53(z2, bluetoothGattCharacteristic, i, z, i2, bArr));
        if (i2 == 0) {
            IAuthTabCallback(4, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda54(z2, z, bluetoothGattCharacteristic, bArr));
        }
        if (z2) {
            onExtraCallback(bluetoothGattServer, bluetoothDevice, 0, i, i2, bArr);
        }
        if (z) {
            if (this.ICustomTabsService == null) {
                this.ICustomTabsService = new LinkedList();
            }
            if (i2 == 0) {
                this.ICustomTabsService.offer(new Pair<>(bluetoothGattCharacteristic, bArr));
                return;
            }
            Pair<Object, byte[]> pairPeekLast = this.ICustomTabsService.peekLast();
            if (pairPeekLast != null && bluetoothGattCharacteristic.equals(pairPeekLast.first)) {
                this.ICustomTabsService.pollLast();
                this.ICustomTabsService.offer(new Pair<>(bluetoothGattCharacteristic, CacheDirFactory.onWarmupCompleted((byte[]) pairPeekLast.second, bArr, i2)));
                return;
            } else {
                this.ICustomTabsCallbackStub = 7;
                return;
            }
        }
        if (onWarmupCompleted(bluetoothDevice, bluetoothGattCharacteristic, bArr) || ITrustedWebActivityCallbackStubProxy()) {
            onExtraCallback(true);
        }
    }

    public static /* synthetic */ String IAuthTabCallback(boolean z, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, boolean z2, int i2, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[Server callback] Write ");
        sb.append(z ? "request" : "command");
        sb.append(" to characteristic ");
        sb.append(bluetoothGattCharacteristic.getUuid());
        sb.append(" (requestId=");
        sb.append(i);
        sb.append(", prepareWrite=");
        sb.append(z2);
        sb.append(", responseNeeded=");
        sb.append(z);
        sb.append(", offset: ");
        sb.append(i2);
        sb.append(", value=");
        sb.append(IABLandingPageActivity4.onExtraCallback(bArr));
        sb.append(")");
        return sb.toString();
    }

    public static /* synthetic */ String onExtraCallback(boolean z, boolean z2, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        String str = z ? "WRITE REQUEST" : "WRITE COMMAND";
        return "[Server] " + (z2 ? "Prepare " : _UrlKt.FRAGMENT_ENCODE_SET) + str + " for characteristic " + bluetoothGattCharacteristic.getUuid() + " received, value: " + IABLandingPageActivity4.onExtraCallbackWithResult(bArr);
    }

    final void onExtraCallbackWithResult(@NonNull BluetoothGattServer bluetoothGattServer, @NonNull BluetoothDevice bluetoothDevice, int i, int i2, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor) {
        FilterWord filterWord;
        IAuthTabCallback(3, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda96(bluetoothGattDescriptor, i, i2));
        if (i2 == 0) {
            IAuthTabCallback(4, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda97(bluetoothGattDescriptor));
        }
        getLayoutParams getlayoutparams = this.writeTypedObject.get(bluetoothGattDescriptor);
        byte[] bArrOnExtraCallbackWithResult = (i2 != 0 || getlayoutparams == null) ? null : getlayoutparams.onExtraCallbackWithResult(bluetoothDevice);
        if (bArrOnExtraCallbackWithResult != null) {
            onExtraCallback(bluetoothGattDescriptor, bArrOnExtraCallbackWithResult);
        } else {
            Map<BluetoothGattDescriptor, byte[]> map = this.readTypedObject;
            if (map == null || !map.containsKey(bluetoothGattDescriptor)) {
                bArrOnExtraCallbackWithResult = bluetoothGattDescriptor.getValue();
            } else {
                bArrOnExtraCallbackWithResult = this.readTypedObject.get(bluetoothGattDescriptor);
            }
        }
        getOnceLogInterval<?> getonceloginterval = this.onExtraCallback;
        if ((getonceloginterval instanceof FilterWord) && getonceloginterval.IAuthTabCallback == bluetoothGattDescriptor && !getonceloginterval.onNavigationEvent()) {
            filterWord = (FilterWord) this.onExtraCallback;
            filterWord.onWarmupCompleted(bArrOnExtraCallbackWithResult);
            bArrOnExtraCallbackWithResult = filterWord.onExtraCallbackWithResult(this.onRelationshipValidationResult);
        } else {
            filterWord = null;
        }
        if (bArrOnExtraCallbackWithResult != null) {
            int length = bArrOnExtraCallbackWithResult.length;
            int i3 = this.onRelationshipValidationResult - 1;
            if (length > i3) {
                bArrOnExtraCallbackWithResult = CacheDirFactory.IAuthTabCallback(bArrOnExtraCallbackWithResult, i2, i3);
            }
        }
        onExtraCallback(bluetoothGattServer, bluetoothDevice, 0, i, i2, bArrOnExtraCallbackWithResult);
        if (filterWord != null) {
            filterWord.IAuthTabCallback(bluetoothDevice, bArrOnExtraCallbackWithResult);
            if (filterWord.onWarmupCompleted()) {
                return;
            }
            if (bArrOnExtraCallbackWithResult == null || bArrOnExtraCallbackWithResult.length < this.onRelationshipValidationResult - 1) {
                filterWord.onNavigationEvent(bluetoothDevice);
                this.onExtraCallback = null;
                onExtraCallback(true);
                return;
            }
            return;
        }
        if (ITrustedWebActivityCallbackStubProxy()) {
            onExtraCallback(true);
        }
    }

    public static /* synthetic */ String onExtraCallbackWithResult(BluetoothGattDescriptor bluetoothGattDescriptor, int i, int i2) {
        return "[Server callback] Read request for descriptor " + bluetoothGattDescriptor.getUuid() + " (requestId=" + i + ", offset: " + i2 + ")";
    }

    public static /* synthetic */ String onNavigationEvent(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "[Server] READ request for descriptor " + bluetoothGattDescriptor.getUuid() + " received";
    }

    final void onNavigationEvent(@NonNull BluetoothGattServer bluetoothGattServer, @NonNull BluetoothDevice bluetoothDevice, int i, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor, boolean z, boolean z2, int i2, @NonNull byte[] bArr) {
        IAuthTabCallback(3, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda120(z2, bluetoothGattDescriptor, i, z, i2, bArr));
        if (i2 == 0) {
            IAuthTabCallback(4, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda121(z2, z, bluetoothGattDescriptor, bArr));
        }
        if (z2) {
            onExtraCallback(bluetoothGattServer, bluetoothDevice, 0, i, i2, bArr);
        }
        if (z) {
            if (this.ICustomTabsService == null) {
                this.ICustomTabsService = new LinkedList();
            }
            if (i2 == 0) {
                this.ICustomTabsService.offer(new Pair<>(bluetoothGattDescriptor, bArr));
                return;
            }
            Pair<Object, byte[]> pairPeekLast = this.ICustomTabsService.peekLast();
            if (pairPeekLast != null && bluetoothGattDescriptor.equals(pairPeekLast.first)) {
                this.ICustomTabsService.pollLast();
                this.ICustomTabsService.offer(new Pair<>(bluetoothGattDescriptor, CacheDirFactory.onWarmupCompleted((byte[]) pairPeekLast.second, bArr, i2)));
                return;
            } else {
                this.ICustomTabsCallbackStub = 7;
                return;
            }
        }
        if (onExtraCallback(bluetoothDevice, bluetoothGattDescriptor, bArr) || ITrustedWebActivityCallbackStubProxy()) {
            onExtraCallback(true);
        }
    }

    public static /* synthetic */ String onWarmupCompleted(boolean z, BluetoothGattDescriptor bluetoothGattDescriptor, int i, boolean z2, int i2, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[Server callback] Write ");
        sb.append(z ? "request" : "command");
        sb.append(" to descriptor ");
        sb.append(bluetoothGattDescriptor.getUuid());
        sb.append(" (requestId=");
        sb.append(i);
        sb.append(", prepareWrite=");
        sb.append(z2);
        sb.append(", responseNeeded=");
        sb.append(z);
        sb.append(", offset: ");
        sb.append(i2);
        sb.append(", value=");
        sb.append(IABLandingPageActivity4.onExtraCallback(bArr));
        sb.append(")");
        return sb.toString();
    }

    public static /* synthetic */ String onNavigationEvent(boolean z, boolean z2, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        String str = z ? "WRITE REQUEST" : "WRITE COMMAND";
        return "[Server] " + (z2 ? "Prepare " : _UrlKt.FRAGMENT_ENCODE_SET) + str + " request for descriptor " + bluetoothGattDescriptor.getUuid() + " received, value: " + IABLandingPageActivity4.onExtraCallbackWithResult(bArr);
    }

    final void IAuthTabCallback(@NonNull BluetoothGattServer bluetoothGattServer, @NonNull BluetoothDevice bluetoothDevice, int i, boolean z) {
        boolean z2;
        IAuthTabCallback(3, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda108(i, z));
        if (z) {
            Deque<Pair<Object, byte[]>> deque = this.ICustomTabsService;
            IAuthTabCallback(4, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda109());
            this.ICustomTabsService = null;
            int i2 = this.ICustomTabsCallbackStub;
            if (i2 != 0) {
                onExtraCallback(bluetoothGattServer, bluetoothDevice, i2, i, 0, null);
                this.ICustomTabsCallbackStub = 0;
                return;
            }
            onExtraCallback(bluetoothGattServer, bluetoothDevice, 0, i, 0, null);
            if (deque == null || deque.isEmpty()) {
                return;
            }
            loop0: while (true) {
                z2 = false;
                for (Pair<Object, byte[]> pair : deque) {
                    Object obj = pair.first;
                    if (obj instanceof BluetoothGattCharacteristic) {
                        if (!onWarmupCompleted(bluetoothDevice, (BluetoothGattCharacteristic) obj, (byte[]) pair.second) && !z2) {
                            break;
                        }
                        z2 = true;
                    } else if (obj instanceof BluetoothGattDescriptor) {
                        if (!onExtraCallback(bluetoothDevice, (BluetoothGattDescriptor) obj, (byte[]) pair.second) && !z2) {
                            break;
                        }
                        z2 = true;
                    } else {
                        continue;
                    }
                }
            }
            if (ITrustedWebActivityCallbackStubProxy() || z2) {
                onExtraCallback(true);
                return;
            }
            return;
        }
        IAuthTabCallback(4, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda110());
        this.ICustomTabsService = null;
        onExtraCallback(bluetoothGattServer, bluetoothDevice, 0, i, 0, null);
    }

    public static /* synthetic */ String onExtraCallbackWithResult(int i, boolean z) {
        return "[Server callback] Execute write request (requestId=" + i + ", execute=" + z + ")";
    }

    public static /* synthetic */ String prefetchWithMultipleUrls() {
        return "[Server] Execute write request received";
    }

    public static /* synthetic */ String ITrustedWebActivityCallbackStub() {
        return "[Server] Cancel write request received";
    }

    public static /* synthetic */ String onNavigationEvent(int i) {
        return "[Server callback] Notification sent (status=" + i + ")";
    }

    final void onExtraCallbackWithResult(@NonNull BluetoothGattServer bluetoothGattServer, @NonNull BluetoothDevice bluetoothDevice, int i) {
        IAuthTabCallback(3, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda141(i));
        if (i == 0) {
            onExtraCallbackWithResult(bluetoothDevice);
        } else {
            Request request = this.mayLaunchUrl;
            if (request instanceof InitConfig) {
                request.onExtraCallbackWithResult(bluetoothDevice, i);
            }
            this.onExtraCallback = null;
            onNavigationEvent(bluetoothDevice, "Error on sending notification/indication", i);
        }
        ITrustedWebActivityCallbackStubProxy();
        onExtraCallback(true);
    }

    public static /* synthetic */ String IAuthTabCallbackStub(int i) {
        return "[Server] MTU changed to: " + i;
    }

    final void onWarmupCompleted(@NonNull BluetoothGattServer bluetoothGattServer, @NonNull BluetoothDevice bluetoothDevice, int i) {
        IAuthTabCallback(4, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda27(i));
        this.onRelationshipValidationResult = i;
        ITrustedWebActivityCallbackStubProxy();
        onExtraCallback(false);
    }

    private void onExtraCallbackWithResult(@NonNull BluetoothDevice bluetoothDevice) {
        Request request = this.mayLaunchUrl;
        if (request instanceof InitConfig) {
            InitConfig initConfig = (InitConfig) request;
            int i = AnonymousClass2.onExtraCallbackWithResult[initConfig.extraCallback.ordinal()];
            if (i == 1) {
                IAuthTabCallback(4, new BleManagerHandler$.ExternalSyntheticLambda60());
            } else if (i == 2) {
                IAuthTabCallback(4, new BleManagerHandler$.ExternalSyntheticLambda61());
            }
            initConfig.onNavigationEvent(bluetoothDevice, initConfig.onWarmupCompleted.getValue());
            if (initConfig.onExtraCallbackWithResult()) {
                IAuthTabCallback(initConfig);
            } else {
                initConfig.onNavigationEvent(bluetoothDevice);
            }
        }
    }

    /* renamed from: o.BusMonitorDependWrapper1$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] onExtraCallbackWithResult;

        static {
            int[] iArr = new int[Request.Type.values().length];
            onExtraCallbackWithResult = iArr;
            try {
                iArr[Request.Type.NOTIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.INDICATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.WAIT_FOR_NOTIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.WAIT_FOR_INDICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.WAIT_FOR_READ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.WAIT_FOR_WRITE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.CONNECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.DISCONNECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.ENSURE_BOND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.CREATE_BOND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.REMOVE_BOND.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.SET.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.READ.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.WRITE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.READ_DESCRIPTOR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.WRITE_DESCRIPTOR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.SET_VALUE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.SET_DESCRIPTOR_VALUE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.BEGIN_RELIABLE_WRITE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.EXECUTE_RELIABLE_WRITE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.ABORT_RELIABLE_WRITE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.ENABLE_NOTIFICATIONS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.ENABLE_INDICATIONS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.DISABLE_NOTIFICATIONS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.DISABLE_INDICATIONS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.READ_BATTERY_LEVEL.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.ENABLE_BATTERY_LEVEL_NOTIFICATIONS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.DISABLE_BATTERY_LEVEL_NOTIFICATIONS.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.ENABLE_SERVICE_CHANGED_INDICATIONS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.REQUEST_MTU.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.REQUEST_CONNECTION_PRIORITY.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.SET_PREFERRED_PHY.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.READ_PHY.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.READ_RSSI.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.REFRESH_CACHE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                onExtraCallbackWithResult[Request.Type.SLEEP.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    public static /* synthetic */ String requestPostMessageChannel() {
        return "[Server] Notification sent";
    }

    public static /* synthetic */ String newSession() {
        return "[Server] Indication sent";
    }

    private void onExtraCallbackWithResult(@NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr) {
        Map<BluetoothGattCharacteristic, byte[]> map = this.asBinder;
        if (map == null || !map.containsKey(bluetoothGattCharacteristic)) {
            bluetoothGattCharacteristic.setValue(bArr);
        } else {
            this.asBinder.put(bluetoothGattCharacteristic, bArr);
        }
    }

    private boolean onWarmupCompleted(@NonNull BluetoothDevice bluetoothDevice, @NonNull BluetoothGattCharacteristic bluetoothGattCharacteristic, @NonNull byte[] bArr) {
        onExtraCallbackWithResult(bluetoothGattCharacteristic, bArr);
        getOptions getoptions = this.requestPostMessageChannelWithExtras.get(bluetoothGattCharacteristic);
        if (getoptions != null) {
            getoptions.onExtraCallbackWithResult(bluetoothDevice, bArr);
        }
        getOnceLogInterval<?> getonceloginterval = this.onExtraCallback;
        if (!(getonceloginterval instanceof hasSecondOptions) || getonceloginterval.onWarmupCompleted != bluetoothGattCharacteristic || getonceloginterval.onNavigationEvent()) {
            return false;
        }
        hasSecondOptions hassecondoptions = (hasSecondOptions) this.onExtraCallback;
        if (!hassecondoptions.onNavigationEvent(bArr)) {
            return false;
        }
        hassecondoptions.onExtraCallbackWithResult(bluetoothDevice, bArr);
        if (!hassecondoptions.IAuthTabCallback()) {
            return false;
        }
        hassecondoptions.onNavigationEvent(bluetoothDevice);
        this.onExtraCallback = null;
        return hassecondoptions.onExtraCallback();
    }

    private void onExtraCallback(@NonNull BluetoothGattDescriptor bluetoothGattDescriptor, @NonNull byte[] bArr) {
        Map<BluetoothGattDescriptor, byte[]> map = this.readTypedObject;
        if (map == null || !map.containsKey(bluetoothGattDescriptor)) {
            bluetoothGattDescriptor.setValue(bArr);
        } else {
            this.readTypedObject.put(bluetoothGattDescriptor, bArr);
        }
    }

    private boolean onExtraCallback(@NonNull BluetoothDevice bluetoothDevice, @NonNull BluetoothGattDescriptor bluetoothGattDescriptor, @NonNull byte[] bArr) {
        onExtraCallback(bluetoothGattDescriptor, bArr);
        getOptions getoptions = this.requestPostMessageChannelWithExtras.get(bluetoothGattDescriptor);
        if (getoptions != null) {
            getoptions.onExtraCallbackWithResult(bluetoothDevice, bArr);
        }
        getOnceLogInterval<?> getonceloginterval = this.onExtraCallback;
        if (!(getonceloginterval instanceof hasSecondOptions) || getonceloginterval.IAuthTabCallback != bluetoothGattDescriptor || getonceloginterval.onNavigationEvent()) {
            return false;
        }
        hasSecondOptions hassecondoptions = (hasSecondOptions) this.onExtraCallback;
        if (!hassecondoptions.onNavigationEvent(bArr)) {
            return false;
        }
        hassecondoptions.onExtraCallbackWithResult(bluetoothDevice, bArr);
        if (!hassecondoptions.IAuthTabCallback()) {
            return false;
        }
        hassecondoptions.onNavigationEvent(bluetoothDevice);
        this.onExtraCallback = null;
        return hassecondoptions.onExtraCallback();
    }

    private void onExtraCallback(@NonNull BluetoothGattServer bluetoothGattServer, @NonNull BluetoothDevice bluetoothDevice, int i, int i2, int i3, @Nullable byte[] bArr) {
        String str;
        if (i == 0) {
            str = "GATT_SUCCESS";
        } else if (i == 6) {
            str = "GATT_REQUEST_NOT_SUPPORTED";
        } else if (i == 7) {
            str = "GATT_INVALID_OFFSET";
        } else {
            throw new InvalidParameterException();
        }
        IAuthTabCallback(3, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda17(str, i3, bArr));
        bluetoothGattServer.sendResponse(bluetoothDevice, i2, i, i3, bArr);
        IAuthTabCallback(2, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda18());
    }

    public static /* synthetic */ String onExtraCallback(String str, int i, byte[] bArr) {
        return "server.sendResponse(" + str + ", offset=" + i + ", value=" + IABLandingPageActivity4.onExtraCallback(bArr) + ")";
    }

    public static /* synthetic */ String onVerticalScrollEvent() {
        return "[Server] Response sent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ITrustedWebActivityCallbackStubProxy() {
        getOnceLogInterval<?> getonceloginterval = this.onExtraCallback;
        if (!(getonceloginterval instanceof getImageCacheDir)) {
            return false;
        }
        getImageCacheDir getimagecachedir = (getImageCacheDir) getonceloginterval;
        if (!getimagecachedir.onWarmupCompleted()) {
            return false;
        }
        IAuthTabCallback(4, (onExtraCallback) new BleManagerHandler$.ExternalSyntheticLambda16());
        getimagecachedir.onNavigationEvent(this.onNavigationEvent);
        this.onExtraCallback = null;
        return true;
    }

    public static /* synthetic */ String access100() {
        return "Condition fulfilled";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0016 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0018 A[Catch: all -> 0x03a4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0009, B:11:0x0010, B:12:0x0012, B:16:0x0018, B:18:0x001b, B:20:0x001f, B:22:0x0025, B:31:0x004e, B:33:0x0052, B:37:0x005c, B:39:0x0060, B:41:0x0068, B:42:0x0078, B:44:0x007c, B:45:0x0085, B:47:0x008e, B:50:0x0094, B:52:0x0098, B:55:0x009d, B:58:0x00a7, B:70:0x00cb, B:73:0x00d1, B:75:0x00d5, B:83:0x00e5, B:85:0x00f6, B:90:0x010d, B:93:0x0119, B:94:0x0121, B:96:0x0129, B:98:0x0134, B:100:0x013a, B:103:0x014a, B:107:0x015e, B:209:0x037a, B:216:0x038e, B:212:0x0380, B:109:0x0163, B:110:0x016f, B:112:0x0175, B:113:0x017f, B:115:0x0185, B:116:0x018f, B:118:0x0196, B:119:0x019c, B:121:0x01a0, B:124:0x01ab, B:126:0x01b2, B:128:0x01c6, B:129:0x01d2, B:131:0x01d6, B:134:0x01e1, B:138:0x01eb, B:140:0x01f7, B:141:0x0201, B:142:0x0205, B:144:0x0210, B:145:0x021a, B:147:0x021e, B:150:0x022b, B:151:0x0231, B:152:0x0237, B:153:0x023d, B:154:0x0243, B:155:0x024b, B:156:0x0253, B:157:0x025b, B:158:0x0263, B:159:0x0269, B:160:0x026f, B:162:0x0275, B:165:0x027f, B:167:0x0286, B:169:0x028a, B:171:0x0290, B:173:0x02a9, B:172:0x029e, B:174:0x02b1, B:176:0x02b8, B:178:0x02bc, B:180:0x02c2, B:182:0x02db, B:181:0x02d0, B:183:0x02e3, B:184:0x02f4, B:185:0x02fc, B:186:0x0310, B:187:0x0317, B:190:0x0320, B:191:0x0325, B:192:0x032a, B:193:0x032f, B:194:0x0334, B:195:0x0344, B:197:0x0351, B:199:0x0358, B:201:0x0360, B:202:0x0367, B:206:0x0372, B:102:0x0147, B:219:0x039a, B:23:0x0030, B:25:0x0036, B:27:0x003e, B:28:0x0044), top: B:228:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004e A[Catch: Exception -> 0x0059, all -> 0x03a4, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0009, B:11:0x0010, B:12:0x0012, B:16:0x0018, B:18:0x001b, B:20:0x001f, B:22:0x0025, B:31:0x004e, B:33:0x0052, B:37:0x005c, B:39:0x0060, B:41:0x0068, B:42:0x0078, B:44:0x007c, B:45:0x0085, B:47:0x008e, B:50:0x0094, B:52:0x0098, B:55:0x009d, B:58:0x00a7, B:70:0x00cb, B:73:0x00d1, B:75:0x00d5, B:83:0x00e5, B:85:0x00f6, B:90:0x010d, B:93:0x0119, B:94:0x0121, B:96:0x0129, B:98:0x0134, B:100:0x013a, B:103:0x014a, B:107:0x015e, B:209:0x037a, B:216:0x038e, B:212:0x0380, B:109:0x0163, B:110:0x016f, B:112:0x0175, B:113:0x017f, B:115:0x0185, B:116:0x018f, B:118:0x0196, B:119:0x019c, B:121:0x01a0, B:124:0x01ab, B:126:0x01b2, B:128:0x01c6, B:129:0x01d2, B:131:0x01d6, B:134:0x01e1, B:138:0x01eb, B:140:0x01f7, B:141:0x0201, B:142:0x0205, B:144:0x0210, B:145:0x021a, B:147:0x021e, B:150:0x022b, B:151:0x0231, B:152:0x0237, B:153:0x023d, B:154:0x0243, B:155:0x024b, B:156:0x0253, B:157:0x025b, B:158:0x0263, B:159:0x0269, B:160:0x026f, B:162:0x0275, B:165:0x027f, B:167:0x0286, B:169:0x028a, B:171:0x0290, B:173:0x02a9, B:172:0x029e, B:174:0x02b1, B:176:0x02b8, B:178:0x02bc, B:180:0x02c2, B:182:0x02db, B:181:0x02d0, B:183:0x02e3, B:184:0x02f4, B:185:0x02fc, B:186:0x0310, B:187:0x0317, B:190:0x0320, B:191:0x0325, B:192:0x032a, B:193:0x032f, B:194:0x0334, B:195:0x0344, B:197:0x0351, B:199:0x0358, B:201:0x0360, B:202:0x0367, B:206:0x0372, B:102:0x0147, B:219:0x039a, B:23:0x0030, B:25:0x0036, B:27:0x003e, B:28:0x0044), top: B:228:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c A[Catch: all -> 0x03a4, TRY_ENTER, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0009, B:11:0x0010, B:12:0x0012, B:16:0x0018, B:18:0x001b, B:20:0x001f, B:22:0x0025, B:31:0x004e, B:33:0x0052, B:37:0x005c, B:39:0x0060, B:41:0x0068, B:42:0x0078, B:44:0x007c, B:45:0x0085, B:47:0x008e, B:50:0x0094, B:52:0x0098, B:55:0x009d, B:58:0x00a7, B:70:0x00cb, B:73:0x00d1, B:75:0x00d5, B:83:0x00e5, B:85:0x00f6, B:90:0x010d, B:93:0x0119, B:94:0x0121, B:96:0x0129, B:98:0x0134, B:100:0x013a, B:103:0x014a, B:107:0x015e, B:209:0x037a, B:216:0x038e, B:212:0x0380, B:109:0x0163, B:110:0x016f, B:112:0x0175, B:113:0x017f, B:115:0x0185, B:116:0x018f, B:118:0x0196, B:119:0x019c, B:121:0x01a0, B:124:0x01ab, B:126:0x01b2, B:128:0x01c6, B:129:0x01d2, B:131:0x01d6, B:134:0x01e1, B:138:0x01eb, B:140:0x01f7, B:141:0x0201, B:142:0x0205, B:144:0x0210, B:145:0x021a, B:147:0x021e, B:150:0x022b, B:151:0x0231, B:152:0x0237, B:153:0x023d, B:154:0x0243, B:155:0x024b, B:156:0x0253, B:157:0x025b, B:158:0x0263, B:159:0x0269, B:160:0x026f, B:162:0x0275, B:165:0x027f, B:167:0x0286, B:169:0x028a, B:171:0x0290, B:173:0x02a9, B:172:0x029e, B:174:0x02b1, B:176:0x02b8, B:178:0x02bc, B:180:0x02c2, B:182:0x02db, B:181:0x02d0, B:183:0x02e3, B:184:0x02f4, B:185:0x02fc, B:186:0x0310, B:187:0x0317, B:190:0x0320, B:191:0x0325, B:192:0x032a, B:193:0x032f, B:194:0x0334, B:195:0x0344, B:197:0x0351, B:199:0x0358, B:201:0x0360, B:202:0x0367, B:206:0x0372, B:102:0x0147, B:219:0x039a, B:23:0x0030, B:25:0x0036, B:27:0x003e, B:28:0x0044), top: B:228:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098 A[Catch: all -> 0x03a4, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0009, B:11:0x0010, B:12:0x0012, B:16:0x0018, B:18:0x001b, B:20:0x001f, B:22:0x0025, B:31:0x004e, B:33:0x0052, B:37:0x005c, B:39:0x0060, B:41:0x0068, B:42:0x0078, B:44:0x007c, B:45:0x0085, B:47:0x008e, B:50:0x0094, B:52:0x0098, B:55:0x009d, B:58:0x00a7, B:70:0x00cb, B:73:0x00d1, B:75:0x00d5, B:83:0x00e5, B:85:0x00f6, B:90:0x010d, B:93:0x0119, B:94:0x0121, B:96:0x0129, B:98:0x0134, B:100:0x013a, B:103:0x014a, B:107:0x015e, B:209:0x037a, B:216:0x038e, B:212:0x0380, B:109:0x0163, B:110:0x016f, B:112:0x0175, B:113:0x017f, B:115:0x0185, B:116:0x018f, B:118:0x0196, B:119:0x019c, B:121:0x01a0, B:124:0x01ab, B:126:0x01b2, B:128:0x01c6, B:129:0x01d2, B:131:0x01d6, B:134:0x01e1, B:138:0x01eb, B:140:0x01f7, B:141:0x0201, B:142:0x0205, B:144:0x0210, B:145:0x021a, B:147:0x021e, B:150:0x022b, B:151:0x0231, B:152:0x0237, B:153:0x023d, B:154:0x0243, B:155:0x024b, B:156:0x0253, B:157:0x025b, B:158:0x0263, B:159:0x0269, B:160:0x026f, B:162:0x0275, B:165:0x027f, B:167:0x0286, B:169:0x028a, B:171:0x0290, B:173:0x02a9, B:172:0x029e, B:174:0x02b1, B:176:0x02b8, B:178:0x02bc, B:180:0x02c2, B:182:0x02db, B:181:0x02d0, B:183:0x02e3, B:184:0x02f4, B:185:0x02fc, B:186:0x0310, B:187:0x0317, B:190:0x0320, B:191:0x0325, B:192:0x032a, B:193:0x032f, B:194:0x0334, B:195:0x0344, B:197:0x0351, B:199:0x0358, B:201:0x0360, B:202:0x0367, B:206:0x0372, B:102:0x0147, B:219:0x039a, B:23:0x0030, B:25:0x0036, B:27:0x003e, B:28:0x0044), top: B:228:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d A[Catch: all -> 0x03a4, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0009, B:11:0x0010, B:12:0x0012, B:16:0x0018, B:18:0x001b, B:20:0x001f, B:22:0x0025, B:31:0x004e, B:33:0x0052, B:37:0x005c, B:39:0x0060, B:41:0x0068, B:42:0x0078, B:44:0x007c, B:45:0x0085, B:47:0x008e, B:50:0x0094, B:52:0x0098, B:55:0x009d, B:58:0x00a7, B:70:0x00cb, B:73:0x00d1, B:75:0x00d5, B:83:0x00e5, B:85:0x00f6, B:90:0x010d, B:93:0x0119, B:94:0x0121, B:96:0x0129, B:98:0x0134, B:100:0x013a, B:103:0x014a, B:107:0x015e, B:209:0x037a, B:216:0x038e, B:212:0x0380, B:109:0x0163, B:110:0x016f, B:112:0x0175, B:113:0x017f, B:115:0x0185, B:116:0x018f, B:118:0x0196, B:119:0x019c, B:121:0x01a0, B:124:0x01ab, B:126:0x01b2, B:128:0x01c6, B:129:0x01d2, B:131:0x01d6, B:134:0x01e1, B:138:0x01eb, B:140:0x01f7, B:141:0x0201, B:142:0x0205, B:144:0x0210, B:145:0x021a, B:147:0x021e, B:150:0x022b, B:151:0x0231, B:152:0x0237, B:153:0x023d, B:154:0x0243, B:155:0x024b, B:156:0x0253, B:157:0x025b, B:158:0x0263, B:159:0x0269, B:160:0x026f, B:162:0x0275, B:165:0x027f, B:167:0x0286, B:169:0x028a, B:171:0x0290, B:173:0x02a9, B:172:0x029e, B:174:0x02b1, B:176:0x02b8, B:178:0x02bc, B:180:0x02c2, B:182:0x02db, B:181:0x02d0, B:183:0x02e3, B:184:0x02f4, B:185:0x02fc, B:186:0x0310, B:187:0x0317, B:190:0x0320, B:191:0x0325, B:192:0x032a, B:193:0x032f, B:194:0x0334, B:195:0x0344, B:197:0x0351, B:199:0x0358, B:201:0x0360, B:202:0x0367, B:206:0x0372, B:102:0x0147, B:219:0x039a, B:23:0x0030, B:25:0x0036, B:27:0x003e, B:28:0x0044), top: B:228:0x0005, inners: #0 }] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [no.nordicsemi.android.ble.Request] */
    /* JADX WARN: Type inference failed for: r3v13, types: [no.nordicsemi.android.ble.Request] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [no.nordicsemi.android.ble.Request] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23, types: [no.nordicsemi.android.ble.Request] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v9, types: [no.nordicsemi.android.ble.Request] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallback(boolean z) {
        final CustomEventInterstitialListener customEventInterstitialListenerOnExtraCallbackWithResult;
        boolean zOnExtraCallbackWithResult;
        int i;
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        RequestQueue requestQueue;
        synchronized (this) {
            if (z) {
                if (this.ICustomTabsCallbackDefault) {
                    this.ICustomTabsCallbackDefault = this.onExtraCallback != null;
                }
                if (!this.ICustomTabsCallbackDefault) {
                    return;
                }
                final BluetoothDevice bluetoothDevice = this.onNavigationEvent;
                try {
                    requestQueue = this.ICustomTabsCallback_Parcel;
                } catch (Exception unused) {
                }
                if (requestQueue != null) {
                    if (requestQueue.IAuthTabCallback()) {
                        customEventInterstitialListenerOnExtraCallbackWithResult = this.ICustomTabsCallback_Parcel.onExtraCallback().onNavigationEvent(this);
                        if (customEventInterstitialListenerOnExtraCallbackWithResult == 0) {
                        }
                        if (customEventInterstitialListenerOnExtraCallbackWithResult == 0) {
                        }
                        if (customEventInterstitialListenerOnExtraCallbackWithResult.onTransact) {
                        }
                    } else {
                        RequestQueue requestQueue2 = this.ICustomTabsCallback_Parcel;
                        if ((requestQueue2 instanceof ReliableWriteRequest) && ((ReliableWriteRequest) requestQueue2).readTypedObject()) {
                            this.ICustomTabsCallback_Parcel.onExtraCallbackWithResult(bluetoothDevice, -7);
                        }
                        this.ICustomTabsCallback_Parcel.onNavigationEvent(bluetoothDevice);
                        this.ICustomTabsCallback_Parcel = null;
                        customEventInterstitialListenerOnExtraCallbackWithResult = 0;
                        if (customEventInterstitialListenerOnExtraCallbackWithResult == 0) {
                        }
                        if (customEventInterstitialListenerOnExtraCallbackWithResult == 0) {
                        }
                        if (customEventInterstitialListenerOnExtraCallbackWithResult.onTransact) {
                        }
                    }
                } else {
                    customEventInterstitialListenerOnExtraCallbackWithResult = 0;
                    if (customEventInterstitialListenerOnExtraCallbackWithResult == 0) {
                        Deque<Request> deque = this.onActivityResized;
                        customEventInterstitialListenerOnExtraCallbackWithResult = deque != null ? deque.poll() : 0;
                    }
                    if (customEventInterstitialListenerOnExtraCallbackWithResult == 0) {
                        if (this.onActivityResized != null) {
                            this.onActivityResized = null;
                            this.ICustomTabsCallbackDefault = true;
                            this.isEngagementSignalsApiAvailable = true;
                            if (bluetoothDevice != null) {
                                onExtraCallback(new onNavigationEvent() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda127
                                    @Override // o.BusMonitorDependWrapper1.onNavigationEvent
                                    public final void run(onMonitorUpload onmonitorupload) {
                                        BusMonitorDependWrapper1.IAuthTabCallbackStub(bluetoothDevice, onmonitorupload);
                                    }
                                });
                                onExtraCallbackWithResult(new onExtraCallbackWithResult() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda129
                                    @Override // o.BusMonitorDependWrapper1.onExtraCallbackWithResult
                                    public final void run(IABLandingPageActivity21 iABLandingPageActivity21) {
                                        BusMonitorDependWrapper1.onNavigationEvent(bluetoothDevice, iABLandingPageActivity21);
                                    }
                                });
                            }
                            CustomEventInterstitialListener customEventInterstitialListener = this.asInterface;
                            if (customEventInterstitialListener != null) {
                                customEventInterstitialListener.onNavigationEvent(customEventInterstitialListener.IAuthTabCallback());
                                this.asInterface = null;
                            }
                        }
                        try {
                            customEventInterstitialListenerOnExtraCallbackWithResult = this.prefetch.remove();
                        } catch (Exception unused2) {
                            this.ICustomTabsCallbackDefault = false;
                            this.mayLaunchUrl = null;
                            return;
                        }
                    }
                    if (customEventInterstitialListenerOnExtraCallbackWithResult.onTransact) {
                        onExtraCallback(false);
                        return;
                    }
                    this.ICustomTabsCallbackDefault = true;
                    this.mayLaunchUrl = customEventInterstitialListenerOnExtraCallbackWithResult;
                    if (customEventInterstitialListenerOnExtraCallbackWithResult instanceof getOnceLogInterval) {
                        getOnceLogInterval<?> getonceloginterval = customEventInterstitialListenerOnExtraCallbackWithResult;
                        int i2 = AnonymousClass2.onExtraCallbackWithResult[customEventInterstitialListenerOnExtraCallbackWithResult.extraCallback.ordinal()];
                        zOnExtraCallbackWithResult = this.onTransact && bluetoothDevice != null && ((bluetoothGattCharacteristic = getonceloginterval.onWarmupCompleted) == null || ((i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 6 ? 0 : 76 : 2 : 32 : 16) & bluetoothGattCharacteristic.getProperties()) != 0);
                        if (zOnExtraCallbackWithResult) {
                            if (getonceloginterval instanceof getImageCacheDir) {
                                getImageCacheDir getimagecachedir = (getImageCacheDir) getonceloginterval;
                                IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda130
                                    @Override // o.BusMonitorDependWrapper1.onExtraCallback
                                    public final String log() {
                                        return BusMonitorDependWrapper1.setEngagementSignalsCallback();
                                    }
                                });
                                if (getimagecachedir.onWarmupCompleted()) {
                                    getimagecachedir.onExtraCallback(bluetoothDevice);
                                    IAuthTabCallback(4, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda131
                                        @Override // o.BusMonitorDependWrapper1.onExtraCallback
                                        public final String log() {
                                            return BusMonitorDependWrapper1.mayLaunchUrl();
                                        }
                                    });
                                    getimagecachedir.onNavigationEvent(bluetoothDevice);
                                    onExtraCallback(true);
                                    return;
                                }
                            }
                            if (getonceloginterval instanceof FilterWord) {
                                IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda132
                                    @Override // o.BusMonitorDependWrapper1.onExtraCallback
                                    public final String log() {
                                        return BusMonitorDependWrapper1.readTypedObject();
                                    }
                                });
                            }
                            if (getonceloginterval instanceof hasSecondOptions) {
                                IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda133
                                    @Override // o.BusMonitorDependWrapper1.onExtraCallback
                                    public final String log() {
                                        return BusMonitorDependWrapper1.prefetch();
                                    }
                                });
                            }
                            this.onExtraCallback = getonceloginterval;
                            if (getonceloginterval.onExtraCallbackWithResult() != null) {
                                getonceloginterval.onExtraCallback(bluetoothDevice);
                                customEventInterstitialListenerOnExtraCallbackWithResult = getonceloginterval.onExtraCallbackWithResult();
                                this.mayLaunchUrl = customEventInterstitialListenerOnExtraCallbackWithResult;
                            }
                        }
                    } else {
                        zOnExtraCallbackWithResult = false;
                    }
                    if (customEventInterstitialListenerOnExtraCallbackWithResult.extraCallback == Request.Type.CONNECT) {
                        CustomEventInterstitialListener customEventInterstitialListener2 = customEventInterstitialListenerOnExtraCallbackWithResult;
                        customEventInterstitialListener2.onExtraCallback(customEventInterstitialListener2.IAuthTabCallback());
                    } else if (bluetoothDevice != null) {
                        customEventInterstitialListenerOnExtraCallbackWithResult.onExtraCallback(bluetoothDevice);
                    } else {
                        customEventInterstitialListenerOnExtraCallbackWithResult.writeTypedObject();
                        this.onExtraCallback = null;
                        onExtraCallback(true);
                        return;
                    }
                    int i3 = AnonymousClass2.onExtraCallbackWithResult[customEventInterstitialListenerOnExtraCallbackWithResult.extraCallback.ordinal()];
                    if (i3 != 1 && i3 != 2) {
                        switch (i3) {
                            case 7:
                                CustomEventInterstitialListener customEventInterstitialListener3 = customEventInterstitialListenerOnExtraCallbackWithResult;
                                this.asInterface = customEventInterstitialListener3;
                                this.mayLaunchUrl = null;
                                zOnExtraCallbackWithResult = onWarmupCompleted(customEventInterstitialListener3.IAuthTabCallback(), customEventInterstitialListener3);
                                break;
                            case 8:
                                zOnExtraCallbackWithResult = asBinder(0);
                                break;
                            case 9:
                                zOnExtraCallbackWithResult = onExtraCallbackWithResult(true);
                                break;
                            case 10:
                                zOnExtraCallbackWithResult = onExtraCallbackWithResult(false);
                                break;
                            case 11:
                                zOnExtraCallbackWithResult = read();
                                break;
                            case 12:
                                this.ICustomTabsCallback_Parcel = (RequestQueue) customEventInterstitialListenerOnExtraCallbackWithResult;
                                onExtraCallback(true);
                                return;
                            case 13:
                                zOnExtraCallbackWithResult = IAuthTabCallback_Parcel(customEventInterstitialListenerOnExtraCallbackWithResult.onWarmupCompleted);
                                break;
                            case 14:
                                InitConfig initConfig = customEventInterstitialListenerOnExtraCallbackWithResult;
                                zOnExtraCallbackWithResult = onExtraCallbackWithResult(initConfig.onWarmupCompleted, initConfig.onNavigationEvent(this.onRelationshipValidationResult), initConfig.onNavigationEvent());
                                break;
                            case 15:
                                zOnExtraCallbackWithResult = IAuthTabCallbackDefault(customEventInterstitialListenerOnExtraCallbackWithResult.IAuthTabCallback);
                                break;
                            case 16:
                                InitConfig initConfig2 = customEventInterstitialListenerOnExtraCallbackWithResult;
                                zOnExtraCallbackWithResult = IAuthTabCallback(initConfig2.IAuthTabCallback, initConfig2.onNavigationEvent(this.onRelationshipValidationResult));
                                break;
                            case 17:
                                onLeaveApplication onleaveapplication = customEventInterstitialListenerOnExtraCallbackWithResult;
                                BluetoothGattCharacteristic bluetoothGattCharacteristic2 = onleaveapplication.onWarmupCompleted;
                                if (bluetoothGattCharacteristic2 != null) {
                                    Map<BluetoothGattCharacteristic, byte[]> map = this.asBinder;
                                    if (map != null && map.containsKey(bluetoothGattCharacteristic2)) {
                                        this.asBinder.put(onleaveapplication.onWarmupCompleted, onleaveapplication.onExtraCallback(this.onRelationshipValidationResult));
                                    } else {
                                        onleaveapplication.onWarmupCompleted.setValue(onleaveapplication.onExtraCallback(this.onRelationshipValidationResult));
                                    }
                                    onleaveapplication.onNavigationEvent(bluetoothDevice);
                                    onExtraCallback(true);
                                }
                                return;
                            case 18:
                                onLeaveApplication onleaveapplication2 = customEventInterstitialListenerOnExtraCallbackWithResult;
                                BluetoothGattDescriptor bluetoothGattDescriptor = onleaveapplication2.IAuthTabCallback;
                                if (bluetoothGattDescriptor != null) {
                                    Map<BluetoothGattDescriptor, byte[]> map2 = this.readTypedObject;
                                    if (map2 != null && map2.containsKey(bluetoothGattDescriptor)) {
                                        this.readTypedObject.put(onleaveapplication2.IAuthTabCallback, onleaveapplication2.onExtraCallback(this.onRelationshipValidationResult));
                                    } else {
                                        onleaveapplication2.IAuthTabCallback.setValue(onleaveapplication2.onExtraCallback(this.onRelationshipValidationResult));
                                    }
                                    onleaveapplication2.onNavigationEvent(bluetoothDevice);
                                    onExtraCallback(true);
                                }
                                return;
                            case 19:
                                zOnExtraCallbackWithResult = getSmallIconId();
                                if (zOnExtraCallbackWithResult) {
                                    this.mayLaunchUrl.onNavigationEvent(bluetoothDevice);
                                    onExtraCallback(true);
                                    return;
                                }
                                break;
                            case 20:
                                zOnExtraCallbackWithResult = getActiveNotifications();
                                break;
                            case 21:
                                zOnExtraCallbackWithResult = notifyNotificationWithChannel();
                                break;
                            case 22:
                                zOnExtraCallbackWithResult = access100(customEventInterstitialListenerOnExtraCallbackWithResult.onWarmupCompleted);
                                break;
                            case 23:
                                zOnExtraCallbackWithResult = access000(customEventInterstitialListenerOnExtraCallbackWithResult.onWarmupCompleted);
                                break;
                            case 24:
                                zOnExtraCallbackWithResult = getInterfaceDescriptor(customEventInterstitialListenerOnExtraCallbackWithResult.onWarmupCompleted);
                                break;
                            case 25:
                                zOnExtraCallbackWithResult = IAuthTabCallbackStubProxy(customEventInterstitialListenerOnExtraCallbackWithResult.onWarmupCompleted);
                                break;
                            case 26:
                                zOnExtraCallbackWithResult = ITrustedWebActivityServiceDefault();
                                break;
                            case 27:
                                zOnExtraCallbackWithResult = onNavigationEvent(true);
                                break;
                            case 28:
                                zOnExtraCallbackWithResult = onNavigationEvent(false);
                                break;
                            case 29:
                                zOnExtraCallbackWithResult = cancelNotification();
                                break;
                            case 30:
                                onInterstitialClicked oninterstitialclicked = customEventInterstitialListenerOnExtraCallbackWithResult;
                                if (this.onRelationshipValidationResult != oninterstitialclicked.onWarmupCompleted()) {
                                    zOnExtraCallbackWithResult = access100(oninterstitialclicked.onWarmupCompleted());
                                    break;
                                } else {
                                    zOnExtraCallbackWithResult = this.onTransact;
                                    if (zOnExtraCallbackWithResult) {
                                        oninterstitialclicked.onWarmupCompleted(bluetoothDevice, this.onRelationshipValidationResult);
                                        oninterstitialclicked.onNavigationEvent(bluetoothDevice);
                                        onExtraCallback(true);
                                        return;
                                    }
                                }
                                break;
                            case 31:
                                final getICacheDir geticachedir = customEventInterstitialListenerOnExtraCallbackWithResult;
                                this.access100 = Build.VERSION.SDK_INT >= 26;
                                zOnExtraCallbackWithResult = access000(geticachedir.IAuthTabCallback());
                                if (zOnExtraCallbackWithResult) {
                                    onNavigationEvent(new Runnable() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda134
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            BusMonitorDependWrapper1.onExtraCallbackWithResult(this.f$0, geticachedir, bluetoothDevice);
                                        }
                                    }, 200L);
                                    break;
                                } else {
                                    this.access100 = false;
                                    break;
                                }
                            case 32:
                                final onInterstitialDismissed oninterstitialdismissed = customEventInterstitialListenerOnExtraCallbackWithResult;
                                int i4 = Build.VERSION.SDK_INT;
                                if (i4 >= 26) {
                                    zOnExtraCallbackWithResult = onNavigationEvent(oninterstitialdismissed.onNavigationEvent(), oninterstitialdismissed.onExtraCallback(), oninterstitialdismissed.IAuthTabCallback());
                                    if (i4 == 33) {
                                        this.extraCallbackWithResult.postDelayed(new Runnable() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda135
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                BusMonitorDependWrapper1.onWarmupCompleted(this.f$0, oninterstitialdismissed);
                                            }
                                        }, 1000L);
                                        break;
                                    }
                                } else {
                                    zOnExtraCallbackWithResult = this.onTransact;
                                    if (zOnExtraCallbackWithResult) {
                                        oninterstitialdismissed.onWarmupCompleted(bluetoothDevice);
                                        oninterstitialdismissed.onNavigationEvent(bluetoothDevice);
                                        onExtraCallback(true);
                                        return;
                                    }
                                }
                                break;
                            case 33:
                                onInterstitialDismissed oninterstitialdismissed2 = customEventInterstitialListenerOnExtraCallbackWithResult;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    zOnExtraCallbackWithResult = ITrustedWebActivityServiceStubProxy();
                                    break;
                                } else {
                                    zOnExtraCallbackWithResult = this.onTransact;
                                    if (zOnExtraCallbackWithResult) {
                                        oninterstitialdismissed2.onWarmupCompleted(bluetoothDevice);
                                        oninterstitialdismissed2.onNavigationEvent(bluetoothDevice);
                                        onExtraCallback(true);
                                        return;
                                    }
                                }
                                break;
                            case 34:
                                zOnExtraCallbackWithResult = ITrustedWebActivityServiceStub();
                                if (zOnExtraCallbackWithResult) {
                                    onNavigationEvent(new Runnable() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda136
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            BusMonitorDependWrapper1.IAuthTabCallback(this.f$0, customEventInterstitialListenerOnExtraCallbackWithResult, bluetoothDevice);
                                        }
                                    }, 1000L);
                                    break;
                                }
                                break;
                            case 35:
                                zOnExtraCallbackWithResult = RemoteActionCompatParcelizer();
                                if (zOnExtraCallbackWithResult) {
                                    onNavigationEvent(new Runnable() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda137
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            BusMonitorDependWrapper1.onExtraCallbackWithResult(this.f$0, customEventInterstitialListenerOnExtraCallbackWithResult, bluetoothDevice);
                                        }
                                    }, 200L);
                                    break;
                                }
                                break;
                            case 36:
                                final onInterstitialShowFail oninterstitialshowfail = (onInterstitialShowFail) customEventInterstitialListenerOnExtraCallbackWithResult;
                                IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda128
                                    @Override // o.BusMonitorDependWrapper1.onExtraCallback
                                    public final String log() {
                                        return BusMonitorDependWrapper1.onExtraCallbackWithResult(oninterstitialshowfail);
                                    }
                                });
                                return;
                        }
                    } else {
                        InitConfig initConfig3 = customEventInterstitialListenerOnExtraCallbackWithResult;
                        byte[] bArrOnNavigationEvent = initConfig3.onNavigationEvent(this.onRelationshipValidationResult);
                        BluetoothGattCharacteristic bluetoothGattCharacteristic3 = initConfig3.onWarmupCompleted;
                        if (bluetoothGattCharacteristic3 != null) {
                            bluetoothGattCharacteristic3.setValue(bArrOnNavigationEvent);
                            Map<BluetoothGattCharacteristic, byte[]> map3 = this.asBinder;
                            if (map3 != null && map3.containsKey(initConfig3.onWarmupCompleted)) {
                                this.asBinder.put(initConfig3.onWarmupCompleted, bArrOnNavigationEvent);
                            }
                        }
                        zOnExtraCallbackWithResult = onExtraCallbackWithResult(initConfig3.onWarmupCompleted, customEventInterstitialListenerOnExtraCallbackWithResult.extraCallback == Request.Type.INDICATE, bArrOnNavigationEvent);
                    }
                    if (!zOnExtraCallbackWithResult && bluetoothDevice != null) {
                        if (this.onTransact) {
                            i = -3;
                        } else {
                            i = BluetoothAdapter.getDefaultAdapter().isEnabled() ? -1 : -100;
                        }
                        customEventInterstitialListenerOnExtraCallbackWithResult.onExtraCallbackWithResult(bluetoothDevice, i);
                        this.onExtraCallback = null;
                        this.access100 = false;
                        onExtraCallback(true);
                    }
                    return;
                }
            } else if (!this.ICustomTabsCallbackDefault) {
            }
        }
    }

    public static /* synthetic */ String setEngagementSignalsCallback() {
        return "Waiting for fulfillment of condition...";
    }

    public static /* synthetic */ String mayLaunchUrl() {
        return "Condition fulfilled";
    }

    public static /* synthetic */ String readTypedObject() {
        return "Waiting for read request...";
    }

    public static /* synthetic */ String prefetch() {
        return "Waiting for value change...";
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BusMonitorDependWrapper1 busMonitorDependWrapper1, getICacheDir geticachedir, BluetoothDevice bluetoothDevice) {
        if (geticachedir.onNavigationEvent(bluetoothDevice)) {
            busMonitorDependWrapper1.access100 = false;
            busMonitorDependWrapper1.onExtraCallback(true);
        }
    }

    public static /* synthetic */ void onWarmupCompleted(BusMonitorDependWrapper1 busMonitorDependWrapper1, onInterstitialDismissed oninterstitialdismissed) {
        if (oninterstitialdismissed.onTransact) {
            return;
        }
        busMonitorDependWrapper1.IAuthTabCallback(5, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda4
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.IPostMessageService();
            }
        });
        busMonitorDependWrapper1.ITrustedWebActivityServiceStubProxy();
    }

    public static /* synthetic */ String IPostMessageService() {
        return "Callback not received in 1000 ms";
    }

    public static /* synthetic */ void IAuthTabCallback(BusMonitorDependWrapper1 busMonitorDependWrapper1, Request request, BluetoothDevice bluetoothDevice) {
        if (busMonitorDependWrapper1.mayLaunchUrl == request) {
            request.onExtraCallbackWithResult(bluetoothDevice, -5);
            busMonitorDependWrapper1.onExtraCallback(true);
        }
    }

    public static /* synthetic */ String onExtraCallback() {
        return "Cache refreshed";
    }

    public static /* synthetic */ void onExtraCallbackWithResult(BusMonitorDependWrapper1 busMonitorDependWrapper1, Request request, BluetoothDevice bluetoothDevice) {
        busMonitorDependWrapper1.IAuthTabCallback(4, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda35
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.onExtraCallback();
            }
        });
        request.onNavigationEvent(bluetoothDevice);
        busMonitorDependWrapper1.mayLaunchUrl = null;
        getOnceLogInterval<?> getonceloginterval = busMonitorDependWrapper1.onExtraCallback;
        if (getonceloginterval != null) {
            getonceloginterval.onExtraCallbackWithResult(bluetoothDevice, -3);
            busMonitorDependWrapper1.onExtraCallback = null;
        }
        busMonitorDependWrapper1.prefetch.clear();
        busMonitorDependWrapper1.onActivityResized = null;
        BluetoothGatt bluetoothGatt = busMonitorDependWrapper1.IAuthTabCallbackDefault;
        if (!busMonitorDependWrapper1.onTransact || bluetoothGatt == null) {
            return;
        }
        busMonitorDependWrapper1.ICustomTabsCallbackStubProxy.onExtraCallbackWithResult();
        busMonitorDependWrapper1.newAuthTabSession = true;
        busMonitorDependWrapper1.newSession = false;
        busMonitorDependWrapper1.IAuthTabCallback(2, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda36
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.ICustomTabsService_Parcel();
            }
        });
        busMonitorDependWrapper1.IAuthTabCallback(3, new onExtraCallback() { // from class: no.nordicsemi.android.ble.BleManagerHandler$$ExternalSyntheticLambda37
            @Override // o.BusMonitorDependWrapper1.onExtraCallback
            public final String log() {
                return BusMonitorDependWrapper1.IAuthTabCallback();
            }
        });
        bluetoothGatt.discoverServices();
    }

    public static /* synthetic */ String ICustomTabsService_Parcel() {
        return "Discovering Services...";
    }

    public static /* synthetic */ String IAuthTabCallback() {
        return "gatt.discoverServices()";
    }

    public static /* synthetic */ String onExtraCallbackWithResult(onInterstitialShowFail oninterstitialshowfail) {
        return "sleep(" + oninterstitialshowfail.writeTypedObject + ")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean IAuthTabCallback_Parcel(@Nullable BluetoothGattDescriptor bluetoothGattDescriptor) {
        return bluetoothGattDescriptor != null && getReflectContext.onNavigationEvent.equals(bluetoothGattDescriptor.getCharacteristic().getUuid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean extraCallback(@Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return bluetoothGattCharacteristic != null && getReflectContext.onNavigationEvent.equals(bluetoothGattCharacteristic.getUuid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public boolean extraCallbackWithResult(@Nullable BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return bluetoothGattCharacteristic != null && getReflectContext.onWarmupCompleted.equals(bluetoothGattCharacteristic.getUuid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean IAuthTabCallbackStub(@Nullable BluetoothGattDescriptor bluetoothGattDescriptor) {
        return bluetoothGattDescriptor != null && getReflectContext.onExtraCallback.equals(bluetoothGattDescriptor.getUuid());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void IAuthTabCallback(int i, @NonNull onExtraCallback onextracallback) {
        if (i >= this.ICustomTabsCallbackStubProxy.IAuthTabCallback()) {
            onextracallback.log();
        }
    }
}
