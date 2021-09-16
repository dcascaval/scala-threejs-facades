package typings.three.lights

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

@js.native
@JSGlobal("THREE.HemisphereLightProbe")
class HemisphereLightProbe extends LightProbe:
  def this(
      skyColor: js.UndefOr[ColorRepresentation] = js.undefined,
      groundColor: js.UndefOr[ColorRepresentation] = js.undefined,
      intensity: js.UndefOr[Double] = js.undefined
  ) = this()
  val isHemisphereLightProbe: Boolean = js.native

@js.native
@JSGlobal("THREE.DirectionalLight")
class DirectionalLight extends Light:
  def this(
      color: js.UndefOr[ColorRepresentation] = js.undefined,
      intensity: js.UndefOr[Double] = js.undefined
  ) = this()

  var target: Object3D = js.native

  val isDirectionalLight: Boolean = js.native

@js.native
@JSGlobal("THREE.PointLightShadow")
class PointLightShadow extends LightShadow

@js.native
@JSGlobal("THREE.SpotLightShadow")
class SpotLightShadow extends LightShadow:

  val isSpotLightShadow: Boolean = js.native
  var focus: Double = js.native

@js.native
@JSGlobal("THREE.SpotLight")
class SpotLight extends Light:
  def this(
      color: js.UndefOr[ColorRepresentation] = js.undefined,
      intensity: js.UndefOr[Double] = js.undefined,
      distance: js.UndefOr[Double] = js.undefined,
      angle: js.UndefOr[Double] = js.undefined,
      penumbra: js.UndefOr[Double] = js.undefined,
      decay: js.UndefOr[Double] = js.undefined
  ) = this()

  var target: Object3D = js.native

  var distance: Double = js.native
  var angle: Double = js.native
  var decay: Double = js.native

  var power: Double = js.native
  var penumbra: Double = js.native
  val isSpotLight: Boolean = js.native

@js.native
@JSGlobal("THREE.AmbientLightProbe")
class AmbientLightProbe extends LightProbe:
  def this(
      color: js.UndefOr[ColorRepresentation] = js.undefined,
      intensity: js.UndefOr[Double] = js.undefined
  ) = this()
  val isAmbientLightProbe: Boolean = js.native

@js.native
@JSGlobal("THREE.LightShadow")
class LightShadow extends js.Object:
  def this(camera: Camera) = this()
  var camera: Camera = js.native
  var bias: Double = js.native
  var normalBias: Double = js.native
  var radius: Double = js.native
  var mapSize: Vector2 = js.native
  var map: RenderTarget = js.native
  var mapPass: RenderTarget = js.native
  var matrix: Matrix4 = js.native
  var autoUpdate: Boolean = js.native
  var needsUpdate: Boolean = js.native
  def copy(source: LightShadow): this.type = js.native
  @JSName("clone")
  def jsClone(recursive: js.UndefOr[Boolean] = js.undefined): this.type = js.native
  def toJSON(): js.Any = js.native
  def getFrustum(): Double = js.native
  def updateMatrices(light: Light, viewportIndex: js.UndefOr[Double] = js.undefined): Unit = js.native
  def getViewport(viewportIndex: Double): Vector4 = js.native
  def getFrameExtents(): Vector2 = js.native
  def dispose(): Unit = js.native

@js.native
@JSGlobal("THREE.AmbientLight")
class AmbientLight extends Light:
  def this(
      color: js.UndefOr[ColorRepresentation] = js.undefined,
      intensity: js.UndefOr[Double] = js.undefined
  ) = this()

  val isAmbientLight: Boolean = js.native

@js.native
@JSGlobal("THREE.DirectionalLightShadow")
class DirectionalLightShadow extends LightShadow:

  val isDirectionalLightShadow: Boolean = js.native

@js.native
@JSGlobal("THREE.HemisphereLight")
class HemisphereLight extends Light:
  def this(
      skyColor: js.UndefOr[ColorRepresentation] = js.undefined,
      groundColor: js.UndefOr[ColorRepresentation] = js.undefined,
      intensity: js.UndefOr[Double] = js.undefined
  ) = this()

  var groundColor: Color = js.native
  val isHemisphereLight: Boolean = js.native

@js.native
@JSGlobal("THREE.LightProbe")
class LightProbe extends Light:
  def this(
      sh: js.UndefOr[SphericalHarmonics3] = js.undefined,
      intensity: js.UndefOr[Double] = js.undefined
  ) = this()

  val isLightProbe: Boolean = js.native
  var sh: SphericalHarmonics3 = js.native
  def fromJSON(json: js.Object): LightProbe = js.native

@js.native
@JSGlobal("THREE.PointLight")
class PointLight extends Light:
  def this(
      color: js.UndefOr[ColorRepresentation] = js.undefined,
      intensity: js.UndefOr[Double] = js.undefined,
      distance: js.UndefOr[Double] = js.undefined,
      decay: js.UndefOr[Double] = js.undefined
  ) = this()

  var distance: Double = js.native
  var decay: Double = js.native

  var power: Double = js.native

@js.native
@JSGlobal("THREE.Light")
class Light extends Object3D:
  def this(
      hex: js.UndefOr[Double | String] = js.undefined,
      intensity: js.UndefOr[Double] = js.undefined
  ) = this()

  var color: Color = js.native
  var intensity: Double = js.native
  val isLight: Boolean = js.native
  var shadow: LightShadow = js.native
  var shadowCameraFov: js.Any = js.native
  var shadowCameraLeft: js.Any = js.native
  var shadowCameraRight: js.Any = js.native
  var shadowCameraTop: js.Any = js.native
  var shadowCameraBottom: js.Any = js.native
  var shadowCameraNear: js.Any = js.native
  var shadowCameraFar: js.Any = js.native
  var shadowBias: js.Any = js.native
  var shadowMapWidth: js.Any = js.native
  var shadowMapHeight: js.Any = js.native
  def dispose(): Unit = js.native

@js.native
@JSGlobal("THREE.RectAreaLight")
class RectAreaLight extends Light:
  def this(
      color: js.UndefOr[ColorRepresentation] = js.undefined,
      intensity: js.UndefOr[Double] = js.undefined,
      width: js.UndefOr[Double] = js.undefined,
      height: js.UndefOr[Double] = js.undefined
  ) = this()

  var width: Double = js.native
  var height: Double = js.native

  val isRectAreaLight: Boolean = js.native
