package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import com.google.android.exoplayer2.text.Cue;
import java.util.Comparator;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class Cea708Decoder$Cea708CueInfo {
    private static final Comparator<Cea708Decoder$Cea708CueInfo> LEAST_IMPORTANT_FIRST = new Comparator() { // from class: com.google.android.exoplayer2.text.cea.Cea708Decoder$Cea708CueInfo$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((Cea708Decoder$Cea708CueInfo) obj2).priority, ((Cea708Decoder$Cea708CueInfo) obj).priority);
        }
    };
    public final Cue cue;
    public final int priority;

    public Cea708Decoder$Cea708CueInfo(CharSequence charSequence, Layout.Alignment alignment, float f, int i2, int i3, float f2, int i4, float f3, boolean z, int i5, int i6) {
        Cue.Builder size = new Cue.Builder().setText(charSequence).setTextAlignment(alignment).setLine(f, i2).setLineAnchor(i3).setPosition(f2).setPositionAnchor(i4).setSize(f3);
        if (z) {
            size.setWindowColor(i5);
        }
        this.cue = size.build();
        this.priority = i6;
    }
}
