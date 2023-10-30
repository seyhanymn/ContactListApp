Feature:User Kayit olusturur

  Scenario:Kullanıcı dogru bilgilerle kayıt olusturur
    Given Kullanici sayfaya gider
    When  Kullanici signup butonuna tiklar
    Then  Kullanici Add User sayfasinde oldugunu dogrular
    Then  KUllanici First Name butonuna tiklar ve dogru bilgi girer
    Then  Kullanici Last Name butonuna tiklar ve dogru bilgi girer
    Then  Kullanici Email botonuna tiklar ve dogru bilgi girer
    Then  Kullanici Password butonuna tiklar ve dogru bilgiler girer
    Then  Kullanici Submit butonuna tiklar
    And  Kullanici kayıt olusturdugunu dogrular
