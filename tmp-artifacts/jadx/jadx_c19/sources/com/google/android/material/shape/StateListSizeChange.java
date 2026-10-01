package com.google.android.material.shape;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class StateListSizeChange {
    private static final int INITIAL_CAPACITY = 10;
    private SizeChange defaultSizeChange;
    int stateCount;
    int[][] stateSpecs = new int[10][];
    SizeChange[] sizeChanges = new SizeChange[10];

    public enum SizeChangeType {
        PERCENT,
        PIXELS
    }

    public static StateListSizeChange create(@NonNull Context context, @NonNull TypedArray typedArray, int i2) throws Resources.NotFoundException {
        int next;
        int resourceId = typedArray.getResourceId(i2, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                StateListSizeChange stateListSizeChange = new StateListSizeChange();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    stateListSizeChange.loadSizeChangeFromItems(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return stateListSizeChange;
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public boolean isStateful() {
        return this.stateCount > 1;
    }

    public SizeChange getDefaultSizeChange() {
        return this.defaultSizeChange;
    }

    public SizeChange getSizeChangeForState(@NonNull int[] iArr) {
        int iIndexOfStateSet = indexOfStateSet(iArr);
        if (iIndexOfStateSet < 0) {
            iIndexOfStateSet = indexOfStateSet(StateSet.WILD_CARD);
        }
        return iIndexOfStateSet < 0 ? this.defaultSizeChange : this.sizeChanges[iIndexOfStateSet];
    }

    public int getMaxWidthChange(int i2) {
        float fMax;
        int i3 = -i2;
        for (int i4 = 0; i4 < this.stateCount; i4++) {
            SizeChangeAmount sizeChangeAmount = this.sizeChanges[i4].widthChange;
            SizeChangeType sizeChangeType = sizeChangeAmount.type;
            if (sizeChangeType == SizeChangeType.PIXELS) {
                fMax = Math.max(i3, sizeChangeAmount.amount);
            } else if (sizeChangeType == SizeChangeType.PERCENT) {
                fMax = Math.max(i3, i2 * sizeChangeAmount.amount);
            }
            i3 = (int) fMax;
        }
        return i3;
    }

    private int indexOfStateSet(int[] iArr) {
        int[][] iArr2 = this.stateSpecs;
        for (int i2 = 0; i2 < this.stateCount; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    private void loadSizeChangeFromItems(@NonNull Context context, @NonNull XmlPullParser xmlPullParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainStyledAttributes;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                Resources resources = context.getResources();
                if (theme == null) {
                    typedArrayObtainStyledAttributes = resources.obtainAttributes(attributeSet, R.styleable.StateListSizeChange);
                } else {
                    typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, R.styleable.StateListSizeChange, 0, 0);
                }
                SizeChangeAmount sizeChangeAmount = getSizeChangeAmount(typedArrayObtainStyledAttributes, R.styleable.StateListSizeChange_widthChange, null);
                typedArrayObtainStyledAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i2 = 0;
                for (int i3 = 0; i3 < attributeCount; i3++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                    if (attributeNameResource != R.attr.widthChange) {
                        if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i2] = attributeNameResource;
                        i2++;
                    }
                }
                addStateSizeChange(StateSet.trimStateSet(iArr, i2), new SizeChange(sizeChangeAmount));
            }
        }
    }

    private SizeChangeAmount getSizeChangeAmount(@NonNull TypedArray typedArray, int i2, @Nullable SizeChangeAmount sizeChangeAmount) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                return new SizeChangeAmount(SizeChangeType.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i3 == 6) {
                return new SizeChangeAmount(SizeChangeType.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return sizeChangeAmount;
    }

    private void addStateSizeChange(@NonNull int[] iArr, @NonNull SizeChange sizeChange) {
        int i2 = this.stateCount;
        if (i2 == 0 || iArr.length == 0) {
            this.defaultSizeChange = sizeChange;
        }
        if (i2 >= this.stateSpecs.length) {
            growArray(i2, i2 + 10);
        }
        int[][] iArr2 = this.stateSpecs;
        int i3 = this.stateCount;
        iArr2[i3] = iArr;
        this.sizeChanges[i3] = sizeChange;
        this.stateCount = i3 + 1;
    }

    private void growArray(int i2, int i3) {
        int[][] iArr = new int[i3][];
        System.arraycopy(this.stateSpecs, 0, iArr, 0, i2);
        this.stateSpecs = iArr;
        SizeChange[] sizeChangeArr = new SizeChange[i3];
        System.arraycopy(this.sizeChanges, 0, sizeChangeArr, 0, i2);
        this.sizeChanges = sizeChangeArr;
    }

    public static class SizeChange {
        public SizeChangeAmount widthChange;

        SizeChange(@Nullable SizeChangeAmount sizeChangeAmount) {
            this.widthChange = sizeChangeAmount;
        }

        SizeChange(@NonNull SizeChange sizeChange) {
            SizeChangeAmount sizeChangeAmount = sizeChange.widthChange;
            this.widthChange = new SizeChangeAmount(sizeChangeAmount.type, sizeChangeAmount.amount);
        }
    }

    public static class SizeChangeAmount {
        float amount;
        SizeChangeType type;

        SizeChangeAmount(SizeChangeType sizeChangeType, float f) {
            this.type = sizeChangeType;
            this.amount = f;
        }

        public int getChange(int i2) {
            SizeChangeType sizeChangeType = this.type;
            if (sizeChangeType == SizeChangeType.PERCENT) {
                return (int) (this.amount * i2);
            }
            if (sizeChangeType == SizeChangeType.PIXELS) {
                return (int) this.amount;
            }
            return 0;
        }
    }
}
