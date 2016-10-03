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


    3821   J. K. Rowling              1965..            England            17 16  1
    3512   Oscar Wilde                1856..1900        England            11 11 22
    3484   Edgar Poe                  1809..1849        USA                26 25  9
    3415   J. R. R. Tolkien           1892..1973        England            40 32  2
    3405   Arthur Conan Doyle         1859..1930        England            41 24  6
    3395   Carl Jung                  1875..1961        Switzerland        19 41  9
    3394   Victor Hugo                1802..1885        France              5 37 18
    3203   Stephen King               1947..            USA                 2  1 47
    3155   Simone de Beauvoir         1908..1986        France             33  7 31
    2999   Charles Baudler            1821..1867        England            50 58  5
    2978   Jane Austen                1775..1817        England            55 27 19
    2968   Martin Heidegger           1889..1976        Germany            45 26 25
    2938   Friedrich Nietzsche        1844..1900        Germany            27 39 29
    2924   Jack London                1876..1916        USA                 1  2 61
    2920   Fedor Dostoevskiy          1821..1881        Russia             60 44 11
    2897   Dante Alighieri            1265..1321        Italy              30 24 37
    2890   Ken Kesey                  1935..2001        USA                89 22  9
    2871   Mikhail Bulgakov           1891..1940        Russia             81 42  4
    2851   Antoine de Saint-Exupéry   1900..1940        France             54 71  4
    2819   Alexander Pushkin          1799..1837        Russia             32 56 24
    2817   Albert Camus               1913..1960        France             29  7 50
    2761   Alexandre Dumas            1802..1870        France             37 75 15
    2700   Charlotte Bronte           1816..1855        England            70 30 24
    2688   Agatha Christie            1890..1976        England            28 15 53
    2668   George Gordon Byron        1788..1824        England            24 19 54
    2642   Isaac Asimov               1920..1992        USA                59 61 17
    2632   Mikhail Lermontov          1814..1841        Russia             58 67 15
    2550   George Oruell              1903..1950        England            21 48 47
    2540   Ray Bradbury               1920..2012        USA                53 17 47
    2497   William Shakespeare        1564..1616        England             6  8 77
    2489   Philip K. Dick             1928..1982        USA                52  5 56
    2461   Hermann Hesse              1877..1962        Switzerland        43 43 43
    2437   Henry Miller               1891..1980        USA                 3  3 84
    2423   Nikolai Gogol              1809..1852        Ukraine            75 49 26
    2339   Immanuele Kant             1724..1804        Germany            34 10 70
    2320   Richard Bach               1936..            USA                14 32 70
    2311   Gabriel García Márquez     1927..2014        Mexico             38 37 56
    2302   Auldous Huxley             1894..1963        England            62 20 53
    2296   Stefan Zweig               1881..1942        Austria            82 87 10
    2272   Erich Maria Remarque       1898..1970        Germany            79 18 47
    2264   Kurt Vonnegut              1922..2007        USA                96 38 29
    2232   Umberto Eco                1932..2016        Italy               4 75 58
    2231   F. Scott Fitzgerald        1896..1940        USA                51  4 70
    2204   Anton Chekhov              1860..1904        Russia             64 48 43
    2175   Boris Pasternak            1890..1960        Russia             65 78 29
    2173   Jean-Paul Sartre           1905..1980        France             39 62 50
    2170   Mark Twain                 1835..1910        USA                10 33 79
    2146   Soren Kierkegaard          1813..1855        Denmark            94 66 22
    2145   Arthur Schopenhauer        1788..1860        Germany            72 60 36
    2140   Sigmund Freud              1856..1939        Austria            23  9 86
    2102   Jules Verne                1828..1905        France             22 40 73
    2087   Erich Fromm                1900..1980        Germany            77 99 17
    2085   Lev Tolstoi                1828..1910        Russia             86 52 36
    2056   Charles Bukowski           1920..1994        USA                93 48 36
    2031   Voltaire                   1694..1798        France             13 22 90
    2030   Mary Shelley               1797..1851        England            16 13 93
    2018   Ethel Voynich              1864..1960        England            105 86 13
    2017   Alexander Kuprin           1870..1938        Russia             85 88 22
    2004   Vladimir Lenin             1870..1924        Russia             31 63 62
    1992   Charles Dickens            1812..1870        England            15 50 77
    1986   Oliver Sacks               1933..2015        England            57 77 43
    1963   Georg Hegel                1770..1831        Germany            68 14 70
    1912   Ernest Hemingway           1899..1961        USA                25 34 84
    1897   Baruch Spinoza             1632..1677        Denmark            90 53 43
    1880   Irvin D. Yalom             1931..            USA                101 104 13
    1874   Franz Kafka                1883..1924        Germany            36 55 70
    1861   George Sand                1804..1876        France              7 29 98
    1842   Jean-Jacques Rousseau      1712..1778        France             20 28 93
    1841   Adolph Hitler              1889..1945        Germany            12 12 105
    1833   Herbert Wells              1866..1946        England             8 59 84
    1782   Karl Marx                  1818..1883        Germany             9 37 97
    1677   Émile Zola                 1840..1902        France             44 85 61
    1659   Milan Kundera              1929..            Czech republic     74 93 43
    1657   Euripides                  480....406 B.C.   Ancient Greece     56 75 61
    1634   Homer                      1100..1000 B.C.   Ancient Greece     18 57 90
    1629   Ivan Goncharov             1812..1891        Russia             79 81 48
    1596   J. D. Salinger             1919..2010        USA                49 48 81
    1571   Stanisław Lem              1921..2006        Ukraine            92 98 36
    1566   Johann Goethe              1749..1832        Germany            36 52 87
    1561   Mikhail Sholokhov          1905..1984        Russia             104 97 31
    1548   Ivan Turgenev              1818..1883        Russia             69 69 63
    1541   Carlos Castaneda           1925..1998        USA                99 94 36
    1491   Alexander Griboedov        1795..1829        Russia             88 96 43
    1339   Maxim Gorkiy               1868..1936        Russia             76 55 77
    1312   Jonathan Safran Foer       1977..            USA                92 90 53
    1230   Stendhal                   1783..1842        France             46 92 79
    1181   Guy de Maupassant          1850..1893        France             73 82 73
    1133   John Fowles                1926..2005        England            95 95 58
    1092   Theodore Draiser           1871..1945        USA                63 101 73
    1053   Vladimir Nabokov           1899..1977        Russia             97 89 64
    0982   Honoré de Balzac           1799..1850        France             85 64 86
    0961   J. M. Coetzee              1940..            South Africa       71 72 90
    0951   Denis Diderot              1713..1784        France             47 83 97
    0950   Friedrich Engels           1820..1895        Germany            42 80 101
    0944   Aristophanes               446....386 B.C.   Ancient Greece     80 105 70
    0931   Molière                    1622..1673        France             48 84 97
    0891   Gustave Flaubert           1821..1880        France             67 65 99
    0804   Chuck Palahniuk            1962..            USA                100 79 80
    0803   William Thackeray          1811..1863        England            87 70 91
    0772   William Golding            1911..1993        England            66 76 100
    0646   Bernard Werber             1961..            France             98 103 77
    0614   Sophocles                  497....406 B.C.   Ancient Greece     102 68 94
    0505   Frédéric Beigbeder         1965..            France             61 102 103
    0396   Eshil                      520....460 B.C.   Ancient Greece     85 91 102
    0089   Nikolay Chernishevskiy     1828..1889        Russia             103 100 104
