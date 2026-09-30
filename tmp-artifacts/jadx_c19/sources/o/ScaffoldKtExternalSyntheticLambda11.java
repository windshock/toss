package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.material.button.MaterialButton;
import com.google.common.collect.ImmutableList;
import com.google.zxing.aztec.encoder.Encoder;
import java.util.ArrayList;
import java.util.List;
import o.ImeEditCommand_androidKtExternalSyntheticLambda1;
import o.RippleKtExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class ScaffoldKtExternalSyntheticLambda11 implements RippleKtExternalSyntheticLambda0 {
    private final Canvas IAuthTabCallback;
    private final onExtraCallback IAuthTabCallbackDefault;
    private final Paint IAuthTabCallbackStub;
    private final IAuthTabCallbackStub asBinder;
    private final Paint asInterface;
    private Bitmap onExtraCallback;
    private final onWarmupCompleted onTransact;
    private static final byte[] onExtraCallbackWithResult = {0, 7, 8, 15};
    private static final byte[] onWarmupCompleted = {0, 119, -120, -1};
    private static final byte[] onNavigationEvent = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    private static int IAuthTabCallback(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    @Override // o.RippleKtExternalSyntheticLambda0
    public int onExtraCallback() {
        return 2;
    }

    public ScaffoldKtExternalSyntheticLambda11(List<byte[]> list) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(list.get(0));
        int iOnUnminimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        int iOnUnminimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onUnminimized();
        Paint paint = new Paint();
        this.asInterface = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.IAuthTabCallbackStub = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.IAuthTabCallback = new Canvas();
        this.onTransact = new onWarmupCompleted(719, 575, 0, 719, 0, 575);
        this.IAuthTabCallbackDefault = new onExtraCallback(0, onExtraCallbackWithResult(), onWarmupCompleted(), IAuthTabCallback());
        this.asBinder = new IAuthTabCallbackStub(iOnUnminimized, iOnUnminimized2);
    }

    @Override // o.RippleKtExternalSyntheticLambda0
    public void onNavigationEvent() {
        this.asBinder.onExtraCallbackWithResult();
    }

    @Override // o.RippleKtExternalSyntheticLambda0
    public void IAuthTabCallback(byte[] bArr, int i2, int i3, RippleKtExternalSyntheticLambda0.onNavigationEvent onnavigationevent, TextFieldDecoratorModifierNodeExternalSyntheticLambda10<RadioButtonDefaults> textFieldDecoratorModifierNodeExternalSyntheticLambda10) {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(bArr, i3 + i2);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(i2);
        textFieldDecoratorModifierNodeExternalSyntheticLambda10.accept(onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private RadioButtonDefaults onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        int i2;
        int i3;
        SparseArray<asBinder> sparseArray;
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback() >= 48 && textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8) == 15) {
            onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21, this.asBinder);
        }
        IAuthTabCallbackStub iAuthTabCallbackStub = this.asBinder;
        IAuthTabCallback iAuthTabCallback = iAuthTabCallbackStub.asInterface;
        if (iAuthTabCallback == null) {
            return new RadioButtonDefaults(ImmutableList.of(), -9223372036854775807L, -9223372036854775807L);
        }
        onWarmupCompleted onwarmupcompleted = iAuthTabCallbackStub.onExtraCallbackWithResult;
        if (onwarmupcompleted == null) {
            onwarmupcompleted = this.onTransact;
        }
        Bitmap bitmap = this.onExtraCallback;
        if (bitmap != null && onwarmupcompleted.asInterface + 1 == bitmap.getWidth()) {
            if (onwarmupcompleted.onNavigationEvent + 1 != this.onExtraCallback.getHeight()) {
            }
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(onwarmupcompleted.asInterface + 1, onwarmupcompleted.onNavigationEvent + 1, Bitmap.Config.ARGB_8888);
            this.onExtraCallback = bitmapCreateBitmap;
            this.IAuthTabCallback.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<onNavigationEvent> sparseArray2 = iAuthTabCallback.onExtraCallback;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.IAuthTabCallback.save();
            onNavigationEvent onnavigationeventValueAt = sparseArray2.valueAt(i4);
            asInterface asinterface = this.asBinder.IAuthTabCallbackStub.get(sparseArray2.keyAt(i4));
            int i5 = onnavigationeventValueAt.IAuthTabCallback + onwarmupcompleted.onExtraCallbackWithResult;
            int i6 = onnavigationeventValueAt.onExtraCallbackWithResult + onwarmupcompleted.onExtraCallback;
            this.IAuthTabCallback.clipRect(i5, i6, Math.min(asinterface.IAuthTabCallbackStubProxy + i5, onwarmupcompleted.onWarmupCompleted), Math.min(asinterface.onExtraCallback + i6, onwarmupcompleted.IAuthTabCallback));
            onExtraCallback onextracallback = this.asBinder.onExtraCallback.get(asinterface.onNavigationEvent);
            if (onextracallback == null && (onextracallback = this.asBinder.onNavigationEvent.get(asinterface.onNavigationEvent)) == null) {
                onextracallback = this.IAuthTabCallbackDefault;
            }
            SparseArray<asBinder> sparseArray3 = asinterface.IAuthTabCallbackStub;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int iKeyAt = sparseArray3.keyAt(i7);
                asBinder asbinderValueAt = sparseArray3.valueAt(i7);
                onExtraCallbackWithResult onextracallbackwithresult = this.asBinder.IAuthTabCallbackDefault.get(iKeyAt);
                onExtraCallbackWithResult onextracallbackwithresult2 = onextracallbackwithresult == null ? this.asBinder.IAuthTabCallback.get(iKeyAt) : onextracallbackwithresult;
                if (onextracallbackwithresult2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    onExtraCallback(onextracallbackwithresult2, onextracallback, asinterface.IAuthTabCallback, asbinderValueAt.onWarmupCompleted + i5, asbinderValueAt.onTransact + i6, onextracallbackwithresult2.onExtraCallbackWithResult ? null : this.asInterface, this.IAuthTabCallback);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (asinterface.onWarmupCompleted) {
                int i8 = asinterface.IAuthTabCallback;
                if (i8 == 3) {
                    i2 = onextracallback.IAuthTabCallback[asinterface.onTransact];
                } else if (i8 == 2) {
                    i2 = onextracallback.onExtraCallbackWithResult[asinterface.asInterface];
                } else {
                    i2 = onextracallback.onWarmupCompleted[asinterface.IAuthTabCallbackDefault];
                }
                this.IAuthTabCallbackStub.setColor(i2);
                this.IAuthTabCallback.drawRect(i5, i6, asinterface.IAuthTabCallbackStubProxy + i5, asinterface.onExtraCallback + i6, this.IAuthTabCallbackStub);
            }
            arrayList.add(new ImeEditCommand_androidKtExternalSyntheticLambda1.onExtraCallbackWithResult().onNavigationEvent(Bitmap.createBitmap(this.onExtraCallback, i5, i6, asinterface.IAuthTabCallbackStubProxy, asinterface.onExtraCallback)).onExtraCallbackWithResult(i5 / onwarmupcompleted.asInterface).onExtraCallback(0).onExtraCallback(i6 / onwarmupcompleted.onNavigationEvent, 0).onExtraCallbackWithResult(0).IAuthTabCallback(asinterface.IAuthTabCallbackStubProxy / onwarmupcompleted.asInterface).onNavigationEvent(asinterface.onExtraCallback / onwarmupcompleted.onNavigationEvent).IAuthTabCallback());
            this.IAuthTabCallback.drawColor(0, PorterDuff.Mode.CLEAR);
            this.IAuthTabCallback.restore();
        }
        return new RadioButtonDefaults(arrayList, -9223372036854775807L, -9223372036854775807L);
    }

    private static void onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, IAuthTabCallbackStub iAuthTabCallbackStub) {
        asInterface asinterface;
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
        int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
        int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
        int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent();
        if ((iOnNavigationEvent3 << 3) > textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("DvbParser", "Data field length exceeds limit");
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback());
            return;
        }
        switch (iOnNavigationEvent) {
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                if (iOnNavigationEvent2 == iAuthTabCallbackStub.asBinder) {
                    IAuthTabCallback iAuthTabCallback = iAuthTabCallbackStub.asInterface;
                    IAuthTabCallback iAuthTabCallbackOnExtraCallback = onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21, iOnNavigationEvent3);
                    if (iAuthTabCallbackOnExtraCallback.IAuthTabCallback != 0) {
                        iAuthTabCallbackStub.asInterface = iAuthTabCallbackOnExtraCallback;
                        iAuthTabCallbackStub.IAuthTabCallbackStub.clear();
                        iAuthTabCallbackStub.onExtraCallback.clear();
                        iAuthTabCallbackStub.IAuthTabCallbackDefault.clear();
                        break;
                    } else if (iAuthTabCallback != null && iAuthTabCallback.onNavigationEvent != iAuthTabCallbackOnExtraCallback.onNavigationEvent) {
                        iAuthTabCallbackStub.asInterface = iAuthTabCallbackOnExtraCallback;
                        break;
                    }
                }
                break;
            case 17:
                IAuthTabCallback iAuthTabCallback2 = iAuthTabCallbackStub.asInterface;
                if (iOnNavigationEvent2 == iAuthTabCallbackStub.asBinder && iAuthTabCallback2 != null) {
                    asInterface asinterfaceOnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, iOnNavigationEvent3);
                    if (iAuthTabCallback2.IAuthTabCallback == 0 && (asinterface = iAuthTabCallbackStub.IAuthTabCallbackStub.get(asinterfaceOnNavigationEvent.onExtraCallbackWithResult)) != null) {
                        asinterfaceOnNavigationEvent.onNavigationEvent(asinterface);
                    }
                    iAuthTabCallbackStub.IAuthTabCallbackStub.put(asinterfaceOnNavigationEvent.onExtraCallbackWithResult, asinterfaceOnNavigationEvent);
                    break;
                }
                break;
            case 18:
                if (iOnNavigationEvent2 == iAuthTabCallbackStub.asBinder) {
                    onExtraCallback onextracallbackOnExtraCallbackWithResult = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21, iOnNavigationEvent3);
                    iAuthTabCallbackStub.onExtraCallback.put(onextracallbackOnExtraCallbackWithResult.onNavigationEvent, onextracallbackOnExtraCallbackWithResult);
                    break;
                } else if (iOnNavigationEvent2 == iAuthTabCallbackStub.onWarmupCompleted) {
                    onExtraCallback onextracallbackOnExtraCallbackWithResult2 = onExtraCallbackWithResult(textFieldDecoratorModifierNodeExternalSyntheticLambda21, iOnNavigationEvent3);
                    iAuthTabCallbackStub.onNavigationEvent.put(onextracallbackOnExtraCallbackWithResult2.onNavigationEvent, onextracallbackOnExtraCallbackWithResult2);
                    break;
                }
                break;
            case 19:
                if (iOnNavigationEvent2 == iAuthTabCallbackStub.asBinder) {
                    onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
                    iAuthTabCallbackStub.IAuthTabCallbackDefault.put(onextracallbackwithresultOnNavigationEvent.onWarmupCompleted, onextracallbackwithresultOnNavigationEvent);
                    break;
                } else if (iOnNavigationEvent2 == iAuthTabCallbackStub.onWarmupCompleted) {
                    onExtraCallbackWithResult onextracallbackwithresultOnNavigationEvent2 = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
                    iAuthTabCallbackStub.IAuthTabCallback.put(onextracallbackwithresultOnNavigationEvent2.onWarmupCompleted, onextracallbackwithresultOnNavigationEvent2);
                    break;
                }
                break;
            case 20:
                if (iOnNavigationEvent2 == iAuthTabCallbackStub.asBinder) {
                    iAuthTabCallbackStub.onExtraCallbackWithResult = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21);
                    break;
                }
                break;
        }
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallbackWithResult((iOnNavigationEvent4 + iOnNavigationEvent3) - textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent());
    }

    private static onWarmupCompleted IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        int i2;
        int i3;
        int i4;
        int iOnNavigationEvent;
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
        boolean zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
        int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
        int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
        if (zOnWarmupCompleted) {
            int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
            int iOnNavigationEvent5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
            int iOnNavigationEvent6 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
            iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
            i4 = iOnNavigationEvent5;
            i3 = iOnNavigationEvent6;
            i2 = iOnNavigationEvent4;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = iOnNavigationEvent2;
            iOnNavigationEvent = iOnNavigationEvent3;
        }
        return new onWarmupCompleted(iOnNavigationEvent2, iOnNavigationEvent3, i2, i4, i3, iOnNavigationEvent);
    }

    private static IAuthTabCallback onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int i2) {
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
        int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
        int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
            i3 -= 6;
            sparseArray.put(iOnNavigationEvent4, new onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16), textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16)));
        }
        return new IAuthTabCallback(iOnNavigationEvent, iOnNavigationEvent2, iOnNavigationEvent3, sparseArray);
    }

    private static asInterface onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int i2) {
        int iOnNavigationEvent;
        int iOnNavigationEvent2;
        int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
        boolean zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(3);
        int i3 = 16;
        int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
        int iOnNavigationEvent5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
        int iOnNavigationEvent6 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
        int iOnNavigationEvent7 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
        int i4 = 2;
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
        int iOnNavigationEvent8 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
        int iOnNavigationEvent9 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
        int iOnNavigationEvent10 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
        int iOnNavigationEvent11 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(2);
        int i5 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i5 > 0) {
            int iOnNavigationEvent12 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i3);
            int iOnNavigationEvent13 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i4);
            int iOnNavigationEvent14 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i4);
            int iOnNavigationEvent15 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(12);
            int i6 = iOnNavigationEvent11;
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
            int iOnNavigationEvent16 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(12);
            if (iOnNavigationEvent13 == 1 || iOnNavigationEvent13 == 2) {
                i5 -= 8;
                iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
                iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
            } else {
                i5 -= 6;
                iOnNavigationEvent = 0;
                iOnNavigationEvent2 = 0;
            }
            sparseArray.put(iOnNavigationEvent12, new asBinder(iOnNavigationEvent13, iOnNavigationEvent14, iOnNavigationEvent15, iOnNavigationEvent16, iOnNavigationEvent, iOnNavigationEvent2));
            iOnNavigationEvent11 = i6;
            i4 = 2;
            i3 = 16;
        }
        return new asInterface(iOnNavigationEvent3, zOnWarmupCompleted, iOnNavigationEvent4, iOnNavigationEvent5, iOnNavigationEvent6, iOnNavigationEvent7, iOnNavigationEvent8, iOnNavigationEvent9, iOnNavigationEvent10, iOnNavigationEvent11, sparseArray);
    }

    private static onExtraCallback onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int i2) {
        int i3;
        int iOnNavigationEvent;
        int iOnNavigationEvent2;
        int iOnNavigationEvent3;
        int iOnNavigationEvent4;
        int i4 = 8;
        int iOnNavigationEvent5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(8);
        int i5 = i2 - 2;
        int[] iArrOnExtraCallbackWithResult = onExtraCallbackWithResult();
        int[] iArrOnWarmupCompleted = onWarmupCompleted();
        int[] iArrIAuthTabCallback = IAuthTabCallback();
        while (i5 > 0) {
            int iOnNavigationEvent6 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i4);
            int iOnNavigationEvent7 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i4);
            int[] iArr = (iOnNavigationEvent7 & 128) != 0 ? iArrOnExtraCallbackWithResult : (iOnNavigationEvent7 & 64) != 0 ? iArrOnWarmupCompleted : iArrIAuthTabCallback;
            if ((iOnNavigationEvent7 & 1) != 0) {
                iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i4);
                iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i4);
                iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i4);
                iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i4);
                i3 = i5 - 6;
            } else {
                int iOnNavigationEvent8 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(6);
                int iOnNavigationEvent9 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
                int iOnNavigationEvent10 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4) << 4;
                i3 = i5 - 4;
                int i6 = iOnNavigationEvent9 << 4;
                iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2) << 6;
                iOnNavigationEvent2 = iOnNavigationEvent8 << 2;
                iOnNavigationEvent3 = i6;
                iOnNavigationEvent4 = iOnNavigationEvent10;
            }
            if (iOnNavigationEvent2 == 0) {
                iOnNavigationEvent = 255;
                iOnNavigationEvent3 = 0;
                iOnNavigationEvent4 = 0;
            }
            double d = iOnNavigationEvent2;
            double d2 = iOnNavigationEvent3 - 128;
            int i7 = i3;
            double d3 = iOnNavigationEvent4 - 128;
            iArr[iOnNavigationEvent6] = IAuthTabCallback((byte) (255 - (iOnNavigationEvent & OggPageHeader.MAX_SEGMENT_COUNT)), TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback((int) (d + (1.402d * d2)), 0, OggPageHeader.MAX_SEGMENT_COUNT), TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, OggPageHeader.MAX_SEGMENT_COUNT), TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback((int) (d + (d3 * 1.772d)), 0, OggPageHeader.MAX_SEGMENT_COUNT));
            iArrOnExtraCallbackWithResult = iArrOnExtraCallbackWithResult;
            iOnNavigationEvent5 = iOnNavigationEvent5;
            i5 = i7;
            i4 = 8;
        }
        return new onExtraCallback(iOnNavigationEvent5, iArrOnExtraCallbackWithResult, iArrOnWarmupCompleted, iArrIAuthTabCallback);
    }

    private static onExtraCallbackWithResult onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        byte[] bArr;
        int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(4);
        int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
        boolean zOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted();
        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(1);
        byte[] bArr2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted;
        if (iOnNavigationEvent2 == 1) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8) << 4);
        } else {
            if (iOnNavigationEvent2 == 0) {
                int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
                int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(16);
                if (iOnNavigationEvent3 > 0) {
                    bArr2 = new byte[iOnNavigationEvent3];
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback(bArr2, 0, iOnNavigationEvent3);
                }
                if (iOnNavigationEvent4 > 0) {
                    bArr = new byte[iOnNavigationEvent4];
                    textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback(bArr, 0, iOnNavigationEvent4);
                }
            }
            return new onExtraCallbackWithResult(iOnNavigationEvent, zOnWarmupCompleted, bArr2, bArr);
        }
        bArr = bArr2;
        return new onExtraCallbackWithResult(iOnNavigationEvent, zOnWarmupCompleted, bArr2, bArr);
    }

    private static int[] onExtraCallbackWithResult() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] onWarmupCompleted() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = IAuthTabCallback(OggPageHeader.MAX_SEGMENT_COUNT, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = IAuthTabCallback(OggPageHeader.MAX_SEGMENT_COUNT, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] IAuthTabCallback() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = OggPageHeader.MAX_SEGMENT_COUNT;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? 255 : 0;
                int i5 = (i2 & 2) != 0 ? 255 : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = IAuthTabCallback(63, i4, i5, i3);
            } else {
                int i6 = i2 & 136;
                if (i6 == 0) {
                    iArr[i2] = IAuthTabCallback(OggPageHeader.MAX_SEGMENT_COUNT, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i6 == 8) {
                    iArr[i2] = IAuthTabCallback(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i6 == 128) {
                    iArr[i2] = IAuthTabCallback(OggPageHeader.MAX_SEGMENT_COUNT, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i6 == 136) {
                    iArr[i2] = IAuthTabCallback(OggPageHeader.MAX_SEGMENT_COUNT, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static void onExtraCallback(onExtraCallbackWithResult onextracallbackwithresult, onExtraCallback onextracallback, int i2, int i3, int i4, @Nullable Paint paint, Canvas canvas) {
        int[] iArr;
        if (i2 == 3) {
            iArr = onextracallback.IAuthTabCallback;
        } else if (i2 == 2) {
            iArr = onextracallback.onExtraCallbackWithResult;
        } else {
            iArr = onextracallback.onWarmupCompleted;
        }
        int[] iArr2 = iArr;
        onNavigationEvent(onextracallbackwithresult.onNavigationEvent, iArr2, i2, i3, i4, paint, canvas);
        onNavigationEvent(onextracallbackwithresult.IAuthTabCallback, iArr2, i2, i3, i4 + 1, paint, canvas);
    }

    private static void onNavigationEvent(byte[] bArr, int[] iArr, int i2, int i3, int i4, @Nullable Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21(bArr);
        int iOnNavigationEvent = i3;
        int i5 = i4;
        byte[] bArrOnWarmupCompleted = null;
        byte[] bArrOnWarmupCompleted2 = null;
        byte[] bArrOnWarmupCompleted3 = null;
        while (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onExtraCallback() != 0) {
            int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
            if (iOnNavigationEvent2 != 240) {
                switch (iOnNavigationEvent2) {
                    case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                        if (i2 != 3) {
                            if (i2 != 2) {
                                bArr2 = null;
                            } else if (bArrOnWarmupCompleted3 == null) {
                                bArr3 = onExtraCallbackWithResult;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrOnWarmupCompleted3;
                            }
                            iOnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, iArr, bArr2, iOnNavigationEvent, i5, paint, canvas);
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback();
                        } else if (bArrOnWarmupCompleted == null) {
                            bArr3 = onWarmupCompleted;
                            bArr2 = bArr3;
                            iOnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, iArr, bArr2, iOnNavigationEvent, i5, paint, canvas);
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback();
                            break;
                        } else {
                            bArr2 = bArrOnWarmupCompleted;
                            iOnNavigationEvent = onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda21, iArr, bArr2, iOnNavigationEvent, i5, paint, canvas);
                            textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback();
                        }
                    case 17:
                        if (i2 == 3) {
                            bArr4 = bArrOnWarmupCompleted2 == null ? onNavigationEvent : bArrOnWarmupCompleted2;
                        } else {
                            bArr4 = null;
                        }
                        iOnNavigationEvent = onExtraCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21, iArr, bArr4, iOnNavigationEvent, i5, paint, canvas);
                        textFieldDecoratorModifierNodeExternalSyntheticLambda21.IAuthTabCallback();
                        break;
                    case 18:
                        iOnNavigationEvent = IAuthTabCallback(textFieldDecoratorModifierNodeExternalSyntheticLambda21, iArr, null, iOnNavigationEvent, i5, paint, canvas);
                        break;
                    default:
                        switch (iOnNavigationEvent2) {
                            case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                                bArrOnWarmupCompleted3 = onWarmupCompleted(4, 4, textFieldDecoratorModifierNodeExternalSyntheticLambda21);
                                break;
                            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                                bArrOnWarmupCompleted = onWarmupCompleted(4, 8, textFieldDecoratorModifierNodeExternalSyntheticLambda21);
                                break;
                            case 34:
                                bArrOnWarmupCompleted2 = onWarmupCompleted(16, 8, textFieldDecoratorModifierNodeExternalSyntheticLambda21);
                                break;
                        }
                }
            } else {
                i5 += 2;
                iOnNavigationEvent = i3;
            }
        }
    }

    private static int onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int[] iArr, @Nullable byte[] bArr, int i2, int i3, @Nullable Paint paint, Canvas canvas) {
        boolean z;
        int i4;
        int iOnNavigationEvent;
        int iOnNavigationEvent2;
        int i5 = i2;
        boolean z2 = false;
        while (true) {
            int i6 = 2;
            int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
            if (iOnNavigationEvent3 != 0) {
                z = z2;
                i4 = 1;
            } else {
                if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3) + 3;
                    iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
                } else {
                    if (textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                        i6 = 1;
                    } else {
                        int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
                        if (iOnNavigationEvent4 == 0) {
                            z2 = true;
                        } else if (iOnNavigationEvent4 != 1) {
                            if (iOnNavigationEvent4 == 2) {
                                iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4) + 12;
                                iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
                            } else if (iOnNavigationEvent4 == 3) {
                                iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8) + 29;
                                iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
                            }
                        }
                        z = z2;
                        iOnNavigationEvent3 = 0;
                        i4 = 0;
                    }
                    z = z2;
                    i4 = i6;
                    iOnNavigationEvent3 = 0;
                }
                int i7 = iOnNavigationEvent;
                iOnNavigationEvent3 = iOnNavigationEvent2;
                z = z2;
                i4 = i7;
            }
            if (i4 != 0 && paint != null) {
                if (bArr != 0) {
                    iOnNavigationEvent3 = bArr[iOnNavigationEvent3];
                }
                paint.setColor(iArr[iOnNavigationEvent3]);
                canvas.drawRect(i5, i3, i5 + i4, i3 + 1, paint);
            }
            i5 += i4;
            if (z) {
                return i5;
            }
            z2 = z;
        }
    }

    private static int onExtraCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int[] iArr, @Nullable byte[] bArr, int i2, int i3, @Nullable Paint paint, Canvas canvas) {
        int i4;
        boolean z;
        int i5;
        int iOnNavigationEvent;
        int iOnNavigationEvent2;
        int i6 = i2;
        boolean z2 = false;
        while (true) {
            int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
            if (iOnNavigationEvent3 != 0) {
                z = z2;
                i5 = 1;
            } else if (!textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                int iOnNavigationEvent4 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(3);
                if (iOnNavigationEvent4 != 0) {
                    i4 = iOnNavigationEvent4 + 2;
                    z = z2;
                    i5 = i4;
                    iOnNavigationEvent3 = 0;
                } else {
                    z2 = true;
                    z = z2;
                    iOnNavigationEvent3 = 0;
                    i5 = 0;
                }
            } else {
                if (!textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                    iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2) + 4;
                    iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
                } else {
                    int iOnNavigationEvent5 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(2);
                    if (iOnNavigationEvent5 == 0) {
                        i4 = 1;
                        z = z2;
                        i5 = i4;
                        iOnNavigationEvent3 = 0;
                    } else if (iOnNavigationEvent5 == 1) {
                        z = z2;
                        i5 = 2;
                        iOnNavigationEvent3 = 0;
                    } else if (iOnNavigationEvent5 != 2) {
                        if (iOnNavigationEvent5 == 3) {
                            iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8) + 25;
                            iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
                        }
                        z = z2;
                        iOnNavigationEvent3 = 0;
                        i5 = 0;
                    } else {
                        iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4) + 9;
                        iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(4);
                    }
                }
                int i7 = iOnNavigationEvent;
                iOnNavigationEvent3 = iOnNavigationEvent2;
                z = z2;
                i5 = i7;
            }
            if (i5 != 0 && paint != null) {
                if (bArr != 0) {
                    iOnNavigationEvent3 = bArr[iOnNavigationEvent3];
                }
                paint.setColor(iArr[iOnNavigationEvent3]);
                canvas.drawRect(i6, i3, i6 + i5, i3 + 1, paint);
            }
            i6 += i5;
            if (z) {
                return i6;
            }
            z2 = z;
        }
    }

    private static int IAuthTabCallback(TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21, int[] iArr, @Nullable byte[] bArr, int i2, int i3, @Nullable Paint paint, Canvas canvas) {
        boolean z;
        int iOnNavigationEvent;
        int i4 = i2;
        boolean z2 = false;
        while (true) {
            int iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
            if (iOnNavigationEvent2 != 0) {
                z = z2;
                iOnNavigationEvent = 1;
            } else if (!textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted()) {
                int iOnNavigationEvent3 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(7);
                if (iOnNavigationEvent3 != 0) {
                    z = z2;
                    iOnNavigationEvent = iOnNavigationEvent3;
                    iOnNavigationEvent2 = 0;
                } else {
                    z = true;
                    iOnNavigationEvent2 = 0;
                    iOnNavigationEvent = 0;
                }
            } else {
                z = z2;
                iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(7);
                iOnNavigationEvent2 = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(8);
            }
            if (iOnNavigationEvent != 0 && paint != null) {
                if (bArr != 0) {
                    iOnNavigationEvent2 = bArr[iOnNavigationEvent2];
                }
                paint.setColor(iArr[iOnNavigationEvent2]);
                canvas.drawRect(i4, i3, i4 + iOnNavigationEvent, i3 + 1, paint);
            }
            i4 += iOnNavigationEvent;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    private static byte[] onWarmupCompleted(int i2, int i3, TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(i3);
        }
        return bArr;
    }

    static final class IAuthTabCallbackStub {
        public final int asBinder;
        public IAuthTabCallback asInterface;
        public onWarmupCompleted onExtraCallbackWithResult;
        public final int onWarmupCompleted;
        public final SparseArray<asInterface> IAuthTabCallbackStub = new SparseArray<>();
        public final SparseArray<onExtraCallback> onExtraCallback = new SparseArray<>();
        public final SparseArray<onExtraCallbackWithResult> IAuthTabCallbackDefault = new SparseArray<>();
        public final SparseArray<onExtraCallback> onNavigationEvent = new SparseArray<>();
        public final SparseArray<onExtraCallbackWithResult> IAuthTabCallback = new SparseArray<>();

        public IAuthTabCallbackStub(int i2, int i3) {
            this.asBinder = i2;
            this.onWarmupCompleted = i3;
        }

        public void onExtraCallbackWithResult() {
            this.IAuthTabCallbackStub.clear();
            this.onExtraCallback.clear();
            this.IAuthTabCallbackDefault.clear();
            this.onNavigationEvent.clear();
            this.IAuthTabCallback.clear();
            this.onExtraCallbackWithResult = null;
            this.asInterface = null;
        }
    }

    static final class onWarmupCompleted {
        public final int IAuthTabCallback;
        public final int asInterface;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final int onWarmupCompleted;

        public onWarmupCompleted(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.asInterface = i2;
            this.onNavigationEvent = i3;
            this.onExtraCallbackWithResult = i4;
            this.onWarmupCompleted = i5;
            this.onExtraCallback = i6;
            this.IAuthTabCallback = i7;
        }
    }

    static final class IAuthTabCallback {
        public final int IAuthTabCallback;
        public final SparseArray<onNavigationEvent> onExtraCallback;
        public final int onNavigationEvent;
        public final int onWarmupCompleted;

        public IAuthTabCallback(int i2, int i3, int i4, SparseArray<onNavigationEvent> sparseArray) {
            this.onWarmupCompleted = i2;
            this.onNavigationEvent = i3;
            this.IAuthTabCallback = i4;
            this.onExtraCallback = sparseArray;
        }
    }

    static final class onNavigationEvent {
        public final int IAuthTabCallback;
        public final int onExtraCallbackWithResult;

        public onNavigationEvent(int i2, int i3) {
            this.IAuthTabCallback = i2;
            this.onExtraCallbackWithResult = i3;
        }
    }

    static final class asInterface {
        public final int IAuthTabCallback;
        public final int IAuthTabCallbackDefault;
        public final SparseArray<asBinder> IAuthTabCallbackStub;
        public final int IAuthTabCallbackStubProxy;
        public final int asBinder;
        public final int asInterface;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final int onTransact;
        public final boolean onWarmupCompleted;

        public asInterface(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<asBinder> sparseArray) {
            this.onExtraCallbackWithResult = i2;
            this.onWarmupCompleted = z;
            this.IAuthTabCallbackStubProxy = i3;
            this.onExtraCallback = i4;
            this.asBinder = i5;
            this.IAuthTabCallback = i6;
            this.onNavigationEvent = i7;
            this.onTransact = i8;
            this.asInterface = i9;
            this.IAuthTabCallbackDefault = i10;
            this.IAuthTabCallbackStub = sparseArray;
        }

        public void onNavigationEvent(asInterface asinterface) {
            SparseArray<asBinder> sparseArray = asinterface.IAuthTabCallbackStub;
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                this.IAuthTabCallbackStub.put(sparseArray.keyAt(i2), sparseArray.valueAt(i2));
            }
        }
    }

    static final class asBinder {
        public final int IAuthTabCallback;
        public final int onExtraCallback;
        public final int onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final int onTransact;
        public final int onWarmupCompleted;

        public asBinder(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.onNavigationEvent = i2;
            this.onExtraCallback = i3;
            this.onWarmupCompleted = i4;
            this.onTransact = i5;
            this.IAuthTabCallback = i6;
            this.onExtraCallbackWithResult = i7;
        }
    }

    static final class onExtraCallback {
        public final int[] IAuthTabCallback;
        public final int[] onExtraCallbackWithResult;
        public final int onNavigationEvent;
        public final int[] onWarmupCompleted;

        public onExtraCallback(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
            this.onNavigationEvent = i2;
            this.onWarmupCompleted = iArr;
            this.onExtraCallbackWithResult = iArr2;
            this.IAuthTabCallback = iArr3;
        }
    }

    static final class onExtraCallbackWithResult {
        public final byte[] IAuthTabCallback;
        public final boolean onExtraCallbackWithResult;
        public final byte[] onNavigationEvent;
        public final int onWarmupCompleted;

        public onExtraCallbackWithResult(int i2, boolean z, byte[] bArr, byte[] bArr2) {
            this.onWarmupCompleted = i2;
            this.onExtraCallbackWithResult = z;
            this.onNavigationEvent = bArr;
            this.IAuthTabCallback = bArr2;
        }
    }
}
