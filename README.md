# Angle
Klasa opakowująca Angle - miara kąta i funkcje trygonometryczne

Zadanie 1 Utwórz klasę Angle zawierającą jedno pole prywatne x typu double przechowujące miarę kąta podaną w radianach. W klasie zbuduj konstruktor z jednym parametrem double (miara kąta w radianach) i sześć metod zwracających wartości funkcji trygonometrycznych kąta reprezentowanego przez obiekt. Napisz program demonstrujący działanie konstruktora i utworzonych metod.
Ważne! Oprócz powszechnie znanych funkcji trygonometrycznych sinus, cosinus tangens i cotangens w klasie Angle uwzględnimy mniej popularne funkcje: secans(sec x = 1 ) oraz cosecans(csx x = 1 ).

Zadanie 2 Dołącz do klasy Angle publiczne metody (radian() i degree()) zwracające liczbę typu double - miarę kąta reprezentowanego przez obiekt wyrażoną w radianach i stopniach. Napisz program demonstrujący działanie tych metod.

Zadanie 3 Dołącz do klasy Angle publiczną metodę toString(), która będzie zwracać łańcuch znaków (o postaci 45°30'15") przedstawiający miarę kąta reprezentowanego przez obiekt wyrażoną w stopniach, minutach i sekundach. Napisz program demonstrujący działanie tej metody.

Zadanie 4 Dołącz do klasy Angle trzy konstruktory — z jednym, dwoma lub trzema parametrami typu int — umożliwiające zbudowanie obiektu reprezentującego kąt o podanej liczbie stopni, stopni i minut lub stopni, minut i sekund. Ogranicz liczbę stopni do zakresuod 0° do 360°, a liczbę minut i sekund do zakresu od 0 do 60. Napisz program demonstrujący działanie tych konstruktorów.

Zadanie 5 Ciąg znaków o postaci 105°30'15" przedstawia miarę kąta w stopniach, minutach i sekundach kątowych. Utwórz konstruktor w klasie Angle, który zbuduje obiekt reprezentujący kąt o podanej w ten sposób mierze. Napisz program demonstrujący działanie tego konstruktora.

Zadanie 6 Utwórz w klasie Angle sześć metod o nazwie setOfXxx, gdzie Xxx oznacza nazwę funkcji trygonometrycznej, ustawiających miarę kąta reprezentowanego przez obiekt na podstawie podanej wartości odpowiedniej funkcji (metody te odpowiadają funkcjom odwrotnym do funkcji trygonometrycznych). Metody zmieniają wartość obiektu, ale nie zwracają żadnej wartości. Napisz program demonstrujący działanie tych metod.

Zadanie 7 Na płaszczyźnie z układem współrzędnych często potrzebujemy wyznaczyć miarę kąta nachylenia prostej przechodzącej przez początek układu współrzędnych i punkt 𝑃(𝑥, 𝑦) do osi OX. Utwórz w klasie Angle metodę o nazwie setOfPoint(), ustawiającą miarę tego kąta jako wartość obiektu. Napisz program demonstrujący działanie metody setOfPoint().

Zadanie 8 Utwórz w klasie Angle konstruktor z dwoma parametrami typu double, tworzący nowy obiekt reprezentujący miarę kąta nachylenia prostej przechodzącej przez początek układu współrzędnych i punkt P(x, y) do osi OX. Napisz program demonstrujący działanie tego konstruktora.

Zadanie 9 Zbuduj w klasie Angle statyczne funkcje o nazwie valueOf(), o różnych parametrach (takich samych jak konstruktory zbudowane w zadaniach 1, 4, 5 i 8), zwracające obiekt klasy Angle odpowiadający kątowi o podanych parametrach. Napisz program demonstrujący działanie tych metod.

Zadanie 10 Na miarach kątów możemy wykonywać dodawanie i odejmowanie. Dodaj do klasy Angle metody add(), sub(), które będą zwracać nowy obiekt, będący sumą (różnicą) miary kąta reprezentowanego przez obiekt wywołujący metodę i miary kąta w obiekcie podanym jako parametr. Napisz program demonstrujący działanie tych metod.

Zadanie 11 Dołącz do klasy Angle statyczne metody sum(), diff(), które będą obliczać sumę (różnicę) dwóch obiektów podanych jako parametry (miar kątów reprezentowanych przez te obiekty). Wynik powinien być obiektem klasy Angle. Napisz program demonstrujący działanie tych metod.
cos(x) sin(x)

Zadanie 12 Miary kątów można mnożyć i dzielić przez liczbę. Napisz metodę mult(),div(), która będzie zwracała nowy obiekt, reprezentujący kąt o mierze będącej iloczynem (ilorazem) miary kąta reprezentowanego przez obiekt i liczby podanej jako parametr (całkowitej lub zmiennoprzecinkowej). Napisz program demonstrujący działanie tych metod.

Zadanie 13 Napisz metodę prod(), quot(), która będzie zwracać obiekt klasy Angle, reprezentujący kąt o mierze będącej iloczynem (ilorazem) miary kąta (obiektu) podanego jako parametr i liczby podanej jako drugi parametr. Napisz program demonstrujący działanie tych metod.

Zadanie 14 Dołącz do klasy Angle statyczne pola przechowujące stałe wartości obiektów reprezentujących wybrane kąty: RIGHT ANGLE (kąt prosty), STRAIGHT ANGLE (kąt półpełny) i FULL ANGLE (kąt pełny), RADIAN (1 radian), DEGREE (1 stopień), ARCMINUTE (1 minuta kątowa) i ARCSECOND (1 sekunda kątowa). Napisz program pokazujący wartości tych stałych.

Zadanie 15 Dodaj do klasy Angle metodę compl() (ang. complementary angle — kąt dopełniający), zwracającą obiekt reprezentujący dopełnienie kąta (obiektu) podanego jako parametr, i metodę suppl() (ang. supplementary angle — kąt przyległy), zwracającą obiekt reprezentujący miarę kąta przyległego do kąta (obiektu) podanego jako parametr. Napisz program demonstrujący działanie tych metod.

Zadanie 16 Utwórz metodę inputAngle() z jednym parametrem typu String (przeznaczonym do opisania wprowadzanej wielkości), zwracającą obiekt Angle reprezentujący kąt o mierze podanej w stopniach. Metoda ta powinna poprawnie interpretować takie dane: liczba całkowita stopni, liczba rzeczywista (ułamek dziesiętny) bez podawania symbolu stopnia oraz ciąg znaków zawierających stopnie, minuty i sekundy kątowe z odpowiednimi
i symbolami jednostek (np. 24°30'15") .

Napisz program rozwiązujący następujące zadanie: W trójkącie równoramiennym kąt przy wierzchołku ma miarę α. Oblicz miarę kąta β przyległego do podstawy tego trójkąta. Sprawdź obliczenia, dodając miary wszystkich kątów wewnętrznych trójkąta.

Zadanie 17 Napisz program rozwiązujący zadanie: W trójkącie równoramiennym kąt przyległy do podstawy ma miarę β. Oblicz miarę kąta α leżącego naprzeciw podstawy tego trójkąta. Sprawdź obliczenia, dodając miary wszystkich kątów wewnętrznych trójkąta.

Zadanie 18 Napisz program rozwiązujący zadanie: Oblicz miary kątów w trójkącie równoramiennym o podstawie a i ramieniu długości b. Sprawdź obliczenia, dodając miary wszystkich kątów wewnętrznych trójkąta.

Zadanie 19 Napisz program rozwiązujący zadanie: Oblicz miary kątów w trójkącie równoramiennym o podstawie a i wysokości (opuszczonej na podstawę) h. Sprawdź obliczenia, dodając miary wszystkich kątów wewnętrznych trójkąta.

Zadanie 20 Napisz program rozwiązujący zadanie: Oblicz miary kątów w trójkącie o bokach a, b i c. Sprawdź obliczenia, dodając miary wszystkich kątów wewnętrznych trójkąta.
i Podczas wprowadzania danych symbol stopnia (°) możesz uzyskać, wpisując Alt+0176 (przytrzymaj lewy klawisz Alt i wprowadź kod 0176 z klawiatury numerycznej). Symbole minuty i sekundy to apostrof i cudzysłów (dostępne bezpośrednio na klawiaturze). Miary kątów spełniają zależność 𝛼 + 2𝛽 = 180°.
  
