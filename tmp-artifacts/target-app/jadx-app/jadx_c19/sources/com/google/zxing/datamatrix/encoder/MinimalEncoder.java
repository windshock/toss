package com.google.zxing.datamatrix.encoder;

import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.zxing.common.MinimalECIInput;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MinimalEncoder {
    static final char[] C40_SHIFT2_CHARS = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};

    enum Mode {
        ASCII,
        C40,
        TEXT,
        X12,
        EDF,
        B256
    }

    static boolean isExtendedASCII(char c, int i2) {
        return c != i2 && c >= 128 && c <= 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInC40Shift1Set(char c) {
        return c <= 31;
    }

    private MinimalEncoder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInC40Shift2Set(char c, int i2) {
        for (char c2 : C40_SHIFT2_CHARS) {
            if (c2 == c) {
                return true;
            }
        }
        return c == i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInTextShift1Set(char c) {
        return isInC40Shift1Set(c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInTextShift2Set(char c, int i2) {
        return isInC40Shift2Set(c, i2);
    }

    public static String encodeHighLevel(String str) {
        return encodeHighLevel(str, null, -1, SymbolShapeHint.FORCE_NONE);
    }

    public static String encodeHighLevel(String str, Charset charset, int i2, SymbolShapeHint symbolShapeHint) {
        int i3;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            str = str.substring(7, str.length() - 2);
            i3 = 5;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            str = str.substring(7, str.length() - 2);
            i3 = 6;
        } else {
            i3 = 0;
        }
        return new String(encode(str, charset, i2, symbolShapeHint, i3), StandardCharsets.ISO_8859_1);
    }

    static byte[] encode(String str, Charset charset, int i2, SymbolShapeHint symbolShapeHint, int i3) {
        return encodeMinimally(new Input(str, charset, i2, symbolShapeHint, i3, null)).getBytes();
    }

    static void addEdge(Edge[][] edgeArr, Edge edge) {
        int i2 = edge.fromPosition + edge.characterLength;
        if (edgeArr[i2][edge.getEndMode().ordinal()] == null || edgeArr[i2][edge.getEndMode().ordinal()].cachedTotalSize > edge.cachedTotalSize) {
            edgeArr[i2][edge.getEndMode().ordinal()] = edge;
        }
    }

    static int getNumberOfC40Words(Input input, int i2, boolean z, int[] iArr) {
        int i3 = 0;
        for (int i4 = i2; i4 < input.length(); i4++) {
            if (input.isECI(i4)) {
                iArr[0] = 0;
                return 0;
            }
            char cCharAt = input.charAt(i4);
            if ((z && HighLevelEncoder.isNativeC40(cCharAt)) || (!z && HighLevelEncoder.isNativeText(cCharAt))) {
                i3++;
            } else if (isExtendedASCII(cCharAt, input.getFNC1Character())) {
                int i5 = cCharAt & 255;
                i3 = (i5 < 128 || (!(z && HighLevelEncoder.isNativeC40((char) (i5 + (-128)))) && (z || !HighLevelEncoder.isNativeText((char) (i5 + (-128)))))) ? i3 + 4 : i3 + 3;
            } else {
                i3 += 2;
            }
            if (i3 % 3 == 0 || ((i3 - 2) % 3 == 0 && i4 + 1 == input.length())) {
                iArr[0] = (i4 - i2) + 1;
                return (int) Math.ceil(i3 / 3.0d);
            }
        }
        iArr[0] = 0;
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void addEdges(Input input, Edge[][] edgeArr, int i2, Edge edge) {
        if (input.isECI(i2)) {
            addEdge(edgeArr, new Edge(input, Mode.ASCII, i2, 1, edge, null));
            return;
        }
        char cCharAt = input.charAt(i2);
        int i3 = 0;
        if (edge == null || edge.getEndMode() != Mode.EDF) {
            if (HighLevelEncoder.isDigit(cCharAt) && input.haveNCharacters(i2, 2) && HighLevelEncoder.isDigit(input.charAt(i2 + 1))) {
                addEdge(edgeArr, new Edge(input, Mode.ASCII, i2, 2, edge, null));
            } else {
                addEdge(edgeArr, new Edge(input, Mode.ASCII, i2, 1, edge, null));
            }
            Mode[] modeArr = {Mode.C40, Mode.TEXT};
            int i4 = 0;
            while (i4 < 2) {
                Mode mode = modeArr[i4];
                int[] iArr = new int[1];
                if (getNumberOfC40Words(input, i2, mode == Mode.C40 ? 1 : i3, iArr) > 0) {
                    addEdge(edgeArr, new Edge(input, mode, i2, iArr[i3], edge, null));
                }
                i4++;
                i3 = 0;
            }
            if (input.haveNCharacters(i2, 3) && HighLevelEncoder.isNativeX12(input.charAt(i2)) && HighLevelEncoder.isNativeX12(input.charAt(i2 + 1)) && HighLevelEncoder.isNativeX12(input.charAt(i2 + 2))) {
                addEdge(edgeArr, new Edge(input, Mode.X12, i2, 3, edge, null));
            }
            addEdge(edgeArr, new Edge(input, Mode.B256, i2, 1, edge, null));
            i3 = 0;
        }
        while (i3 < 3) {
            int i5 = i2 + i3;
            if (!input.haveNCharacters(i5, 1) || !HighLevelEncoder.isNativeEDIFACT(input.charAt(i5))) {
                break;
            }
            i3++;
            addEdge(edgeArr, new Edge(input, Mode.EDF, i2, i3, edge, null));
        }
        if (i3 == 3 && input.haveNCharacters(i2, 4) && HighLevelEncoder.isNativeEDIFACT(input.charAt(i2 + 3))) {
            addEdge(edgeArr, new Edge(input, Mode.EDF, i2, 4, edge, null));
        }
    }

    static Result encodeMinimally(Input input) {
        int length = input.length();
        Edge[][] edgeArr = (Edge[][]) Array.newInstance((Class<?>) Edge.class, length + 1, 6);
        int i2 = 0;
        addEdges(input, edgeArr, 0, null);
        for (int i3 = 1; i3 <= length; i3++) {
            for (int i4 = 0; i4 < 6; i4++) {
                Edge edge = edgeArr[i3][i4];
                if (edge != null && i3 < length) {
                    addEdges(input, edgeArr, i3, edge);
                }
            }
            for (int i5 = 0; i5 < 6; i5++) {
                edgeArr[i3 - 1][i5] = null;
            }
        }
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        while (i2 < 6) {
            Edge edge2 = edgeArr[length][i2];
            if (edge2 != null) {
                int i8 = (i2 <= 0 || i2 > 3) ? edge2.cachedTotalSize : edge2.cachedTotalSize + 1;
                if (i8 < i6) {
                    i7 = i2;
                    i6 = i8;
                }
            }
            i2++;
        }
        if (i7 < 0) {
            throw new IllegalStateException("Failed to encode \"" + input + "\"");
        }
        return new Result(edgeArr[length][i7]);
    }

    static final class Edge {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final int cachedTotalSize;
        private final int characterLength;
        private final int fromPosition;
        private final Input input;
        private final Mode mode;
        private final Edge previous;
        private static final int[] allCodewordCapacities = {3, 5, 8, 10, 12, 16, 18, 22, 30, 32, 36, 44, 49, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};
        private static final int[] squareCodewordCapacities = {3, 5, 8, 12, 18, 22, 30, 36, 44, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};
        private static final int[] rectangularCodewordCapacities = {5, 10, 16, 33, 32, 49};

        private static int getC40Value(boolean z, int i2, char c, int i3) {
            if (c == i3) {
                return 27;
            }
            if (z) {
                if (c <= 31) {
                    return c;
                }
                if (c == ' ') {
                    return 3;
                }
                return c <= '/' ? c - '!' : c <= '9' ? c - ',' : c <= '@' ? c - '+' : c <= 'Z' ? c - '3' : c <= '_' ? c - 'E' : c <= 127 ? c - '`' : c;
            }
            if (c == 0) {
                return 0;
            }
            if (i2 == 0 && c <= 3) {
                return c - 1;
            }
            if (i2 == 1 && c <= 31) {
                return c;
            }
            if (c == ' ') {
                return 3;
            }
            if (c >= '!' && c <= '/') {
                return c - '!';
            }
            if (c >= '0' && c <= '9') {
                return c - ',';
            }
            if (c >= ':' && c <= '@') {
                return c - '+';
            }
            if (c >= 'A' && c <= 'Z') {
                return c - '@';
            }
            if (c >= '[' && c <= '_') {
                return c - 'E';
            }
            if (c == '`') {
                return 0;
            }
            return (c < 'a' || c > 'z') ? (c < '{' || c > 127) ? c : c - '`' : c - 'S';
        }

        private static int getX12Value(char c) {
            if (c == '\r') {
                return 0;
            }
            if (c == '*') {
                return 1;
            }
            if (c == '>') {
                return 2;
            }
            if (c == ' ') {
                return 3;
            }
            return (c < '0' || c > '9') ? (c < 'A' || c > 'Z') ? c : c - '3' : c - ',';
        }

        /* synthetic */ Edge(Input input, Mode mode, int i2, int i3, Edge edge, AnonymousClass1 anonymousClass1) {
            this(input, mode, i2, i3, edge);
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x0093 A[PHI: r10
          0x0093: PHI (r10v12 int) = (r10v8 int), (r10v8 int), (r10v8 int), (r10v15 int), (r10v15 int), (r10v15 int) binds: [B:52:0x0089, B:54:0x008d, B:56:0x0091, B:36:0x0067, B:38:0x006b, B:39:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00bb A[PHI: r10
          0x00bb: PHI (r10v10 int) = (r10v5 int), (r10v5 int), (r10v5 int), (r10v8 int), (r10v15 int), (r10v15 int) binds: [B:65:0x00b1, B:67:0x00b5, B:69:0x00b9, B:49:0x0084, B:30:0x005c, B:32:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Edge(Input input, Mode mode, int i2, int i3, Edge edge) {
            this.input = input;
            this.mode = mode;
            this.fromPosition = i2;
            this.characterLength = i3;
            this.previous = edge;
            int numberOfC40Words = edge != null ? edge.cachedTotalSize : 0;
            Mode previousMode = getPreviousMode();
            switch (AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode[mode.ordinal()]) {
                case 1:
                    numberOfC40Words = (input.isECI(i2) || MinimalEncoder.isExtendedASCII(input.charAt(i2), input.getFNC1Character())) ? numberOfC40Words + 2 : numberOfC40Words + 1;
                    if (previousMode == Mode.C40 || previousMode == Mode.TEXT || previousMode == Mode.X12) {
                        numberOfC40Words++;
                        break;
                    }
                    break;
                case 2:
                    numberOfC40Words = (previousMode == Mode.B256 && getB256Size() != 250) ? numberOfC40Words + 1 : numberOfC40Words + 2;
                    if (previousMode != Mode.ASCII) {
                        if (previousMode == Mode.C40 || previousMode == Mode.TEXT || previousMode == Mode.X12) {
                            numberOfC40Words += 2;
                            break;
                        }
                    }
                    break;
                case 3:
                case 4:
                case 5:
                    Mode mode2 = Mode.X12;
                    if (mode == mode2) {
                        numberOfC40Words += 2;
                    } else {
                        numberOfC40Words += MinimalEncoder.getNumberOfC40Words(input, i2, mode == Mode.C40, new int[1]) << 1;
                    }
                    if (previousMode != Mode.ASCII && previousMode != Mode.B256) {
                        if (previousMode != mode && (previousMode == Mode.C40 || previousMode == Mode.TEXT || previousMode == mode2)) {
                        }
                    }
                    break;
                case 6:
                    if (previousMode != Mode.ASCII && previousMode != Mode.B256) {
                        if (previousMode != Mode.C40 && previousMode != Mode.TEXT && previousMode != Mode.X12) {
                            numberOfC40Words += 3;
                            break;
                        } else {
                            numberOfC40Words += 5;
                            break;
                        }
                    } else {
                        numberOfC40Words += 4;
                        break;
                    }
            }
            this.cachedTotalSize = numberOfC40Words;
        }

        int getB256Size() {
            int i2 = 0;
            for (Edge edge = this; edge != null && edge.mode == Mode.B256 && i2 <= 250; edge = edge.previous) {
                i2++;
            }
            return i2;
        }

        Mode getPreviousStartMode() {
            Edge edge = this.previous;
            return edge == null ? Mode.ASCII : edge.mode;
        }

        Mode getPreviousMode() {
            Edge edge = this.previous;
            return edge == null ? Mode.ASCII : edge.getEndMode();
        }

        Mode getEndMode() {
            if (this.mode == Mode.EDF) {
                if (this.characterLength < 4) {
                    return Mode.ASCII;
                }
                int lastASCII = getLastASCII();
                if (lastASCII > 0 && getCodewordsRemaining(this.cachedTotalSize + lastASCII) <= 2 - lastASCII) {
                    return Mode.ASCII;
                }
            }
            Mode mode = this.mode;
            if (mode == Mode.C40 || mode == Mode.TEXT || mode == Mode.X12) {
                if (this.fromPosition + this.characterLength >= this.input.length() && getCodewordsRemaining(this.cachedTotalSize) == 0) {
                    return Mode.ASCII;
                }
                if (getLastASCII() == 1 && getCodewordsRemaining(this.cachedTotalSize + 1) == 0) {
                    return Mode.ASCII;
                }
            }
            return this.mode;
        }

        Mode getMode() {
            return this.mode;
        }

        int getLastASCII() {
            int length = this.input.length();
            int i2 = this.fromPosition + this.characterLength;
            int i3 = length - i2;
            if (i3 <= 4 && i2 < length) {
                if (i3 == 1) {
                    return MinimalEncoder.isExtendedASCII(this.input.charAt(i2), this.input.getFNC1Character()) ? 0 : 1;
                }
                if (i3 == 2) {
                    if (!MinimalEncoder.isExtendedASCII(this.input.charAt(i2), this.input.getFNC1Character())) {
                        int i4 = i2 + 1;
                        if (!MinimalEncoder.isExtendedASCII(this.input.charAt(i4), this.input.getFNC1Character())) {
                            return (HighLevelEncoder.isDigit(this.input.charAt(i2)) && HighLevelEncoder.isDigit(this.input.charAt(i4))) ? 1 : 2;
                        }
                    }
                    return 0;
                }
                if (i3 == 3) {
                    if (HighLevelEncoder.isDigit(this.input.charAt(i2)) && HighLevelEncoder.isDigit(this.input.charAt(i2 + 1)) && !MinimalEncoder.isExtendedASCII(this.input.charAt(i2 + 2), this.input.getFNC1Character())) {
                        return 2;
                    }
                    return (HighLevelEncoder.isDigit(this.input.charAt(i2 + 1)) && HighLevelEncoder.isDigit(this.input.charAt(i2 + 2)) && !MinimalEncoder.isExtendedASCII(this.input.charAt(i2), this.input.getFNC1Character())) ? 2 : 0;
                }
                if (HighLevelEncoder.isDigit(this.input.charAt(i2)) && HighLevelEncoder.isDigit(this.input.charAt(i2 + 1)) && HighLevelEncoder.isDigit(this.input.charAt(i2 + 2)) && HighLevelEncoder.isDigit(this.input.charAt(i2 + 3))) {
                    return 2;
                }
            }
            return 0;
        }

        int getMinSymbolSize(int i2) {
            int i3 = AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint[this.input.getShapeHint().ordinal()];
            if (i3 == 1) {
                for (int i4 : squareCodewordCapacities) {
                    if (i4 >= i2) {
                        return i4;
                    }
                }
            } else if (i3 == 2) {
                for (int i5 : rectangularCodewordCapacities) {
                    if (i5 >= i2) {
                        return i5;
                    }
                }
            }
            for (int i6 : allCodewordCapacities) {
                if (i6 >= i2) {
                    return i6;
                }
            }
            int[] iArr = allCodewordCapacities;
            return iArr[iArr.length - 1];
        }

        int getCodewordsRemaining(int i2) {
            return getMinSymbolSize(i2) - i2;
        }

        static byte[] getBytes(int i2) {
            return new byte[]{(byte) i2};
        }

        static byte[] getBytes(int i2, int i3) {
            return new byte[]{(byte) i2, (byte) i3};
        }

        static void setC40Word(byte[] bArr, int i2, int i3, int i4, int i5) {
            int i6 = ((i3 & OggPageHeader.MAX_SEGMENT_COUNT) * 1600) + ((i4 & OggPageHeader.MAX_SEGMENT_COUNT) * 40) + (i5 & OggPageHeader.MAX_SEGMENT_COUNT) + 1;
            bArr[i2] = (byte) (i6 / 256);
            bArr[i2 + 1] = (byte) (i6 % 256);
        }

        byte[] getX12Words() {
            int i2 = (this.characterLength / 3) << 1;
            byte[] bArr = new byte[i2];
            for (int i3 = 0; i3 < i2; i3 += 2) {
                int i4 = (i3 / 2) * 3;
                setC40Word(bArr, i3, getX12Value(this.input.charAt(this.fromPosition + i4)), getX12Value(this.input.charAt(this.fromPosition + i4 + 1)), getX12Value(this.input.charAt(this.fromPosition + i4 + 2)));
            }
            return bArr;
        }

        static int getShiftValue(char c, boolean z, int i2) {
            if (z && MinimalEncoder.isInC40Shift1Set(c)) {
                return 0;
            }
            if (!z && MinimalEncoder.isInTextShift1Set(c)) {
                return 0;
            }
            if (z && MinimalEncoder.isInC40Shift2Set(c, i2)) {
                return 1;
            }
            return (z || !MinimalEncoder.isInTextShift2Set(c, i2)) ? 2 : 1;
        }

        byte[] getC40Words(boolean z, int i2) {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < this.characterLength; i3++) {
                char cCharAt = this.input.charAt(this.fromPosition + i3);
                if ((z && HighLevelEncoder.isNativeC40(cCharAt)) || (!z && HighLevelEncoder.isNativeText(cCharAt))) {
                    arrayList.add(Byte.valueOf((byte) getC40Value(z, 0, cCharAt, i2)));
                } else if (!MinimalEncoder.isExtendedASCII(cCharAt, i2)) {
                    int shiftValue = getShiftValue(cCharAt, z, i2);
                    arrayList.add(Byte.valueOf((byte) shiftValue));
                    arrayList.add(Byte.valueOf((byte) getC40Value(z, shiftValue, cCharAt, i2)));
                } else {
                    char c = (char) ((cCharAt & 255) - 128);
                    if ((z && HighLevelEncoder.isNativeC40(c)) || (!z && HighLevelEncoder.isNativeText(c))) {
                        arrayList.add((byte) 1);
                        arrayList.add((byte) 30);
                        arrayList.add(Byte.valueOf((byte) getC40Value(z, 0, c, i2)));
                    } else {
                        arrayList.add((byte) 1);
                        arrayList.add((byte) 30);
                        int shiftValue2 = getShiftValue(c, z, i2);
                        arrayList.add(Byte.valueOf((byte) shiftValue2));
                        arrayList.add(Byte.valueOf((byte) getC40Value(z, shiftValue2, c, i2)));
                    }
                }
            }
            if (arrayList.size() % 3 != 0) {
                arrayList.add((byte) 0);
            }
            byte[] bArr = new byte[(arrayList.size() / 3) << 1];
            int i4 = 0;
            for (int i5 = 0; i5 < arrayList.size(); i5 += 3) {
                setC40Word(bArr, i4, ((Byte) arrayList.get(i5)).byteValue() & 255, ((Byte) arrayList.get(i5 + 1)).byteValue() & 255, ((Byte) arrayList.get(i5 + 2)).byteValue() & 255);
                i4 += 2;
            }
            return bArr;
        }

        byte[] getEDFBytes() {
            int iCeil = (int) Math.ceil(this.characterLength / 4.0d);
            byte[] bArr = new byte[iCeil * 3];
            int i2 = this.fromPosition;
            int iMin = Math.min((this.characterLength + i2) - 1, this.input.length() - 1);
            for (int i3 = 0; i3 < iCeil; i3 += 3) {
                int[] iArr = new int[4];
                for (int i4 = 0; i4 < 4; i4++) {
                    if (i2 <= iMin) {
                        iArr[i4] = this.input.charAt(i2) & '?';
                        i2++;
                    } else {
                        iArr[i4] = i2 == iMin + 1 ? 31 : 0;
                    }
                }
                int i5 = (iArr[0] << 18) | (iArr[1] << 12) | (iArr[2] << 6) | iArr[3];
                bArr[i3] = (byte) (i5 >> 16);
                bArr[i3 + 1] = (byte) (i5 >> 8);
                bArr[i3 + 2] = (byte) i5;
            }
            return bArr;
        }

        byte[] getLatchBytes() {
            int[] iArr = AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode;
            int i2 = iArr[getPreviousMode().ordinal()];
            if (i2 == 1 || i2 == 2) {
                int i3 = iArr[this.mode.ordinal()];
                if (i3 == 2) {
                    return getBytes(231);
                }
                if (i3 == 3) {
                    return getBytes(230);
                }
                if (i3 == 4) {
                    return getBytes(239);
                }
                if (i3 == 5) {
                    return getBytes(238);
                }
                if (i3 == 6) {
                    return getBytes(240);
                }
            } else if ((i2 == 3 || i2 == 4 || i2 == 5) && this.mode != getPreviousMode()) {
                switch (iArr[this.mode.ordinal()]) {
                    case 1:
                        return getBytes(254);
                    case 2:
                        return getBytes(254, 231);
                    case 3:
                        return getBytes(254, 230);
                    case 4:
                        return getBytes(254, 239);
                    case 5:
                        return getBytes(254, 238);
                    case 6:
                        return getBytes(254, 240);
                }
            }
            return new byte[0];
        }

        byte[] getDataBytes() {
            switch (AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode[this.mode.ordinal()]) {
                case 1:
                    if (this.input.isECI(this.fromPosition)) {
                        return getBytes(241, this.input.getECIValue(this.fromPosition) + 1);
                    }
                    if (MinimalEncoder.isExtendedASCII(this.input.charAt(this.fromPosition), this.input.getFNC1Character())) {
                        return getBytes(235, this.input.charAt(this.fromPosition) - 127);
                    }
                    if (this.characterLength == 2) {
                        return getBytes(((this.input.charAt(this.fromPosition) - '0') * 10) + this.input.charAt(this.fromPosition + 1) + 82);
                    }
                    if (this.input.isFNC1(this.fromPosition)) {
                        return getBytes(232);
                    }
                    return getBytes(this.input.charAt(this.fromPosition) + 1);
                case 2:
                    return getBytes(this.input.charAt(this.fromPosition));
                case 3:
                    return getC40Words(true, this.input.getFNC1Character());
                case 4:
                    return getC40Words(false, this.input.getFNC1Character());
                case 5:
                    return getX12Words();
                case 6:
                    return getEDFBytes();
                default:
                    return new byte[0];
            }
        }
    }

    /* renamed from: com.google.zxing.datamatrix.encoder.MinimalEncoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode;
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint;

        static {
            int[] iArr = new int[SymbolShapeHint.values().length];
            $SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint = iArr;
            try {
                iArr[SymbolShapeHint.FORCE_SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$encoder$SymbolShapeHint[SymbolShapeHint.FORCE_RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode = iArr2;
            try {
                iArr2[Mode.ASCII.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode[Mode.B256.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode[Mode.C40.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode[Mode.TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode[Mode.X12.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$encoder$MinimalEncoder$Mode[Mode.EDF.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static final class Result {
        private final byte[] bytes;

        Result(Edge edge) {
            int i2;
            Input input = edge.input;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            int iPrepend = ((edge.mode == Mode.C40 || edge.mode == Mode.TEXT || edge.mode == Mode.X12) && edge.getEndMode() != Mode.ASCII) ? prepend(Edge.getBytes(254), arrayList) : 0;
            for (Edge edge2 = edge; edge2 != null; edge2 = edge2.previous) {
                iPrepend += prepend(edge2.getDataBytes(), arrayList);
                if (edge2.previous == null || edge2.getPreviousStartMode() != edge2.getMode()) {
                    if (edge2.getMode() == Mode.B256) {
                        if (iPrepend <= 249) {
                            arrayList.add(0, Byte.valueOf((byte) iPrepend));
                            i2 = iPrepend + 1;
                        } else {
                            arrayList.add(0, Byte.valueOf((byte) (iPrepend % 250)));
                            arrayList.add(0, Byte.valueOf((byte) ((iPrepend / 250) + 249)));
                            i2 = iPrepend + 2;
                        }
                        arrayList2.add(Integer.valueOf(arrayList.size()));
                        arrayList3.add(Integer.valueOf(i2));
                    }
                    prepend(edge2.getLatchBytes(), arrayList);
                    iPrepend = 0;
                }
            }
            if (input.getMacroId() == 5) {
                prepend(Edge.getBytes(236), arrayList);
            } else if (input.getMacroId() == 6) {
                prepend(Edge.getBytes(237), arrayList);
            }
            if (input.getFNC1Character() > 0) {
                prepend(Edge.getBytes(232), arrayList);
            }
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                applyRandomPattern(arrayList, arrayList.size() - ((Integer) arrayList2.get(i4)).intValue(), ((Integer) arrayList3.get(i4)).intValue());
            }
            int minSymbolSize = edge.getMinSymbolSize(arrayList.size());
            if (arrayList.size() < minSymbolSize) {
                arrayList.add((byte) -127);
            }
            while (arrayList.size() < minSymbolSize) {
                arrayList.add(Byte.valueOf((byte) randomize253State(arrayList.size() + 1)));
            }
            this.bytes = new byte[arrayList.size()];
            while (true) {
                byte[] bArr = this.bytes;
                if (i3 >= bArr.length) {
                    return;
                }
                bArr[i3] = ((Byte) arrayList.get(i3)).byteValue();
                i3++;
            }
        }

        static int prepend(byte[] bArr, List<Byte> list) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                list.add(0, Byte.valueOf(bArr[length]));
            }
            return bArr.length;
        }

        private static int randomize253State(int i2) {
            int i3 = (i2 * 149) % 253;
            int i4 = i3 + 130;
            return i4 <= 254 ? i4 : i3 - 124;
        }

        static void applyRandomPattern(List<Byte> list, int i2, int i3) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i2 + i4;
                int iByteValue = (list.get(i5).byteValue() & 255) + (((i5 + 1) * 149) % OggPageHeader.MAX_SEGMENT_COUNT) + 1;
                if (iByteValue > 255) {
                    iByteValue -= 256;
                }
                list.set(i5, Byte.valueOf((byte) iByteValue));
            }
        }

        public byte[] getBytes() {
            return this.bytes;
        }
    }

    static final class Input extends MinimalECIInput {
        private final int macroId;
        private final SymbolShapeHint shape;

        /* synthetic */ Input(String str, Charset charset, int i2, SymbolShapeHint symbolShapeHint, int i3, AnonymousClass1 anonymousClass1) {
            this(str, charset, i2, symbolShapeHint, i3);
        }

        private Input(String str, Charset charset, int i2, SymbolShapeHint symbolShapeHint, int i3) {
            super(str, charset, i2);
            this.shape = symbolShapeHint;
            this.macroId = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getMacroId() {
            return this.macroId;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public SymbolShapeHint getShapeHint() {
            return this.shape;
        }
    }
}
