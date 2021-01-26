@googlearama
  Feature: Google da arama yapma
    Scenario: TC01_kullanici googleda arama yapar
      Given kullanici google sayfasindadir
      And kullanici kemal ozden aramasi yapar
      Then arama sayfasinin basligi dogrulanir
