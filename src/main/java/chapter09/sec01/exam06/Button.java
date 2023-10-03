package chapter09.sec01.exam06;

public class Button {
    interface OnClickListener {
        void onClick();
    }

    OnClickListener listener;

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }
}
