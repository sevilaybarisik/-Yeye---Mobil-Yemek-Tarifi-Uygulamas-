package com.barisenginbag.yeye.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.barisenginbag.yeye.Adapter.FoodListAdapter;
import com.barisenginbag.yeye.Domain.FoodDomain;
import com.barisenginbag.yeye.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView.Adapter adapterFoodList;
private RecyclerView recyclerViewFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerview();
    }

    private void initRecyclerview() {
        ArrayList<FoodDomain> items=new ArrayList<>();
        items.add(new FoodDomain("İçli Köfte","İçli köftenin iç harcını hazırlamak için; kuru soğanı küçük küpler halinde doğrayın. Sıvı yağı tavada kızdırın.Doğradığınız kuru soğan ve orta yağlı kıymayı kavurun.  Üzerine tuz, karabiber ve ceviz içi ilave edip İç harcı ılınması için bir kenarda bekletin.İçli köftenin dışını hazırlamak için; köftelik ince bulguru ve irmiği derin bir kabın içine alın. Sıcak suyu ilave edin ve bulgurlar şişene dek 10 dakika bekletin.Salça tuz ve karabiberi bulgur ve irmik karışımına yedirdikten sonra yavaş yavaş unu ilave ederk hamur haline gelene kadar yoğurun.Hazırladığınız harçtan avuç büyüklüğünde parçalar kopartın ve ellerinizi ıslatıp, parmaklarınızla kenarlarını düzelterek ortasını çukurlaştırın.","fast_4","Maliyet yazılacak",25,400,5));
        items.add(new FoodDomain("Prinç pilavı","Pirinçleri yıkadıktan sonra bir kap içerisine alın ve üzerini geçecek kadar ılık su ekleyip en az 1 saat suda bekletin. Daha sonra nişastası iyice kaybolup duru bir su çıkana kadar yıkayıp suyunu süzün.Uygun bir pilav tenceresinin içerisine tereyağı ekleyin.Tereyağı eridikten sonra pirinçleri ekleyip kavurmaya başlayın. Pirinçler tane tane dökülmeye başlayana kadar yaklaşık 5 dakika kavurun.Pirinçler kavrulduktan sonra sıcak su veya tavuk suyu ekleyin. Tavuk suyu ile pilavınız daha lezzetli olacaktır.Pilava tuz, tarçın ve yenibahar da ekledikten sonra bir tahta kaşıkla karıştırıp tencerenin kapağını kapatın ve kısık ateşte pişmeye bırakın.Pirinçler tamamen suyunu çekince ocağı kapatın, tencerenin üzerine bir kağıt havlu serip kapağını kapatın ve pilavı demlenmeye bırakın.Pilavınız en az 15 dakika demlendikten sonra tahta kaşıkla karıştırıp servis yapabilirsiniz. Afiyet olsun!","fast_5", "Maliyet yazılacak",30,300,3.5));
        items.add(new FoodDomain("Ezogelin Çorbası","Bulgur ve irmiği birlikte karıştırıp üzerini biraz geçene kadar sıcak su ekleyelim.Bulgur şişene kadar kapağını kapatıp bekletelim. Bu sırada iç harç için kıymayı tavaya alıp kendi yağında kavuralım.Sonra küp doğranmış soğanı ve yağları ilave edip soğan kavrulana kadar pişirelim.En son baharatları ekleyip karıştıralım ve ocaktan alıp soğumaya bırakalım.Bulgur hazır olunca diğer malzemeleri ekleyip iyice yoğuralım ve ana köfteler için hamurdan ufak bezeler alıp içli köfte gibi hazırlayalım.İçine iç harç koyup kapatalım ve büyük olmamasına dikkat edin. Hamurun 3 te birini kızlar için ayırıp misket büyüklüğünde yuvarlayın.Çorba için nohut ve eti tuz ekleyip düdüklüde haşlayın. Çorba için tencereye küp doğranmış soğan koyup yağda pembeleşene kadar kavurun.Salça ekleyip oda kavrulur daha sonra kuru naneyi ekleyip tekrar kavurun.Nohut ve eti de ekleyin limon suyunu ve et suyunu da ilave edin su kaynamaya başlayınca köfteleri ekleyin köfteler suyun yüzeyine çıkınca pişmiş demektir.Ocaktan alabilirsiniz. Deneyenlere şimdiden afiyet olsun.","fast_6","Maliyet yazılcak",60,300,5));
        items.add(new FoodDomain("Cheese Buger","Soğan ve sarımsağı rendeleyin. Derin bir kasede soğan, sarımsak, kıyma, tuz ve baharatları yoğurun. Üzerini streç film ile kapatıp buzdolabında 1-2 saat dinlendirin. Hamburger ekmeklerini ikiye ayırın. Ekmeklerin üzerine marul yapraklarını, dilimlediğiniz domatesi ve salatalık turşusunu yerleştirin. Son olarak birer dilim cheddar peyniri yerleştirin. Buzdolabında çıkardığınız köfte harcını tekrar yoğurup hamburger ekmeklerinin büyüklüğünde 4 adet köfte yapın. Ayçiçeği yağını tavada ısıtın. Köftelerin her iki tarafını da kızartın. Ocaktan almaya yakın köftelerin üzerine birer dilim cheddar peyniri yerleştirip tavanın kapağını kapatın. Peynirler erimeye başlayınca ocaktan alın.","fast_1","Maliyet yazılacak",20,120,4));
        items.add(new FoodDomain("Kömbe","Eritilmiş tereyağı üzerine diğer malzemeleri ekleyip yoğurun.Unu kontrollü ekleyin, ele yapışmayan hafif sert bir hamur elde edin.Ceviz büyüklüğünde parçalar koparıp elinizle yuvarlayın. Üzerini susama batırıp kömbe kalıbına bastırın. Hafifçe tezgaha vurup kalıptan çıkarın.Tepsiye dizip önceden ısıtılmış 180 derecelik fırında alt üst ayarda, hafif pembeleşinceye kadar fırınlayın.Piştikten sonra tepside soğumaya bırakın. Servis tabağına alın. Afiyet olsun.","fast_7","Maliyet yazılacak",25,200,5));
        items.add(new FoodDomain("Vejetaryan Pizza","İnstant mayayla mayalanmış pizza hamurlarını incecik açtıktan sonra kalp şeklinde kalıplara yerleştiriyor, üzerlerine domatesli ve kekikli vejeteryan pizza sosunu sürüyoruz. Bitti mi? Hayır. Rendelenmiş cheddar ve mozzarella peynirleriyle lezzet verip, üzerlerini domates dilimleriyle kaplıyoruz","fast_3","Maliyet yazılacak",30,100,4.5));
        recyclerViewFood=findViewById(R.id.view1);
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterFoodList=new FoodListAdapter(items);
        recyclerViewFood.setAdapter(adapterFoodList);


    }
}