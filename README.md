# com.qualitydemy01_TestNG
1. Pages sayfaları formatı Page ile bitmeli.(HomePage)

2.  Locaterların formatı Tagname ile baslamalı (input_password, link_login, button_login seklinde olamalı)
acıklamak için yorum satırı eklenmeli.

3. Test methodlarında belirtilmiş ise @Test(groups = {"minireg1","smoke"}) seklinde tanımlar olamalı
4. Locate almadan önce ilgili Page de varmı bakılmalı
5.  instructor ile ilgili testler bir packages altında 
user ile ilgililer baska bir klasor altında olmalı mı?
6. Test class isimleri Tc01_login seklinde olmalı?
## arkadaslar aklınıza gelen birsey var ise ekleyin toplantıda konusalım

# GİT
1. Herkes kendi adına bir branch olsuturmalı
* git branch asan    gibi
2. Calısmalar sadece kendi branchinde yapılmalı

3. Proje acıldıgında ilk olarak main branch te pull yapılıp
* git checkout main
* git pull
kendi branchimize geciş yapılmalı
* git checkout asan
* git merge main ile maindekileri kendi branchimize alalım

4. yaptıgımız calısmalar;
* git add .
* git commit -m "calısmanızla ilgili yorum yazınız"
* suan push etmiyoruz.
* tekrar git checkout main yazıp
* mainden git pull yapıyoruz
* tekrar git checkout asan branch ine gectim
* git merge main yazdım
* artık ;
* git push yazabilirim.

5. pull request te bulunduktan sonra sorumludan dan baska kimse
merge onayı yapmamalı.
* https://github.com/krmsan/com.qualitydemy01_TestNG/pull/new/asan
url e gidip pull request talebinde bulunulmalı

6. Push lamadan önce mainden pull yapılıp sonra kendi branchimize merge yapmalıyız
7. Push lamadan önce Team leade haber verilmeli mi?
* aynı anda baska biri daha push lar ise ne olur :)
* Pushlayacagım proje guncel mi diye sormalımıyız
* team lead her pushlamadan sonra pull requesti 
* kabul edip merge yaparak projeyi gunceller
* sonra tum team e proje guncellendi pull ediniz mesajı atmalı mıj

