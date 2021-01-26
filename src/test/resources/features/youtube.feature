@youtube
  Feature: Youtubeda videonun izlenme sayisini bulma
    Scenario: TC02_kullanici youtubevideoyu acar ve izlenme sayisini alir
      Given kullanici youtubea gider
      And kullanici techproed aramasi yapar
      And kullanici bir videoya tiklar
      Then kullanici videonun bilgilerini alir
