---
id: conversion-options
title: Customize the generated code.
---

### `stExperimentalEnableImplicitOps`
Enable this to get builder-like functionality for generated companion objects.
This will be the default soon, and it'll be better incorporated into the documentation.

For now see [release notes for 1.0.0-beta13](https://github.com/ScalablyTyped/Converter/releases/tag/v1.0.0-beta13)

### `stIgnore`
There are a few reasons you might want to ignore things:
- A dependency of a library you want to use might fail conversion/compilation and you can try to salvage the situation by ignoring it.
- A dependency is slow to convert/build and you have no use for it
- A library has a circular set of dependencies (it's javascript, of course it happens) you might break the circuit by ignoring a library.

The consequence of ignoring a library is typically that whenever another library references something in it, 
that reference will be translated as `js.Any` with a comment (and there will be warnings when importing).

You cannot ignore the `std` library.
 
Some usage examples: 

- `csstype` is a type-only library from DefinitelyTyped which describes all of react CSS with Typescript interfaces, enabling
 type-safe use. It is a dependency of `react`, and used throughout that ecosystem. 
 This is something you either want, or don't care about. If you don't, you can exclude it like this: 

```scala
project.settings(
  stIgnore += "csstype"
)
```

- Let's say you want to use an old version of `material-ui` which comes bundled with 5000 icons, modelled as react component classes.
You also don't need the icons. If that's the case, you can also exclude prefixes of module names with the same mechanism

```scala
project.settings(
  stIgnore ++= List("material-ui/svg-icons")
)
```

### `stEnableScalaJsDefined` 

As explained in the corresponding [Scala.js documentation page](https://www.scala-js.org/doc/interoperability/sjs-defined-js-classes.html),
`@ScalaJSDefined` traits are more convenient because they can be `new`ed, extended and so on.

However, there an imperfection somewhere in Scala.js and/or scalac with handling huge amounts of annotations 
 which makes compilation of some libraries *insanely* much slower.
`@material-ui/core` takes ~600 seconds to compile with `@ScalaJSDefined` traits, and ~35 without. 

This setting also uses `Selection`, so an example usage is:
```scala
project.settings(
  stEnableScalaJsDefined := Selection.All()
)
```

By default this is off, that is `Selection.None()`

### `stStdLib`
This mirrors the `--lib` option to typescript, see 
[compiler options](https://www.typescriptlang.org/docs/handbook/compiler-options.html).

The main usage is to limit which DOM/Javascript APIs are available. 
For instance, a node application should not access the DOM at all, 
 and a browser application should only use things you have polyfilled.
      
```scala
project.settings(
  stStdlib := List("es6", "es2018.asyncgenerator")
)
```

Note that if you use `scala-js-dom` APIs they are naturally not affected.

Also note that if you use a [flavour](flavour.md) which translates types to `scala-js-dom` types, 
 only types found in the chosen stdlib will be translated.
 
### `stOutputPackage`
You can adjust the top-level package into which we put the generated code.
       
```scala
project.settings(
  stOutputPackage := "org.awesome.sauce",
)
```


### `stUseScalaJsDom`
When `true` (which is the default) uses scala-js-dom types when possible instead of types we translate from typescript in `std`.
`true` is also implied by the react flavours.

Benefit from setting to `false`:
- more comprehensive DOM API. scala-js-dom is nowhere close to the coverage typescript has. 
We keep all the generated types which dont exist in scala-js-dom, but the ones which are there will have fewer things defined on them.
- more coherent DOM API, since it will all be equal instead of belonging to two different worlds.

Benefit from keeping as `true`:
- less code to compile when `stMinimize` is enabled for `std`.
- easier interop with other Scala.js libraries

## Customize the build

Do you find the debug output tiring?

```scala
Global / stQuiet := true
```

By default we store caches and built artifacts in `~/.cache/scalablytyped` or a similar directory for your operating system.

If that doesn't suit you, you can specify another directory 

```scala
Global / stDir := file("/some/other/dir")
```
