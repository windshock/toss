// entry=0x7bbd0

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void H7a964(void)

{
  long lVar1;
  undefined **ppuVar2;
  ulong uVar3;
  ulong uVar4;
  
  _DAT_0027cf50 = 0x9637fa57698bd568;
  uVar3 = (-DAT_00274480 | 0x99bbd15a94f8c2f2U) * 2 - (-DAT_00274480 ^ 0x99bbd15a94f8c2f2U);
  uVar4 = 0x99bbd15a94f8c2f2 - (-DAT_00274480 ^ 0xffffffffffffffffU);
  lVar1 = (uVar3 | uVar4) + (uVar3 & uVar4);
  ppuVar2 = &PTR_LAB_0027abe8;
  if (lVar1 != (-DAT_00274480 | 0x99bbd15a94f8c2faU) * 2 - (-DAT_00274480 ^ 0x99bbd15a94f8c2faU)) {
    ppuVar2 = &PTR_LAB_002780b8 +
              (long)(int)((-(int)DAT_00274480 | 0x94f8c2f2U) * 2 -
                         (-(int)DAT_00274480 ^ 0x94f8c2f2U)) * 0x5b;
  }
                    /* WARNING: Could not recover jumptable at 0x00185d84. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar2)(lVar1,-0x66442ea56af46e32 - (-DAT_00274480 ^ 0xffffffffffffffffU));
  return;
}


