package typings.three.three.extras.objects

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.three.*
import typings.three.three.helpers.*
import typings.three.three.textures.*
import typings.three.three.objects.*
import typings.three.three.extras.*
import typings.three.three.extras.core.*
import typings.three.three.extras.curves.*
import typings.three.three.animation.*
import typings.three.three.animation.tracks.*
import typings.three.three.loaders.*
import typings.three.three.cameras.*
import typings.three.three.core.*
import typings.three.three.materials.*
import typings.three.three.renderers.*
import typings.three.three.renderers.webxr.*
import typings.three.three.renderers.shaders.*
import typings.three.three.renderers.webgl.*
import typings.three.three.geometries.*
import typings.three.three.scenes.*
import typings.three.three.math.*
import typings.three.three.math.interpolants.*
import typings.three.three.audio.*
import typings.three.three.lights.*


@js.native
@JSGlobal("THREE.ImmediateRenderObject")
class ImmediateRenderObject extends Object3D:
	def this(material: Material) = this()
	val isImmediateRenderObject: Boolean = js.native;
	var material: Material = js.native;
	var hasPositions: Boolean = js.native;
	var hasNormals: Boolean = js.native;
	var hasColors: Boolean = js.native;
	var hasUvs: Boolean = js.native;
	var positionArray: Null | Float32Array = js.native;
	var normalArray: Null | Float32Array = js.native;
	var colorArray: Null | Float32Array = js.native;
	var uvArray: Null | Float32Array = js.native;
	var count: Double = js.native;
	def render(renderCallback: js.Function0[Unit]): Unit = js.native
