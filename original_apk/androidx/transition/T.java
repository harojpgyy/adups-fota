package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Slide;

/* compiled from: Slide */
class T extends Slide.b {
    T() {
        super((P) null);
    }

    public float b(ViewGroup viewGroup, View view) {
        return view.getTranslationX() + ((float) viewGroup.getWidth());
    }
}
