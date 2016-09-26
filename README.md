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


    3593   J. K. Rowling              1965..            England            17 15  1
    3254   Oscar Wilde                1856..1900        England            11 11 23
    3236   Edgar Poe                  1809..1849        USA                26 24 10
    3207   J. R. R. Tolkien           1892..1973        England            38 31  2
    3197   Arthur Conan Doyle         1859..1930        England            39 23  6
    3167   Carl Jung                  1875..1961        Switzerland        19 38 10
    3156   Victor Hugo                1802..1885        France              5 35 19
    3025   Stephen King               1947..            USA                 2  1 44
    2957   Simone de Beauvoir         1908..1986        France             32  6 30
    2929   John Keats                 1795..1821        England            42 45  7
    2801   Charles Baudler            1821..1867        England            49 55  5
    2786   Jack London                1876..1916        USA                 1  2 56
    2750   Jane Austen                1775..1817        England            53 26 20
    2738   Dante Alighieri            1265..1321        Italy              29 23 34
    2729   Martin Heidegger           1889..1976        Germany            44 25 26
    2729   Friedrich Nietzsche        1844..1900        Germany            27 36 29
    2711   Fedor Dostoevskiy          1821..1881        Russia             58 41 12
    2672   Mikhail Bulgakov           1891..1940        Russia             80 39  4
    2662   Antoine de Saint-Exupéry   1900..1940        France             52 68  4
    2658   Albert Camus               1913..1960        France             28  6 47
    2652   Ken Kesey                  1935..2001        USA                88 21 10
    2601   Alexander Pushkin          1799..1937        Russia             31 53 25
    2542   Alexandre Dumas            1802..1870        France             36 72 16
    2519   George Gordon Byron        1788..1824        England            24 18 50
    2472   Charlotte Bronte           1816..1855        England            68 29 25
    2433   Isaac Asimov               1920..1992        USA                57 58 18
    2423   Mikhail Lermontov          1814..1841        Russia             56 64 16
    2408   William Shakespeare        1564..1616        England             6  7 70
    2401   George Oruell              1903..1950        England            21 45 44
    2391   Ray Bradbury               1920..2012        USA                51 16 44
    2380   Philip K. Dick             1928..1982        USA                50  4 51
    2332   Hermann Hesse              1877..1962        Switzerland        41 40 40
    2318   Henry Miller               1891..1980        USA                 3  3 78
    2240   Immanuele Kant             1724..1804        Germany            33  9 64
    2211   Richard Bach               1936..            USA                14 31 64
    2205   Nikolai Gogol              1809..1852        Ukraine            74 46 27
    2173   Auldous Huxley             1894..1963        England            60 19 49
    2123   Umberto Eco                1932..2016        Italy               4 72 53
    2114   Erich Maria Remarque       1898..1970        Germany            78 17 44
    2081   Mark Twain                 1835..1910        USA                10 32 72
    2077   Stefan Zweig               1881..1942        Austria            81 84 11
    2075   Anton Chekhov              1860..1904        Russia             62 45 40
    2044   Jean-Paul Sartre           1905..1980        France             37 59 47
    2031   Sigmund Freud              1856..1939        Austria            23  8 80
    2012   Jules Verne                1828..1905        France             22 37 67
    2006   Arthur Schopenhauer        1788..1860        Germany            71 57 33
    1987   Boris Pasternak            1890..1960        Russia             63 75 29
    1947   Lev Tolstoi                1828..1910        Russia             85 49 33
    1938   Soren Kierkegaard          1813..1855        Denmark            92 63 23
    1923   Charles Dickens            1812..1870        England            15 47 70
    1922   Voltaire                   1694..1798        France             13 21 84
    1911   Mary Shelley               1797..1851        England            16 13 87
    1905   Vladimir Lenin             1870..1924        Russia             30 60 57
    1889   Erich Fromm                1900..1980        Germany            76 94 18
    1864   Georg Hegel                1770..1831        Germany            66 14 64
    1857   Oliver Sacks               1933..2015        England            55 74 40
    1849   Ethel Voynich              1864..1960        England            99 83 14
    1803   Ernest Hemingway           1899..1961        USA                25 33 78
    1799   Alexander Kuprin           1870..1938        Russia             84 85 23
    1795   Franz Kafka                1883..1924        Germany            35 52 64
    1758   Baruch Spinoza             1632..1677        Denmark            89 50 40
    1753   George Sand                1804..1876        France              7 28 92
    1744   Herbert Wells              1866..1946        England             8 56 78
    1733   Jean-Jacques Rousseau      1712..1778        France             20 27 87
    1731   Irvin D. Yalom             1931..            USA                96 98 14
    1722   Adolph Hitler              1889..1945        Germany            12 12 99
    1683   Karl Marx                  1818..1883        Germany             9 35 91
    1655   John Milton                1608..1674        England            69 10 75
    1578   Émile Zola                 1840..1902        France             43 82 56
    1568   Euripides                  480....406 B.C.   Ancient Greece     54 72 56
    1545   Homer                      1100..1000 B.C.   Ancient Greece     18 54 84
    1520   Milan Kundera              1929..            Czech republic     73 90 40
    1517   J. D. Salinger             1919..2010        USA                48 45 75
    1490   Ivan Goncharov             1812..1891        Russia             78 78 45
    1486   Johann Goethe              1749..1832        Germany            35 49 81
    1459   Ivan Turgenev              1818..1883        Russia             67 66 58
    1452   Stanisław Lem              1921..2006        Ukraine            91 93 33
    1362   Alexander Griboedov        1795..1829        Russia             87 92 40
    1280   Maxim Gorkiy               1868..1936        Russia             75 52 70
    1193   Jonathan Safran Foer       1977..            USA                91 87 49
    1170   Stendhal                   1783..1842        France             45 89 72
    1102   Guy de Maupassant          1850..1893        France             72 79 67
    1054   John Fowles                1926..2005        England            93 91 53
    1042   Theodore Draiser           1871..1945        USA                61 96 67
    0974   Vladimir Nabokov           1899..1977        Russia             94 86 59
    0902   Honoré de Balzac           1799..1850        France             84 61 80
    0894   Aristophanes               446....386 B.C.   Ancient Greece     79 99 64
    0882   J. M. Coetzee              1940..            South Africa       70 69 84
    0881   Friedrich Engels           1820..1895        Germany            40 77 95
    0872   Denis Diderot              1713..1784        France             46 80 91
    0852   Molière                    1622..1673        France             47 81 91
    0822   Gustave Flaubert           1821..1880        France             65 62 93
    0784   Chuck Palahniuk            1962..            USA                95 76 73
    0724   William Thackeray          1811..1863        England            86 67 85
    0703   William Golding            1911..1993        England            64 73 94
    0575   Sophocles                  497....406 B.C.   Ancient Greece     97 65 88
    0455   Frédéric Beigbeder         1965..            France             59 97 97
    0317   Eshil                      520....460 B.C.   Ancient Greece     84 88 96
    0069   Nikolay Chernishevskiy     1828..1889        Russia             98 95 98
