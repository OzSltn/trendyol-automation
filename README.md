
# PREREQUITES
- Eclipse IDE
- JAVA
- Selenium
- TestNG
- Chrome WebDriver
- Apache POI


# FEATURES
- Proje Java dilinde, Chrome tarayıcıda çalışmak üzere tasarlanmıştır.
- Annotasyonlar için TestNG ve Assertionlar için JUnit kütüphanesi kullanılmıştır.
- Bu projede login sayfasında ve ürün listeleme sayfasında filtreler üzerinde iki farklı test koşulmuştur.
- Login testinde Excel verilerini okumak için Apache POI kütüphanesi kullanılmıştır. 
- Testin gerçekleştirilebilmesi için credential.xlsx dosyasında 3. veri grubuna doğru kullanıcı bilgileri girilmelidir.
- Gerçekleştirilen testlerin ekran görüntüleri alınmış ve aşağıda paylaşılmıştır.  


# TASKS

## Login Test Senaryosu
- Kullanıcı Chrome tarayıcı üzerinden "https://www.trendyol.com/" sayfasını ziyaret eder ve sayfa yüklenir.
- Onetrust banner da "KABUL ET" butonuna basılır. Banner'ın kaybolduğu görülür.
- Login işlemi için anasayfada "Giriş Yap" butonuna tıklar ve giriş panelinin yüklendiğini kontrol eder.
- Giriş Yap panelinde email ve password bilgilerini girmeden "GİRİŞ YAP" butonuna tıklayarak sistemi kontrol eder ve sisteme giriş yapamaz. 
- Kullanıcı yanlış mail-doğru password ile sistemi kontrol eder ve sisteme giriş yapamaz.
- Kullanıcı doğru mail-yanlış password ile sistemi kontrol eder ve sisteme giriş yapamaz.
- Kullanıcı doğru mail ve doğru password ile sisteme giriş yapar ve anasayfa yüklenir.

## Ürün Listeleme Sayfası Filtreleme Test Senaryosu
- Kullanıcı Chrome tarayıcı üzerinden "https://www.trendyol.com/" sayfasını ziyaret eder ve sayfa yüklenir.
- Onetrust Banner'da "KABUL ET" butonuna basılır. Banner'ın kaybolduğu görülür.
- Login işlemi için anasayfada "Giriş Yap" tıklar ve giriş paneli yüklenir.
- Mail ve password bilgileri ile sisteme giriş yapar ve anasayfa yüklenir (bilgiler Excel dosyasından yüklenir).
- Search Bar'a tıklar ve "mango elbise" yazar. Search Bar üzerindeki arama ikonuna tıklar ve ürün listeleme sayfası yüklenir.
- Ürün listeleme sayfasında "Tüm Kategoriler" tıklar ve elementlerin kaybolduğu gözlenir.
- Filtreleme alanında "Tüm Kategoriler" de Drop Down Arrow'a tıklar ve elementler görünür duruma gelir.
- "Kategori ara" da Search Bar'a "elbise" yazar ve Chechk Box'larda elbise seçenekleri görülür.
- "Tüm Kategoriler" de "Elbise" Check Box'a tıklar ve Check Box'ın işaretlendiği görülür.
- Ürün listeleme sayfasında filtreleme alanında "Marka" tıklar ve elementlerin kaybolduğu gözlenir.
- Filtreleme alanında "Marka" Drop Down Arrow tıklar ve elementler görünür duruma gelir.
- "Marka ara" Search Bar'da "mango" yazar ve Check Box'larda Mango markası seçenekleri gözlemlenir.
- "Mango" Check Box'a tıklar ve Check Box'ın işaretlendiği görülür.
- "Mango" Check Box'a tıklar ve Check Box'ın işaretlendiği görülür.


## SCREENSHOTS 

<img src="screenshots/2024-03-26 14-49-30.png" alt="Screenshot 1" width="1000" height="500">
<img src="screenshots/2024-03-26 14-49-32.png" alt="Screenshot 2" width="1000" height="500">
<img src="screenshots/2024-03-26 14-49-33.png" alt="Screenshot 3" width="1000" height="500">
<img src="screenshots/2024-03-26 14-49-34.png" alt="Screenshot 4" width="1000" height="500">
<img src="screenshots/2024-03-26 14-49-41.png" alt="Screenshot 5" width="1000" height="500">
<img src="screenshots/2024-03-26 14-49-44.png" alt="Screenshot 6" width="1000" height="500">
<img src="screenshots/2024-03-19 16-50-34.png" alt="Screenshot 7" width="1000" height="500">

