Papaya
======

A collection of useful utilities

# LzyMap
Its so lazy that there isn't even an 'a' in the name!  A decorator for a java.util.Map that will load a value into the map if it doesn't already exist.  See class for examples.

## Why not in Google Guava?
https://code.google.com/p/guava-libraries/wiki/IdeaGraveyard

## If Google says its bad, why stil do it?
There is a slight difference between this implementation and what is explained by Google.  Unless you provide a ValueFactory, the get method is just a pass-through to the underlying map.  It is similar to using getOrElse in other languages, but it loads the value into the map before it is returned.

## Why not use the LazyMap in Commons-Collections?
You can, but Commons-Collections is not Generically typed :(

