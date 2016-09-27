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


    3891   J. K. Rowling              1965..            England            17 17  1
    3562   Oscar Wilde                1856..1900        England            11 12 23
    3534   Edgar Poe                  1809..1849        USA                26 26 10
    3485   J. R. R. Tolkien           1892..1973        England            40 33  2
    3475   Arthur Conan Doyle         1859..1930        England            41 25  6
    3445   Carl Jung                  1875..1961        Switzerland        19 42 10
    3444   Victor Hugo                1802..1885        France              5 38 19
    3262   Stephen King               1947..            USA                 2  1 48
    3215   Simone de Beauvoir         1908..1986        France             33  7 32
    3178   John Keats                 1795..1821        England            44 50  7
    3049   Charles Baudler            1821..1867        England            51 60  5
    3018   Jane Austen                1775..1817        England            56 28 20
    3007   Martin Heidegger           1889..1976        Germany            46 27 26
    2987   Friedrich Nietzsche        1844..1900        Germany            27 40 30
    2984   Jack London                1876..1916        USA                 1  2 62
    2959   Fedor Dostoevskiy          1821..1881        Russia             61 45 12
    2947   Dante Alighieri            1265..1321        Italy              30 25 38
    2920   Mikhail Bulgakov           1891..1940        Russia             83 43  4
    2920   Ken Kesey                  1935..2001        USA                91 23 10
    2901   Antoine de Saint-Exupéry   1900..1940        France             55 73  4
    2876   Albert Camus               1913..1960        France             29  7 51
    2859   Alexander Pushkin          1799..1837        Russia             32 58 25
    2800   Alexandre Dumas            1802..1870        France             37 77 16
    2740   Charlotte Bronte           1816..1855        England            71 31 25
    2737   Agatha Christie            1890..1976        England            28 16 54
    2717   George Gordon Byron        1788..1824        England            24 20 55
    2672   Isaac Asimov               1920..1992        USA                60 63 18
    2662   Mikhail Lermontov          1814..1841        Russia             59 69 16
    2589   George Oruell              1903..1950        England            21 50 48
    2579   Ray Bradbury               1920..2012        USA                54 18 48
    2557   William Shakespeare        1564..1616        England             6  8 78
    2539   Philip K. Dick             1928..1982        USA                53  5 57
    2511   Hermann Hesse              1877..1962        Switzerland        43 44 44
    2477   Henry Miller               1891..1980        USA                 3  3 86
    2443   Nikolai Gogol              1809..1852        Ukraine            77 51 27
    2399   Immanuele Kant             1724..1804        Germany            34 10 71
    2369   Richard Bach               1936..            USA                14 33 71
    2361   Gabriel García Márquez     1927..2014        Mexico             38 38 57
    2341   Auldous Huxley             1894..1963        England            63 21 54
    2316   Stefan Zweig               1881..1942        Austria            84 89 11
    2302   Erich Maria Remarque       1898..1970        Germany            81 19 48
    2294   Kurt Vonnegut              1922..2007        USA                98 39 30
    2280   F. Scott Fitzgerald        1896..1940        USA                52  4 71
    2271   Umberto Eco                1932..2016        Italy               4 77 59
    2233   Anton Chekhov              1860..1904        Russia             65 50 44
    2220   Mark Twain                 1835..1910        USA                10 34 80
    2213   Jean-Paul Sartre           1905..1980        France             39 64 51
    2205   Boris Pasternak            1890..1960        Russia             66 80 30
    2179   Sigmund Freud              1856..1939        Austria            23  9 88
    2166   Soren Kierkegaard          1813..1855        Denmark            96 68 23
    2165   Arthur Schopenhauer        1788..1860        Germany            74 62 37
    2151   Jules Verne                1828..1905        France             22 41 74
    2107   Erich Fromm                1900..1980        Germany            79 101 18
    2105   Lev Tolstoi                1828..1910        Russia             88 54 37
    2076   Charles Bukowski           1920..1994        USA                95 50 37
    2060   Voltaire                   1694..1798        France             13 23 92
    2060   Mary Shelley               1797..1851        England            16 14 95
    2043   Vladimir Lenin             1870..1924        Russia             31 65 63
    2038   Ethel Voynich              1864..1960        England            107 88 14
    2037   Alexander Kuprin           1870..1938        Russia             87 90 23
    2032   Charles Dickens            1812..1870        England            15 52 78
    2016   Oliver Sacks               1933..2015        England            58 79 44
    2003   Georg Hegel                1770..1831        Germany            69 15 71
    1942   Ernest Hemingway           1899..1961        USA                25 35 86
    1917   Baruch Spinoza             1632..1677        Denmark            92 55 44
    1914   Franz Kafka                1883..1924        Germany            36 57 71
    1900   Irvin D. Yalom             1931..            USA                103 106 14
    1891   George Sand                1804..1876        France              7 30 100
    1872   Jean-Jacques Rousseau      1712..1778        France             20 29 95
    1871   Adolph Hitler              1889..1945        Germany            12 13 107
    1853   Herbert Wells              1866..1946        England             8 61 86
    1812   Karl Marx                  1818..1883        Germany             9 38 99
    1774   John Milton                1608..1674        England            72 11 83
    1707   Émile Zola                 1840..1902        France             45 87 62
    1687   Euripides                  480....406 B.C.   Ancient Greece     57 77 62
    1679   Milan Kundera              1929..            Czech republic     76 95 44
    1654   Homer                      1100..1000 B.C.   Ancient Greece     18 59 92
    1649   Ivan Goncharov             1812..1891        Russia             81 83 49
    1606   J. D. Salinger             1919..2010        USA                50 50 83
    1591   Stanisław Lem              1921..2006        Ukraine            94 100 37
    1585   Johann Goethe              1749..1832        Germany            36 54 89
    1581   Mikhail Sholokhov          1905..1984        Russia             106 99 32
    1578   Ivan Turgenev              1818..1883        Russia             70 71 64
    1561   Carlos Castaneda           1925..1998        USA                101 96 37
    1511   Alexander Griboedov        1795..1829        Russia             90 98 44
    1359   Maxim Gorkiy               1868..1936        Russia             78 57 78
    1331   Jonathan Safran Foer       1977..            USA                94 92 54
    1260   Stendhal                   1783..1842        France             47 94 80
    1201   Guy de Maupassant          1850..1893        France             75 84 74
    1153   John Fowles                1926..2005        England            97 97 59
    1122   Theodore Draiser           1871..1945        USA                64 103 74
    1073   Vladimir Nabokov           1899..1977        Russia             99 91 65
    0982   Honoré de Balzac           1799..1850        France             87 66 88
    0970   Friedrich Engels           1820..1895        Germany            42 82 103
    0963   Aristophanes               446....386 B.C.   Ancient Greece     82 107 71
    0961   J. M. Coetzee              1940..            South Africa       73 74 92
    0961   Denis Diderot              1713..1784        France             48 85 99
    0941   Molière                    1622..1673        France             49 86 99
    0901   Gustave Flaubert           1821..1880        France             68 67 101
    0824   Chuck Palahniuk            1962..            USA                102 81 81
    0803   William Thackeray          1811..1863        England            89 72 93
    0782   William Golding            1911..1993        England            67 78 102
    0666   Bernard Werber             1961..            France             100 105 78
    0614   Sophocles                  497....406 B.C.   Ancient Greece     104 70 96
    0514   Frédéric Beigbeder         1965..            France             62 104 105
    0396   Eshil                      520....460 B.C.   Ancient Greece     87 93 104
    0089   Nikolay Chernishevskiy     1828..1889        Russia             105 102 106
