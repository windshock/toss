// entry=0x13f140

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void H13b7f8(void)

{
  byte *pbVar1;
  ulong uVar2;
  undefined **ppuVar3;
  uint uVar4;
  uint uVar5;
  void *pvVar6;
  int in_w8;
  undefined4 in_w9;
  int iVar7;
  ulong uVar8;
  long unaff_x24;
  
  iVar7 = (int)DAT_00279eb0;
  DAT_002862d8 = in_w9;
  if (in_w8 != (-iVar7 | 0x8692046U) * 2 - (-iVar7 ^ 0x8692046U)) {
    DAT_0029e818 = 0;
    DAT_00278648 = (uint)(*(int *)(unaff_x24 + 0x98) == *(int *)(unaff_x24 + 0x18));
    memset(&stack0x00000010,0,0x80);
    pvVar6 = memset(&stack0x000001bc +
                    (-DAT_00279eb0 ^ 0x3f63e72908692046U) +
                    (-DAT_00279eb0 & 0x3f63e72908692046U) * 2 +
                    ((-DAT_00279eb0 | 0x3f63e72908692046U) * 2 -
                    (-DAT_00279eb0 ^ 0x3f63e72908692046U)) * 0x100,0,0x100);
    CallSupervisor(0);
                    /* WARNING: Could not recover jumptable at 0x00239e70. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_0027ed80)
              (((long)pvVar6 << 0x20) >> (0x2065 - (-DAT_00279eb0 ^ 0xffffffffffffffffU) & 0x3f));
    return;
  }
  _DAT_0027e7b4 = 0xbad1fe5a;
  DAT_0027e7b8 = 0xd905;
  DAT_0027e7ba = 0x57;
  uVar8 = (-DAT_00279eb0 | 0x3f63e72908692046U) * 2 - (-DAT_00279eb0 ^ 0x3f63e72908692046U);
  pbVar1 = &DAT_0012ced4 +
           (uVar8 << ((-DAT_00279eb0 | 0x3f63e72908692048U) * 2 -
                      (-DAT_00279eb0 ^ 0x3f63e72908692048U) & 0x3f));
  uVar4 = (uint)pbVar1[(-DAT_00279eb0 | 0x3f63e72908692047U) * 2 -
                       (-DAT_00279eb0 ^ 0x3f63e72908692047U)] <<
          (ulong)((-iVar7 ^ 0x869204eU) + (-iVar7 & 0x869204eU) * 2 & 0x1f);
  uVar5 = uVar4 & *pbVar1 | uVar4 ^ *pbVar1;
  uVar4 = (uint)pbVar1[(-DAT_00279eb0 ^ 0x3f63e72908692048U) +
                       (-DAT_00279eb0 & 0x3f63e72908692048U) * 2] <<
          (ulong)((-iVar7 ^ 0x2056U) + (-iVar7 & 0x2056U) * 2 & 0x1f);
  uVar5 = uVar5 & uVar4 | uVar5 ^ uVar4;
  uVar4 = (uint)pbVar1[(-DAT_00279eb0 | 0x3f63e72908692049U) + (-DAT_00279eb0 & 0x3f63e72908692049U)
                      ] << (ulong)(0x869205d - (-iVar7 ^ 0xffffffffU) & 0x1f);
  uVar5 = (uVar5 & uVar4 | uVar5 ^ uVar4) * ((-iVar7 ^ 0x643b09dbU) + (-iVar7 & 0x643b09dbU) * 2);
  uVar4 = uVar5 >> (ulong)((-iVar7 | 0x869205eU) + (-iVar7 & 0x869205eU) & 0x1f);
  uVar4 = ((uVar4 | uVar5) & (uVar4 & uVar5 ^ 0xffffffff)) *
          ((-iVar7 | 0x643b09dbU) + (-iVar7 & 0x643b09dbU));
  uVar5 = ((-iVar7 | 0xd5a88150U) + (-iVar7 & 0xd5a88150U)) *
          ((-iVar7 | 0x643b09dbU) * 2 - (-iVar7 ^ 0x643b09dbU));
  uVar2 = (-DAT_00279eb0 ^ 0x3f63e72908692047U) + (-DAT_00279eb0 & 0x3f63e72908692047U) * 2;
  ppuVar3 = &PTR_LAB_0027d278 + (int)((-iVar7 | 0x8692088U) + (-iVar7 & 0x8692088U));
  if ((uVar8 ^ uVar2) + (uVar8 & uVar2) * 2 !=
      (-DAT_00279eb0 | 0x3f63e72908692047U) + (-DAT_00279eb0 & 0x3f63e72908692047U)) {
    ppuVar3 = &PTR_LAB_00281900;
  }
                    /* WARNING: Could not recover jumptable at 0x0023dae8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar3)((uVar4 ^ 0xffffffff) & uVar5 | uVar4 & (uVar5 ^ 0xffffffff));
  return;
}


