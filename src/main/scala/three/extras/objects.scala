package typings.three.extras.objects

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.*
import typings.three.helpers.*
import typings.three.textures.*
import typings.three.objects.*
import typings.three.extras.*
import typings.three.extras.core.*
import typings.three.extras.curves.*
import typings.three.animation.*
import typings.three.animation.tracks.*
import typings.three.loaders.*
import typings.three.cameras.*
import typings.three.core.*
import typings.three.materials.*
import typings.three.renderers.*
import typings.three.renderers.webxr.*
import typings.three.renderers.shaders.*
import typings.three.renderers.webgl.*
import typings.three.geometries.*
import typings.three.scenes.*
import typings.three.math.*
import typings.three.math.interpolants.*
import typings.three.audio.*
import typings.three.lights.*

@js.native
@JSGlobal("THREE.ImmediateRenderObject")
class ImmediateRenderObject extends Object3D:
  def this(material: Material) = this()
  val isImmediateRenderObject: Boolean = js.native
  var material: Material = js.native
  var hasPositions: Boolean = js.native
  var hasNormals: Boolean = js.native
  var hasColors: Boolean = js.native
  var hasUvs: Boolean = js.native
  var positionArray: Null | Float32Array = js.native
  var normalArray: Null | Float32Array = js.native
  var colorArray: Null | Float32Array = js.native
  var uvArray: Null | Float32Array = js.native
  var count: Double = js.native
  def render(renderCallback: js.Function0[Unit]): Unit = js.native
