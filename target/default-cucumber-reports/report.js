$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/youtube.feature");
formatter.feature({
  "name": "Youtubeda videonun izlenme sayisini bulma",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@youtube"
    }
  ]
});
formatter.scenario({
  "name": "TC02_kullanici youtubevideoyu acar ve izlenme sayisini alir",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@youtube"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici youtubea gider",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.YoutubeVideoBilgileriStepDefinitions.kullanici_youtubea_gider()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici techproed aramasi yapar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.YoutubeVideoBilgileriStepDefinitions.kullanici_techproed_aramasi_yapar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici bir videoya tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.YoutubeVideoBilgileriStepDefinitions.kullanici_bir_videoya_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici videonun bilgilerini alir",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.YoutubeVideoBilgileriStepDefinitions.kullanici_videonun_bilgilerini_alir()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});