$("span").hide();
$("#img1").hide();
$("#img2").hide();

function displayPhraseObiekty(){
    document.getElementById("prz").innerHTML = "Przykład:";
    document.getElementById("wyn").innerHTML = "Wynik:";
    document.getElementById("temat").innerHTML = "Tworzenie obiektów z wieloma konstruktorami";
    document.getElementById("opis").innerHTML = "Dla obiektu można zdefiniować wiele konstruktorów, "
    +"każdy tak samo się nazywa, lecz musi mieć różną liczbę argumentów lub różne typy argumentów";
    var przyklad = document.getElementById("img1");
    przyklad.src = "img1.png";
    var wynik = document.getElementById("img2");
    wynik.src = "img2.png";
    $("span").show();
    $("#img1").show();
    $("#img2").show();
    $("#gif").hide();
}

function displayPhraseEnkapsulacja(){
    document.getElementById("prz").innerHTML = "Przykład:";
    document.getElementById("wyn").innerHTML = "Wynik:";
    document.getElementById("temat").innerHTML = "Enkapsulacja";
    document.getElementById("opis").innerHTML = "Enkapsulacja (in. hermetyzacja) polega na ukrywaniu pewnych danych "
    +"składowych lub metod obiektów danej klasy tak, aby były one dostępne tylko metodom wewnętrznym "
    +"danej klasy lub funkcjom zaprzyjaźnionym.";
    var przyklad = document.getElementById("img1");
    przyklad.src = "img3.png";
    var wynik = document.getElementById("img2");
    wynik.src = "img4.png";
    $("span").show();
    $("#img1").show();
    $("#img2").show();
    $("#gif").hide();
}

function displayPhraseMetody(){
    document.getElementById("prz").innerHTML = "Metody publiczne:";
    document.getElementById("wyn").innerHTML = "Metody prywatne:";
    document.getElementById("temat").innerHTML = "Metody publiczne i prywatne";
    document.getElementById("opis").innerHTML = "<b><i>publiczne</i></b> - wszystkie zmienne i metody domyślnie są publiczne. "
    +"Oznacza to że są dostępne dla użytkownika klasy i mogą być w dowolny sposób zmieniane, modyfikowane itp.</br>"
    +"<b><i>prywatne</i></b> - jeżeli zmienne z jakiegoś powodu są istotne dla działania klasy powinny być definiowane.";
    var przyklad = document.getElementById("img1");
    przyklad.src = "img5.png";
    var wynik = document.getElementById("img2");
    wynik.src = "img6.png";
    $("span").show();
    $("#img1").show();
    $("#img2").show();
    $("#gif").hide();
}