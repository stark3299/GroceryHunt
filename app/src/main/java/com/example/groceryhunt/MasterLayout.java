package com.example.groceryhunt;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MasterLayout extends AppCompatActivity {
   RecyclerView recyclerView2 ;
   ListView listView ;
   ImageView img0,img2,img3,img4,img5,img6,img7,img8,img9;
   int[] img1 = { R.drawable.langra,R.drawable.chausa,R.drawable.desheri};
   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.master_layout);
      String[] brand11 =getResources().getStringArray(R.array.brand);
      String[] quantity11 =getResources().getStringArray(R.array.product);
      String[] product11 =getResources().getStringArray(R.array.quantity);
      String[] mrp11 =getResources().getStringArray(R.array.mrp);
      List<String> urlList = new ArrayList<String>();
      List<String> urlList1 = new ArrayList<String>();
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer10.png?alt=media&token=2fa41668-48cf-41fd-a62f-51455bb09717");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer11.png?alt=media&token=a9aa1865-f74a-40ff-a055-0709f50008c7");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer12.png?alt=media&token=7fd7332c-4601-4438-af84-d8a2cf8f6dae");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer13.png?alt=media&token=c93fd23e-c302-4f81-bc34-5b55385f0cd8");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer14.png?alt=media&token=92f6af5c-18bf-4055-8268-23c89d381d2e");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer15.png?alt=media&token=4ac60a7c-7556-444a-a836-0ef0438276ab");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer16.png?alt=media&token=7bb5fab8-1cc7-4086-a390-3b6e91406641");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer17.png?alt=media&token=f20810d6-f79d-4f58-a63c-59df2913cf66");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer18.png?alt=media&token=c73db3ce-8124-4cfd-a12d-7b54be7f7d64");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer19.png?alt=media&token=913a5b99-01e8-41bd-84fb-93a6a8a4264d");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer20.png?alt=media&token=746a498a-4c1b-4ba6-bd77-27b0973cae98");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer21.png?alt=media&token=4ffa1fb4-5968-4b0c-9604-9b3bd272f2a0");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer3.jpg?alt=media&token=477b067f-abbf-4ebd-b989-c5e290b8784e");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer4.png?alt=media&token=0b6fa0aa-cc4f-44dc-af53-52b2fa0aeb2f");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer5.png?alt=media&token=8e6dcc7a-1b65-4bf7-9a7e-5f42b45430be");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer6.png?alt=media&token=6fb96419-86fb-4a03-8ab3-2a30947c7b96");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer7.png?alt=media&token=96682d73-867a-4387-8927-65787ae796c0");
      urlList1.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/offer%2Foffer8.png?alt=media&token=c8e324bb-06e7-48cd-9d86-10d52c951b7b");
      img0 = findViewById(R.id.img1);
      img2 = findViewById(R.id.img2);
      img3 = findViewById(R.id.img3);
      img4 = findViewById(R.id.img4);
      img5 = findViewById(R.id.img5);
      img6 = findViewById(R.id.img6);
      img7 = findViewById(R.id.img7);
      img8 = findViewById(R.id.img8);
      img9 = findViewById(R.id.img9);
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/fruits%2Fapple.png?alt=media&token=72611a71-3728-4d49-99ff-13a0cd25d9fe");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/fruits%2Fkiwi.jpg?alt=media&token=d8f4e1e7-8be5-40ed-a63d-0a0be8279f92");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/fruits%2Fcherry.png?alt=media&token=ad002a9b-bfa2-4b5a-8481-39d1c3369f88");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/fruits%2Famrood.jpeg?alt=media&token=b3851592-8cd0-443c-a85d-f98b41f3b962");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/fruits%2Fangoor.jpg?alt=media&token=e7a845c9-b195-4075-b308-1d632d90454b");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/fruits%2Fchickoo.png?alt=media&token=b4ef571f-c543-45f3-be86-e5463ba15efa");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/fruits%2Flitchi.jpg?alt=media&token=e039f44d-c444-4081-85bb-5266900ab701");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/fruits%2Fmango.jpg?alt=media&token=fb979150-c974-4bcc-8ec4-c89280a462d1");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/fruits%2Fsantrey.jpg?alt=media&token=85090f33-4748-4e0c-8eda-e7ed0620ecdf");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/fruits%2Fstrawberry.jpg?alt=media&token=6e965ffe-2592-43cc-b395-fea299a0e445");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/fruits%2Fanar.png?alt=media&token=ba3e4c34-9699-46e0-84be-c4b708fe7f56");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/fruits%2Fmausmi.jpg?alt=media&token=9057bc2d-df80-412d-94ae-23f1fa721c11");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Fbaingan.jpg?alt=media&token=eba01c90-8a3a-442b-8a99-618a7220fcce");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Fbeans.jpg?alt=media&token=c85a718f-0064-41ff-b7da-c8ac4e3a6f43");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Fbhindi.png?alt=media&token=013c6a7d-d639-4b24-a20c-77ee6ed8ae6c");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Fdhaniya.jpg?alt=media&token=bad1b9f6-9656-429f-a4b8-5641c6f3dac5");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Fdhaniya.jpg?alt=media&token=bad1b9f6-9656-429f-a4b8-5641c6f3dac5");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Fkarela.jpg?alt=media&token=23ae25aa-f839-415f-957c-95d4bcdcbaa8");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Fkathal.jpg?alt=media&token=b9d226fc-8978-426a-8aa1-08fe3dd3cd32");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Fkheera.jpg?alt=media&token=44cb2b68-7b29-4c0d-b535-6acbf80850bf");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Flauki.jpg?alt=media&token=f11bcd92-056f-47e1-8f4b-cebf908a58d8");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Fmushroom.jpg?alt=media&token=c025de4a-4aa9-4dfd-8464-aec83000632c");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Fpalak.png?alt=media&token=1aa12fbd-1c6d-4d24-8380-5010f8458892");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2FParwal.png?alt=media&token=255cb752-c6cc-4589-b47b-82852ffdea2b");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Fpattagobhi.jpg?alt=media&token=8b0bc926-20bd-4b7c-8e83-ed17b3efb370");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Fpudina.jpg?alt=media&token=73497e6a-3794-4ee8-8feb-12856cb1ba06");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Fshaljam.png?alt=media&token=d703bea0-95b4-44e9-a539-76948226e17d");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Ftaroi.jpg?alt=media&token=5caaf6c5-29f6-4aac-ad32-907d23a9b240");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/vegetables%2Ftinda.jpg?alt=media&token=d9659674-6f22-4d54-9f47-1f65f26df796");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/ColdDrinks%2F7up.jpg?alt=media&token=ac1a581b-e982-4627-aa67-aed6e8a26c6d");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/ColdDrinks%2Fcocacola.jpg?alt=media&token=2bbd9416-e988-4d3c-88da-2e07bfda28d8");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/ColdDrinks%2Ffanta.jpg?alt=media&token=efcbe66e-c2e6-4355-ad26-8e0250a002b4");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/ColdDrinks%2Flimca.png?alt=media&token=7f0fe019-d379-4aa7-adb5-7705a7d21bf1");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/ColdDrinks%2FMirinda.jpg?alt=media&token=cd72baf6-a595-47b4-9600-6491b15a416f");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/ColdDrinks%2FMountainDew.jpg?alt=media&token=de5a0af2-56b8-4d52-8417-9f20c472e8c5");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/ColdDrinks%2FSprite.jpg?alt=media&token=f9eb86ad-8172-4adf-90fb-869e6990d6b5");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/ColdDrinks%2Fthumsup.jpg?alt=media&token=9342f411-48cf-4f84-a574-4d161d591bad");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/cereals%2Fchoco.png?alt=media&token=34b4ad91-0ed7-423f-910b-081416c35d59");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/cereals%2Fkelloggs.jpg?alt=media&token=848232fe-552f-4c0c-b493-76ee778434f5");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/cereals%2Fnestle.jpg?alt=media&token=4d5dd5ab-ff03-4e46-b5b6-f2973252f4a8");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/personal%20care%2Fchocolatebliss.png?alt=media&token=e9c65290-46bd-4f34-a6b1-8a21f7a4dc7b");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/personal%20care%2Fcleansing.jpeg?alt=media&token=9e4745cc-e9d7-435f-88f9-93adf32c795a");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/personal%20care%2Fdentalcream.jpg?alt=media&token=f5325a42-cdb3-43ef-886a-a608a45ed22a");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/personal%20care%2Ffacepack.jpeg?alt=media&token=992d4cc6-ed46-40e0-b54e-b7c1276727e2");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/personal%20care%2Ffacewash.jpg?alt=media&token=8b80954a-833b-4630-a462-d6852d82de74");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/personal%20care%2Fmakeup.jpg?alt=media&token=ef6d1194-017e-43b7-ab41-c63962650ed0");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/personal%20care%2Fskincare.png?alt=media&token=e93d808f-d457-46e3-88b2-09f2465e9cd9");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/personal%20care%2Fskincare.png?alt=media&token=e93d808f-d457-46e3-88b2-09f2465e9cd9");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/pet%20care%2Fbeef.jpeg?alt=media&token=719b0509-306d-4add-bbb2-cd9d823c1cda");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/pet%20care%2Fcomb.jpg?alt=media&token=bce1a224-5227-4757-8a40-3a6ed2917eb3");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/pet%20care%2Fdogchew.jpg?alt=media&token=d68ce411-9cef-4a63-a1f7-038e4aaecb7e");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/pet%20care%2Fente.jpeg?alt=media&token=111596f4-cf52-4cc6-97c7-6ee6e1500088");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/pet%20care%2Fmat.jpg?alt=media&token=127ef5c8-6ebe-4ea9-907f-90c09924df7f");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/pet%20care%2Fshower.jpg?alt=media&token=005b42de-5bc1-4314-a8dd-b2991ea598c7");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/pulses%2Farhar%20dal.jpg?alt=media&token=f7548ea4-a093-40c4-bc58-d04631bc47d0");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/pulses%2Fchana-dal.png?alt=media&token=82a3065d-c483-4be9-b1d9-38c36c9f3408");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/pulses%2Fmalka.jpg?alt=media&token=c83d45e8-f43b-4216-a444-a92afa6b38b4");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/pulses%2Fmasoordal.jpg?alt=media&token=1d89ee7c-ab41-4b50-a24c-44de6f9bc770");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/pulses%2Fmatar.png?alt=media&token=2733b378-35d3-4027-a7e5-f8febe3ecc16");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/pulses%2Fmoongdal.jpg?alt=media&token=1f20b78e-86b4-4f67-8b25-fd81ff283f34");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/rice%2Faashirvaad.png?alt=media&token=7611bbc5-3992-4096-a6db-1c177ee9ab28");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/rice%2Fbasmatilocal.jpg?alt=media&token=5850a342-2caf-4889-b23e-95ead9c937e6");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/rice%2Fbrownrice.png?alt=media&token=090343d5-4955-4343-8ead-a7ecdf32f479");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/rice%2Findia-gate-basmati-rice-.jpg?alt=media&token=83e6487f-a8c0-4841-8a55-ad153971bb20");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/rice%2Fmasoori.jpg?alt=media&token=527bc14d-c045-495e-8c8b-e83590229c76");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/rice%2Fmatta.png?alt=media&token=a053bc7f-94f9-4a5b-9d3e-1856d927ada0");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/rice%2Fseasoning.png?alt=media&token=6ba43f89-303a-4f08-99e8-6185755cd456");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/soaps%2Fdove.jpeg?alt=media&token=ad682de7-99b1-4aa9-b098-12e1626bb49f");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/soaps%2Flifebuoy.jpg?alt=media&token=a48d2fa5-9674-4a9a-82d1-6fbd36227e56");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/soaps%2Flux.jpg?alt=media&token=8a46710d-8544-4010-8a39-fc040c5b64ed");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/soaps%2Fmargo.jpg?alt=media&token=dc9b1f74-dcd9-4a18-94db-bf8b17b463b6");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/soaps%2Fpears.jpg?alt=media&token=aa2ba7cf-5f1f-4ee1-97b6-5caa248a7cee");
      urlList.add("https://firebasestorage.googleapis.com/v0/b/groceryhunt-57148.appspot.com/o/soaps%2Fsantoor.jpg?alt=media&token=099bdd3d-1cd2-404f-ac48-8580caa9f8d4");

      listView = findViewById(R.id.list);
      Adapter3 adapter3 = new Adapter3(this,brand11,quantity11,product11,mrp11,img1);
      listView.setAdapter(adapter3);

      recyclerView2 = findViewById(R.id.grid_view);
      Adapter4 adapter4 = new Adapter4(this,urlList1);
      recyclerView2.setAdapter(adapter4);


      recyclerView2.setLayoutManager(new LinearLayoutManager(this));
      recyclerView2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
      String randomPicture1 = urlList.get(new Random().nextInt(urlList.size()));
      String randomPicture2 = urlList.get(new Random().nextInt(urlList.size()));
      String randomPicture3 = urlList.get(new Random().nextInt(urlList.size()));
      String randomPicture4 = urlList.get(new Random().nextInt(urlList.size()));
      String randomPicture5 = urlList.get(new Random().nextInt(urlList.size()));
      String randomPicture6 = urlList.get(new Random().nextInt(urlList.size()));
      String randomPicture7 = urlList.get(new Random().nextInt(urlList.size()));
      String randomPicture8 = urlList.get(new Random().nextInt(urlList.size()));
      String randomPicture9 = urlList.get(new Random().nextInt(urlList.size()));
      Picasso.get()
              .load(randomPicture1)
              .placeholder(R.drawable.ic_launcher_foreground)
              .error(R.drawable.ic_launcher_background)
              .into(img0);
      Picasso.get()
              .load(randomPicture2)
              .placeholder(R.drawable.ic_launcher_foreground)
              .error(R.drawable.ic_launcher_background)
              .into(img2);
      Picasso.get()
              .load(randomPicture3)
              .placeholder(R.drawable.ic_launcher_foreground)
              .error(R.drawable.ic_launcher_background)
              .into(img3);
      Picasso.get()
              .load(randomPicture4)
              .placeholder(R.drawable.ic_launcher_foreground)
              .error(R.drawable.ic_launcher_background)
              .into(img4);
      Picasso.get()
              .load(randomPicture5)
              .placeholder(R.drawable.ic_launcher_foreground)
              .error(R.drawable.ic_launcher_background)
              .into(img5);
      Picasso.get()
              .load(randomPicture6)
              .placeholder(R.drawable.ic_launcher_foreground)
              .error(R.drawable.ic_launcher_background)
              .into(img6);
      Picasso.get()
              .load(randomPicture7)
              .placeholder(R.drawable.ic_launcher_foreground)
              .error(R.drawable.ic_launcher_background)
              .into(img7);
      Picasso.get()
              .load(randomPicture8)
              .placeholder(R.drawable.ic_launcher_foreground)
              .error(R.drawable.ic_launcher_background)
              .into(img8);
      Picasso.get()
              .load(randomPicture9)
              .placeholder(R.drawable.ic_launcher_foreground)
              .error(R.drawable.ic_launcher_background)
              .into(img9);

   }
}
