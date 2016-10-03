# Literature

Writers rating based on google search results and goodreads.com rates.<br/>

Current formula: r1 + r2 + 2 * r3, where

r1 - points from google search results by '%authorname%' query, e.g. 'Mark Twain' <br/>
r2 - points from google search results by '%authorname% writer' query, e.g. 'Mark Twain writer'<br/>
r3 - points from goodreads.com writer rating

All rates are normalized among authors.
If author has best goodreads.com rating among 100 other authors, he gains 100 points.
If author is #5 in google search results among 100 other authors, he gains 95 points and so on.

First number is author rating. Last three numbers are inverted r1, r2, r3 numbers.<br/>
E.g. Stephen King row means he is #2 in google search query, #1 in google search person query and #44 in goodreads.com


    3782   J. K. Rowling              1965..            England            17 16  1
    3493   Oscar Wilde                1856..1900        England            11 11 21
    3464   Edgar Poe                  1809..1849        USA                26 25  8
    3385   Arthur Conan Doyle         1859..1930        England            41 24  5
    3376   J. R. R. Tolkien           1892..1973        England            40 32  2
    3375   Carl Jung                  1875..1961        Switzerland        19 41  8
    3374   Victor Hugo                1802..1885        France              5 37 17
    3183   Stephen King               1947..            USA                 2  1 46
    3135   Simone de Beauvoir         1908..1986        France             33  7 30
    2968   Jane Austen                1775..1817        England            54 27 18
    2948   Martin Heidegger           1889..1976        Germany            45 26 24
    2918   Friedrich Nietzsche        1844..1900        Germany            27 39 28
    2910   Fedor Dostoevskiy          1821..1881        Russia             59 44 10
    2905   Jack London                1876..1916        USA                 1  2 60
    2880   Ken Kesey                  1935..2001        USA                88 22  8
    2877   Dante Alighieri            1265..1321        Italy              30 24 36
    2841   Mikhail Bulgakov           1891..1940        Russia             80 42  4
    2831   Antoine de Saint-Exupéry   1900..1940        France             53 70  4
    2799   Alexander Pushkin          1799..1837        Russia             32 56 23
    2797   Albert Camus               1913..1960        France             29  7 49
    2751   Alexandre Dumas            1802..1870        France             37 74 14
    2691   Charlotte Bronte           1816..1855        England            69 30 23
    2668   Agatha Christie            1890..1976        England            28 15 52
    2648   George Gordon Byron        1788..1824        England            24 19 53
    2642   Isaac Asimov               1920..1992        USA                58 60 16
    2632   Mikhail Lermontov          1814..1841        Russia             57 66 14
    2530   George Oruell              1903..1950        England            21 48 46
    2530   Ray Bradbury               1920..2012        USA                52 17 46
    2479   Philip K. Dick             1928..1982        USA                51  5 55
    2477   William Shakespeare        1564..1616        England             6  8 76
    2441   Hermann Hesse              1877..1962        Switzerland        43 43 42
    2417   Henry Miller               1891..1980        USA                 3  3 83
    2413   Nikolai Gogol              1809..1852        Ukraine            74 49 25
    2320   Immanuele Kant             1724..1804        Germany            34 10 69
    2300   Richard Bach               1936..            USA                14 32 69
    2296   Stefan Zweig               1881..1942        Austria            81 86  9
    2292   Auldous Huxley             1894..1963        England            61 20 52
    2291   Gabriel García Márquez     1927..2014        Mexico             38 37 55
    2263   Erich Maria Remarque       1898..1970        Germany            78 18 46
    2254   Kurt Vonnegut              1922..2007        USA                95 38 28
    2222   Umberto Eco                1932..2016        Italy               4 74 57
    2221   F. Scott Fitzgerald        1896..1940        USA                50  4 69
    2194   Anton Chekhov              1860..1904        Russia             63 48 42
    2175   Boris Pasternak            1890..1960        Russia             64 77 28
    2163   Jean-Paul Sartre           1905..1980        France             39 61 49
    2150   Mark Twain                 1835..1910        USA                10 33 78
    2146   Soren Kierkegaard          1813..1855        Denmark            93 65 21
    2145   Arthur Schopenhauer        1788..1860        Germany            71 59 35
    2120   Sigmund Freud              1856..1939        Austria            23  9 85
    2087   Erich Fromm                1900..1980        Germany            76 98 16
    2082   Jules Verne                1828..1905        France             22 40 72
    2076   Lev Tolstoi                1828..1910        Russia             85 52 35
    2046   Charles Bukowski           1920..1994        USA                92 48 35
    2018   Ethel Voynich              1864..1960        England            104 85 12
    2017   Alexander Kuprin           1870..1938        Russia             84 87 21
    2011   Voltaire                   1694..1798        France             13 22 89
    2010   Mary Shelley               1797..1851        England            16 13 92
    1994   Vladimir Lenin             1870..1924        Russia             31 62 61
    1986   Oliver Sacks               1933..2015        England            56 76 42
    1972   Charles Dickens            1812..1870        England            15 50 76
    1953   Georg Hegel                1770..1831        Germany            67 14 69
    1892   Ernest Hemingway           1899..1961        USA                25 34 83
    1887   Baruch Spinoza             1632..1677        Denmark            89 53 42
    1880   Irvin D. Yalom             1931..            USA                100 103 12
    1854   Franz Kafka                1883..1924        Germany            36 55 69
    1842   George Sand                1804..1876        France              7 29 97
    1823   Herbert Wells              1866..1946        England             8 58 83
    1822   Jean-Jacques Rousseau      1712..1778        France             20 28 92
    1821   Adolph Hitler              1889..1945        Germany            12 12 104
    1762   Karl Marx                  1818..1883        Germany             9 37 96
    1667   Émile Zola                 1840..1902        France             44 84 60
    1659   Milan Kundera              1929..            Czech republic     73 92 42
    1657   Euripides                  480....406 B.C.   Ancient Greece     55 74 60
    1629   Ivan Goncharov             1812..1891        Russia             78 80 47
    1615   Homer                      1100..1000 B.C.   Ancient Greece     18 57 89
    1576   J. D. Salinger             1919..2010        USA                49 48 80
    1571   Stanisław Lem              1921..2006        Ukraine            91 97 35
    1561   Mikhail Sholokhov          1905..1984        Russia             103 96 30
    1548   Ivan Turgenev              1818..1883        Russia             68 68 62
    1546   Johann Goethe              1749..1832        Germany            36 52 86
    1541   Carlos Castaneda           1925..1998        USA                98 93 35
    1491   Alexander Griboedov        1795..1829        Russia             87 95 42
    1329   Maxim Gorkiy               1868..1936        Russia             75 55 76
    1312   Jonathan Safran Foer       1977..            USA                91 89 52
    1220   Stendhal                   1783..1842        France             46 91 78
    1181   Guy de Maupassant          1850..1893        France             72 81 72
    1133   John Fowles                1926..2005        England            94 94 57
    1092   Theodore Draiser           1871..1945        USA                62 100 72
    1053   Vladimir Nabokov           1899..1977        Russia             96 88 63
    0982   Honoré de Balzac           1799..1850        France             84 63 85
    0961   J. M. Coetzee              1940..            South Africa       70 71 89
    0944   Aristophanes               446....386 B.C.   Ancient Greece     79 104 69
    0941   Denis Diderot              1713..1784        France             47 82 96
    0940   Friedrich Engels           1820..1895        Germany            42 79 100
    0921   Molière                    1622..1673        France             48 83 96
    0891   Gustave Flaubert           1821..1880        France             66 64 98
    0804   Chuck Palahniuk            1962..            USA                99 78 79
    0803   William Thackeray          1811..1863        England            86 69 90
    0772   William Golding            1911..1993        England            65 75 99
    0646   Bernard Werber             1961..            France             97 102 76
    0614   Sophocles                  497....406 B.C.   Ancient Greece     101 67 93
    0505   Frédéric Beigbeder         1965..            France             60 101 102
    0396   Eshil                      520....460 B.C.   Ancient Greece     84 90 101
    0089   Nikolay Chernishevskiy     1828..1889        Russia             102 99 103
