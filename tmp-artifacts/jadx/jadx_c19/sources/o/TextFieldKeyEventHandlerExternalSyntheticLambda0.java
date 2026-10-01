package o;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldKeyEventHandlerExternalSyntheticLambda0 {

    public static final class onExtraCallbackWithResult {
        public final ByteBuffer IAuthTabCallback;
        public final int onWarmupCompleted;

        private onExtraCallbackWithResult(int i2, ByteBuffer byteBuffer) {
            this.onWarmupCompleted = i2;
            this.IAuthTabCallback = byteBuffer;
        }
    }

    public static List<onExtraCallbackWithResult> onExtraCallbackWithResult(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b = byteBufferAsReadOnlyBuffer.get();
            if (((b >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            if (((b >> 1) & 1) != 0) {
                iRemaining = onWarmupCompleted(byteBufferAsReadOnlyBuffer);
            } else {
                iRemaining = byteBufferAsReadOnlyBuffer.remaining();
            }
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            arrayList.add(new onExtraCallbackWithResult((b >> 3) & 15, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
        }
        return arrayList;
    }

    private static int onWarmupCompleted(ByteBuffer byteBuffer) {
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            byte b = byteBuffer.get();
            i2 |= (b & Byte.MAX_VALUE) << (i3 * 7);
            if ((b & 128) == 0) {
                return i2;
            }
        }
        return i2;
    }

    public static final class onNavigationEvent {
        public final boolean IAuthTabCallback;
        public final boolean IAuthTabCallbackDefault;
        public final boolean IAuthTabCallbackStub;
        public final boolean IAuthTabCallbackStubProxy;
        public final boolean IAuthTabCallback_Parcel;
        public final boolean ICustomTabsCallback;
        public final boolean access000;
        public final int access100;
        public final byte asBinder;
        public final int asInterface;
        public final boolean extraCallback;
        public final int extraCallbackWithResult;
        public final int getInterfaceDescriptor;
        public final boolean onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final boolean onNavigationEvent;
        public final int onTransact;
        public final byte onWarmupCompleted;
        public final byte readTypedObject;
        public final boolean writeTypedObject;

        public static onNavigationEvent onWarmupCompleted(onExtraCallbackWithResult onextracallbackwithresult) {
            try {
                return new onNavigationEvent(onextracallbackwithresult);
            } catch (IAuthTabCallback unused) {
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0140  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0172  */
        /* JADX WARN: Type inference failed for: r9v4, types: [int] */
        /* JADX WARN: Type inference failed for: r9v5 */
        /* JADX WARN: Type inference failed for: r9v6 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private onNavigationEvent(onExtraCallbackWithResult onextracallbackwithresult) throws IAuthTabCallback {
            int iOnNavigationEvent;
            int iOnNavigationEvent2;
            boolean zOnWarmupCompleted;
            ?? r9;
            RecordingInputConnection_androidKt.onNavigationEvent(onextracallbackwithresult.onWarmupCompleted == 1);
            byte[] bArr = new byte[onextracallbackwithresult.IAuthTabCallback.remaining()];
            onextracallbackwithresult.IAuthTabCallback.asReadOnlyBuffer().get(bArr);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(bArr);
            this.getInterfaceDescriptor = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
            boolean zOnWarmupCompleted2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
            this.IAuthTabCallback_Parcel = zOnWarmupCompleted2;
            if (zOnWarmupCompleted2) {
                iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
                this.onExtraCallback = false;
                this.IAuthTabCallbackDefault = false;
                iOnNavigationEvent = 0;
                r9 = 0;
            } else {
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
                    boolean zOnWarmupCompleted3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                    this.onExtraCallback = zOnWarmupCompleted3;
                    if (zOnWarmupCompleted3) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(47);
                    }
                } else {
                    this.onExtraCallback = false;
                }
                this.IAuthTabCallbackDefault = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
                int iOnNavigationEvent4 = 0;
                int i2 = 0;
                iOnNavigationEvent = 0;
                boolean z = false;
                while (i2 <= iOnNavigationEvent3) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(12);
                    if (i2 == 0) {
                        iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
                        zOnWarmupCompleted = z;
                        if (iOnNavigationEvent4 > 7) {
                            zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                        }
                    } else {
                        zOnWarmupCompleted = z;
                        if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5) > 7) {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                            zOnWarmupCompleted = z;
                        }
                    }
                    if (this.onExtraCallback) {
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                    }
                    if (this.IAuthTabCallbackDefault && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                        if (i2 == 0) {
                            iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
                        } else {
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                        }
                    }
                    i2++;
                    z = zOnWarmupCompleted;
                }
                iOnNavigationEvent2 = iOnNavigationEvent4;
                r9 = z;
            }
            int iOnNavigationEvent5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
            int iOnNavigationEvent6 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(iOnNavigationEvent5 + 1);
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(iOnNavigationEvent6 + 1);
            if (!this.IAuthTabCallback_Parcel) {
                this.IAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
            } else {
                this.IAuthTabCallback = false;
            }
            if (this.IAuthTabCallback) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
            if (this.IAuthTabCallback_Parcel) {
                this.access000 = true;
                this.IAuthTabCallbackStubProxy = true;
            } else {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
                boolean zOnWarmupCompleted4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                if (zOnWarmupCompleted4) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
                }
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    this.IAuthTabCallbackStubProxy = true;
                } else {
                    this.IAuthTabCallbackStubProxy = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                }
                if (this.IAuthTabCallbackStubProxy && !textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    this.access000 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                } else {
                    this.access000 = true;
                }
                if (zOnWarmupCompleted4) {
                    this.onTransact = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3) + 1;
                }
                this.access100 = iOnNavigationEvent2;
                this.extraCallbackWithResult = r9;
                this.asInterface = iOnNavigationEvent;
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
                boolean zOnWarmupCompleted5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                this.onNavigationEvent = zOnWarmupCompleted5;
                if (this.getInterfaceDescriptor != 2 && zOnWarmupCompleted5) {
                    this.writeTypedObject = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                } else {
                    this.writeTypedObject = false;
                }
                if (this.getInterfaceDescriptor == 1) {
                    this.IAuthTabCallbackStub = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                } else {
                    this.IAuthTabCallbackStub = false;
                }
                if (!textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    this.onWarmupCompleted = (byte) textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
                    this.readTypedObject = (byte) textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
                    this.asBinder = (byte) textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
                } else {
                    this.onWarmupCompleted = (byte) 0;
                    this.readTypedObject = (byte) 0;
                    this.asBinder = (byte) 0;
                }
                if (!this.IAuthTabCallbackStub) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                    this.ICustomTabsCallback = false;
                    this.extraCallback = false;
                } else if (this.onWarmupCompleted == 1 && this.readTypedObject == 13 && this.asBinder == 0) {
                    this.ICustomTabsCallback = false;
                    this.extraCallback = false;
                } else {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                    int i3 = this.getInterfaceDescriptor;
                    if (i3 == 0) {
                        this.ICustomTabsCallback = true;
                        this.extraCallback = true;
                    } else if (i3 == 1) {
                        this.ICustomTabsCallback = false;
                        this.extraCallback = false;
                    } else if (this.writeTypedObject) {
                        boolean zOnWarmupCompleted6 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                        this.ICustomTabsCallback = zOnWarmupCompleted6;
                        if (zOnWarmupCompleted6) {
                            this.extraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
                        } else {
                            this.extraCallback = false;
                        }
                    } else {
                        this.ICustomTabsCallback = true;
                        this.extraCallback = false;
                    }
                    if (this.ICustomTabsCallback && this.extraCallback) {
                        this.onExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
                    }
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
                }
                this.onExtraCallbackWithResult = 0;
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
            }
            this.onTransact = 0;
            this.access100 = iOnNavigationEvent2;
            this.extraCallbackWithResult = r9;
            this.asInterface = iOnNavigationEvent;
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
            boolean zOnWarmupCompleted52 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
            this.onNavigationEvent = zOnWarmupCompleted52;
            if (this.getInterfaceDescriptor != 2) {
                this.writeTypedObject = false;
            }
            if (this.getInterfaceDescriptor == 1) {
            }
            if (!textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            }
            if (!this.IAuthTabCallbackStub) {
            }
            this.onExtraCallbackWithResult = 0;
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
        }

        private static void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(64);
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                TextFieldKeyEventHandlerExternalSyntheticLambda0.onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        int i2 = 0;
        while (!textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
            i2++;
        }
        if (i2 < 32) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(i2);
        }
    }

    public static final class onExtraCallback {
        private final boolean onExtraCallback;

        public boolean onWarmupCompleted() {
            return this.onExtraCallback;
        }

        public static onExtraCallback onWarmupCompleted(onNavigationEvent onnavigationevent, onExtraCallbackWithResult onextracallbackwithresult) {
            try {
                return new onExtraCallback(onnavigationevent, onextracallbackwithresult);
            } catch (IAuthTabCallback unused) {
                return null;
            }
        }

        private onExtraCallback(onNavigationEvent onnavigationevent, onExtraCallbackWithResult onextracallbackwithresult) throws IAuthTabCallback {
            int i2 = onextracallbackwithresult.onWarmupCompleted;
            RecordingInputConnection_androidKt.onNavigationEvent(i2 == 6 || i2 == 3);
            byte[] bArr = new byte[Math.min(4, onextracallbackwithresult.IAuthTabCallback.remaining())];
            onextracallbackwithresult.IAuthTabCallback.asReadOnlyBuffer().get(bArr);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(bArr);
            boolean z = onnavigationevent.IAuthTabCallback_Parcel;
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                this.onExtraCallback = false;
                return;
            }
            int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
            boolean zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
            boolean z2 = onnavigationevent.onExtraCallback;
            if (!zOnWarmupCompleted) {
                this.onExtraCallback = true;
                return;
            }
            boolean zOnWarmupCompleted2 = (iOnNavigationEvent == 3 || iOnNavigationEvent == 0) ? true : textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
            boolean z3 = onnavigationevent.IAuthTabCallbackStubProxy;
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                boolean z4 = onnavigationevent.access000;
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
            }
            boolean z5 = onnavigationevent.IAuthTabCallback;
            if (iOnNavigationEvent != 3) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallbackStub();
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(onnavigationevent.onTransact);
            if (iOnNavigationEvent != 2 && iOnNavigationEvent != 0 && !zOnWarmupCompleted2) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
            }
            this.onExtraCallback = ((iOnNavigationEvent == 3 || iOnNavigationEvent == 0) ? OggPageHeader.MAX_SEGMENT_COUNT : textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8)) != 0;
        }
    }

    static class IAuthTabCallback extends Exception {
        private IAuthTabCallback() {
        }
    }
}
