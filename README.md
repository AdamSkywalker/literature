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


    3841   J. K. Rowling              1965..            England            18 17  1
    3532   Oscar Wilde                1856..1900        England            12 12 22
    3504   Edgar Poe                  1809..1849        USA                27 26  9
    3425   J. R. R. Tolkien           1892..1973        England            41 34  2
    3425   Arthur Conan Doyle         1859..1930        England            42 25  6
    3414   Victor Hugo                1802..1885        France              5 39 18
    3405   Carl Jung                  1875..1961        Switzerland        20 43  9
    3243   Stephen King               1947..            USA                 2  1 47
    3175   Simone de Beauvoir         1908..1986        France             34  8 31
    3008   Jane Austen                1775..1817        England            55 28 19
    2987   Martin Heidegger           1889..1976        Germany            46 27 25
    2954   Jack London                1876..1916        USA                 1  3 61
    2947   Friedrich Nietzsche        1844..1900        Germany            28 41 29
    2939   Fedor Dostoevskiy          1821..1881        Russia             60 46 11
    2930   Marcel Proust              1871..1922        France             87 32  5
    2917   Dante Alighieri            1265..1321        Italy              31 25 37
    2910   Ken Kesey                  1935..2001        USA                90 23  9
    2891   Mikhail Bulgakov           1891..1940        Russia             81 44  4
    2881   Antoine de Saint-Exupéry   1900..1940        France             54 72  4
    2837   Albert Camus               1913..1960        France             30  8 50
    2829   Alexander Pushkin          1799..1837        Russia             33 58 24
    2781   Alexandre Dumas            1802..1870        France             38 76 15
    2730   Charlotte Bronte           1816..1855        England            70 31 24
    2707   Agatha Christie            1890..1976        England            29 16 53
    2688   George Gordon Byron        1788..1824        England            25 20 54
    2672   Isaac Asimov               1920..1992        USA                59 62 17
    2662   Mikhail Lermontov          1814..1841        Russia             58 68 15
    2570   Ray Bradbury               1920..2012        USA                53 18 47
    2560   George Oruell              1903..1950        England            22 50 47
    2519   Philip K. Dick             1928..1982        USA                52  6 56
    2517   William Shakespeare        1564..1616        England             7  9 77
    2471   Hermann Hesse              1877..1962        Switzerland        44 45 43
    2467   Henry Miller               1891..1980        USA                 3  4 84
    2443   Nikolai Gogol              1809..1852        Ukraine            75 51 26
    2359   Immanuele Kant             1724..1804        Germany            35 11 70
    2331   Auldous Huxley             1894..1963        England            62 21 53
    2330   Richard Bach               1936..            USA                15 34 70
    2326   Stefan Zweig               1881..1942        Austria            82 88 10
    2321   Gabriel García Márquez     1927..2014        Mexico             39 39 56
    2302   Erich Maria Remarque       1898..1970        Germany            79 19 47
    2274   Kurt Vonnegut              1922..2007        USA                97 40 29
    2262   Umberto Eco                1932..2016        Italy               4 76 58
    2260   F. Scott Fitzgerald        1896..1940        USA                51  5 70
    2258   James Joyce                1882..1941        Ireland             6  2 94
    2223   Anton Chekhov              1860..1904        Russia             64 50 43
    2205   Boris Pasternak            1890..1960        Russia             65 79 29
    2193   Jean-Paul Sartre           1905..1980        France             40 63 50
    2180   Mark Twain                 1835..1910        USA                11 35 79
    2175   Arthur Schopenhauer        1788..1860        Germany            72 61 36
    2166   Soren Kierkegaard          1813..1855        Denmark            95 67 22
    2160   Sigmund Freud              1856..1939        Austria            24 10 86
    2117   Erich Fromm                1900..1980        Germany            77 100 17
    2112   Jules Verne                1828..1905        France             23 42 73
    2095   Lev Tolstoi                1828..1910        Russia             87 54 36
    2066   Charles Bukowski           1920..1994        USA                94 50 36
    2050   Voltaire                   1694..1798        France             14 23 90
    2047   Alexander Kuprin           1870..1938        Russia             85 89 22
    2038   Ethel Voynich              1864..1960        England            106 87 13
    2030   Mary Shelley               1797..1851        England            17 14 94
    2024   Vladimir Lenin             1870..1924        Russia             32 64 62
    2016   Oliver Sacks               1933..2015        England            57 78 43
    2002   Charles Dickens            1812..1870        England            16 52 77
    1993   Georg Hegel                1770..1831        Germany            68 15 70
    1922   Ernest Hemingway           1899..1961        USA                26 36 84
    1907   Baruch Spinoza             1632..1677        Denmark            91 55 43
    1900   Irvin D. Yalom             1931..            USA                102 105 13
    1884   Franz Kafka                1883..1924        Germany            37 57 70
    1861   George Sand                1804..1876        France              8 30 99
    1853   Herbert Wells              1866..1946        England             9 60 84
    1842   Jean-Jacques Rousseau      1712..1778        France             21 29 94
    1841   Adolph Hitler              1889..1945        Germany            13 13 106
    1772   Karl Marx                  1818..1883        Germany            10 39 98
    1697   Émile Zola                 1840..1902        France             45 86 61
    1689   Milan Kundera              1929..            Czech republic     74 94 43
    1687   Euripides                  480....406 B.C.   Ancient Greece     56 76 61
    1659   Ivan Goncharov             1812..1891        Russia             79 82 48
    1645   Homer                      1100..1000 B.C.   Ancient Greece     19 59 90
    1606   J. D. Salinger             1919..2010        USA                50 50 81
    1591   Stanisław Lem              1921..2006        Ukraine            93 99 36
    1581   Mikhail Sholokhov          1905..1984        Russia             105 98 31
    1578   Ivan Turgenev              1818..1883        Russia             69 70 63
    1576   Johann Goethe              1749..1832        Germany            37 54 87
    1561   Carlos Castaneda           1925..1998        USA                100 95 36
    1511   Alexander Griboedov        1795..1829        Russia             89 97 43
    1359   Maxim Gorkiy               1868..1936        Russia             76 57 77
    1331   Jonathan Safran Foer       1977..            USA                93 91 53
    1250   Stendhal                   1783..1842        France             47 93 79
    1211   Guy de Maupassant          1850..1893        France             73 83 73
    1153   John Fowles                1926..2005        England            96 96 58
    1122   Theodore Draiser           1871..1945        USA                63 102 73
    1073   Vladimir Nabokov           1899..1977        Russia             98 90 64
    1011   Honoré de Balzac           1799..1850        France             85 65 86
    0991   J. M. Coetzee              1940..            South Africa       71 73 90
    0973   Aristophanes               446....386 B.C.   Ancient Greece     80 106 70
    0951   Denis Diderot              1713..1784        France             48 84 98
    0950   Friedrich Engels           1820..1895        Germany            43 81 102
    0931   Molière                    1622..1673        France             49 85 98
    0901   Gustave Flaubert           1821..1880        France             67 66 100
    0824   Chuck Palahniuk            1962..            USA                101 80 80
    0823   William Thackeray          1811..1863        England            88 71 91
    0782   William Golding            1911..1993        England            66 77 101
    0666   Bernard Werber             1961..            France             99 104 77
    0614   Sophocles                  497....406 B.C.   Ancient Greece     103 69 95
    0514   Frédéric Beigbeder         1965..            France             61 103 104
    0406   Eshil                      520....460 B.C.   Ancient Greece     85 92 103
    0089   Nikolay Chernishevskiy     1828..1889        Russia             104 101 105
