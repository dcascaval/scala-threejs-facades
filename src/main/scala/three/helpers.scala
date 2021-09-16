package typings.three.helpers

import scala.scalajs.js
import js.annotation.*
import org.scalajs.dom.*
import org.scalajs.dom.raw.{HTMLMediaElement, HTMLVideoElement, HTMLCanvasElement, HTMLImageElement}
import org.scalajs.dom.raw.{WebGLShader, WebGLFramebuffer}
import org.scalajs.dom.experimental.gamepad.*
import scalajs.js.typedarray.*

import typings.three.*
import typings.three.textures.*
import typings.three.objects.*
import typings.three.extras.*
import typings.three.extras.core.*
import typings.three.extras.curves.*
import typings.three.extras.objects.*
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
@JSGlobal("THREE.PointLightHelper")
class PointLightHelper extends Object3D:
  def this(
      light: PointLight,
      sphereSize: js.UndefOr[Double] = js.undefined,
      color: js.UndefOr[ColorRepresentation] = js.undefined
  ) = this()

  var light: PointLight = js.native
  var color: js.UndefOr[ColorRepresentation] = js.native

  def dispose(): Unit = js.native
  def update(): Unit = js.native

@js.native
@JSGlobal("THREE.BoxHelper")
class BoxHelper extends LineSegments[BufferGeometry, Material | js.Array[Material]]:
  def this(`object`: Object3D, color: js.UndefOr[ColorRepresentation] = js.undefined) = this()

  def update(`object`: js.UndefOr[Object3D] = js.undefined): Unit = js.native
  def setFromObject(`object`: Object3D): this.type = js.native

@js.native
@JSGlobal("THREE.SkeletonHelper")
class SkeletonHelper extends LineSegments[BufferGeometry, Material | js.Array[Material]]:
  def this(`object`: Object3D) = this()

  var bones: js.Array[Bone] = js.native
  var root: Object3D = js.native
  val isSkeletonHelper: Boolean = js.native

  def getBoneList(`object`: Object3D): js.Array[Bone] = js.native
  def update(): Unit = js.native

@js.native
@JSGlobal("THREE.HemisphereLightHelper")
class HemisphereLightHelper extends Object3D:
  def this(light: HemisphereLight, size: Double, color: js.UndefOr[ColorRepresentation] = js.undefined) =
    this()
  var light: HemisphereLight = js.native

  var material: MeshBasicMaterial = js.native
  var color: js.UndefOr[ColorRepresentation] = js.native
  def dispose(): Unit = js.native
  def update(): Unit = js.native

@js.native
@JSGlobal("THREE.CameraHelper")
class CameraHelper extends LineSegments[BufferGeometry, Material | js.Array[Material]]:
  def this(camera: Camera) = this()
  var camera: Camera = js.native
  var pointMap: AnonObject1 = js.native

  def update(): Unit = js.native
  def dispose(): Unit = js.native

@js.native
@JSGlobal("THREE.PlaneHelper")
class PlaneHelper extends LineSegments[BufferGeometry, Material | js.Array[Material]]:
  def this(
      plane: Plane,
      size: js.UndefOr[Double] = js.undefined,
      hex: js.UndefOr[Double] = js.undefined
  ) = this()

  var plane: Plane = js.native
  var size: Double = js.native

@js.native
@JSGlobal("THREE.DirectionalLightHelper")
class DirectionalLightHelper extends Object3D:
  def this(
      light: DirectionalLight,
      size: js.UndefOr[Double] = js.undefined,
      color: js.UndefOr[ColorRepresentation] = js.undefined
  ) = this()
  var light: DirectionalLight = js.native
  var lightPlane: Line[BufferGeometry, Material | js.Array[Material]] = js.native
  var targetLine: Line[BufferGeometry, Material | js.Array[Material]] = js.native
  var color: js.UndefOr[ColorRepresentation] = js.native

  def dispose(): Unit = js.native
  def update(): Unit = js.native

@js.native
@JSGlobal("THREE.Box3Helper")
class Box3Helper extends LineSegments[BufferGeometry, Material | js.Array[Material]]:
  def this(box: Box3, color: js.UndefOr[Color] = js.undefined) = this()

  var box: Box3 = js.native

@js.native
@JSGlobal("THREE.GridHelper")
class GridHelper extends LineSegments[BufferGeometry, Material | js.Array[Material]]:
  def this(
      size: js.UndefOr[Double] = js.undefined,
      divisions: js.UndefOr[Double] = js.undefined,
      color1: js.UndefOr[ColorRepresentation] = js.undefined,
      color2: js.UndefOr[ColorRepresentation] = js.undefined
  ) = this()

  def setColors(
      color1: js.UndefOr[ColorRepresentation] = js.undefined,
      color2: js.UndefOr[ColorRepresentation] = js.undefined
  ): Unit = js.native

@js.native
@JSGlobal("THREE.PolarGridHelper")
class PolarGridHelper extends LineSegments[BufferGeometry, Material | js.Array[Material]]:
  def this(
      radius: js.UndefOr[Double] = js.undefined,
      radials: js.UndefOr[Double] = js.undefined,
      circles: js.UndefOr[Double] = js.undefined,
      divisions: js.UndefOr[Double] = js.undefined,
      color1: js.UndefOr[ColorRepresentation] = js.undefined,
      color2: js.UndefOr[ColorRepresentation] = js.undefined
  ) = this()

@js.native
@JSGlobal("THREE.SpotLightHelper")
class SpotLightHelper extends Object3D:
  def this(light: Light, color: js.UndefOr[ColorRepresentation] = js.undefined) = this()
  var light: Light = js.native

  var color: js.UndefOr[ColorRepresentation] = js.native
  var cone: LineSegments[BufferGeometry, Material | js.Array[Material]] = js.native
  def dispose(): Unit = js.native
  def update(): Unit = js.native

@js.native
@JSGlobal("THREE.ArrowHelper")
class ArrowHelper extends Object3D:
  def this(
      dir: js.UndefOr[Vector3] = js.undefined,
      origin: js.UndefOr[Vector3] = js.undefined,
      length: js.UndefOr[Double] = js.undefined,
      color: js.UndefOr[ColorRepresentation] = js.undefined,
      headLength: js.UndefOr[Double] = js.undefined,
      headWidth: js.UndefOr[Double] = js.undefined
  ) = this()

  var line: Line[BufferGeometry, Material | js.Array[Material]] = js.native
  var cone: Mesh[BufferGeometry, Material | js.Array[Material]] = js.native
  def setDirection(dir: Vector3): Unit = js.native
  def setLength(
      length: Double,
      headLength: js.UndefOr[Double] = js.undefined,
      headWidth: js.UndefOr[Double] = js.undefined
  ): Unit = js.native
  def setColor(color: ColorRepresentation): Unit = js.native

@js.native
@JSGlobal("THREE.AxesHelper")
class AxesHelper extends LineSegments[BufferGeometry, Material | js.Array[Material]]:
  def this(size: js.UndefOr[Double] = js.undefined) = this()

  def setColors(xAxisColor: Color, yAxisColor: Color, zAxisColor: Color): this.type = js.native
  def dispose(): Unit = js.native

@js.native
sealed trait AnonObject1 extends js.Object:
  @JSBracketAccess
  def apply(id: String): js.Array[Double] = js.native
