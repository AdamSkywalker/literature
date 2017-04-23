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


    3871   J. K. Rowling              1965..            England            18 18  1
    3562   Oscar Wilde                1856..1900        England            12 13 22
    3524   Edgar Poe                  1809..1849        USA                28 27  9
    3445   J. R. R. Tolkien           1892..1973        England            42 35  2
    3445   Arthur Conan Doyle         1859..1930        England            43 26  6
    3444   Victor Hugo                1802..1885        France              5 40 18
    3435   Carl Jung                  1875..1961        Switzerland        20 44  9
    3282   Stephen King               1947..            USA                 2  1 47
    3205   Simone de Beauvoir         1908..1986        France             35  8 31
    3028   Jane Austen                1775..1817        England            56 29 19
    3007   Martin Heidegger           1889..1976        Germany            47 28 25
    2994   Jack London                1876..1916        USA                 1  3 61
    2967   Friedrich Nietzsche        1844..1900        Germany            29 42 29
    2959   Fedor Dostoevskiy          1821..1881        Russia             61 47 11
    2950   Marcel Proust              1871..1922        France             88 33  5
    2937   Dante Alighieri            1265..1321        Italy              32 26 37
    2930   Ken Kesey                  1935..2001        USA                91 24  9
    2911   Mikhail Bulgakov           1891..1940        Russia             82 45  4
    2901   Antoine de Saint-Exupéry   1900..1940        France             55 73  4
    2866   Albert Camus               1913..1960        France             31  8 50
    2849   Alexander Pushkin          1799..1837        Russia             34 59 24
    2801   Alexandre Dumas            1802..1870        France             39 77 15
    2750   Charlotte Bronte           1816..1855        England            71 32 24
    2727   Agatha Christie            1890..1976        England            30 17 53
    2707   George Gordon Byron        1788..1824        England            26 21 54
    2691   Isaac Asimov               1920..1992        USA                60 63 17
    2682   Mikhail Lermontov          1814..1841        Russia             59 69 15
    2589   Ray Bradbury               1920..2012        USA                54 19 47
    2580   George Oruell              1903..1950        England            23 51 47
    2557   William Shakespeare        1564..1616        England             7  9 77
    2549   Philip K. Dick             1928..1982        USA                53  6 56
    2507   Henry Miller               1891..1980        USA                 3  4 84
    2491   Hermann Hesse              1877..1962        Switzerland        45 46 43
    2463   Nikolai Gogol              1809..1852        Ukraine            76 52 26
    2379   Immanuele Kant             1724..1804        Germany            36 12 70
    2359   Richard Bach               1936..            USA                15 35 70
    2351   Auldous Huxley             1894..1963        England            63 22 53
    2346   Stefan Zweig               1881..1942        Austria            83 89 10
    2341   Gabriel García Márquez     1927..2014        Mexico             40 40 56
    2322   Erich Maria Remarque       1898..1970        Germany            80 20 47
    2298   James Joyce                1882..1941        Ireland             6  2 94
    2294   Kurt Vonnegut              1922..2007        USA                98 41 29
    2291   Umberto Eco                1932..2016        Italy               4 77 58
    2290   F. Scott Fitzgerald        1896..1940        USA                52  5 70
    2243   Anton Chekhov              1860..1904        Russia             65 51 43
    2225   Boris Pasternak            1890..1960        Russia             66 80 29
    2213   Jean-Paul Sartre           1905..1980        France             41 64 50
    2210   Mark Twain                 1835..1910        USA                11 36 79
    2195   Arthur Schopenhauer        1788..1860        Germany            73 62 36
    2186   Soren Kierkegaard          1813..1855        Denmark            96 68 22
    2180   Sigmund Freud              1856..1939        Austria            25 11 86
    2137   Erich Fromm                1900..1980        Germany            78 101 17
    2131   Jules Verne                1828..1905        France             24 43 73
    2115   Lev Tolstoi                1828..1910        Russia             88 55 36
    2086   Charles Bukowski           1920..1994        USA                95 51 36
    2080   Voltaire                   1694..1798        France             14 24 90
    2067   Alexander Kuprin           1870..1938        Russia             86 90 22
    2060   Mary Shelley               1797..1851        England            17 15 94
    2058   Ethel Voynich              1864..1960        England            107 88 13
    2043   Vladimir Lenin             1870..1924        Russia             33 65 62
    2035   Oliver Sacks               1933..2015        England            58 79 43
    2032   Charles Dickens            1812..1870        England            16 53 77
    2013   Georg Hegel                1770..1831        Germany            69 16 70
    1942   Ernest Hemingway           1899..1961        USA                27 37 84
    1927   Baruch Spinoza             1632..1677        Denmark            92 56 43
    1921   Jonathan Swift             1667..1745        Ireland            22 10 101
    1920   Irvin D. Yalom             1931..            USA                103 106 13
    1904   Franz Kafka                1883..1924        Germany            38 58 70
    1891   George Sand                1804..1876        France              8 31 99
    1883   Herbert Wells              1866..1946        England             9 61 84
    1872   Jean-Jacques Rousseau      1712..1778        France             21 30 94
    1851   Adolph Hitler              1889..1945        Germany            13 14 107
    1802   Karl Marx                  1818..1883        Germany            10 40 98
    1717   Émile Zola                 1840..1902        France             46 87 61
    1709   Milan Kundera              1929..            Czech republic     75 95 43
    1707   Euripides                  480....406 B.C.   Ancient Greece     57 77 61
    1678   Ivan Goncharov             1812..1891        Russia             80 83 48
    1674   Homer                      1100..1000 B.C.   Ancient Greece     19 60 90
    1626   J. D. Salinger             1919..2010        USA                51 51 81
    1610   Stanisław Lem              1921..2006        Ukraine            94 100 36
    1601   Mikhail Sholokhov          1905..1984        Russia             106 99 31
    1598   Ivan Turgenev              1818..1883        Russia             70 71 63
    1595   Johann Goethe              1749..1832        Germany            38 55 87
    1581   Carlos Castaneda           1925..1998        USA                101 96 36
    1531   Alexander Griboedov        1795..1829        Russia             90 98 43
    1379   Maxim Gorkiy               1868..1936        Russia             77 58 77
    1351   Jonathan Safran Foer       1977..            USA                94 92 53
    1270   Stendhal                   1783..1842        France             48 94 79
    1231   Guy de Maupassant          1850..1893        France             74 84 73
    1173   John Fowles                1926..2005        England            97 97 58
    1141   Theodore Draiser           1871..1945        USA                64 103 73
    1093   Vladimir Nabokov           1899..1977        Russia             99 91 64
    1031   Honoré de Balzac           1799..1850        France             86 66 86
    1011   J. M. Coetzee              1940..            South Africa       72 74 90
    0993   Aristophanes               446....386 B.C.   Ancient Greece     81 107 70
    0971   Denis Diderot              1713..1784        France             49 85 98
    0951   Molière                    1622..1673        France             50 86 98
    0950   Friedrich Engels           1820..1895        Germany            44 82 103
    0901   Gustave Flaubert           1821..1880        France             68 67 101
    0844   Chuck Palahniuk            1962..            USA                102 81 80
    0843   William Thackeray          1811..1863        England            89 72 91
    0782   William Golding            1911..1993        England            67 78 102
    0686   Bernard Werber             1961..            France             100 105 77
    0634   Sophocles                  497....406 B.C.   Ancient Greece     104 70 95
    0514   Frédéric Beigbeder         1965..            France             62 104 105
    0406   Eshil                      520....460 B.C.   Ancient Greece     86 93 104
    0089   Nikolay Chernishevskiy     1828..1889        Russia             105 102 106
