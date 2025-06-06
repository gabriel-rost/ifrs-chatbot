package com.example.chatbot;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public class ChatItemDecoration extends RecyclerView.ItemDecoration {
    private final int spacing;
    public ChatItemDecoration(int spacing) {
        this.spacing = spacing;
    }
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.top = spacing;
        outRect.bottom = spacing;
    }
}