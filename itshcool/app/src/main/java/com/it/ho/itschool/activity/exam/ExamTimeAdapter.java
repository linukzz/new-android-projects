package com.it.ho.itschool.activity.exam;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import com.it.ho.itschool.R;

/**
 * Created by ho on 2016-8-25.
 */
public class ExamTimeAdapter extends RecyclerView.Adapter<ExamTimeAdapter.ExamTimeViewHolder> {
    private ArrayList<ExamTimeInfo> mValues = new ArrayList<>();

    public void addItem(int time, String subject) {
        ExamTimeInfo addInfo = new ExamTimeInfo();

        addInfo.time = time;
        addInfo.subject = subject;

        mValues.add(addInfo);
    }

    @Override
    public ExamTimeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_exam_item, parent, false);

        return new ExamTimeViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final ExamTimeViewHolder holder, int position) {
        ExamTimeInfo mInfo = getItemData(position);

        holder.mTime.setText(String.valueOf(mInfo.time));
        holder.mSubject.setText(mInfo.subject);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public ExamTimeInfo getItemData(int position) {
        return mValues.get(position);
    }

    public class ExamTimeViewHolder extends RecyclerView.ViewHolder {
        public final Context mContext;
        public final TextView mTime, mSubject;

        public ExamTimeViewHolder(View mView) {
            super(mView);

            mContext = mView.getContext();
            mTime = (TextView) mView.findViewById(R.id.list_item_entry_title);
            mSubject = (TextView) mView.findViewById(R.id.list_item_entry_summary);
        }
    }

    public class ExamTimeInfo {
        public int time;
        public String subject;
    }
}