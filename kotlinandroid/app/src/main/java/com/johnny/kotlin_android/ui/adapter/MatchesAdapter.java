package com.johnny.kotlin_android.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.johnny.kotlin_android.databinding.MatchItemBinding;
import com.johnny.kotlin_android.domain.Match;

import java.util.List;

public class MatchesAdapter extends RecyclerView.Adapter<MatchesAdapter.ViewHolder> {

    private List<Match> matches;

    public MatchesAdapter(List<Match> matches) {
            this.matches = matches;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =  LayoutInflater.from(parent.getContext());
        MatchItemBinding binding = MatchItemBinding.inflate(layoutInflater, parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Context context = holder.itemView.getContext();

        Match match = matches.get(position);


            //Glide
            Glide.with(context).load(match.getHomeTeam().getImage()).circleCrop().into((holder.binding.imageViewTemA));
            Glide.with(context).load(match.getAwayTeam().getImage()).circleCrop().into((holder.binding.imageViewTeamB));

            holder.binding.tvNameTeamA.setText(match.getHomeTeam().getName());
            holder.binding.tvNameTeamB.setText(match.getAwayTeam().getName());


    }

    @Override
    public int getItemCount() {
        return matches.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final MatchItemBinding binding;

        public ViewHolder(MatchItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }


}
