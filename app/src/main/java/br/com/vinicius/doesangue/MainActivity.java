package br.com.vinicius.doesangue;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private PostAdapter postAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        postAdapter = new PostAdapter();
        recyclerView.setAdapter(postAdapter);

        List<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setImageViewUsuario(R.drawable.usuaria);
        post1.setTextViewData("06/09/2020");
        post1.setTextViewHora("19:00");
        post1.setTextViewUsuario("Pedro Silva");
        post1.setTextViewNome("João Carlos Maia");
        post1.setTextViewTipoSanguineo("O+");
        post1.setTextViewHospital("Hospital São José do Avaí");
        post1.setTextViewCidade("Itaperuna");
        post1.setTextViewBairro("Centro");
        post1.setTextViewRua("Cel. Luís Ferraz");


        posts.add(post1);



        Post post2 = new Post();
        post2.setImageViewUsuario(R.drawable.usuaria);
        post2.setTextViewData("07/09/2020");
        post2.setTextViewHora("19:30");
        post2.setTextViewUsuario("Carlos Eduardo");
        post2.setTextViewNome("Josicleide Lemos");
        post2.setTextViewTipoSanguineo("O-");
        post2.setTextViewHospital("Hospital São José do Avaí");
        post2.setTextViewCidade("Itaperuna");
        post2.setTextViewBairro("Centro");
        post2.setTextViewRua("Cel. Luís Ferraz");

        posts.add(post2);


        Post post3 = new Post();
        post3.setImageViewUsuario(R.drawable.usuaria);
        post3.setTextViewData("08/09/2020");
        post3.setTextViewHora("20:00");
        post3.setTextViewUsuario("Mário Lima");
        post3.setTextViewNome("Lucas Santos");
        post3.setTextViewTipoSanguineo("O+");
        post3.setTextViewHospital("Hospital São José do Avaí");
        post3.setTextViewCidade("Itaperuna");
        post3.setTextViewBairro("Centro");
        post3.setTextViewRua("Cel. Luís Ferraz");

        posts.add(post3);
        postAdapter.setPosts(posts);


    }

    private static class PostViewHolder extends RecyclerView.ViewHolder {

        private final TextView textViewData;
        private final ImageView imageViewUsuario;
        private final TextView textViewHora;
        private final TextView textViewUsuario;
        private final TextView textViewNome;
        private final TextView textViewTipoSanguineo;
        private final TextView TextViewHospital;
        private final TextView textViewCidade;
        private final TextView textViewBairro;
        private final TextView textViewRua;


        public PostViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewData = itemView.findViewById(R.id.text_view_data);
            imageViewUsuario = itemView.findViewById(R.id.image_view_usuario);
            textViewHora = itemView.findViewById(R.id.text_view_hora);
            textViewUsuario = itemView.findViewById(R.id.text_view_usuario);
            textViewNome = itemView.findViewById(R.id.text_view_nome);
            textViewTipoSanguineo = itemView.findViewById(R.id.text_view_tipoSanguineo);
            TextViewHospital = itemView.findViewById(R.id.text_view_hospital);
            textViewCidade = itemView.findViewById(R.id.text_view_cidade);
            textViewBairro = itemView.findViewById(R.id.text_view_bairro);
            textViewRua = itemView.findViewById(R.id.text_view_rua);

        }

        void bind(Post post){
            textViewData.setText(post.getTextViewData());
            imageViewUsuario.setImageResource(post.getImageViewUsuario());
            textViewHora.setText(post.getTextViewHora());
            textViewUsuario.setText(post.getTextViewUsuario());
            textViewNome.setText(post.getTextViewNome());
            textViewTipoSanguineo.setText(post.getTextViewTipoSanguineo());
            TextViewHospital.setText(post.getTextViewHospital());
            textViewCidade.setText(post.getTextViewCidade());
            textViewBairro.setText(post.getTextViewBairro());
            textViewRua.setText(post.getTextViewRua());
        }
    }

    private class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {

        private List<Post> posts = new ArrayList<>();

        @NonNull
        @Override
        public PostViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

            View view = getLayoutInflater().inflate(R.layout.feed_item, viewGroup, false);
            return new PostViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull PostViewHolder postViewHolder, int i) {
            Post post = posts.get(i);
            postViewHolder.bind(post);


        }

        @Override
        public int getItemCount() {
            return posts.size();
        }

        public void setPosts(List<Post> posts) {
            this.posts = posts;
            this.notifyDataSetChanged();
        }
    }

    private class Post{

        private int ImageViewUsuario;
        private String TextViewHora;
        private String TextViewData;
        private String TextViewUsuario;
        private String TextViewNome;
        private String TextViewTipoSanguineo;
        private String TextViewHospital;
        private String TextViewCidade;
        private String TextViewBairro;
        private String TextViewRua;


        public String getTextViewData() {
            return TextViewData;
        }

        public void setTextViewData(String textViewData) {
            TextViewData = textViewData;
        }


        public int getImageViewUsuario() {
            return ImageViewUsuario;
        }

        public void setImageViewUsuario(int imageViewUsuario) {
            ImageViewUsuario = imageViewUsuario;
        }

        public String getTextViewHora() {
            return TextViewHora;
        }

        public void setTextViewHora(String textViewHora) {
            TextViewHora = textViewHora;
        }

        public String getTextViewUsuario() {
            return TextViewUsuario;
        }

        public void setTextViewUsuario(String textViewUsuario) {
            TextViewUsuario = textViewUsuario;
        }

        public String getTextViewNome() {
            return TextViewNome;
        }

        public void setTextViewNome(String textViewNome) {
            TextViewNome = textViewNome;
        }


        public String getTextViewTipoSanguineo() {
            return TextViewTipoSanguineo;
        }

        public void setTextViewTipoSanguineo(String textViewTipoSanguineo) {
            TextViewTipoSanguineo = textViewTipoSanguineo;
        }

        public String getTextViewHospital() {
            return TextViewHospital;
        }

        public void setTextViewHospital(String textViewHospital) {
            TextViewHospital = textViewHospital;
        }

        public String getTextViewCidade() {
            return TextViewCidade;
        }

        public void setTextViewCidade(String textViewCidade) {
            TextViewCidade = textViewCidade;
        }

        public String getTextViewBairro() {
            return TextViewBairro;
        }

        public void setTextViewBairro(String textViewBairro) {
            TextViewBairro = textViewBairro;
        }

        public String getTextViewRua() {
            return TextViewRua;
        }

        public void setTextViewRua(String textViewRua) {
            TextViewRua = textViewRua;
        }

    }
}